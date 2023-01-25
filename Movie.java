package Shows;

import Features.Language;
import java.util.ArrayList;

public class Movie extends Show {

    private int durationOfTheMovie;

    public Movie(String title, ArrayList<Genre> genres, int num_views, String lang, String Synopsis, double average_rating, String quality, int durationOfTheMovie) {
        super(title, genres, num_views, lang, Synopsis, average_rating, quality);
        this.durationOfTheMovie = durationOfTheMovie;
    }

    public Movie(String title, ArrayList<Genre> genres, int num_views, Language lang, String Synopsis, double average_rating, int total_watch, String quality, int durationOfTheMovie) {
        super(title, genres, num_views, lang, Synopsis, average_rating, quality);
        this.durationOfTheMovie = durationOfTheMovie;
    }

    public Movie(String title, ArrayList<Genre> genres, int num_views, Language lang, String Synopsis, double average_rating, String quality, int durationOfTheMovie) {
        super(title, genres, num_views, lang, Synopsis, average_rating, quality);
        this.durationOfTheMovie = durationOfTheMovie;
    }

    public int getDurationOfTheMovie() {
        return durationOfTheMovie;
    }

    public void setDurationOfTheMovie(int durationOfTheMovie) {
        this.durationOfTheMovie = durationOfTheMovie;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.durationOfTheMovie + "min";

    }
}
