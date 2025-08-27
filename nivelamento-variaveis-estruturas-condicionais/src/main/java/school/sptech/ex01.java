package school.sptech;

public class ex01 {

    public static void main(String[] args) {

        Integer crianca = 1;
        Integer adolecente = 2;
        Integer adulto = 1;
        // Integer idade = 0;
        Integer familia = (crianca + adolecente + adulto);

        Double valor1 = 25.12;
        Double valor2 = 15.88;
        Double valor3 = 12.44;
        Double total = ((crianca * 25.12) +(adolecente * 15.88) + (adulto * 12.44));

        String frase = String.format("Você tem um total de %s filhos " + "e vai receber R$ %.2f de bolsa", familia, total);
        System.out.println(frase);

    }
}
