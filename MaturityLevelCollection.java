/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Features;

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
public class MaturityLevelCollection {

    private List<MaturityLevel> maturityLevels;

    public MaturityLevelCollection() {
        this.maturityLevels = new ArrayList<MaturityLevel>();
    }

    public boolean addMaturityLevel(MaturityLevel maturityLevel) {
        if (!maturityLevels.contains(maturityLevel)) {
            maturityLevels.add(maturityLevel);
            return true;
        }
        return false;
    }

    public boolean removeMaturityLevel(MaturityLevel maturityLevel) {
        return maturityLevels.remove(maturityLevel);
    }

    public void modifyElement(MaturityLevel search, MaturityLevel newMaturityLevel) {
        int index = maturityLevels.indexOf(search);
        if (index >= 0) {
            maturityLevels.set(index, newMaturityLevel);
        }
    }

    public void modifyElement(String description, MaturityLevel newMaturityLevel) {
        ListIterator<MaturityLevel> iter = maturityLevels.listIterator();
        while (iter.hasNext()) {
            MaturityLevel maturityLevel = iter.next();
            if (maturityLevel.getDescription().equals(description)) {
                iter.set(newMaturityLevel);
            }
        }
    }

    public ArrayList<MaturityLevel> findMaturityLevelWithEmail(String email) {
        ArrayList<MaturityLevel> results = new ArrayList<MaturityLevel>();
        // will using Iterator instaed of IteratorList have an impact on the execution of the project?
        Iterator<MaturityLevel> iter = maturityLevels.iterator();
        while (iter.hasNext()) {
            MaturityLevel maturityLevel = iter.next();
            if (maturityLevel.getDescription().compareTo(email) == 0) {
                results.add(maturityLevel);
            }
        }
        return results;
    }

    public void sortMaturityLevels(Comparator comp) {
        Collections.sort(maturityLevels, comp);
    }

    @Override
    public String toString() {
        String str = " ";
        ListIterator<MaturityLevel> iter = maturityLevels.listIterator();
        while (iter.hasNext()) {
            MaturityLevel maturityLevel = iter.next();
            str += maturityLevel.toString() + "\n";
        }
        return str;
    }
}
