/*
 * Copyright (C) 2011-2012  "MG7"
 *
 * This file is part of MG7
 *
 * MG7 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.era7.bioinfo.mg7.relationships;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class TaxonFrequencyResultsRel extends BasicRelationship{

    public static final String NAME = "TAXON_FREQUENCY_RESULTS_REL";
    
    /** Least common ancestor absolute frequency value **/
    public static final String LCA_ABSOLUTE_VALUE_PROPERTY = "lca_absolute_value";
    /** Least common ancestor accumulated absolute frequency value **/
    public static final String LCA_ACCUMULATED_ABSOLUTE_VALUE_PROPERTY = "lca_accumulated_absolute_value";
    public static final String ABSOLUTE_VALUE_PROPERTY = "absolute_value";
    public static final String ACCUMULATED_ABSOLUTE_VALUE_PROPERTY = "accumulated_absolute_value";

    public TaxonFrequencyResultsRel(Relationship rel){
        super(rel);
    }
    
    public int getAbsoluteValue(){    return Integer.parseInt(String.valueOf(relationship.getProperty(ABSOLUTE_VALUE_PROPERTY)));}
    public int getAccumulatedAbsoluteValue(){    return Integer.parseInt(String.valueOf(relationship.getProperty(ACCUMULATED_ABSOLUTE_VALUE_PROPERTY)));}
    public int getLCAAbsoluteValue(){   return Integer.parseInt(String.valueOf(relationship.getProperty(LCA_ABSOLUTE_VALUE_PROPERTY)));}
    public int getLCAAccumulatedAbsoluteValue(){    return Integer.parseInt(String.valueOf(relationship.getProperty(LCA_ACCUMULATED_ABSOLUTE_VALUE_PROPERTY)));}


    public void setAbsoluteValue(int value){  relationship.setProperty(ABSOLUTE_VALUE_PROPERTY, value);}
    public void setAccumulatedAbsoluteValue(int value){  relationship.setProperty(ACCUMULATED_ABSOLUTE_VALUE_PROPERTY, value);}
    public void setLCAAbsoluteValue(int value){  relationship.setProperty(LCA_ABSOLUTE_VALUE_PROPERTY, value);}
    public void setLCAAccumulatedAbsoluteValue(int value){  relationship.setProperty(LCA_ACCUMULATED_ABSOLUTE_VALUE_PROPERTY, value);}

    @Override
    public String name() {
        return NAME;
    }
    
    @Override
    public String toString(){
        return "Absolute value = " + getAbsoluteValue() + "\n"
                + "Accumulated absolute value = " + getAccumulatedAbsoluteValue() + "\n"
                + "LCA absolute value = " + getLCAAbsoluteValue() + "\n"
                + "LCA accumulated absolute value = " + getLCAAccumulatedAbsoluteValue();
    }

}

