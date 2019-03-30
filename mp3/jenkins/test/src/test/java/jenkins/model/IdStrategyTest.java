package jenkins.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class IdStrategyTest {

    Jenkins jenkins;
    
    @Test
    public void nothingAfterS() throws Exception {
        IdStrategy.CaseSensitive myCase = new IdStrategy.CaseSensitive();
        assertEquals("tokenstring", myCase.idFromFilename("tokenstring$"));
 
    }
 
    @Test
    public void validAfterS() throws Exception {
        IdStrategy.CaseSensitive myCase = new IdStrategy.CaseSensitive();
        assertEquals("tokenstring", myCase.idFromFilename("tokenstrin$0067"));
    }
}