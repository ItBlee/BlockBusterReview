package com.tvproject.blockbusterreview.web.model;

import javax.persistence.*;

@Entity
@Table(name = "movie_cast", schema = "blockbusterreviewdb")
public class MovieCastModel {
    private Integer castId;
    private Integer movieId;
    private Integer personId;
    private String characterName;
    private Integer castOrder;

    private MovieModel movie;
    private PersonModel person;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cast_id")
    public Integer getCastId() {
        return castId;
    }

    public void setCastId(Integer castId) {
        this.castId = castId;
    }

    @Basic
    @Column(name = "movie_id")
    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    @Basic
    @Column(name = "person_id")
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "character_name")
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Basic
    @Column(name = "cast_order")
    public Integer getCastOrder() {
        return castOrder;
    }

    public void setCastOrder(Integer castOrder) {
        this.castOrder = castOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieCastModel that = (MovieCastModel) o;

        if (castId != null ? !castId.equals(that.castId) : that.castId != null) return false;
        if (movieId != null ? !movieId.equals(that.movieId) : that.movieId != null) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (characterName != null ? !characterName.equals(that.characterName) : that.characterName != null)
            return false;
        if (castOrder != null ? !castOrder.equals(that.castOrder) : that.castOrder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = castId != null ? castId.hashCode() : 0;
        result = 31 * result + (movieId != null ? movieId.hashCode() : 0);
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (characterName != null ? characterName.hashCode() : 0);
        result = 31 * result + (castOrder != null ? castOrder.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "movie_id", nullable = false)
    public MovieModel getMovie() {
        return movie;
    }

    public void setMovie(MovieModel movie) {
        this.movie = movie;
    }

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "person_id", nullable = false)
    public PersonModel getPerson() {
        return person;
    }

    public void setPerson(PersonModel person) {
        this.person = person;
    }
}
