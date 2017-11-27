/*
 * Manipula arquivo de linha que contém dados referêntes ao modelo.
 * Principais operações: leitura e escrita.
 */
package IO;

import model.Pessoa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Candidato;

/**
 *
 * @author Elias Gonçalves, André Gomes
 * 
 */
public class Manipulador {
    
    // Variáveis
    private static File diretorio;
    private static File arquivo;
    private static String nomeDiretorio = "BancoDeDados";
    private static String nomeArquivoEleitor = "listaDeEleitores.txt";
    private static String nomeArquivoCandidato = "listaDeCandidatos.txt";
    private static ArrayList<Pessoa> listaDeEleitores = new ArrayList();
    private static ArrayList<Pessoa> listaDeCandidatos = new ArrayList();
    
    // Métodos:
    public static ArrayList<Pessoa> getListaDeEleitores() {
        return listaDeEleitores;
    }
    public static ArrayList<Pessoa> getListaDeCandidatos() {
        return listaDeCandidatos;
    }
    
    private static void criarDiretorio(){
        diretorio = new File(nomeDiretorio);
        diretorio.mkdir();
    }
    
    protected static void deletarDiretorio(){
        diretorio = new File(nomeDiretorio);
        diretorio.delete();
    }
    
    protected static void criarArquivoEleitor(){    
        try {
            diretorio = new File(nomeDiretorio);
            if(!diretorio.exists())
                criarDiretorio();
            arquivo = new File(nomeDiretorio + "/" + nomeArquivoEleitor);
            arquivo.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(
                Manipulador.class.getName()).log(Level.SEVERE, 
                "Erro ao criar arquivo " + nomeArquivoEleitor, ex
            );
        }
    }
    protected static void criarArquivoCandidato(){    
        try {
            diretorio = new File(nomeDiretorio);
            if(!diretorio.exists())
                criarDiretorio();
            arquivo = new File(nomeDiretorio + "/" + nomeArquivoCandidato);
            arquivo.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(
                Manipulador.class.getName()).log(Level.SEVERE, 
                "Erro ao criar arquivo " + nomeArquivoCandidato, ex
            );
        }
    }
    
    protected static void deletarArquivoEleitor(){
        arquivo = getFileEleitor();
        arquivo.delete();
    }
    protected static void deletarArquivoCandidato(){
        arquivo = getFileCandidato();
        arquivo.delete();
    }
    private static File getFileEleitor(){
        File file = new File(nomeDiretorio + "/" + nomeArquivoEleitor);
        
        if(!file.exists())
           criarArquivoEleitor();
           
        return new File(nomeDiretorio + "/" + nomeArquivoEleitor);
    }
    private static File getFileCandidato(){
        File file = new File(nomeDiretorio + "/" + nomeArquivoCandidato);
        
        if(!file.exists())
           criarArquivoCandidato();
           
        return new File(nomeDiretorio + "/" + nomeArquivoCandidato);
    }
    
    /**
     * Faz a leitura de um aquivo em linha.
     */
    public static void lerArquivoEleitor(){
        String linhaLida;
        try {
            FileReader leitor = new FileReader(getFileEleitor());
            BufferedReader buffer = new BufferedReader(leitor);
            
            // Faz algo com o que for lido, setar um objeto, por exemplo e add 
            // a lisdaDePessoas
            while( (linhaLida = buffer.readLine()) != null ) {
                System.out.println(linhaLida);
            }
            
            buffer.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao criar leitor para o arquivo " + nomeArquivoEleitor, ex
            );
        } catch (IOException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao ler linha do arquivo " + nomeArquivoEleitor, ex
            );
        }
    }
    public static void lerArquivoCandidato(){
        String linhaLida;
        try {
            FileReader leitor = new FileReader(getFileCandidato());
            BufferedReader buffer = new BufferedReader(leitor);
            
            // Faz algo com o que for lido, setar um objeto, por exemplo e add 
            // a lisdaDePessoas
            while( (linhaLida = buffer.readLine()) != null ) {
                System.out.println(linhaLida);
            }
            
            buffer.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao criar leitor para o arquivo " + nomeArquivoCandidato, ex
            );
        } catch (IOException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao ler linha do arquivo " + nomeArquivoCandidato, ex
            );
        }
    }
        
    public static void escreverEleitor(Pessoa p){
        try {
            FileWriter escritor = new FileWriter(getFileEleitor(), true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            
            buffer.write(p.getNome());
            buffer.newLine();
            buffer.write(Integer.toString(p.getMatricula()));
            buffer.newLine();
            buffer.write(Integer.toString(p.getAnoNascimento()));
            buffer.newLine();
              
            buffer.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao criar leitor para o arquivo " + nomeArquivoEleitor, ex
            );
        } catch (IOException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao escrever linha no arquivo " + nomeArquivoEleitor, ex
            );
        }
    }
    public static void escreverCandidato(Candidato p){
        try {
            FileWriter escritor = new FileWriter(getFileCandidato(), true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            
            buffer.write(p.getNome());
            buffer.newLine();
            buffer.write(Integer.toString(p.getMatricula()));
            buffer.newLine();
            buffer.write(Integer.toString(p.getAnoNascimento()));
            buffer.newLine();
            buffer.write(p.getPathFoto());
            buffer.newLine();
            buffer.write(Integer.toString(p.getQtdVotos()));
            buffer.newLine();
              
            buffer.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao criar leitor para o arquivo " + nomeArquivoCandidato, ex
            );
        } catch (IOException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao escrever linha no arquivo " + nomeArquivoCandidato, ex
            );
        }
    }
    
}