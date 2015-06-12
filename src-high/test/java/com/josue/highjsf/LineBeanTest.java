/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josue.highjsf;

import com.josue.highjsf.component.LineBean;
import com.josue.highjsf.component.Serie;
import java.util.Arrays;
import java.util.LinkedList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author jgontijo
 */
public class LineBeanTest {

    @Test
    public void testToString() {
        LineBean lineBean = new LineBean();
        lineBean.setTitleText("mytext");
        lineBean.setyTitle("yText");
        lineBean.setCategories(new LinkedList<>(Arrays.asList("a", "b", "c")));

        Serie serie1 = new Serie();
        serie1.setName("serie1");
        serie1.setData(new LinkedList<>(Arrays.asList(1.0, 2.5, 3.5)));

        Serie serie2 = new Serie();
        serie2.setName("serie2");
        serie2.setData(new LinkedList<>(Arrays.asList(1.0, 2.5, 3.5)));

        Serie serie3 = new Serie();
        serie3.setName("serie3");
        serie3.setData(new LinkedList<>(Arrays.asList(5.0, 8.5, 6.5)));

        lineBean.getSeries().add(serie1);
        lineBean.getSeries().add(serie2);
        lineBean.getSeries().add(serie3);
        
        String toString = lineBean.toString();
        Assert.assertNotNull(toString);
        Assert.assertFalse(toString.isEmpty());
        
    }

}
