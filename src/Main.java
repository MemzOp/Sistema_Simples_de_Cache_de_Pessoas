import static java.lang.IO.*;
void main() {
    List<Pessoa> banco = new ArrayList<>();
    List<Pessoa> cache = new ArrayList<>();
    int proximoId = 1;

    while (true) {
        println("1 - Cadastrar");
        println("2 - Buscar por ID");
        int opcao = Integer.parseInt(readln("Escolha: "));

        if (opcao == 1) {
            String nome = readln("Digite o seu nome: ");
            int idade = Integer.parseInt(readln("Digite a sua idade: "));

            Pessoa nova = new Pessoa(proximoId, nome, idade);
            banco.add(nova);

            println("Cadastro feito!");
            println("O seu ID é: " + proximoId);
            println("Dados: " + nova);

            proximoId = proximoId + 1;

        } else if (opcao == 2) {
            int id = Integer.parseInt(readln("Digite o seu ID de cadastro: "));

            Pessoa p = null;
            for (Pessoa x : cache) {
                if (x.getID() == id) {
                    p = x;
                    break;
                }
            }

            if (p != null) {
                cache.remove(p);
                cache.add(p);
                println("Pessoa encontrada no cache: " + p);
            } else {
                for (Pessoa x : banco) {
                    if (x.getID() == id) {
                        p = x;
                        break;
                    }
                }

                if (p == null) {
                    println("Pessoa não encontrada.");
                } else {
                    if (cache.size() == 10) {
                        println("Cache cheio. Removida do cache: " + cache.get(0));
                        cache.remove(0);
                    }
                    cache.add(p);
                    println("Pessoa buscada no banco e adicionada ao cache: " + p);
                }
            }

        } else {
            println("Opção inválida.");
        }

        println("");
    }
}