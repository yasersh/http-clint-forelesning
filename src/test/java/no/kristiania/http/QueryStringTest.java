package no.kristiania.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class QueryStringTest {
    @Test
    void shouldReserveStatusCode(){
        QueryString queryString = new QueryString("status=200");
        assertEquals ("200",queryString.getParameter("status"));
    }
    @Test
    void ShouldReserveStatusCode401(){
        QueryString queryString = new QueryString("status=401");
        assertEquals ("401",queryString.getParameter("status"));
    }
    @Test
    void shouldReturnNullForMissingParameters(){
        QueryString queryString = new QueryString("body=Hallo");
        assertNull(queryString.getParameter("status"));
    }
    @Test
    void shouldSupportMultiParameters(){
        QueryString queryString = new QueryString("status=200&body=Hallo");
        assertEquals("200",queryString.getParameter("status"));
        assertEquals("Hallo",queryString.getParameter("body"));

    }
}
