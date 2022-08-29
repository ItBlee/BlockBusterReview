package com.tvproject.blockbusterreview.web.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "movie", schema = "blockbusterreviewdb")
public class MovieModel {
    private Integer movieId;
    private String title;
    private Integer budget;
    private String homepage;
    private String overview;
    private BigDecimal popularity;
    private Date releaseDate;
    private Long revenue;
    private Integer runtime;
    private String movieStatus;
    private String tagline;
    private BigDecimal voteAverage;
    private Integer voteCount;
    private String posterPath;

    private List<MovieCastModel> cast;
    private List<MovieCrewModel> crew;
    private List<ImageModel> images;
    private List<VideoModel> videos;
    private List<CompanyModel> productCompanies;
    private List<CountryModel> productCountries;
    private List<GenreModel> genres;
    private List<KeywordModel> keywords;
    private List<LanguageModel> languages;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "budget")
    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    @Basic
    @Column(name = "homepage")
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @Basic
    @Column(name = "overview")
    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Basic
    @Column(name = "popularity")
    public BigDecimal getPopularity() {
        return popularity;
    }

    public void setPopularity(BigDecimal popularity) {
        this.popularity = popularity;
    }

    @Basic
    @Column(name = "release_date")
    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Basic
    @Column(name = "revenue")
    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    @Basic
    @Column(name = "runtime")
    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    @Basic
    @Column(name = "movie_status")
    public String getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(String movieStatus) {
        this.movieStatus = movieStatus;
    }

    @Basic
    @Column(name = "tagline")
    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    @Basic
    @Column(name = "vote_average")
    public BigDecimal getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(BigDecimal voteAverage) {
        this.voteAverage = voteAverage;
    }

    @Basic
    @Column(name = "vote_count")
    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Basic
    @Column(name = "poster_path")
    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieModel that = (MovieModel) o;

        if (movieId != null ? !movieId.equals(that.movieId) : that.movieId != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (budget != null ? !budget.equals(that.budget) : that.budget != null) return false;
        if (homepage != null ? !homepage.equals(that.homepage) : that.homepage != null) return false;
        if (overview != null ? !overview.equals(that.overview) : that.overview != null) return false;
        if (popularity != null ? !popularity.equals(that.popularity) : that.popularity != null) return false;
        if (releaseDate != null ? !releaseDate.equals(that.releaseDate) : that.releaseDate != null) return false;
        if (revenue != null ? !revenue.equals(that.revenue) : that.revenue != null) return false;
        if (runtime != null ? !runtime.equals(that.runtime) : that.runtime != null) return false;
        if (movieStatus != null ? !movieStatus.equals(that.movieStatus) : that.movieStatus != null) return false;
        if (tagline != null ? !tagline.equals(that.tagline) : that.tagline != null) return false;
        if (voteAverage != null ? !voteAverage.equals(that.voteAverage) : that.voteAverage != null) return false;
        if (voteCount != null ? !voteCount.equals(that.voteCount) : that.voteCount != null) return false;
        if (posterPath != null ? !posterPath.equals(that.posterPath) : that.posterPath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = movieId != null ? movieId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (budget != null ? budget.hashCode() : 0);
        result = 31 * result + (homepage != null ? homepage.hashCode() : 0);
        result = 31 * result + (overview != null ? overview.hashCode() : 0);
        result = 31 * result + (popularity != null ? popularity.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + (revenue != null ? revenue.hashCode() : 0);
        result = 31 * result + (runtime != null ? runtime.hashCode() : 0);
        result = 31 * result + (movieStatus != null ? movieStatus.hashCode() : 0);
        result = 31 * result + (tagline != null ? tagline.hashCode() : 0);
        result = 31 * result + (voteAverage != null ? voteAverage.hashCode() : 0);
        result = 31 * result + (voteCount != null ? voteCount.hashCode() : 0);
        result = 31 * result + (posterPath != null ? posterPath.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            orphanRemoval = true)
    public List<MovieCastModel> getCast() {
        return cast;
    }

    public void setCast(List<MovieCastModel> cast) {
        this.cast = cast;
    }

    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            orphanRemoval = true)
    public List<MovieCrewModel> getCrew() {
        return crew;
    }

    public void setCrew(List<MovieCrewModel> crew) {
        this.crew = crew;
    }

    @OneToMany(mappedBy = "ofMovie", fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            orphanRemoval = true)
    public List<ImageModel> getImages() {
        return images;
    }

    public void setImages(List<ImageModel> images) {
        this.images = images;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "movie_videos",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "video_id"))
    public List<VideoModel> getVideos() {
        return videos;
    }

    public void setVideos(List<VideoModel> videos) {
        this.videos = videos;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "movie_companies",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "company_id"))
    public List<CompanyModel> getProductCompanies() {
        return productCompanies;
    }

    public void setProductCompanies(List<CompanyModel> productCompanies) {
        this.productCompanies = productCompanies;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "movie_countries",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "country_id"))
    public List<CountryModel> getProductCountries() {
        return productCountries;
    }

    public void setProductCountries(List<CountryModel> productCountries) {
        this.productCountries = productCountries;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "movie_genres",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    public List<GenreModel> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreModel> genres) {
        this.genres = genres;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "movie_keywords",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "keyword_id"))
    public List<KeywordModel> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<KeywordModel> keywords) {
        this.keywords = keywords;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "movie_languages",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id"))
    public List<LanguageModel> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguageModel> languages) {
        this.languages = languages;
    }
}
