///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.josue.highjsf.component;
//
//import java.io.StringWriter;
//import javax.faces.component.FacesComponent;
//import javax.faces.component.UINamingContainer;
//import javax.json.Json;
//import javax.json.JsonArrayBuilder;
//import javax.json.JsonObjectBuilder;
//
///**
// *
// * @author jgontijo
// */
//@FacesComponent("highComponent")
//public class JsonRenderer extends UINamingContainer {
//
//    public String render(LineBean lineBean) {
//        JsonObjectBuilder builder = Json.createObjectBuilder();
//        
//        builder.add("chart", Json.createObjectBuilder().add("type", "line"));
//        builder.add("title", Json.createObjectBuilder().add("text", lineBean.getTitleText()));
//
//        JsonArrayBuilder catArrayBuilder = Json.createArrayBuilder();
//        for (String category : lineBean.getCategories()) {
//            catArrayBuilder.add(category);
//        }
//        builder.add("xAxis", Json.createObjectBuilder().add("categories", catArrayBuilder).build());
//        builder.add("yAxis", Json.createObjectBuilder().add("title", Json.createObjectBuilder().add("text", lineBean.getyTitle())).build());
//
//        JsonArrayBuilder seriesArrayBuilder = Json.createArrayBuilder();
//        for (Serie serie : lineBean.getSeries()) {
//            seriesArrayBuilder.add(serie.getJson());
//        }
//
//        builder.add("series", seriesArrayBuilder);
//        StringWriter stringWriter = new StringWriter();
//        Json.createWriter(stringWriter).writeObject(builder.build());
//        
//        return stringWriter.toString();
//    }
//
//}
