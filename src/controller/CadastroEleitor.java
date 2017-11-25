
package controller;

import java.util.List;
import model.Eleitor;

/**
 *
 * @author Neres
 */

public class CadastroEleitor {

    public static void cadastrarEleitor(String nome, int matricula, int anoNascimento,List listaEleitor){
        Eleitor eleitor = new Eleitor(nome, matricula, anoNascimento);
        listaEleitor.add(eleitor);        
    }
}
