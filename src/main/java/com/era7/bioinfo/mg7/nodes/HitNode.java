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
public class HitNode extends BasicEntity{

    public static final String NODE_TYPE = HitNode.class.getCanonicalName();    

    public static final String HIT_ACCESSION_PROPERTY = "hit_accession";
    public static final String HIT_LENGTH_PROPERTY = "hit_length";
    public static final String HIT_DEF_PROPERTY = "hit_def";
    public static final String GI_ID_PROPERTY = "gi_id";
    public static final String HIT_NUM_PROPERTY = "hit_num";


    public HitNode(Node n){
        super(n);
    }

    public int getHitLength(){    return Integer.parseInt(String.valueOf(node.getProperty(HIT_LENGTH_PROPERTY)));}
    public int getGiId(){    return Integer.parseInt(String.valueOf(node.getProperty(GI_ID_PROPERTY)));}
    public String getHitAccession(){    return String.valueOf(node.getProperty(HIT_ACCESSION_PROPERTY));}
    public String getHitDef(){    return String.valueOf(node.getProperty(HIT_DEF_PROPERTY));}
    public int getHitNum(){ return Integer.parseInt(String.valueOf(node.getProperty(HIT_NUM_PROPERTY)));}


    public void setHitLength(int value){  node.setProperty(HIT_LENGTH_PROPERTY, value);}
    public void setGiId(int value){  node.setProperty(GI_ID_PROPERTY, value);}
    public void setHitDef(String value){    node.setProperty(HIT_DEF_PROPERTY, value);}
    public void setHitAccession(String value){    node.setProperty(HIT_ACCESSION_PROPERTY, value);}
    public void setHitNum(int value){   node.setProperty(HIT_NUM_PROPERTY, value);}
    

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof HitNode){
            HitNode other = (HitNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "";
    }

}
