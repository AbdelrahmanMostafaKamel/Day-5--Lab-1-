/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablesawexample;


//import com.google.common.collect.Table;
//import com.ibm.icu.impl.UResource.Table;
import java.io.IOException;
import java.util.List;
import tech.tablesaw.api.Table;
import tech.tablesaw.columns.Column;

/**
 *
 * @author HP
 */
public class TestClass {
    public static void main(String[] args){
    try{
    Table titanicData;
    String dataPath="H:\\ITI AI-PRO\\Java & UML\\Day(5)\\Data_to_use\\titanic.csv";
    titanicData=Table.read().csv(dataPath);
    List<Column<?>> dataStructure=titanicData.columns();
    System.out.println(dataStructure);
    System.out.println(titanicData.summary());
    }
    catch(IOException e){
    e.printStackTrace();
    }
  }
    
}
