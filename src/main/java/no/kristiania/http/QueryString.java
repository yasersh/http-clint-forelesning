package no.kristiania.http;

import java.util.HashMap;
import java.util.Map;

public class QueryString {
    private final Map<String,String> parameters = new HashMap<>();

    private  String parameterValue;
    private  String parameterName;

    public QueryString(String queryString) {

        for (String parameter : queryString.split("&")) {
            int equalPos= parameter.indexOf('=');
            parameterName = parameter.substring(0,equalPos);
            parameterValue= parameter.substring(equalPos+1);
            parameters.put(parameterName,parameterValue);
        }

    }

    public String getParameter(String parameterName) {
        if (parameterName.equals(this.parameterName)){
        return parameterValue;
    }else {
            return parameters.get(parameterName);
        }
    }

}
