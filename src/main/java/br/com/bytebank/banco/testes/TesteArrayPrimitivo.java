package br.com.bytebank.banco.testes;

public class TesteArrayPrimitivo {

    //Array
    public static void main(String[] args) {

        int[] idades = new int[5];
        for(int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

/*        //int idade1 = 29;

        int[] idades = new int[5];

        idades[0] = 9;
        idades[1] = 19;
        idades[2] = 29;
        idades[3] = 39;
        idades[4] = 49;

        int idade1 = idades[0];

        System.out.println(idade1);
        System.out.println(idades.length);*/

    }

}
