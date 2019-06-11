package suites;

import org.testng.annotations.*;
import support.Core;

import static objetos.Ambiente.*;
import static objetos.Login.*;

public class Executora extends Core {
    @BeforeClass
    public void beforeClass()
    {
        removepasta();
        escrevendoarquivo();
    }

    @BeforeMethod
    public void beforeMethod()
    {
        criarChromeDriver();
        escrevendoarquivo();
    }

    @AfterMethod
    public void afterMethod()
    {

        fecharChromeDriver();
        escrevendoarquivo();
    }

    @AfterClass
    public void afterClass()
    {
        escrevendoarquivo();
    }

    @Test
    public void teste1()
    {
        navegar(urlLogin);
        click(loginButtonLogin);
        print();
    }
    @Test
    public void teste2()
    {
        crianovapasta();
        escrevendoarquivo();
    }
}
