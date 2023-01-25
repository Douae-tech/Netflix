/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author DOUAE
 */
public class RequestCollection {

    private List<Request> requests;

    public RequestCollection() {
        this.requests = new LinkedList<Request>();
    }

    public boolean addRequest(Request request) {
        if (!requests.contains(request)) {
            requests.add(request);
            return true;
        }
        return false;
    }

    public boolean removeRequest(Request request) {
        return requests.remove(request);
    }

    public void modifyElement(Request search, Request newRequest) {
        int index = requests.indexOf(search);
        if (index >= 0) {
            requests.set(index, newRequest);
        }
    }

    public void modifyElement(String title, Request newRequest) {
        ListIterator<Request> iter = requests.listIterator();
        while (iter.hasNext()) {
            Request request = iter.next();
            if (request.getTitle().equals(title)) {
                iter.set(newRequest);
            }
        }
    }

    public ArrayList<Request> findRequestWithTitle(String title) {
        ArrayList<Request> results = new ArrayList<Request>();
        // will using Iterator instaed of IteratorList have an impact on the execution of the project?
        Iterator<Request> iter = requests.iterator();
        while (iter.hasNext()) {
            Request request = iter.next();
            if (request.getTitle().compareTo(title) == 0) {
                results.add(request);
            }
        }
        return results;
    }

    public void sortRequests(Comparator comp) {
        Collections.sort(requests, comp);
    }

    @Override
    public String toString() {
        String str = " ";
        ListIterator<Request> iter = requests.listIterator();
        while (iter.hasNext()) {
            Request request = iter.next();
            str = request.toString() + "\n";
        }
        return str;
    }
}
