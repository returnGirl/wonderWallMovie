package sysu.persistence.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shower on 2017/5/6 0006.
 */
@Entity
@Table(name = "hall")
public class Hall {
    private static long gen = 0;

    @Id
    @Column(name = "id")
    private long id = gen++;
    private int number;
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    public Hall() {}
    public Hall(int number, Cinema cinema) {
        this.number = number;
        this.cinema = cinema;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "id=" + id +
                ", number=" + number +
                ", cinema=" + cinema +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.number == ((Hall)obj).getNumber() && this.cinema.equals(((Hall)obj).getCinema());
    }
}
