
package controller;

import IO.Manipulador;
import java.util.List;
import model.Candidato;

/**
 *
 * @author Ramon, André 
 */

public class CadastroCandidato {
    
    public static void cadastrarCandidato(int QtdVotos, String pathFoto, String nome, int matricula, int anoNascimento,List listaCandidatos){
        Candidato candidato = new Candidato(QtdVotos, pathFoto, nome, matricula, anoNascimento);             
        Manipulador.escreverCandidato(candidato);
    }

    
        
        
}
