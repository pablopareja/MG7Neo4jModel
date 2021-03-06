/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era7.bioinfo.mg7.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class HspNode extends BasicEntity{

    public static final String NODE_TYPE = HspNode.class.getCanonicalName();
        
    public static final String ALIGNMENT_LENGTH_PROPERTY = "alignment_length";
    public static final String IDENTITY_PROPERTY = "identity";
    public static final String EVALUE_PROPERTY = "evalue";
    public static final String QUERY_SEQUENCE_PROPERTY = "query_sequence";
    public static final String HIT_SEQUENCE_PROPERTY = "hit_sequence";
    public static final String MIDLINE_PROPERTY = "midline";
    public static final String HSP_NUM_PROPERTY = "hsp_num";


    public HspNode(Node n){
        super(n);
    }

    
    public int getAlignmentLength(){    return Integer.parseInt(String.valueOf(node.getProperty(ALIGNMENT_LENGTH_PROPERTY)));}
    public int getIdentity(){   return Integer.parseInt(String.valueOf(node.getProperty(IDENTITY_PROPERTY)));}
    public String getEvalue(){  return String.valueOf(node.getProperty(EVALUE_PROPERTY));}
    public String getQuerySequence(){   return String.valueOf(node.getProperty(QUERY_SEQUENCE_PROPERTY));}
    public String getHitSequence(){ return String.valueOf(node.getProperty(HIT_SEQUENCE_PROPERTY));}
    public String getMidline(){  return String.valueOf(node.getProperty(MIDLINE_PROPERTY));}
    public int getHspNum(){ return Integer.parseInt(String.valueOf(node.getProperty(HSP_NUM_PROPERTY)));}
   

    public void setAlignmentLength(int value){  node.setProperty(ALIGNMENT_LENGTH_PROPERTY, value);}
    public void setIdentity(int value){ node.setProperty(IDENTITY_PROPERTY, value);}
    public void setEvalue(String value){    node.setProperty(EVALUE_PROPERTY, value);}
    public void setQuerySequence(String value){ node.setProperty(QUERY_SEQUENCE_PROPERTY, value);}
    public void setHitSequence(String value){ node.setProperty(HIT_SEQUENCE_PROPERTY, value);}
    public void setMidline(String value){   node.setProperty(MIDLINE_PROPERTY, value);}
    public void setHspNum(int value){   node.setProperty(HSP_NUM_PROPERTY, value);}
    
    
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof HspNode){
            HspNode other = (HspNode) obj;
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
