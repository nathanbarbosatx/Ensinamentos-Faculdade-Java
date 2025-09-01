package school.sptech;

public class ex03 {

    public static void main(String[] args) {

        Integer cafeqtd = 3;
        Integer cafevalor = 15;
        Integer clientepagou = 55;
        Integer conta = cafeqtd * cafevalor;
        Integer troco = clientepagou - conta;

        String frase = String.format("Seu troco será de R$ %d", troco);
        System.out.println(frase);
    }
}
