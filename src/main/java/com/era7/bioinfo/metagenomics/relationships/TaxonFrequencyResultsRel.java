/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era7.bioinfo.metagenomics.relationships;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class TaxonFrequencyResultsRel extends BasicRelationship{

    public static final String NAME = "TAXON_FREQUENCY_RESULTS_REL";
    
    public static final String ABSOLUTE_VALUE_PROPERTY = "absolute_value";
    public static final String ACCUMULATED_ABSOLUTE_VALUE_PROPERTY = "accumulated_absolute_value";

    public TaxonFrequencyResultsRel(Relationship rel){
        super(rel);
    }
    
    public int getAbsoluteValue(){    return Integer.parseInt(String.valueOf(relationship.getProperty(ABSOLUTE_VALUE_PROPERTY)));}
    public int getAccumulatedAbsoluteValue(){    return Integer.parseInt(String.valueOf(relationship.getProperty(ACCUMULATED_ABSOLUTE_VALUE_PROPERTY)));}


    public void setAbsoluteValue(int value){  relationship.setProperty(ABSOLUTE_VALUE_PROPERTY, value);}
    public void setAccumulatedAbsoluteValue(int value){  relationship.setProperty(ACCUMULATED_ABSOLUTE_VALUE_PROPERTY, value);}

    @Override
    public String name() {
        return NAME;
    }
    
    @Override
    public String toString(){
        return "Absolute value = " + getAbsoluteValue() + "\n"
                + "Accumulated absolute value = " + getAccumulatedAbsoluteValue();
    }

}

