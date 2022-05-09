/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.YearMonth;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Curso {
    
    
    String Nome;
    String  Diminuitivo;
    String Formacao;
    ArrayList<String> Disciplinas = new ArrayList<String>();
    String numeroCurso = "";
     
    public void CriarCurso(String NomeG , String DiminuitivoG, String FormacaoG, ArrayList<String> DisciplinasG){
        
        Nome = NomeG;
        Diminuitivo = DiminuitivoG;
        Formacao = FormacaoG;
        Disciplinas = DisciplinasG;
        GerarCodigo();
    }
    
    public String AdicionarBaseDados(){
        
        if(VerificarSeCodigoExiste() == false){
        
            DataBaseQuerys baseDados = new DataBaseQuerys();
            Connection conn = baseDados.getDataBaseQuerys();

            try{

                 PreparedStatement statement = conn.prepareStatement("INSERT INTO cursos VALUES \n" +
                "(\n" +
                "(SELECT SUM(t.soma) FROM (SELECT MAX(c.ID_CURSO) + 1 AS soma   FROM cursos c UNION SELECT 0 AS soma  FROM professor, aluno) t),\n" +
                "'"+ Nome +"',\n" +
                "'"+ Diminuitivo +"',\n" +
                "(SELECT f.ID_FORMACAO FROM formacoes f WHERE f.NOME_FORMACAO = '"+ Formacao +"'),\n" +
                "'"+ numeroCurso +"'\n" +
                ") ");
                int rows = statement.executeUpdate();



            }catch(SQLException ex){

                System.out.print("\n" + ex);
            } 
        
            
            InserirDisciplinas();
            
        }
        else{
            
            return "Este curso já existe!";
        }
        
        return "Curso adicionado com sucesso!!";
    }
    
    public void GerarCodigo(){
        
        
        int ano = YearMonth.now().getYear();
        int n = 0;
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();
        
        try{
            
            PreparedStatement statement = conn.prepareStatement("SELECT SUM(t.soma) as Max\n" +
            "FROM (SELECT MAX(c.ID_CURSO)+ 1 AS soma FROM cursos c \n" +
            "UNION \n" +
            "SELECT 0 as soma  FROM aluno) t");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
               
                n = rs.getInt("Max");
                System.out.print("\n" + n);
            }
            
            
        }catch(SQLException ex){
            
            System.out.print("\n" + ex);
        } 
        
        numeroCurso = ano + "2" + n;
        System.out.print("\n" + numeroCurso);
        
    }
    
    public boolean VerificarSeCodigoExiste(){
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();
        int count = 0;
        try{
            
             PreparedStatement statement = conn.prepareStatement("SELECT COUNT(c.ID_CURSO) AS Coun FROM cursos c WHERE c.NOME_CURSO = '"+ Nome +"' OR c.DIMINUITIVO_CURSO = '"+ Diminuitivo +"' OR c.Codigo_Curso = '"+ numeroCurso +"'");
             ResultSet rs = statement.executeQuery();
             
             
            while(rs.next()){
                
                count = rs.getInt("Coun");
            }
            
            
        }catch(SQLException ex){
            
            
        } 
        
        
        if(count == 1){
            
            return true;
        }
        else{
            
            return false;
        }
    }
    
    public void InserirDisciplinas(){
        
        for(int i = 0; i <= Disciplinas.size() - 1; i++){
            
            DataBaseQuerys baseDados = new DataBaseQuerys();
            Connection conn = baseDados.getDataBaseQuerys();
            
            try{

                PreparedStatement statement = conn.prepareStatement("INSERT INTO cursodisciplina (ID_CURSO, ID_DISCIPLINA) VALUES\n" +
                "(\n" +
                "(SELECT c.ID_CURSO FROM cursos c WHERE c.NOME_CURSO = '"+ Nome +"'),\n" +
                "(SELECT d.ID_DISCIPLINA FROM disciplinas d WHERE d.DIMINUITIVO_DISCIPLINA = '"+ Disciplinas.get(i) +"')\n" +
                ")");
                int rows = statement.executeUpdate();

                


            }catch(SQLException ex){

                System.out.print("\n" + ex);
            } 
        }
    }
}
