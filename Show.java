package Shows;

import Features.Language;
import Features.Quality;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.ListIterator;

public class Show implements Serializable {

    public static final long serialVersionUID = -2183274224233349658L;
    private String title;
    private GregorianCalendar release_date;
    private Quality quality;
    private ArrayList<Genre> genres;
    private Language lang;
    //private ArrayList <String> names;
    private int num_views;
    private String Synopsis;
    private double average_rating;
    //private MaturityLevelCollection levels;

    public Show(String lang) {
        if (lang.equalsIgnoreCase(Language.ENGLISH.name())) {
            this.lang = Language.ENGLISH;
        } else if (lang.equalsIgnoreCase(Language.FRENCH.name())) {
            this.lang = Language.FRENCH;
        } else if (lang.equalsIgnoreCase(Language.CHINESE.name())) {
            this.lang = Language.CHINESE;
        } else if (lang.equalsIgnoreCase(Language.SPANISH.name())) {
            this.lang = Language.SPANISH;
        } else if (lang.equalsIgnoreCase(Language.ARABIC.name())) {
            this.lang = Language.ARABIC;
        } else {
            this.lang = Language.KOREAN;
        }
    }

    public Show(String title, ArrayList<Genre> genres, int num_views, String Lang, String Synopsis, double average_rating, String quality) {
        this(Lang);
        this.release_date = new GregorianCalendar();
        this.title = title;
        this.genres = genres;
        this.num_views = num_views;
        this.Synopsis = Synopsis;
        this.average_rating = average_rating;
        this.quality = Quality.valueOf(quality);
        //this.levels=new MaturityLevelCollection();
    }

    /*public Show(GregorianCalendar release_date, String title, int num_views, String Lang, String Synopsis, double average_rating, String quality){
    this(Lang);
    this.release_date = release_date; 
    this.title=title;
    this.genres=new GenreCollection();
    this.num_views=num_views;
    this.Synopsis=Synopsis;
    this.average_rating=average_rating;
    this.quality=Quality.valueOf(quality);
    this.levels=new MaturityLevelCollection();
    }*/
    public Show(String title, ArrayList<Genre> genres, int num_views, Language Lang, String Synopsis, double average_rating, String quality) {
        this.release_date = new GregorianCalendar();
        this.title = title;
        this.genres = genres;
        this.num_views = num_views;
        this.lang = Lang;
        this.Synopsis = Synopsis;
        this.average_rating = average_rating;
        this.quality = Quality.valueOf(quality);
        //this.levels=new MaturityLevelCollection();
    }

    /*public Show(GregorianCalendar release_date, String title, int num_views, Language Lang, String Synopsis, double average_rating, String quality){
    this.release_date = release_date; 
    this.title=title;
    this.genres=new GenreCollection();
    this.num_views=num_views;
    this.lang=Lang;
    this.Synopsis=Synopsis;
    this.average_rating=average_rating;
    this.quality=Quality.valueOf(quality);
    this.levels=new MaturityLevelCollection();
    }*/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GregorianCalendar getRelease_date() {
        return release_date;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = Quality.valueOf(quality);
    }

    public void setRelease_Date(int year, int month, int day) {
        release_date.set(GregorianCalendar.YEAR, year);
        release_date.set(GregorianCalendar.MONTH, month);
        release_date.set(GregorianCalendar.DATE, day);
    }

    public Language getLanguage() {
        return lang;
    }

    public void setLanguage(String lang) {
        this.lang = Language.valueOf(lang);
    }

    public int getNum_views() {
        return num_views;
    }

    public void setNum_views(int num_views) {
        this.num_views = num_views;
    }

    public String getSynopsis() {
        return Synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.Synopsis = synopsis;
    }

    public double getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }

    /* public MaturityLevelCollection getLevels(){
        return levels;
    }
    
    public void setLevels(MaturityLevelCollection levels){
        this.levels=levels;
    }*/
    public String getGenre() {
        String str = " ";
        ListIterator<Genre> iter = genres.listIterator();
        while (iter.hasNext()) {
            Genre genre = iter.next();
            str += genre.toString() + " ";
        }
        return str;
    }

    public Genre getMainGenre() {
        return genres.get(0);
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Show) {
            Show s = (Show) obj;
            return s.getTitle().equals(this.title);
        }
        return false;
    }

    @Override
    public String toString() {
        return (this.title + " " + release_date.get(GregorianCalendar.DATE)
                + "/" + release_date.get(GregorianCalendar.MONTH) + "/"
                + release_date.get(GregorianCalendar.YEAR) + " " + lang.name().toLowerCase() + " " + this.num_views + " " + this.Synopsis + "  " + this.average_rating + " " + this.quality.toString()
                + " " + this.genres.toString());
    }
}
