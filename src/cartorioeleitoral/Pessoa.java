
package cartorioeleitoral;

/**
 *
 * @author Raiminson
 */

public abstract class Pessoa {
    private String nome;
    private int matricula;
    private int anoNascimento;

    public Pessoa(String nome, int matricula, int anoNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.anoNascimento = anoNascimento;
    }
}
