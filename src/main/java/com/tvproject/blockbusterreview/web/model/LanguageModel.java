package com.tvproject.blockbusterreview.web.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "language", schema = "blockbusterreviewdb")
public class LanguageModel {
    private Integer languageId;
    private String languageCode;
    private String languageName;

    private List<VideoModel> videos;
    private List<MovieModel> movies;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    @Basic
    @Column(name = "language_code")
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Basic
    @Column(name = "language_name")
    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LanguageModel that = (LanguageModel) o;

        if (languageId != null ? !languageId.equals(that.languageId) : that.languageId != null) return false;
        if (languageCode != null ? !languageCode.equals(that.languageCode) : that.languageCode != null) return false;
        if (languageName != null ? !languageName.equals(that.languageName) : that.languageName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = languageId != null ? languageId.hashCode() : 0;
        result = 31 * result + (languageCode != null ? languageCode.hashCode() : 0);
        result = 31 * result + (languageName != null ? languageName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "language", fetch = FetchType.LAZY)
    public List<VideoModel> getVideos() {
        return videos;
    }

    public void setVideos(List<VideoModel> videos) {
        this.videos = videos;
    }

    @ManyToMany
    @JoinTable(name = "movie_languages",
            joinColumns = @JoinColumn(name = "language_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    public List<MovieModel> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieModel> movies) {
        this.movies = movies;
    }
}
