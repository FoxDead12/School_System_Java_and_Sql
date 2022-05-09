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
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author david
 */
public class Professor {
    
    
    String nome;
    String sexo;
    String data_nasc;
    String nacionalidade;
    int habilitacao;
    String distrito;
    String concelho;
    String freguesia;
    String localidade;
    String codigo_postal;
    String telemovel;
    String morada;
    String email;
    String numCartaoCidadao;
    
    String numeroProfessor = "";
    
    ArrayList<String> Turmas = new ArrayList<String>();
    ArrayList<String> Disciplinas = new ArrayList<String>();
    
    int anoEnscricao;
    int mesEnscricao;
    int diaEnscricao;
    
    public void CriarProfessor(String NomeGet, String SexoGet, String Data_NascimentoGet, String NacionalidadeGet, int HabilitacoesGet , String DistritoGet, 
            String ConcelhoGet, String FreguesiaGet, String LocalidadeGet, String Codigo_PostaGet, String Telemovel, String MoradaGet, String EmailGet, String NumCartaoCidadaoGet, ArrayList<String> TurmasGet, ArrayList<String> DisciplinasGet){
        
        nome = NomeGet;
        sexo = SexoGet;
        data_nasc = Data_NascimentoGet;
        nacionalidade = NacionalidadeGet;
        habilitacao = HabilitacoesGet;
        distrito = DistritoGet;
        concelho = ConcelhoGet;
        freguesia = FreguesiaGet;
        localidade = LocalidadeGet;
        codigo_postal = Codigo_PostaGet;
        telemovel = Telemovel;
        morada = MoradaGet;
        email = EmailGet;
        numCartaoCidadao = NumCartaoCidadaoGet;
       
        Turmas = TurmasGet;
        Disciplinas = DisciplinasGet;
        
        
        if(GerarNumeroProf() == false){
            System.out.print("Aconteceu Algum Erro!");
            return;
        }
    }
    
    
    boolean GerarNumeroProf(){
        
        int ano = YearMonth.now().getYear();
        int quant_alunos_ano = 0;
        
        anoEnscricao = ano;
        mesEnscricao = YearMonth.now().getMonthValue();
        diaEnscricao = LocalDate.now().getDayOfMonth();
        
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();
        
        try{
            
            PreparedStatement statement = conn.prepareStatement("SELECT COUNT(a.ID_PROFESSOR) as PROFESSOR_COUNT FROM professor a, registo_professor r WHERE a.ID_PROFESSOR = r.ID_PROFESSOR AND r.ANO = " + ano + "");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
            
                quant_alunos_ano = rs.getInt("PROFESSOR_COUNT") + 1;
            }
            
            numeroProfessor = ano + "1" + quant_alunos_ano + "";
            System.out.print(numeroProfessor);
            
            return true;
        }catch(SQLException ex){
            
            return false;
        }
    }
    
    public String AdicionarProfBD(){
        System.out.print("\n" + habilitacao);
        
        
        if(VerificarSeAlunoExiste() == true){
            
           int idProf = 0;
            idProf = EncontrarId();
            
            DataBaseQuerys baseDados = new DataBaseQuerys();
            Connection conn = baseDados.getDataBaseQuerys();
        
        
            boolean alunoAdicionado = false;
            do{

                //Query de adicionar a base de dados
                try{

                    PreparedStatement statement = conn.prepareStatement("INSERT INTO professor values ("+ idProf +",'"+ nome +"' ,'"+ numeroProfessor +"@ispgaya.pt', '" + data_nasc + "'," 
                            + "'"+ morada +"','"+ localidade +"', '"+ nacionalidade +"','" + numCartaoCidadao + "','"+ numeroProfessor + "','"+ distrito +"','"+  concelho +"','" + freguesia + "','" + codigo_postal 
                            + "','" + email + "','" + sexo + "'," + habilitacao + ", '"+ telemovel +"')");

                    int rows = statement.executeUpdate();

                    alunoAdicionado = true;
                }catch(SQLException ex){
                    System.out.print(ex);
                    if(ex.toString().contains("Duplicate entry")){

                        idProf = EncontrarId();
                    }
                }

            }while(alunoAdicionado == false);

            Date dt = new Date();
            try{

                PreparedStatement statement1 =  conn.prepareStatement("INSERT INTO registo_professor (ID_PROFESSOR, ACAO_REGISTO, ANO, MES, DIA, HORA) values ("+ idProf +", 0 , "+ anoEnscricao +", "+ mesEnscricao +", " + diaEnscricao + ", '"+  ("" + dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds())    +"')"); //Acao registo 0 quer dizer que foi adicionado
                int rows = statement1.executeUpdate();

            }catch(SQLException ex){

                System.out.print(ex);
            }
        
            
            AdicionarDisciplinas(idProf);
            
            
            return "PROFESSOR ADICIONADO COM SUCESSO!!";
        }
        else{
            
            return "ESTE PROFESSOR JÁ EXISTE!!";
        }
        
    }
    
    int EncontrarId(){
        
        int idAluno = 0;
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();
        
        
        
        try{
            
            PreparedStatement statement = conn.prepareStatement("SELECT MAX(ID_PROFESSOR) as ID_PROFESSOR FROM professor ");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                
                idAluno = rs.getInt("ID_PROFESSOR") + 1;
            }
            
        }catch(SQLException ex){
            System.out.print(ex);
        }
        
        
        return idAluno;
    }
    
   boolean VerificarSeAlunoExiste(){
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();
        int count = 0;
        try{
            
            PreparedStatement statement = conn.prepareStatement("SELECT count(ID_PROFESSOR) as Count from  professor WHERE EMAIL_PESSOAL = '"+ email +"' AND NUMERO_CIDADAO = '"+ numCartaoCidadao +"' AND NUMERO_PROFESSOR = '"+ numeroProfessor +"'  ");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                count = rs.getInt("Count");           
            }
            
            if(count == 0){
                    
                return true;
            }
            else{
                return false;
            }
            
        }catch(SQLException ex){
            
            System.out.print(ex);
            return false;
        }
        
        
        
    }
   
   public void AdicionarDisciplinas(int idP){
       
       
       if(Turmas.size() > 0 && Disciplinas.size() > 0){
           
           for(int i = 0; i <= Turmas.size() - 1; i++){
               
                DataBaseQuerys baseDados = new DataBaseQuerys();
                Connection conn = baseDados.getDataBaseQuerys();
                try {
                
                    PreparedStatement statement = conn.prepareStatement("INSERT INTO professordisciplina (ID_PROFESSOR,ID_DISCIPLINA, ID_TURMA) \n" +
                    "VALUES("+ idP +",\n" +
                    "(SELECT d.ID_DISCIPLINA FROM disciplinas d WHERE d.NOME_DISCIPLINA = '"+ Disciplinas.get(i) +"'),\n" +
                    "(SELECT t.id_turma FROM turmas t WHERE t.NOME_TURMA = '"+ Turmas.get(i) +"')\n" +
                    ")");
                    int rows = statement.executeUpdate();
                    
                
                
                }catch (SQLException ex) {
                    System.out.print(ex);
                }
            
            
                
                
                
                
                
           }
       }
   }
   
}
