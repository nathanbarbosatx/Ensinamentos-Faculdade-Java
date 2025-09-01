package school.sptech;

public class ex02 {

    public static void main(String[] args) {

        Integer aquecimento = 5;
        Integer exaerobico = 10;
        Integer exmusuclacao =45;

        Integer calorias = ((aquecimento * 12) + (exaerobico * 20) + (exmusuclacao * 25));
        Integer tempo = aquecimento + exaerobico + exmusuclacao;

        String frase = String.format("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.", tempo, calorias);
        System.out.println(frase);

    }
}
