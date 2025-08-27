package school.sptech;

public class ex02 {

    public static void main(String[] args) {

        Integer aquecimento = 5;
        Integer exaerobico = 15;
        Integer exmusculacao = 45;
        Integer total = (aquecimento + exaerobico + exmusculacao);

        Double kalaquecimento = (aquecimento * 12.0);
        Double kalaero = (exaerobico * 20.0);
        Double kalmusc = (exaerobico * 25.0);
        Double totalkal = (kalaquecimento + kalaero + kalmusc);

        String frase = String.format("Olá, Jorge. Você fez um total de %s minutos de exercícios " + "e perdeu cerca de % .2f calorias.", total, totalkal);
        System.out.println(frase);

    }
}
