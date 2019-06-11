package conteudos.conteudo5;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Files {
    /*
    Existem muitas formas de escrever arquivos em java, eu separei a que considero mais eficiente, que está hoje sendo utilizada na automação da fábrica
    O método BufferedWriter já cria o arquivo, se o mesmo não existir e consegue adicionar valores ao arquivo, caso seja necessário.

    O método do BufferedWriter está envolvido em um try catch por ser passado em lambda, função avançada de java que depênde de métodos de linguagem 8, será passado
    em mais detalhes no próximo módulo do curso.
     */

    private static File arquivo = new File(System.getProperty("user.dir")+"/src/test/resources/teste.log");

    public static void main(String[] args) throws IOException {
        //escrevendoArquivo();
        //lendoArquivo();
        copiandoArquivo();


    }

    static void escrevendoArquivo(){
        /*
        Caso seja necessário, pode-se usar a função "append", exibida após o nome do arquivo, para adicionar valores no arquivo sem pagar o conteúdo já existente
         */
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(arquivo, true), StandardCharsets.UTF_8))) {
            writer.write("Conteúdo\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void lendoArquivo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        /*
        A função br.readLine() faz com que o java procure a próxima linha do arquivo, portanto,
        o valor da linha considerado em br.readLine() dentro do if, validando que a linha possui algum conteúdo (não é nulo/ !null)
        é necessário ser transmitido para uma string, para então ser lido e exibido
        caso contrário, ao dar System.out.println(br.readLine()); a próxima linha seria considerada e como o nosso log possui apenas uma linha
        o valor exibido seria: null
         */
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
        br.close();
    }

    static void copiandoArquivo() throws IOException {
        File pasta = new File(System.getProperty("user.dir")+"/src/test/resources/copia");
        /*
        Para copiar o arquivo, é necessário ter a sua pasta destino criada
         */
        if (pasta.mkdir()){
            System.out.println("Pasta criada!");
        }

        /*
        Ao realizar uma cópia, se já existir um arquivo com o mesmo nome e extensão no local almejado, o mesmo será substituído

        OBS: Não há a necessidade de instanciar objetos para utiliza-los, portanto, como o segundo parâmetro, estou instanciando o objeto file
        dentro do método de cópia
         */
        FileUtils.copyFile(arquivo, new File(pasta + "/arquivo_copiado.log"));
    }
}
