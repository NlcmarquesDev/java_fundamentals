public class Converter {
    public double dollarPrice;
    public double buy;
    public double iof = 1.06;


    public double convertReal(double dollar, double qty){
            double totalDollar = (dollar *  qty) * iof;
            return totalDollar;
    }


}
