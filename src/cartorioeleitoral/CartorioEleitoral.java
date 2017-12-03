package cartorioeleitoral;

import IO.Manipulador;
import controller.*;
import java.util.ArrayList;
import java.util.List;
import model.Candidato;
import model.Eleitor;
import model.Pessoa;
import view.telaInicial;

/**
 *
 * @author agome
 */
public class CartorioEleitoral {

    public static void main(String[] args) {
        telaInicial tela;

        List<Candidato> listaCandidatos = new ArrayList<>();
        List<Eleitor> listaEleitores = new ArrayList<>();

        //CadastroEleitor.cadastrarEleitor("AndréEleitor", 160300003, 1990, listaEleitores);
        //CadastroEleitor.cadastrarEleitor("AndréEleitorDois", 160300003, 1990, listaEleitores);
        //CadastroCandidato.cadastrarCandidato(0, "sem foto", "André", 160300003, 1990, listaCandidatos);
        //CadastroCandidato.cadastrarCandidato(0, "sem foto", "AndréDois", 160300003, 1990, listaCandidatos);

        Manipulador.lerArquivoEleitor(listaEleitores);
        Manipulador.lerArquivoCandidato(listaCandidatos);

//        listaCandidatos.forEach((obj) -> {
//            Manipulador.escreverCandidato(obj);
//        });
 /*
        listaEleitores.forEach((obj) -> {
            //Manipulador.escreverEleitor(obj);
            System.out.println(obj.getNome() + obj.getMatricula());
        });*/
        listaCandidatos.forEach((obj) -> {
            //Manipulador.escreverEleitor(obj);
            System.out.println(obj.getNome() + obj.getMatricula());
        });
        

        System.out.println("Tamanho - " + listaCandidatos.size());
        tela = new telaInicial(listaEleitores, listaCandidatos);
        tela.setVisible(true);

    }
}
