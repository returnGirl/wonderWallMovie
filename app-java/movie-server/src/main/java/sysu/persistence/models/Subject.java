package sysu.persistence.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Shower on 2017/4/20 0020.
 */
@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @Column(name = "id")
    private long id;
    private String title;
    private String original_title;

    @OneToOne
    @JoinColumn(name = "rating_id")
    private Rating rating;
    private int ratings_count;
    private int wish_count;
    private int collect_count;
    @ElementCollection
    private Map<String, String> images;
    private String subtype;

    @OneToMany
    @JoinColumn(name = "celebrity_id")
    private List<Celebrity> directors = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "celebrity_id")
    private List<Celebrity> casts = new ArrayList<>();

    private int year;
    @ElementCollection
    private List<String> genres = new ArrayList<>();
    @ElementCollection
    private List<String> countries = new ArrayList<>();
    private String summary;

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

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public int getWish_count() {
        return wish_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public Map<String, String> getImages() {
        return images;
    }

    public void setImages(Map<String, String> images) {
        this.images = images;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public List<Celebrity> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Celebrity> directors) {
        this.directors = directors;
    }

    public List<Celebrity> getCasts() {
        return casts;
    }

    public void setCasts(List<Celebrity> casts) {
        this.casts = casts;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", original_title='" + original_title + '\'' +
                ", rating=" + rating +
                ", ratings_count=" + ratings_count +
                ", wish_count=" + wish_count +
                ", collect_count=" + collect_count +
                ", images=" + images +
                ", subtype='" + subtype + '\'' +
                ", directors=" + directors +
                ", casts=" + casts +
                ", year=" + year +
                ", genres=" + genres +
                ", countries=" + countries +
                ", summary='" + summary + '\'' +
                '}';
    }
}










