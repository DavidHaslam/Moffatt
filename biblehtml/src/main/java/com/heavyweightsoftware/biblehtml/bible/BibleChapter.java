package com.heavyweightsoftware.biblehtml.bible;

import java.util.ArrayList;
import java.util.List;

public class BibleChapter {
    private int                         number;
    private List<BibleVerse>            verses = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<BibleVerse> getVerses() {
        return verses;
    }

    public void addVerse(BibleVerse verse) {
        verses.add(verse);
    }
}
