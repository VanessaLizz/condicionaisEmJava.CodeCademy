package aulas;

class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String langName, int speakers, String regions, String order){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = order;
    }

    public static void main (String[] args){

    }
}
