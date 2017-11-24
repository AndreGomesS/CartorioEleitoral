
package cartorioeleitoral;

/**
 *
 * @author Pedro
 */

public class Candidato extends Pessoa{
    
    int QtdVotos;
    String pathFoto;

    public Candidato(int QtdVotos, String pathFoto, String nome, int matricula, int anoNascimento) {
        super(nome, matricula, anoNascimento);
        this.QtdVotos = QtdVotos;
        this.pathFoto = pathFoto;
    }
    

}
