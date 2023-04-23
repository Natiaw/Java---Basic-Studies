// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String[] args) {
        System.out.println("Hello World");
        System.out.print("Statement");
        System.out.print("  without an enter, correct?");
        System.out.println(); //pra dar o enter pq usei o print em cima

        //creating variables
        String carName = "McLaren";
        System.out.println(carName); //sem "" pq tá chamando uma variável

        int myNum = 13; //sem o "" pq é int e não uma string
        System.out.println(myNum);

        //poderia tb fazer
        int myNum2; //primeiro declarar e depois
        myNum2 = 15; //associar um valor à ele
        System.out.println(myNum2);

        //se eu disser agora que
        myNum = 21; // acabo de mudar o value de myNum A PARTIR de agora;
        System.out.println(myNum);

        //pra criar constante imutável usa-se o FINAL statement
        final int myNum3 = 27; //agora ele não muda;

        //posso declarar variáveis lado a lado
        int a = 5, b = 7, c = 9;

        //combinar texto e variáveis
        String name = "NATHALIE";
        System.out.println("Era uma vez uma " + name);

        //juntar strings
        String firstName = "Paolo ";
        String secondName = "Cagol";
        String fullName = firstName + secondName;
        System.out.println(fullName);

        //PORÉM se fizer o + com numeros, ele soma mesmo
        System.out.println(a+b+c+myNum3);

        //e se agora eu disser que minhas variáveis são iguais, funciona?
        a = b = c;
        System.out.println(b); //funciona, agora eles todos tem o ultimo valor. CRAZY

        //e como ja mudou o valor se eu disser que c = b = a... continua sendo 9, certo?
        c = b = a;
        System.out.println(a); //certo

        //bolean types are for True, false... yes, no... on, off... basically 0, 1
        boolean isJavaFun = true;
        boolean isNathiFun = false;
        System.out.println(isJavaFun);
        System.out.println(isNathiFun);

        //pode fazer display de char com ASCII values
        char myASCII1 = 67;
        char myASCII2 = 'C'; //detalhe que é maiúsculo
        System.out.println(myASCII1 + myASCII2); //ops deu erro
        System.out.println(myASCII1 + ' ' + myASCII2); //ta somando valor ASCII ainda
        System.out.println(myASCII1 + " " + myASCII2); //fixed. yay.

        //transform a double into int (or more in less)
        double myExample = 9.31d;
        int myIntExample = (int) myExample;
        System.out.println(myExample + " " + myIntExample);

        //pra crescer na vida não precisa dos parênteses
        int imInt = 7;
        double letsGrow = imInt;
        System.out.println(imInt + " " + letsGrow); //adds .0 to show off

        //Agora vamos acessar os operadores
        //posso somar variavel com value, ovvio
        int sum1 = a + 30;
        System.out.println(sum1);

        //increment ++x decrenent --x
        ++a;
        System.out.println(a); //era 9 pq igualei lá em cima, agora é 10
        --b;
        System.out.println(b); //esse vira um 8

        //incrementar por 2? ou faz duas vezes ++a ++a ou
        a+=2;
        System.out.println(a); //deve ser 12, right? yep

        //nao esquecer que % é modulo, resto da divisão

        //>> shifts binary ;p

        //tb tem os operadores de comparação == != > >= etc
        //e os logical que retornam true or false

       boolean letsCheck = b < a && b < c;
       boolean letsCheck2 = a < b && b < c;
        System.out.println(letsCheck + " " + letsCheck2);

        //strings now. which are objetcs. So we can use methods that perform operations;
        String minhaString = "this is a text to check the operations";
        System.out.println("O tamanho dessa string eh: " + minhaString);
        //clearly i forgot the operator
        System.out.println("O tamanho dessa string eh: " + minhaString.length()); //counted.  correct.

        //.toUpperCase() or lower, pra mudar a string pra caps ou nao

        //oh there is a locate one, interesting
        System.out.println(minhaString.indexOf("check")); //posição conta do 0, então check começa no 18. right?
        //right;

        // que nem la em cima com o char, o + vai concatenar duas strings
        //pra concatenar de forma justa, bonitinha, organizada usa o concat
        String oi = "oie";
        String eai = "eaii";
        System.out.println(oi+eai);
        System.out.println(oi.concat(eai));

        //se eu quiser confundir o miolos, posso adicionar strings compostas de numeros
        //e nao vao fazer operações pq sao strings, ovviamente

        String n = "134", f = "354";
        System.out.println(n+f); //e teremos 134354

        //se add numero e string, ainda eh uma concatenação
        System.out.println(n+f+a);

        //e se quiser digitar bonitinho tem que usar metodos \' \" \\ assim
        //tb tem o \n \t \b etc
        String novoMetodo = "I\'m Natinha \nMendonçinha";
        System.out.println(novoMetodo);

        //MATHS eh o mesmo de sempre .max(a,b) .min .sqrt etc

        //learning if else e else if statements

        int mes = 3;
        if (mes < 2) {
            System.out.println("You still have time to pay your rent");
        } else if (mes == 3) {
            System.out.println("This is the month to pay your year rent");
        } else {
            System.out.println("Boy, the time has passed. Taxes will be applied");
        }

        //ovviamente essas coisas se fazem perguntando ao usuario :v se não é sempre março heh

        //tb podemos usar nosso amigo condição ? true  : false

        String result = (mes > 3) ? "rent is missing" : "you're still on time baby";
        System.out.println(result);

        //tb tem o switch... pra não escrever uma emaranhada de elses ifs

        switch(mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;

                //etc
        }

        //quando o programa encontra a condição que precisa, ele quebra (break)
        // e quando nao há condições específicas a gente só add o default, ele testa as condições existentes, se não corresponde entra em default mode
        // default: sout("retype your month, mylady");

        //programas tb entram em loop, com o while... enquanto o que eu quero nao acontecer, continua aí dentro da minha função

        int k = 13;
        while (k <= 17) { //confere
            System.out.println(k); //printa ele primeiro
            k++; //depois incrementa, volta o loop, printa de novo...
        }

        //outra syntax é do/while... faça algo enquanto o que eu quero nao aconteceu
        //a dif é que ele executa a condição primeiro, mesmo que seja falsa, pq ela é requisita a execução antes de ser testada

        int l = 13;
        do {
            System.out.println(l); //printa
            l++; //implementa
        } while (l<=17); //confere

        //e aí tem o for, o meu preferido
        //quando sei exatamente como quero o meu loop, uso o for

        for(int q = 13; q >= 13 && q < 21; q++) { //para um ini q, enquanto ele for maior/igual a 13 e menor que 21, incrementa pf
            System.out.println(q);
        }

        //e ai chega o for-each para arrays

        String[] clubes = {"Gremio", "Liverpool", "Milan", "Benfica"};
        for (String r : clubes) {
            System.out.println(r); //para cada vez q r passa nos clubes, printa eles
        }

        //tb se pode usar break e continue dentro dos statements...
        // while tal coisa, if tal coisa, faz algo e continue/break;

        //Arrays - lembrando que pra acessar um elemento deve-se usar o []
        System.out.println(clubes[0]); //posição zero é sempre o primeiro

        //quero trocar um elemento?
        clubes[3] = "Porto FC";

        //tamanho de um array? clubes.length

        //loop in array? seja esperto, use o length
        for (int u = 0; u < clubes.length; u++) {
            System.out.println(clubes[u]);
        }

        //e pra terminar a sintaxe base, temos loop in arrays multidimensionais (matrizes)

        int[][] numerosTeste = {{1,2,3,4},{5,6,7}};
        for (int t = 0; t < numerosTeste.length; t++) {
            for (int y = 0; y <= numerosTeste.length; y++) { //troca as condições pra ver como que printa
                System.out.println(numerosTeste[t][y]);
            }
        }

        //exemplo mais generico aqui

        int [][] board = new int [4][4]; //cria uma tabela 4*4

        //popular a tabela
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = row * col;
                //row na 0, col 0 printa 0*0 0
                //row na 0, col 1 printa 0*1 = 0 até o 3 * 0 = 0
                //row na 1, col 0 printa 1*0 = 0 até o 1*3 = 3
                //row na 2, col 0 printa 2*0 = 0, row 2, col 1 -> 2*1 = 2 até 2*3=6
                //row na 3, col 0 3*0 = 0, 3*1 = 3. 3*2 = 6, 3*3=9

                //obviamente nao ta printando pq nao fiz a funcao print ainda
                // pra printar add dntro do segunddo for um sout print (board[row][col] + "\t");
                //e um soutln
            }
        }

        //basic of java coding finished, next step: methods and classes


    }

}
