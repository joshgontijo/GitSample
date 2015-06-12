/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josue.highjsf.component;

import java.io.StringWriter;
import java.util.LinkedList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

/**
 *
 * @author jgontijo
 */
public class LineBean {

    private String titleText;
    private String yTitle;
    private final List<String> categories = new LinkedList<>();
    private final List<Serie> series = new LinkedList<>();

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getyTitle() {
        return yTitle;
    }

    public void setyTitle(String yTitle) {
        this.yTitle = yTitle;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories.addAll(categories);
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series.addAll(series);
    }

    @Override
    public String toString() {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("title", Json.createObjectBuilder().add("text", titleText));

        JsonArrayBuilder catArrayBuilder = Json.createArrayBuilder();
        for (String category : categories) {
            catArrayBuilder.add(category);
        }
        builder.add("xAxis", Json.createObjectBuilder().add("categories", catArrayBuilder).build());
        builder.add("yAxis", Json.createObjectBuilder().add("title", Json.createObjectBuilder().add("text", yTitle)).build());

        JsonArrayBuilder seriesArrayBuilder = Json.createArrayBuilder();
        for (Serie serie : series) {
            seriesArrayBuilder.add(serie.getJson());
        }

        builder.add("series", seriesArrayBuilder);
        StringWriter stringWriter = new StringWriter();
        Json.createWriter(stringWriter).writeObject(builder.build());
        return stringWriter.toString();

    }

}
