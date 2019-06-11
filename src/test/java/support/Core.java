package support;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public class Core {
    public static WebDriver navegador;

    public void criarChromeDriver()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        navegador.manage().window().maximize();
    }

    public void fecharChromeDriver()
    {
        navegador.quit();
    }

    public void navegar(String url)
    {
        navegador.get(url);
    }

    public void click(String xpath)
    {
        navegador.findElement(By.xpath(xpath)).click();
    }

    public void esperar(int tempo) throws InterruptedException {
        Thread.sleep(tempo);
    }

    public void print()
    {
        File screenshot = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);
    }

    public void crianovapasta() {
        File pasta = new File(System.getProperty("user.dir")+"/src/test/resources/teste2");
        if (!pasta.exists())
        {
            pasta.mkdir();
            System.out.println("Pasta criada!");
        }
    }

    public void escrevendoarquivo() {
        File arquivo = new File(System.getProperty("user.dir")+"/src/test/resources/Resultado.log");
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(arquivo, true), StandardCharsets.UTF_8))) {
            writer.write("teste aula 1\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void removepasta (){
        File pasta = new File(System.getProperty("user.dir")+"/src/test/resources/teste2");
        if (pasta.exists())
        {
            pasta.delete();
            System.out.println("Pasta deletada!");
        }
    }
}
