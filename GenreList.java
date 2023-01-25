/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

/**
 *
 * @author DOUAE
 */
public class GenreList {

    private ArrayList<Genre> genres;

    public GenreList() {
        this.genres = new ArrayList();
    }

    public boolean addGenre(Genre genre) {
        if (!genres.contains(genre)) {
            genres.add(genre);
            return true;
        }
        return false;
    }

    public boolean removeGenre(Genre genre) {
        return genres.remove(genre);
    }

    public void modifyElement(Genre search, Genre newGenre) {
        int index = genres.indexOf(search);
        if (index >= 0) {
            genres.set(index, newGenre);
        }
    }

    public void sortGenres(Comparator comp) {
        Collections.sort(genres, comp);
    }

    @Override
    public String toString() {
        String str = " ";
        ListIterator<Genre> iter = genres.listIterator();
        while (iter.hasNext()) {
            Genre genre = iter.next();
            str = genre.toString() + "\n";
        }
        return str;
    }

}
