public class Plant {

    private class name;

    private class latinName;

    private class annualMultiYear;

    private class continentWhereGrow;

    private class height;

    private class edibleOrNot;

    public Plant(){

    }
    public Plant (String name, String latinName, boolean annualMultiYear, String continentWhereGrow, int height, boolean edibleOrNot) {
        this.name = name;
        this.latinName = latinName;
        this.annualMultiYear = annualMultiYear;
        this.continentWhereGrow = continentWhereGrow;
        this.height = height;
        this.edibleOrNot = edibleOrNot;
    }

    public String getName(){

        return this.name;
    }

    public void setName(String name){
        this.name = name;

    }

    public String getLatinName(){
        return this.latinName;
    }
    public void setLatinName(String latinName){
        this.latinName = latinName;
    }
    public boolean getAnnulaMultiYear(){
        return this.annualMultiYear;
    }
    public void setAnnualMultiYear(boolean annualMultiYear){
        this.annualMultiYear = annualMultiYear;
    }
    public String continentWhereGrow(){

        return this.continentWhereGrow();
    }

    public void setContinentWhereGrow(String continentWhereGrow){
        this.continentWhereGrow = continentWhereGrow;

    }
    public int getHeight(){
        return this.height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public boolean getEdibleOrNot(){
        return this.edibleOrNot;
    }
    public void setEdibleOrNot(boolean edibleOrNot) {
        this.edibleOrNot = edibleOrNot;
    }

}
