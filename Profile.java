/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

import Features.MaturityLevel;
import Features.Language;
import Shows.Show;
import Shows.ShowList;

public class Profile {

    private String name;
    private MaturityLevel level_restriction;
    private String email;
    private boolean toNotify;
    private String language;
    //private Playback playback;
    private boolean subtitles;
    private ShowList favorites;
    private ShowList blocked;
    private Language subtitle_lang;

    public Profile(String name, MaturityLevel level_restriction, String email, boolean toNotify, String language, boolean subtitles) {
        this.name = name;
        this.level_restriction = level_restriction;
        this.email = email;
        this.toNotify = toNotify;
        this.language = language;
        this.subtitles = subtitles;
        this.favorites = new ShowList();
        this.blocked = new ShowList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MaturityLevel getMaturityLevel() {
        return level_restriction;
    }

    public void setMaturityLevel(MaturityLevel level_restriction) {
        this.level_restriction = level_restriction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean getToNotify() {
        return toNotify;
    }

    public void setToNotify(boolean toNotify) {
        this.toNotify = toNotify;
    }

    public boolean getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;
    }

    public Language getSubtitleLang() {
        return subtitle_lang;
    }

    public void setSubtitleLang(String subtitle_lang) {
        this.subtitle_lang = Language.valueOf(subtitle_lang);
    }

    public ShowList getFavorites() {
        return favorites;
    }

    public void setFavorites(ShowList favorites) {
        this.favorites = favorites;
    }

    public ShowList getBlocked() {
        return blocked;
    }

    public void setBlocked(ShowList blocked) {
        this.blocked = blocked;
    }

    public void addFavorites(Show show) {
        this.favorites.addShow(show);
    }

    public void ModifyMaturity(MaturityLevel maturity) {
        this.level_restriction = maturity;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Profile) {
            Profile s = (Profile) obj;
            return s.getName().equals(this.name);
        }
        return false;
    }

    public String toString() {
        return ("Name:" + this.name + "\nMaturityLevel: " + this.level_restriction + "\nemail: " + this.email + "Do you want to recieve notification? " + this.toNotify + "Language: " + this.language + "Do you want to have Subtitles? " + this.subtitles + "Language of the subtitles" + subtitle_lang.name());
    }
}
