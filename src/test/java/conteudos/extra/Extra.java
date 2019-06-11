package conteudos.extra;

public class Extra {

    /*
    O if/else in line, é uma maneira diferenciada, porém, muito útil de escrever ifs e elses de forma mais compacta
    Não encontrei artigos sobre/não acredito que isso impacte no processamento, pois a tomada de decisão é a mesma
    A quantidade de linhas, tirando casos de centenas, se torna dispensável para o processamento da máquina

    Para realizar o if/else in line, escrevemos a condição e em seguida, um (?) para indicar o resultado
    Para cada (?) é necessário ter um (:) subsequente, sendo o (:) a condição de saída de erro (else)

    Traduzindo ao pé da letra:
    CONDIÇÃO ? (THEN/ENTÃO) RESULTADO : (ELSE/SE NÃO) RESULTADO;
    CONDIÇÃO ? (THEN/ENTÃO) RESULTADO : (ELSE/SE NÃO) CONDIÇÃO ? (THEN/ENTÃO) RESULTADO :(ELSE/SE NÃO) RESULTADO;

    ---------------------------------------------------------------------------------------------------------------

    Para realizar um if, podemos negar o valor de qualquer condição ao inserir um (!) antes da mesma,
    contanto que a condição seja em boleanos, exemplo:
    Exemplo:

    String a = "";
    String b = "";

    if (a.equals(b))
    Verifica: se a é igual a b

    if(!a.equals(b))
    Verifica: se a é diferente de b

    Portanto, para realizar validações com boleanos, podemos apenas inserir a variável, que retornará true ou false
    Exemplo:

    boolean a = false;

    if(a)
    Verifica: se a é true

    if(!a)
    Verifica: se a é false

    OBS: Nem todas as condições permitem o uso do (!), normalmente condições com operadores lógicos não retornam boleanos
    Exemplo:
    ==, >=, <=, >, <, !=

    Para comparação com operadores lógicos, em negação, se usa (!=)
     */

    static int a = 10;
    static int b = 5;
    static int c = 15;
    static boolean d = false;

    public static void main(String[] args) {
        ifElseNormal();
        ifElseInLine();
        ifElseCompostoNormal();
        ifElseCompostoInLine();
        validarBoleanos();
    }

    static void ifElseNormal()
    {
        if (a > b)
        {
            System.out.println("A é maior que B");
        }else {
            System.out.println("B é maior que A");
        }
    }

    static void ifElseInLine()
    {
        System.out.println(a > b ? "A é maior que B" : "B é maior que A");
    }

    static void ifElseCompostoNormal()
    {
        if (b > a)
        {
            System.out.println("B é maior que A");
        }else if (b > c){
            System.out.println("B é maior que C");
        }
        else {
            System.out.println("B é a menor variável");
        }
    }

    static void ifElseCompostoInLine()
    {
        System.out.println(
                b > a ? "B é maior que A" :
                b > c ? "B é maior que C" :
                        "B é a menor variável");
    }

    static void validarBoleanos()
    {
        if (d==false)
        {
            System.out.println("O valor de d é false");
        }else{
            System.out.println("O valor de d é true");
        }

        System.out.println(d==false ? "O valor de d é false" : "O valor de d é true");

        if (!d)
        {
            System.out.println("O valor de d é false");
        }else{
            System.out.println("O valor de d é true");
        }

        System.out.println(!d ? "O valor de d é false" : "O valor de d é true");
    }
}
