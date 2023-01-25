package Shows;

import Features.Language;
import Features.Quality;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author DOUAE
 */
public class ShowList {

    private List<Show> shows;
    public static final String DIR_PATH = System.getProperty("user.dir") + File.separator + "data";

    public static final String FILE_PATH = DIR_PATH + File.separator + "netflix.ser";

    //public static final String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "netflix.ser";
    public ShowList() {
        this.shows = new ArrayList<Show>();
        initData();
    }

    public void initData() {

        ArrayList<Genre> g1 = new ArrayList();
        g1.add(Genre.ACTION);
        g1.add(Genre.DRAMA);
        ArrayList<Genre> g2 = new ArrayList();
        g2.add(Genre.DRAMA);
        g2.add(Genre.ROMANCE);
        ArrayList<Genre> g3 = new ArrayList();
        g3.add(Genre.DRAMA);
        g3.add(Genre.ROMANCE);

        Show s1 = new Serie("Prison Break", g1, 867000, Language.FRENCH, """
                                                                              An innocent man is framed for the homicide of the vice President's brother and scheduled to be executed at a super-max penitentiary
                                                                              Thus, it's up to his younger brother to save him with his genius scheme: install himself in the same prison by holding up a bank.
                                                                              As the final mounth ticks away, launch the escape plan step-by-step to break the both of them out,
                                                                              with his full body tattoo acting as his guide; a tattoo which hides the layout of the prison facility and necessary clues vital to the escape.""", 8.3, Quality.HD.toString(), 5);

        Show s2 = new Movie("Sense and Sensibility", g2, 45456, Language.ENGLISH, "Rich Mr.Dashwood dies, leaving his second wife and her daughters poor by the rules of inheritance."
                + "Two daughters are the titular opposite.", 7.5, Quality.ULTRA_HD.toString(), 136);

        Show s3 = new Movie("Titanic", g3, 20000, Language.CHINESE, """
                                                                              101-year-old Rose DeWitt Bukater tells the story of her life aboard the Titanic, 84 years later.
                                                                              A young Rose boards the ship with her mother and fianc\u00e9. Meanwhile, Jack Dawson and Fabrizio De Rossi win third-class tickets aboard the ship.
                                                                              Rose tells the whole story from Titanic's departure through to its death on its first and last voyage on April 15, 1912.""", 7.8, Quality.HD.toString(), 194);

        shows.add(s1);
        shows.add(s2);
        shows.add(s3);

    }

    public boolean addShow(Show show) {
        if (!shows.contains(show)) {
            shows.add(show);
            return true;
        }
        return false;
    }

    public boolean removeShow(Show show) {
        return shows.remove(show);
    }

    public void modifyElement(Show search, Show newShow) {
        int index = shows.indexOf(search);
        if (index >= 0) {
            shows.set(index, newShow);
        }
    }

    public void modifyElement(String title, Show newShow) {
        ListIterator<Show> iter = shows.listIterator();
        while (iter.hasNext()) {
            Show show = iter.next();
            if (show.getTitle().equals(title)) {
                iter.set(newShow);
            }
        }
    }

    public ArrayList<Show> findShowWithTitle(String title) {
        ArrayList<Show> results = new ArrayList<Show>();

        Iterator<Show> iter = shows.iterator();
        while (iter.hasNext()) {
            Show show = iter.next();
            if (show.getTitle().compareTo(title) == 0) {
                results.add(show);
            }
        }
        return results;
    }

    public boolean modifyShow(String title, Show newShow) {
        if (findShowWithTitle(title).isEmpty()) {
            return false;
        }
        ListIterator<Show> iter = shows.listIterator();
        while (iter.hasNext()) {
            Show s = iter.next();
            if (s.getTitle().equals(title)) {
                iter.set(newShow);
            }
        }
        return true;
    }

    public boolean modifyShow(Show search, Show newShow) {
        if (!shows.contains(search)) {
            return false;
        }
        int index = shows.indexOf(search);
        if (index >= 0) {
            shows.set(index, newShow);
        }
        return true;
    }

    public ArrayList<Show> findShowWithGenre(Genre SearchedGenre) {
        ArrayList<Show> results = new ArrayList<Show>();
        Iterator<Show> iter = shows.iterator();
        while (iter.hasNext()) {
            Show show = iter.next();
            ArrayList<Genre> genres = show.getGenres();
            for (int i = 0; i < genres.size(); i++) {
                if (genres.get(i).compareTo(SearchedGenre) == 0) {
                    results.add(show);
                }
            }
        }
        return results;
    }

    public void sortShows(Comparator comp) {
        Collections.sort(shows, comp);
    }

    public void load() throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream(ShowList.FILE_PATH);
        ObjectInputStream in = new ObjectInputStream(fin);
        shows = (ArrayList<Show>) in.readObject();

        System.out.println("Deserialized shows saved in " + ShowList.FILE_PATH);
        in.close();
        fin.close();
    }

    public void save() throws IOException {
        File f = new File(this.DIR_PATH);
        if (!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
        }

        FileOutputStream fout = new FileOutputStream(ShowList.FILE_PATH, false);
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(this.shows);

        out.close();
        fout.close();

        System.out.println("Serialized shows saved in " + ShowList.FILE_PATH);

    }

    public List<Show> getShowList() {
        return shows;
    }

    @Override
    public String toString() {
        String str = " ";
        ListIterator<Show> iter = shows.listIterator();
        while (iter.hasNext()) {
            Show show = iter.next();
            str = show.toString() + "\n";
        }
        return str;
    }
}
