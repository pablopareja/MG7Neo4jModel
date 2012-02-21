/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era7.bioinfo.mg7.relationships;


import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ReadResultLCANcbiTaxonRel extends BasicRelationship{

    public static final String NAME = "READ_RESULT_LCA_NCBI_TAXON";

    public ReadResultLCANcbiTaxonRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
