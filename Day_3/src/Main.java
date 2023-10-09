import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
//        CRIAR UMA CURRENT COIN, ela aceda a moeda interna do computador
//        NumberFormat euro = NumberFormat.getCurrencyInstance();
//        String productValue = euro.format(1120.80);
//
//        System.out.println(productValue);

//        int priceProduct = 15;
//        boolean buy = priceProduct >= 10 && priceProduct <= 15;
//
//        System.out.println(buy);
//        boolean temEmprego = false;
//        boolean temEmpresa = true;
//        boolean tem50k = true;
//        boolean podeFInanciar = (temEmpresa || temEmpresa) && tem50k;
//
//        System.out.println(podeFInanciar);

        int precoAuto = 80_100;

        if(precoAuto >= 90_000 && precoAuto <= 100_000)
            System.out.println("Pode Comprar, esta dentro dos valores");
        else if (precoAuto > 100_000)
            System.out.println("Valor acima das nossas condicoes");
        else
            System.out.println("Valor abaixo , deve estar com algum problema, tenha atencao");





    }
}