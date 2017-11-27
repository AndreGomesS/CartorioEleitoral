package cartorioeleitoral;

import controller.*;
import java.util.ArrayList;
import java.util.List;
import model.Candidato;
import model.Eleitor;
import model.Pessoa;

/**
 *
 * @author agome
 */
public class CartorioEleitoral {

    public static void main(String[] args) {
        
        List<Candidato> listaCandidatos = new ArrayList<>();
        List<Eleitor> listaEleitores = new ArrayList<>();
        
        CadastroEleitor.cadastrarEleitor("AndréEleitor", 160300003, 1990, listaEleitores);
        CadastroEleitor.cadastrarEleitor("AndréEleitorDois", 160300003, 1990, listaEleitores);
        CadastroCandidato.cadastrarCandidato(0, "sem foto", "André", 160300003, 1990, listaCandidatos);
        CadastroCandidato.cadastrarCandidato(0, "sem foto", "AndréDois", 160300003, 1990, listaCandidatos);
        
        
        listaCandidatos.forEach((obj) -> {
            System.out.println(obj.getNome());
        });
        
        listaEleitores.forEach((obj) -> {
            System.out.println(obj.getNome());
        });
        


        
    
    }

}
