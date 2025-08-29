package school.sptech;

public class ex01 {

    public static void main(String[] args) {

       Integer nenem = 3;
       Integer crianca = 1;
       Integer jovemadulto =1;
       Integer totalfilho = nenem + crianca + jovemadulto;

       Double bolsanenem = (25.12 * nenem) + (15.88 * crianca) + (12.44 * jovemadulto);

       String frase =String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa",totalfilho, bolsanenem);
        System.out.println(frase);
    }
}
