package com.waites.moviereview.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String genre;
    private String imdblink;
    private String releasedate;
    private String imageurl;

    public Movie() {

    }

    public Movie(String title, String genre, String imdblink, String releasedate, String imageurl) {
        this.title = title;
        this.genre = genre;
        this.imdblink = imdblink;
        this.releasedate = releasedate;
        this.imageurl = imageurl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImdblink() {
        return imdblink;
    }

    public void setImdblink(String imdblink) {
        this.imdblink = imdblink;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public void setAll(String title, String genre, String imdblink, String releasedate, String imageurl){
        this.title = title;
        this.genre = genre;
        this.imdblink = imdblink;
        this.releasedate = releasedate;
        this.imageurl = imageurl;
    }
}
