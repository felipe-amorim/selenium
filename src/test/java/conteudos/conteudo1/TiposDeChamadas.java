package conteudos.conteudo1;

import org.testng.annotations.Test;

public class TiposDeChamadas {

    /*
        Métodos estáticos são essencialmente métodos trancados com valores definidos em tempo de compilação
        Ou seja, não conseguem acessar métodos dinâmicos em tempo de execução, por terem sua escrita feita em compilação

        **Entretanto, métodos e variáveis estáticos, aceitam novos valores em tempo de execução, quando este vem de um métodos não estáticos**

        Métodos e variáveis estáticas, podem armazenar valores mesmo com diferentes chamadas de classe e instâncias
        Exemplo:

        Em uma classe Main, temos as seguintes variáveis em tempo de compilação (Momento de execução inicial)
        static int a = 10;
        int b = 5;

        A classe Executora1 faz as seguintes modificações em tempo de execução
        a = 20;
        b = 10;

        Posteriormente, a classe Executora2 faz a seguinte chamada
        System.out.println(a);
        System.out.println(b);

        O valor imprimido em tela será:
        20
        5

        Explicação:
        Como a variável a possui o parametro static, ela armazena o valor para todas as chamadas de classe (permanece estática, imutável)
        Como a variável b não possui o parametro static, em uma nova chamada, ela tem o seu valor inicial exibido (em uma nova chamada, responde de forma dinâmica)

        OBS: chamadas à variáveis estaticas são diferentes de não estáticas, exemplo rápido de chamada correta para o caso acima:
        Main.a = 20;
        Main m = new Main();
        m.b = 10;
        
        Ou, para acessar valores não estáticos, pode-se usar Extends.

        Estudar conteúdo de diagrama de sequencia, caso necessário
         */
    
    
    public static void main(String[] args) {
        //chamarConteudoNaoEstatico("Chamado via estatico");
        chamarConteudoEstatico("Chamado via estatico");
    }

    @Test
    public void teste()
    {
        chamarConteudoEstatico("Chamado via não estatico");
        chamarConteudoNaoEstatico("Chamado via não estatico");
    }

    static void chamarConteudoEstatico(String alteracao)
    {
        System.out.println("Conteúdo estático "+alteracao);
    }

    void chamarConteudoNaoEstatico(String alteracao)
    {
        System.out.println("Conteúdo não estático "+alteracao);
    }
}
