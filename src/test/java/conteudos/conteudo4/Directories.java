package conteudos.conteudo4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Directories {

    /*
    A função mkdir() irá criar/deletar apenas diretórios ou arquivos singulares, ou seja, em caso de subpastas ou, caso alguma pasta
    do caminho do arquivo/pasta almejado não existe, e esse não seja o ultimo, o mkdir() será ignorado;

    Para múltiplos diretórios, é necessário informar ao Java que ele deve criar todas as subpastas até o arquivo/pasta almejado, para isso
    usamos a função mkdirs();
    **Para remover um diretório, incluindo o conteúdo dentro dele, seja pasta ou arquivo, deve-se usar a função FileUtils.deleteDirectory("caminho");

    Os casos de .delete, .mkdir e .mkdirs retornam boleano, ou seja, a maneira mais eficiente de se utilizar estes, seria em um if ou em um return
    Segue um exemplo de implementação de cada.
     */


    public static void main(String[] args) throws IOException {
        //criarNovaPasta();

        //removerUmaPasta();

        //criarNovaPastaComSubpastas();

        //removendoUmDiretorioDePastas();

        //criarPastaIf();

        //criarPastaRetorno();
    }

    static void criarNovaPasta()
    {
        File pasta = new File(System.getProperty("user.dir")+"/src/test/resources/teste1");
        if (!pasta.exists())
        {
            pasta.mkdir();
            System.out.println("Pasta criada!");
        }
    }

    static void criarNovaPastaComSubpastas()
    {
        File pasta = new File(System.getProperty("user.dir")+"/src/test/resources/teste1/testesub1");
        if (!pasta.exists())
        {
            pasta.mkdirs();
            System.out.println("Pasta criada!");
        }
    }

    static void removerUmaPasta()
    {
        File pasta = new File(System.getProperty("user.dir")+"/src/test/resources/teste1");
        if (pasta.exists())
        {
            pasta.delete();
            System.out.println("Pasta deletada!");
        }
    }

    static void removendoUmDiretorioDePastas() throws IOException {
        File pasta = new File(System.getProperty("user.dir")+"/src/test/resources/teste1");
        if (pasta.exists())
        {
            FileUtils.deleteDirectory(pasta);
            System.out.println("Diretório deletado!");
        }
    }

    static void criarPastaIf()
    {
        File pasta = new File(System.getProperty("user.dir")+"/src/test/resources/teste1");
        if (pasta.mkdir()){
            System.out.println("Pasta criada!");
        }else if (pasta.delete())
        {
            System.out.println("Pasta deletada!");
        }else
        {
            System.out.println("Xabu!");
        }
    }

    static boolean criarPastaRetorno()
    {
        return new File(System.getProperty("user.dir")+"/src/test/resources/teste1").exists() ?
                new File(System.getProperty("user.dir")+"/src/test/resources/teste1").delete() :
                new File(System.getProperty("user.dir")+"/src/test/resources/teste1").mkdir();
    }
}
