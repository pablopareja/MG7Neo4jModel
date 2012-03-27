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
public class ReadResultNode extends BasicEntity{

    public static final String NODE_TYPE = ReadResultNode.class.getCanonicalName();
    
    public static final String READ_RESULT_READ_ID_INDEX = "read_result_read_id_index";

    public static final String READ_ID_PROPERTY = "id";
    public static final String READ_SEQUENCE_PROPERTY = "sequence";
    public static final String QUERY_LENGTH_PROPERTY = "query_length";


    public ReadResultNode(Node n){
        super(n);
    }


    public String getReadId(){  return String.valueOf(node.getProperty(READ_ID_PROPERTY));}
    public String getReadSequence(){  return String.valueOf(node.getProperty(READ_SEQUENCE_PROPERTY));}
    public int getQueryLength(){    return Integer.parseInt(String.valueOf(node.getProperty(QUERY_LENGTH_PROPERTY)));}


    public void setReadId(String value){    node.setProperty(READ_ID_PROPERTY, value);}
    public void setReadSequence(String value){    node.setProperty(READ_SEQUENCE_PROPERTY, value);}
    public void setQueryLength(int value){  node.setProperty(QUERY_LENGTH_PROPERTY, value);}
    

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ReadResultNode){
            ReadResultNode other = (ReadResultNode) obj;
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
