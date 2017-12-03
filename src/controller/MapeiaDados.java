
package controller;

import model.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author agome
 */

public class MapeiaDados {

    public void mapeiaCandidato(Candidato candidato){
        Map dadosView = new HashMap<>();
        dadosView.put("nome", new String(candidato.getNome()));
        dadosView.put("anoNascimento", new Integer(candidato.getAnoNascimento()));
        dadosView.put("matricula",new Integer(candidato.getMatricula()));
        dadosView.put("qtdVotos", new Integer(candidato.getQtdVotos()));
        dadosView.put("pathFoto",new String(candidato.getPathFoto()));
    }
}
