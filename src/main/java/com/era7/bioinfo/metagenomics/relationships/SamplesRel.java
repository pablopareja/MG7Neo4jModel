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
public class SamplesRel extends BasicRelationship{

    public static final String NAME = "SAMPLES";

    public SamplesRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}

