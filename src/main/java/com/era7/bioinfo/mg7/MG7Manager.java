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
package com.era7.bioinfo.mg7;

import com.era7.bioinfo.bio4j.neo4j.model.util.Bio4jManager;
import com.era7.bioinfo.mg7.nodes.ReadResultNode;
import com.era7.bioinfo.mg7.nodes.SampleNode;
import java.util.HashMap;
import java.util.Map;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.index.Index;


/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class MG7Manager extends Bio4jManager{
    
    private static boolean alreadyCreated = false;
    
    public static String READ_RESULT_SAMPLE_TAXON_INDEX_NAME = "read_result_sample_taxon_index_name";
    public static String READ_RESULT_SAMPLE_LCA_TAXON_INDEX_NAME = "read_result_sample_lca_taxon_index_name";
    
    private static String PROVIDER_ST = "provider";
    private static String EXACT_ST = "exact";
    private static String LUCENE_ST = "lucene";
    private static String TYPE_ST = "type";
        
    //-----------------node indexes-----------------------
    private Index<Node> sampleNameIndex = null;
    private Index<Node> readResultReadIdIndex = null;
    private Index<Node> readResultTaxonSampleIndex = null;
    private Index<Node> readResultLCATaxonSampleIndex = null;
    
    public MG7Manager(String dbFolder){
        
        super(dbFolder, firstTimeCalled(), false);
                
        initIndexes();
        
    }
    
    public MG7Manager(String dbFolder, boolean createUnderlyingService, boolean readOnlyMode){
        
        super(dbFolder, createUnderlyingService, readOnlyMode);
                
        initIndexes();
        
    }
    
    public Index<Node> getSampleNameIndex(){        
        return sampleNameIndex;
    }
    
    public Index<Node> getReadResultReadIdIndex(){        
        return readResultReadIdIndex;
    }
    
    public Index<Node> getReadResultTaxonSampleIndex(){        
        return readResultTaxonSampleIndex;
    }
    
    public Index<Node> getReadResultLCATaxonSampleIndex(){        
        return readResultLCATaxonSampleIndex;
    }
    
    private static synchronized boolean firstTimeCalled() {
        if (!alreadyCreated) {
            alreadyCreated = true;
            return true;
        } else {
            return false;
        }
    }
    
    private void initIndexes(){
        Map<String,String> indexProps = new HashMap<String, String>();
        indexProps.put(PROVIDER_ST, LUCENE_ST);
        indexProps.put(TYPE_ST, EXACT_ST);
                                
        //----------node indexes-----------
        sampleNameIndex = graphService.index().forNodes(SampleNode.SAMPLE_NAME_INDEX, indexProps);
        readResultReadIdIndex = graphService.index().forNodes(ReadResultNode.READ_RESULT_READ_ID_INDEX, indexProps);      
        readResultTaxonSampleIndex = graphService.index().forNodes(READ_RESULT_SAMPLE_TAXON_INDEX_NAME,indexProps);
        readResultLCATaxonSampleIndex = graphService.index().forNodes(READ_RESULT_SAMPLE_LCA_TAXON_INDEX_NAME,indexProps);
    }
    
}
