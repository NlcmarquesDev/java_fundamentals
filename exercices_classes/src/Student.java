public class Student {
    public String name;
    public double firstTrimetre;
    public double secondTrimetre;
    public double theerdTrimetre;

    public double finalScore(){
        return firstTrimetre + secondTrimetre + theerdTrimetre;
    }

    public void checkScore(double score){
        if (score >= 60) {
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            double missing = 60 - score;
            System.out.println("MISSING " + missing + " POINTS");
        }
    }

}
