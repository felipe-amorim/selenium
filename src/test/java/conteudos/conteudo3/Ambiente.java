package conteudos.conteudo3;

public class Ambiente {
    /*
    Capturar os elementos, caminhos, variáveis de ambiente, variáveis do sistema, entre outros, pode poupar muito trabalho na
    construção de um software visando portabilidade
    Ou seja, um projeto criado na máquina A que utiliza variáveis de captura de ambiente dinamicos, pode ser executado na máquina B
    com o mínimo de retrabalho, pois o mesmo já irá capturar automáticamente as informações do sistema e diretórios necessários para
    executar as suas determinadas funções.
     */
    public static void main(String[] args) {
        capturarNomeClasse();
        capturarNomeClasseSimples();
        capturarVariaveisDeSistema();
    }

    /*
    Nomes de classes são considerados à partir da pasta java executável do projeto, seja test ou main
    Ou seja, o valor de caminho da classe só pode ser DENTRO da pasta java executável

    **Pasta Java é definida nos módulos do projeto, é basicamente à partir de qual diretório a máquina irá processar arquivos, interpretando a linguagem Java**

    Para acessar os módulos, clicar com o botão direito na pasta raiz do projeto e acessar o menu "Open Module Settings" ou pressionar F4 e então, acessar a aba "Sources"
     */

    static void capturarNomeClasse()
    {
        //caso o método não fosse estático, a chamada de classe seria this.getClass().getName()
        System.out.println(Ambiente.class.getName());
    }

    static void capturarNomeClasseSimples()
    {
        //caso o método não fosse estático, a chamada de classe seria this.getClass().getSimpleName()
        System.out.println(Ambiente.class.getSimpleName());
    }

    static void capturarVariaveisDeSistema()
    {
        /*
        Existem outras variáveis de sistema, listei as que considero mais importantes
         */

        System.out.println("Caminho raiz do projeto: "+ System.getProperty("user.dir"));
        System.out.println("Sistema operacional: "+ System.getProperty("os.name"));
        System.out.println("Arquitetura do OS: "+ System.getProperty("os.arch"));
        System.out.println("Versão do OS: "+ System.getProperty("os.version"));
        System.out.println("Versão do Java: "+ System.getProperty("java.version"));
        System.out.println("Usuário de execução: "+ System.getProperty("user.name"));
    }
}
