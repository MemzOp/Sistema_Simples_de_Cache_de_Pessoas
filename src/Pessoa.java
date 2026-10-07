public class Pessoa {

    public static int contador = 0;
    private int ID;
    private String nome;
    private int idade;

    public Pessoa(int ID, String nome, int idade) {
        this.ID = ++ contador;
        this.nome = nome;
        this.idade = idade;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
