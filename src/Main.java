class Series{
private String seriesName;
private int NumberOfSeasons;
private String MainActors;
private String IsFinished;

    public Series(String seriesName, int NumberOfSeasons, String MainActors, String IsFinished){

        this.seriesName = seriesName;
        this.NumberOfSeasons = NumberOfSeasons;
        this.MainActors = MainActors;
        this.IsFinished = IsFinished;

    }
    public String getSeriesName(){
        return seriesName;
    }
    public int hetNumberOfSeasons(){
        return NumberOfSeasons;
    }
    public String getMainActors(){
        return MainActors;
    }
    public String getIsFinished(){
        return IsFinished;
    }
    public String FullDetails(){
        return ("Name: "+ seriesName+ "\nNumber of seasons: "+ NumberOfSeasons+"\nCast: "+MainActors+"\nStatus: "+ IsFinished);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("----List of Series----");
        Series s1 = new Series("WandaVision", 1, "Elizabeth Olsen, Paul Bettany", "Finished");
        Series s2 = new Series("Hawkeye", 1, "Jeremy Renner, Haille Steinfeld", "To be continued");
        Series s3 = new Series("Orphan Black", 5, "Tatiana Maslany, Jordan Gavaris", "Finished");
        System.out.println(s1.FullDetails());
        System.out.println("----------------------");
        System.out.println(s2.FullDetails());
        System.out.println("----------------------");
        System.out.println(s3.FullDetails());


    }
}
