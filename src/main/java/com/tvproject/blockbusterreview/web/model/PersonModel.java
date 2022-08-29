package com.tvproject.blockbusterreview.web.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "person", schema = "blockbusterreviewdb")
public class PersonModel {
    private Integer personId;
    private Integer genderId;
    private String personName;
    private String birthday;
    private String department;
    private String deathday;
    private String biography;
    private String overview;
    private Integer popularity;
    private String placeOfBirth;
    private String profilePath;
    private String homepage;

    private GenderModel gender;
    private List<MovieCastModel> castList;
    private List<MovieCrewModel> crewList;
    private List<ImageModel> images;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "gender_id")
    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    @Basic
    @Column(name = "person_name")
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Basic
    @Column(name = "birthday")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "deathday")
    public String getDeathday() {
        return deathday;
    }

    public void setDeathday(String deathday) {
        this.deathday = deathday;
    }

    @Basic
    @Column(name = "biography")
    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
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
    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    @Basic
    @Column(name = "place_of_birth")
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Basic
    @Column(name = "profile_path")
    public String getProfilePath() {
        return profilePath;
    }

    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }

    @Basic
    @Column(name = "homepage")
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @ManyToOne
    @JoinColumn(name = "gender_id", referencedColumnName = "gender_id", nullable = false)
    public GenderModel getGender() {
        return gender;
    }

    public void setGender(GenderModel gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonModel that = (PersonModel) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (genderId != null ? !genderId.equals(that.genderId) : that.genderId != null) return false;
        if (personName != null ? !personName.equals(that.personName) : that.personName != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;
        if (deathday != null ? !deathday.equals(that.deathday) : that.deathday != null) return false;
        if (biography != null ? !biography.equals(that.biography) : that.biography != null) return false;
        if (overview != null ? !overview.equals(that.overview) : that.overview != null) return false;
        if (popularity != null ? !popularity.equals(that.popularity) : that.popularity != null) return false;
        if (placeOfBirth != null ? !placeOfBirth.equals(that.placeOfBirth) : that.placeOfBirth != null) return false;
        if (profilePath != null ? !profilePath.equals(that.profilePath) : that.profilePath != null) return false;
        if (homepage != null ? !homepage.equals(that.homepage) : that.homepage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (genderId != null ? genderId.hashCode() : 0);
        result = 31 * result + (personName != null ? personName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (deathday != null ? deathday.hashCode() : 0);
        result = 31 * result + (biography != null ? biography.hashCode() : 0);
        result = 31 * result + (overview != null ? overview.hashCode() : 0);
        result = 31 * result + (popularity != null ? popularity.hashCode() : 0);
        result = 31 * result + (placeOfBirth != null ? placeOfBirth.hashCode() : 0);
        result = 31 * result + (profilePath != null ? profilePath.hashCode() : 0);
        result = 31 * result + (homepage != null ? homepage.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "person")
    public List<MovieCastModel> getCastList() {
        return castList;
    }

    public void setCastList(List<MovieCastModel> castList) {
        this.castList = castList;
    }

    @OneToMany(mappedBy = "person")
    public List<MovieCrewModel> getCrewList() {
        return crewList;
    }

    public void setCrewList(List<MovieCrewModel> crewList) {
        this.crewList = crewList;
    }

    @OneToMany(mappedBy = "ofPerson", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    public List<ImageModel> getImages() {
        return images;
    }

    public void setImages(List<ImageModel> images) {
        this.images = images;
    }
}
