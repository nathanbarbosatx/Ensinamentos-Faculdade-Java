package school.sptech;

public class ex04 {

    public static void main(String[] args) {

       String nome = "Anthony";
       Integer nota1 = 8;
       Integer nota2 = 6;
       Integer media = (nota1 + nota2)/2;

       String frase = String.format("Olá, %s. Sua média foi de %d", nome, media);
        System.out.println(frase);
    }
}
