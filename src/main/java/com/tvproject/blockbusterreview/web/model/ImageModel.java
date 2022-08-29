package com.tvproject.blockbusterreview.web.model;

import javax.persistence.*;

@Entity
@Table(name = "image", schema = "blockbusterreviewdb")
public class ImageModel {
    private Integer imageId;
    private Integer movieId;
    private Integer personId;
    private String filePath;

    private MovieModel ofMovie;
    private PersonModel ofPerson;

    @Id
    @Column(name = "image_id")
    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
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
    @Column(name = "file_path")
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "movie_id")
    public MovieModel getOfMovie() {
        return ofMovie;
    }

    public void setOfMovie(MovieModel ofMovie) {
        this.ofMovie = ofMovie;
    }

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "person_id")
    public PersonModel getOfPerson() {
        return ofPerson;
    }

    public void setOfPerson(PersonModel ofPerson) {
        this.ofPerson = ofPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageModel that = (ImageModel) o;

        if (imageId != null ? !imageId.equals(that.imageId) : that.imageId != null) return false;
        if (movieId != null ? !movieId.equals(that.movieId) : that.movieId != null) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (filePath != null ? !filePath.equals(that.filePath) : that.filePath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imageId != null ? imageId.hashCode() : 0;
        result = 31 * result + (movieId != null ? movieId.hashCode() : 0);
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        return result;
    }
}
