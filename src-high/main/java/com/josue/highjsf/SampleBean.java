package com.josue.highjsf;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.josue.highjsf.component.LineBean;
import com.josue.highjsf.component.Serie;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;

/**
 *
 * @author jgontijo
 */
@Named
public class SampleBean {
    
    private int realTimeXValue = 0;
    
    public int getRealTimeXValue() {
        return realTimeXValue;
    }

    public void setRealTimeXValue(int realTimeXValue) {
        this.realTimeXValue = realTimeXValue;
    }
    
    Random rand = new Random();
    public Integer updateRealtimeValue(){
        realTimeXValue = rand.nextInt(100 - 1) + 1;
        LOG.log(Level.INFO, "RANDON : {0}", realTimeXValue);
        return realTimeXValue;
    }
    private static final Logger LOG = Logger.getLogger(SampleBean.class.getName());
    
    private LineBean lineBean;
    
    @PostConstruct
    public void init(){
        
        lineBean = new LineBean();
        lineBean.setTitleText("mytext");
        lineBean.setyTitle("yText");
        lineBean.setCategories(Arrays.asList("a", "b", "c","sa","sddd","ijn"));

        Serie serie1 = new Serie();
        serie1.setName("serie1");
        serie1.getData().add(new Double(1));
        serie1.getData().add(6.5);
        serie1.getData().add(new Double(11));
        serie1.getData().add(new Double(16));
        serie1.getData().add(new Double(15));
        serie1.getData().add(new Double(14));

        Serie serie2 = new Serie();
        serie2.setName("serie2");
        serie2.setData(new LinkedList<>(Arrays.asList(3.0, 2.5, 3.5, 3.0, 2.5, 3.5)));

        Serie serie3 = new Serie();
        serie3.setName("serie3");
        serie3.setData(new LinkedList<>(Arrays.asList(3.0, 2.5, 7.5, 2.0, 1.5, 7.5)));
        
        Serie serie4 = new Serie();
        serie4.setName("serie3");
        serie4.setData(new LinkedList<>(Arrays.asList(13.0, 9.5, 10.5,9.5, 9.5, 0.5)));
        
        Serie serie5 = new Serie();
        serie5.setName("serie3");
        serie5.setData(new LinkedList<>(Arrays.asList(8.0, 0.5, 6.5, 6.5, 6.0, 9.2)));
        
        Serie serie6 = new Serie();
        serie6.setName("serie3");
        serie6.setData(new LinkedList<>(Arrays.asList(5.0, 8.9, 6.75, 8.0, 0.5, 6.5)));

        lineBean.getSeries().add(serie1);
        lineBean.getSeries().add(serie2);
        lineBean.getSeries().add(serie3);
        lineBean.getSeries().add(serie4);
        lineBean.getSeries().add(serie5);
        lineBean.getSeries().add(serie6);
    }

    public LineBean getLineBean() {
        return lineBean;
    }

    public void setLineBean(LineBean lineBean) {
        this.lineBean = lineBean;
    }
}
