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

/**
 *
 * @author Elias Gonçalves
 * 
 */
public class Manipulador {
    
    // Variáveis
    private static File diretorio;
    private static File arquivo;
    private static String nomeDiretorio = "BancoDeDados";
    private static String nomeArquivo = "listaDePessoas.txt";
    private static ArrayList<Pessoa> listaDePessoas = new ArrayList();
    
    // Métodos:
    public static ArrayList<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }
    
    private static void criarDiretorio(){
        diretorio = new File(nomeDiretorio);
        diretorio.mkdir();
    }
    
    protected static void deletarDiretorio(){
        diretorio = new File(nomeDiretorio);
        diretorio.delete();
    }
    
    protected static void criarArquivo(){    
        try {
            diretorio = new File(nomeDiretorio);
            if(!diretorio.exists())
                criarDiretorio();
            arquivo = new File(nomeDiretorio + "/" + nomeArquivo);
            arquivo.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(
                Manipulador.class.getName()).log(Level.SEVERE, 
                "Erro ao criar arquivo " + nomeArquivo, ex
            );
        }
    }
    
    protected static void deletarArquivo(){
        arquivo = getFile();
        arquivo.delete();
    }
    
    private static File getFile(){
        File file = new File(nomeDiretorio + "/" + nomeArquivo);
        
        if(!file.exists())
           criarArquivo();
           
        return new File(nomeDiretorio + "/" + nomeArquivo);
    }
    
    /**
     * Faz a leitura de um aquivo em linha.
     */
    public static void lerArquivo(){
        String linhaLida;
        try {
            FileReader leitor = new FileReader(getFile());
            BufferedReader buffer = new BufferedReader(leitor);
            
            // Faz algo com o que for lido, setar um objeto, por exemplo e add 
            // a lisdaDePessoas
            while( (linhaLida = buffer.readLine()) != null ) {
                System.out.println(linhaLida);
            }
            
            buffer.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao criar leitor para o arquivo " + nomeArquivo, ex
            );
        } catch (IOException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao ler linha do arquivo " + nomeArquivo, ex
            );
        }
    }
        
    public static void escrever(Pessoa p){
        try {
            FileWriter escritor = new FileWriter(getFile(), true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            
            buffer.write(p.getNome());
            buffer.newLine();
            buffer.write(p.getMatricula());
            buffer.newLine();
            buffer.write(p.getAnoNascimento());
            buffer.newLine();
              
            buffer.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao criar leitor para o arquivo " + nomeArquivo, ex
            );
        } catch (IOException ex) {
            Logger.getLogger(Manipulador.class.getName()).log(
                Level.SEVERE, "Erro ao escrever linha no arquivo " + nomeArquivo, ex
            );
        }
    }
    
}