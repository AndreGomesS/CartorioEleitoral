
package controller;

import IO.Manipulador;
import java.util.List;
import model.Eleitor;

/**
 *
 * @author Neres
 */

public class CadastroEleitor {

    public static void cadastrarEleitor(String nome, int matricula, int anoNascimento,List listaEleitor){
        Eleitor eleitor = new Eleitor(nome, matricula, anoNascimento);
        //System.out.println("nome "+ eleitor.getNome() + " matriclaa " +eleitor.getMatricula()+"nascimento "+ eleitor.getAnoNascimento());
        //listaEleitor.add(eleitor);
        Manipulador.escreverEleitor(eleitor);
    }
}
