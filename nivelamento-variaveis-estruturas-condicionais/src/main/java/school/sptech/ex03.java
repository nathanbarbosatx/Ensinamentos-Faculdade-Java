package school.sptech;

public class ex03 {

    public static void main(String[] args) {

        Integer valorcafe = 12;
        Integer qtdcafe = 5;
        Integer valorpago = (valorcafe * qtdcafe);
        Integer dinheirocliente = 100;
        Integer troco = (dinheirocliente - valorpago);

        String frase = String.format("Seu troco será de R$ %s",troco);
        System.out.println(frase);
    }
}
