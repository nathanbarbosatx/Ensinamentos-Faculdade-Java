package school.sptech;

public class ex04 {

    public static void main(String[] args) {

        String nome = "Anthony";
        Double nota1 = 9.5;
        Double nota2 = 5.75;
        Double media = ((nota1 + nota2)/2);

        String frase = String.format("Olá, %s ." + " Sua média foi de %.2f", nome, media);
        System.out.println(frase);
    }
}
