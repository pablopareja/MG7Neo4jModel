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


    public SampleNode(Node n){
        super(n);
    }


    public String getName(){    return String.valueOf(node.getProperty(NAME_PROPERTY));}


    public void setName(String value){  node.setProperty(NAME_PROPERTY, value);}


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
