/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era7.bioinfo.metagenomics;

import com.era7.bioinfo.bio4jmodel.util.Bio4jManager;
import com.era7.bioinfo.metagenomics.nodes.ReadResultNode;
import com.era7.bioinfo.metagenomics.nodes.SampleNode;
import java.util.HashMap;
import java.util.Map;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.index.Index;


/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class MetagenomicsManager extends Bio4jManager{
    
    public static String READ_RESULT_SAMPLE_TAXON_INDEX_NAME = "read_result_sample_taxon_index_name";
    
    private static String PROVIDER_ST = "provider";
    private static String EXACT_ST = "exact";
    //private static String FULL_TEXT_ST = "fulltext";
    private static String LUCENE_ST = "lucene";
    private static String TYPE_ST = "type";
    
    private GraphDatabaseService graphDbService = null;
    
    //-----------------node indexes-----------------------
    private Index<Node> sampleNameIndex = null;
    private Index<Node> readResultReadIdIndex = null;
    private Index<Node> readResultTaxonSampleIndex = null;
    
    public MetagenomicsManager(String dbFolder){
        
        super(dbFolder);
                
        Map<String,String> indexProps = new HashMap<String, String>();
        indexProps.put(PROVIDER_ST, LUCENE_ST);
        indexProps.put(TYPE_ST, EXACT_ST);
                
        //----------node indexes-----------
        sampleNameIndex = graphDbService.index().forNodes(SampleNode.SAMPLE_NAME_INDEX, indexProps);
        readResultReadIdIndex = graphDbService.index().forNodes(ReadResultNode.READ_RESULT_READ_ID_INDEX, indexProps);      
        readResultTaxonSampleIndex = graphDbService.index().forNodes(READ_RESULT_SAMPLE_TAXON_INDEX_NAME,indexProps);
        
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
    
}
