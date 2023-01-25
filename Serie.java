package Shows;

import Features.Language;
import java.util.ArrayList;
import java.util.HashMap;

public class Serie extends Show {

    HashMap<Integer, Integer> objMap;
    private int numberOfSeasons;

    public Serie(String title, ArrayList<Genre> genres, int num_views, String lang, String Synopsis, double average_rating, String quality, int numberOfSeasons) {
        super(title, genres, num_views, lang, Synopsis, average_rating, quality);
        objMap = new HashMap<Integer, Integer>();
        this.numberOfSeasons = numberOfSeasons;

    }

    public Serie(String title, ArrayList<Genre> genres, int num_views, Language lang, String Synopsis, double average_rating, String quality, int numberOfSeasons) {
        super(title, genres, num_views, lang, Synopsis, average_rating, quality);
        objMap = new HashMap<Integer, Integer>();
        this.numberOfSeasons = numberOfSeasons;

    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public void setNumberOfEpisodes(int SeasonNumber, int numberOfEpisodes) {
        objMap.put(SeasonNumber, numberOfEpisodes);
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.numberOfSeasons + " ";

    }

}
