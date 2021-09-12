package no.kristiania.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueryStringTest {
    @Test
    void shouldReserveStatusCode(){
        QueryString queryString = new QueryString("status=200");
        assertEquals ("200",queryString.getParameter("status"));
    }
}
