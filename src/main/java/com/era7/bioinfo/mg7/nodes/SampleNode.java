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
package com.era7.bioinfo.mg7.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SampleNode extends BasicEntity{

    public static final String NODE_TYPE = SampleNode.class.getCanonicalName();
    public static final String SAMPLE_NAME_INDEX = "sample_name_index";

    public static final String NAME_PROPERTY = "name";
    public static final String NUMBER_OF_READS_WITHOUT_FILTERING_PROPERTY = "number_of_reads_without_filtering";
    public static final String NUMBER_OF_READS_THAT_COMPLIED_WITH_THRESHOLD_PROPERTY = "number_of_reads_that_complied_with_threshold";
    public static final String NUMBER_OF_READS_WITH_TAXONOMY_ASSOCIATED_PROPERTY = "number_of_reads_with_taxonomy_associated";
    public static final String NUMBER_OF_READS_FOR_DIRECT_MODE_PROPERTY = "number_of_reads_for_direct_mode";


    public SampleNode(Node n){
        super(n);
    }


    public String getName(){    return String.valueOf(node.getProperty(NAME_PROPERTY));}
    public int getNumberOfReadsWithoutFiltering(){  return Integer.parseInt(String.valueOf(node.getProperty(NUMBER_OF_READS_WITHOUT_FILTERING_PROPERTY)));}
    public int getNumberOfReadsThatCompliedWithThreshold(){  return Integer.parseInt(String.valueOf(node.getProperty(NUMBER_OF_READS_THAT_COMPLIED_WITH_THRESHOLD_PROPERTY)));}
    public int getNumberOfReadsWithTaxonomyAssociated(){  return Integer.parseInt(String.valueOf(node.getProperty(NUMBER_OF_READS_WITH_TAXONOMY_ASSOCIATED_PROPERTY)));}
    public int getNumberOfReadsForDirectMode(){  return Integer.parseInt(String.valueOf(node.getProperty(NUMBER_OF_READS_FOR_DIRECT_MODE_PROPERTY)));}


    public void setName(String value){  node.setProperty(NAME_PROPERTY, value);}
    public void setNumberOfReadsWithoutFiltering(int value){  node.setProperty(NUMBER_OF_READS_WITHOUT_FILTERING_PROPERTY, value);}
    public void setNumberOfReadsThatCompliedWithThreshold(int value){  node.setProperty(NUMBER_OF_READS_THAT_COMPLIED_WITH_THRESHOLD_PROPERTY, value);}
    public void setNumberOfReadsWithTaxonomyAssociated(int value){  node.setProperty(NUMBER_OF_READS_WITH_TAXONOMY_ASSOCIATED_PROPERTY, value);}
    public void setNumberOfReadsForDirectMode(int value){  node.setProperty(NUMBER_OF_READS_FOR_DIRECT_MODE_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SampleNode){
            SampleNode other = (SampleNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "name = " + getName();
    }

}
