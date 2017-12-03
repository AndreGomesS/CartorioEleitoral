
package controller;

import IO.Manipulador;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 2700f13115ea762257b200a242da96b97fa16f21
import java.util.List;
import model.Candidato;

/**
 *
 * @author Ramon, André 
 */

public class CadastroCandidato {
    
    public static void cadastrarCandidato(int QtdVotos, String pathFoto, String nome, int matricula, int anoNascimento,List listaCandidatos){
<<<<<<< HEAD
        Candidato candidato = new Candidato(QtdVotos, pathFoto, nome, matricula, anoNascimento);
       // listaCandidatos.add(candidato);   
=======
        Candidato candidato = new Candidato(QtdVotos, pathFoto, nome, matricula, anoNascimento);             
>>>>>>> 2700f13115ea762257b200a242da96b97fa16f21
        Manipulador.escreverCandidato(candidato);
    }

    
        
        
}
