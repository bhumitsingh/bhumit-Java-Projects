public class Marksheet extends Student{
    private int mathematicsMARKS,scienceMARKS,socialScienceMARKS,englishMARKS,hindiMARKS;

    public int getScienceMARKS() {
        return scienceMARKS;
    }

    public void setScienceMARKS(int scienceMARKS) {
        this.scienceMARKS = scienceMARKS;
    }

    public int getSocialScienceMARKS() {
        return socialScienceMARKS;
    }

    public void setSocialScienceMARKS(int socialScienceMARKS) {
        this.socialScienceMARKS = socialScienceMARKS;
    }

    public int getEnglishMARKS() {
        return englishMARKS;
    }

    public void setEnglishMARKS(int englishMARKS) {
        this.englishMARKS = englishMARKS;
    }

    public int getHindiMARKS() {
        return hindiMARKS;
    }

    public void setHindiMARKS(int hindiMARKS) {
        this.hindiMARKS = hindiMARKS;
    }

    public int getMathematicsMARKS() {
        return mathematicsMARKS;
    }

    public void setMathematicsMARKS(int mathematicsMARKS) {
        this.mathematicsMARKS = mathematicsMARKS;
    }

    Marksheet(String name, int roll_no, int pendingFee) {
        super(name, roll_no, pendingFee);
    }

    void display2(){

    }


}
