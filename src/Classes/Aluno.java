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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Aluno {
    
    
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
    int curso;
    String numCartaoCidadao;
    String formacao;
    int FormacaoId;
    
    
    String numeroAluno;
    String DiminutivoCurso;
   
    int anoEnscricao;
    int mesEnscricao;
    int diaEnscricao;
    int idTurma;
    
    
    public void CriarAluno(String NomeGet, String SexoGet, String Data_NascimentoGet, String NacionalidadeGet, int HabilitacoesGet , String DistritoGet, 
            String ConcelhoGet, String FreguesiaGet, String LocalidadeGet, String Codigo_PostaGet, String Telemovel, String MoradaGet, String EmailGet, String CursoGet, String NumCartaoCidadaoGet, String formacaoGet){
        
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
        formacao = formacaoGet;
        
        
        //Executar Funcoes essenciais
        if(BuscarCurso(CursoGet) == false){
            System.out.print("Aconteceu Algum Erro!");
            return;
        }
        
        if(GerarNumeroAluno() == false){
            System.out.print("Aconteceu Algum Erro!");
            return;
        }
       
        
       BuscarOuCriarTurma();
    }
    
    private boolean GerarNumeroAluno(){
        
        // Número Aluno, ANO + ID_CURSO + NUMB_ALUNOS_ANO
        
        int ano = YearMonth.now().getYear();
        int quant_alunos_ano = 0;
        
        anoEnscricao = ano;
        mesEnscricao = YearMonth.now().getMonthValue();
        diaEnscricao = LocalDate.now().getDayOfMonth();
        
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();
        
        try{
            
            PreparedStatement statement = conn.prepareStatement("SELECT COUNT(a.ID_ALUNO) as ALUNOS_COUNT FROM aluno a, registos_alunos r WHERE a.ID_ALUNO = r.ID_ALUNO AND r.ANO = " + ano + "");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
            
                quant_alunos_ano = rs.getInt("ALUNOS_COUNT");
            }
            
            numeroAluno = ano + "" + curso+ "0" + quant_alunos_ano + "";
            System.out.print(numeroAluno);
            
            return true;
        }catch(SQLException ex){
            System.out.print(ex);
            return false;
        }
        
    }
    
    boolean BuscarCurso(String cursoTemp){
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();
        
        try{
            
            PreparedStatement statement = conn.prepareStatement("SELECT ID_CURSO, DIMINUITIVO_CURSO FROM cursos c WHERE c.NOME_CURSO = '"+ cursoTemp +"' ORDER BY c.ID_CURSO ASC");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
            
                curso = rs.getInt("ID_CURSO");
                DiminutivoCurso = rs.getString("DIMINUITIVO_CURSO");
            }
            
           return true;
        }catch(SQLException ex){
            System.out.print(ex);
            return false;
        }
    }
    
    
    
    

    
    
    
    void BuscarOuCriarTurma(){
        
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();
        
        
        
        try{
            
            PreparedStatement statement = conn.prepareStatement("SELECT COUNT(turmas.id_turma) as Total_Turmas, id_turma  FROM turmas WHERE id_curso = "+ curso +" AND Ano = 1");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                
                if(rs.getInt("Total_Turmas") == 1){
                    idTurma = rs.getInt("id_turma");
                }
                else{
                    
                    CriarTurma();
                }
            }
            
        }catch(SQLException ex){
            System.out.print(ex);
        }
        
        System.out.print("\nA turma tem o id " + idTurma);
    }
    
    void CriarTurma(){
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();

        try{
            
            PreparedStatement statement = conn.prepareStatement("INSERT INTO turmas (id_curso,NOME_TURMA, Codigo_Turma) VALUES ("+ curso +", '"+   (DiminutivoCurso + "_" + anoEnscricao + "_" + (anoEnscricao + 1)) +"', '"+ (anoEnscricao + "" + curso) +"' )");
            int rows = statement.executeUpdate();
            
        }catch(SQLException ex){
            System.out.print(ex);
        }
        
        //Buscar ID TURMA
        try{
            
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM turmas WHERE turmas.id_curso = " + curso +" AND turmas.Ano = 1");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                
                idTurma = rs.getInt("id_turma");
            }
            
        }catch(SQLException ex){
            System.out.print(ex);
        }
        
        
    }
    
    
    
    
    
    
    

    
    public String AdicionarAlunoDB(){
        
        
        
        if(VerificarSeAlunoExiste() == false){
            
            System.out.print("ESTE ALUNO JÁ EXISTE!!");
            return "ESTE ALUNO JÁ EXISTE!!";
        }
        
        int idAluno = 0;
        idAluno = EncontrarId();
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();
        
        
        boolean alunoAdicionado = false;
        do{
        
            //Query de adicionar a base de dados
            try{

                PreparedStatement statement = conn.prepareStatement("INSERT INTO aluno values ("+ idAluno +",'"+ numeroAluno + "',  '"+ nome +"', '"+ sexo +"', '" + data_nasc + "'," 
                        + "'"+ nacionalidade +"',"+ habilitacao +", '"+ distrito +"','" + concelho + "','" + freguesia + "','" + morada 
                        + "','" + codigo_postal + "','" + localidade + "','" + telemovel + "','" + email  + "','" + numeroAluno + "@ispgaya.pt'," + curso + ",'"+ numCartaoCidadao +"', "+idTurma +")");

                int rows = statement.executeUpdate();

                alunoAdicionado = true;
            }catch(SQLException ex){
                System.out.print(ex);
                if(ex.toString().contains("Duplicate entry")){
                    
                    idAluno = EncontrarId();
                }
            }
        
        }while(alunoAdicionado == false);
        
        Date dt = new Date();
        try{
            
            PreparedStatement statement1 =  conn.prepareStatement("INSERT INTO registos_alunos (ID_ALUNO, ACAO_REGISTO, ANO, MES, DIA, HORA) values ("+ idAluno +", 0 , "+ anoEnscricao +", "+ mesEnscricao +", " + diaEnscricao + ", '"+  ("" + dt.getHours() + ":" + dt.getMinutes() + ":" + dt.getSeconds())    +"')"); //Acao registo 0 quer dizer que foi adicionado
            int rows = statement1.executeUpdate();
         
        }catch(SQLException ex){
            
            System.out.print(ex);
        }
        
        return "ALUNO ADICIONADO COM SUCESSO!";
    }
    
    
    int EncontrarId(){
        
        int idAluno = 0;
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();
        
        
        
        try{
            
            PreparedStatement statement = conn.prepareStatement("SELECT MAX(id_aluno) as ID_ALUNO FROM aluno ");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                
                idAluno = rs.getInt("ID_ALUNO") + 1;
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
            
            PreparedStatement statement = conn.prepareStatement("SELECT count(id_aluno) as Count from  aluno WHERE aluno.EMAILPESSOAL__ALUNO = '"+ email +"' AND aluno.NUMERO_CARTAO_CIDADAO = '"+ numCartaoCidadao +"' AND aluno.NUMERO_ALUNO = '"+ numeroAluno +"' ");
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
    
    /*
    public String AdicionarBaseDados(){
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
        Connection conn = baseDados.getDataBaseQuerys();
        
       
        int id_aluno = 0;
        int vef = 0;
        
        
        try {
                
                PreparedStatement statement = conn.prepareStatement("SELECT COUNT(aluno.ID_ALUNO) AS Quant_Aluno, MAX(aluno.ID_ALUNO) AS Max_Aluno FROM aluno WHERE EMAIL_ALUNO = '" + Email + "'");
                ResultSet rs = statement.executeQuery();
                
                while(rs.next()){
                    
                    //Fornecer id do aluno e verificar se este aluno já existe
                    vef = rs.getInt("Quant_Aluno");
                    id_aluno = rs.getInt("Max_Aluno") + 1;    
                }    
                
                    //Vamos Adicionar o player a base de dados
                
                if(vef == 0){
                    boolean adicionou_jogador = false;
                    do{  

                        try {
                            
                            PreparedStatement statement2 = conn.prepareStatement("INSERT INTO aluno (ID_ALUNO, NOME_ALUNO, EMAIL_ALUNO, DATA_NASCIMENTO, ID_CURSO, MORADA, LOCALIDADE, PAIS, NACIONALIDADE) VALUES ("+ id_aluno +",'"+ nome +"','"+ Email +"','"+ Data +"', "+ Curso +", '"+ Morada +"','"+ Localidade +"', '"+ Pais +"', '"+ Nacionalidade +"')");
                            int rowsAffected = statement2.executeUpdate();
                            adicionou_jogador = true;
                            
                        }catch (SQLException ex) {
                               
                            //Caso Já existe este id ele vai repetir o procedimento
                            if(ex.toString().contains("Duplicate entry")){
                                
                                System.out.print("\nEsta key ja existe");
                                
                                PreparedStatement statement3 = conn.prepareStatement("SELECT MAX(aluno.ID_ALUNO) AS Max_Aluno FROM aluno");
                                ResultSet rs3 = statement3.executeQuery();
                                while(rs3.next()){
                                    id_aluno = rs3.getInt("Max_Aluno") + 1;    
                                }       
                            }
                            
                            
                            
                        }
                       
                    }while(adicionou_jogador  == false );
                    
                       return "\nALUNO ADICIONADO COM SUCESSO!";
                        
                }
                else{
                     return "\nESTE ALUNO JÁ EXISTE!";
                }
                
            }catch (SQLException ex) {
                 return "\nACONTECEU ALGUM ERRO TENTE NOVAMENTE!";
            }
        
    }
    */
    
    /*public void BuscarInformaçõesAlunos(String EmailPes){
        
        
        
        try {
            DataBaseQuerys baseDados = new DataBaseQuerys();
            Connection conn = baseDados.getDataBaseQuerys();
            
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM ALUNO WHERE EMAIL_ALUNO = '"+ EmailPes +"'");
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                
                CriarAluno(rs.getString("NOME_ALUNO"), rs.getString("EMAIL_ALUNO"), rs.getString("MORADA"), rs.getString("LOCALIDADE"), rs.getString("PAIS"), rs.getString("NACIONALIDADE"), rs.getInt("ID_CURSO"), rs.getString("DATA_NASCIMENTO"));
            }
            
        } catch (SQLException ex) {
           System.out.print(ex);
        }
        
    }
    */
}
