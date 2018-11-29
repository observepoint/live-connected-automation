package models;

import org.apache.http.HeaderElement;
import org.apache.http.ParseException;

public class Header implements org.apache.http.Header {
    private String name;
    private String value;

    public Header(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Header() {
    }

    public Header setName (String name){
        this.name = name;
        return this;
    }

    public Header setValue(String value){
        this.value = value;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public HeaderElement[] getElements() throws ParseException {
        return new HeaderElement[0];
    }
}

