package edu.bu.projectportal;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

/**
 * Created by danazh on 2/21/18.
 */
public class Project {

    public final static Project[] projects = {
            new Project(
                    "Weather Forecast",
                    "Weather Forecast brings you the latest temperature and forecasts in your area.",
                    Arrays.asList("Ron Burgandy", "Dan the Weather Man"),
                    true
            ),
//            new Project (
//                    "Connect Me",
//                    "Connect Me is an app ... ",
//                    false
//            ),
//            new Project(
//                    "What to Eat",
//                    "What to Eat is an app ...",
//                    false
//            ),
//            new Project (
//                    "Project Portal",
//                    "Project Portal is an app ...",
//                    true
//            )
    };


    private String title;
    private String summary;
    private List<String> authors;
    private Boolean isFavorite;


    public Project(
            @NotNull String title,
            @NotNull String summary,
            @NotNull List<String> authors,
            @NotNull Boolean isFavorite
    ) {
        this.title = title;
        this.summary = summary;
        this.authors = authors;
        this.isFavorite = isFavorite;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public List<String> getAuthors() {
        return authors;
    }
//
//    public List<String> getLinks() {
//        return links;
//    }

    public Boolean getFavorite() {
        return isFavorite;
    }

//    public List<String> getKeywords() {
//        return keywords;
//    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setAuthors(List<String> authors) { this.authors = authors; }
//
//    public void setLinks(List<String> links) { this.links = links; }

    public void setIsFavorite(Boolean isFavorite) { this.isFavorite = isFavorite; }
//
//    public void setKeywords(List<String> keywords) { this.keywords = keywords; }

    @NotNull
    @Override
    public String toString() {

        return "Project{" +
                "title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", authors='" + authors + '\'' +
//                ", links='" + links + '\'' +
                ", isFavorite='" + isFavorite + '\'' +
//                ", keywords='" + keywords + '\'' +
                '}';
    }

}
