package conteudos.conteudo2;

public class Outputs {
    public static void main(String[] args) {

    }

    static void imprimirConteudoComQuebraDeLinha(String conteudo)
    {
        /*
        A função println já coloca uma quebra de linha no final de cada execução
        Exemplo:

        System.out.println(conteudo);
        System.out.println(conteudo);

        Imprime:
        "conteudo"
        "conteudo"

        */
        System.out.println(conteudo);
    }

    static void imprimirConteudoSemQuebraDeLinha(String conteudo)
    {
        /*
        A função print apenas imprime o valor na tela, sem inserir quebras de linha
        Exemplo:

        System.out.print(conteudo);
        System.out.print(conteudo);

        Imprime:
        "conteudo""conteudo"

        */

        System.out.print(conteudo);
    }

    static void imprimirConteudoComValoresEscape(String conteudo)
    {

        /*
        Regex
        "Escaped values" são funções de strings, valores reservados que executam determinadas funções para texto
        **A não tradução é proposital, certas coisas, se for traduzir, dificulta na hora de realizar buscas no google***

        O escaped value \n realiza uma quebra de linha, ou seja, o valor será exibido uma linha a mais para baixo
        O escaped value \t realiza uma tabulação, ou seja, o valor será exibido com a distância de um tab
        Escaped values podem ser utilizados à vontade e a grande maioria das funções java conseguem interpreta-los
        Exemplo:

        System.out.println("\t\t\t\t"+conteudo);
        Imprime:
                        "conteudo"

        System.out.println("\t\t\t"+conteudo);
        Imprime:
                    "conteudo"

        System.out.println("\t\t"+conteudo);
        Imprime:
                "conteudo"

        System.out.println("\t"+conteudo);
        Imprime:
            "conteudo"

        */

        System.out.println("\n"+conteudo);
        System.out.println("\t"+conteudo);
    }

    static void imprimirConteudoComArgumentos(String arg1, String arg2)
    {
        /*
        A letra “f” no final da palavra "print" significa "formatted".
        Os especificadores de formato são como marcadores de lugares para um valor,
        especificando o tipo da saída dos dados que iniciam com um sinal de porcentagem (%)
        seguido por um caractere representando seu tipo de dado.
        Os valores a serem imprimidos seguem a ordem de input no "printf".
        Exemplo:

        System.out.printf("%s\n%s\n", arg1, arg2);
        Imprime:
        "arg1"
        "arg2"

        System.out.printf("%s\n%s\n", arg2, arg1);
        Imprime:
        "arg2"
        "arg1"

        %d	representa números inteiros
        %f	representa números floats
        %2f	representa números doubles
        %b	representa valores booleanos
        %c	representa valores char
        %s	representa valores string
        */

        System.out.printf("%s\n%s\n", arg1, arg2);
        System.out.printf("O usuario %b chegou antes do usuário %s", true, "Marcelo");
        String mensagem="";
        String usuario1="";
        String usuario2="";
        System.out.println(mensagem+usuario1+usuario2);
    }
}