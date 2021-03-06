package com.feelthecoder.dsc.Model;

import androidx.annotation.Keep;

@Keep
public class EventGet {

    String title,pic,description,shortdes,date;

    public EventGet(String title, String pic, String description, String shortdes,String date) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.shortdes = shortdes;
        this.date=date;
    }

    public EventGet() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortdes() {
        return shortdes;
    }

    public void setShortdes(String shortdes) {
        this.shortdes = shortdes;
    }
}
