public class RestoraniArve {

    private double arveSuurus;
    private int tip;
    private double koguSumma;

    public RestoraniArve(double arveSuurus) {
        this.arveSuurus = arveSuurus;
        this.tip = (int) Math.round(arveSuurus * 0.1);
        this.koguSumma = arveSuurus + tip;
    }

    public double getArveSuurus() {
        return arveSuurus;
    }

    public int getTip() {
        return tip;
    }

    public double getKoguSumma() {
        return koguSumma;
    }

    public static void main(String[] args) {
        RestoraniArve arve = new RestoraniArve(36.0);
        System.out.println("Arve " + arve.getArveSuurus() + "€; Tip " + arve.getTip() + "; Kokku " + arve.getKoguSumma() + "€");
    }
}