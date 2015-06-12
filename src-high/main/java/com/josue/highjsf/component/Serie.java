/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josue.highjsf.component;

import java.util.LinkedList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 *
 * @author jgontijo
 */
public class Serie {
    
    private String name;
    private final List<Double> data = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getData() {
        return data;
    }

    public void setData(List<Double> data) {
        this.data.addAll(data);
    }

    public Serie add(Integer val){
        this.data.add(Double.valueOf(val));
        return this;
    }
    
     public Serie add(Double val){
        this.data.add(val);
        return this;
    }
    
    protected JsonObject getJson(){
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        objectBuilder.add("name", name);
        
        JsonArrayBuilder dataArray = Json.createArrayBuilder();
        for(Double d : data){
            dataArray.add(d);
        }
        objectBuilder.add("data", dataArray.build());
        
        return objectBuilder.build();
    }
    
}
