package com.company;

import java.util.HashSet;
import java.util.Set;

public class Author {

    private Set<String> authorNames=new HashSet<>();

    public Author(){}
    public Author(Set<String> authorNames) {
        this.authorNames = authorNames;
    }
    public Set<String> getAuthorNames() {
        return authorNames;
    }


    public void setAuthorNames(Set<String> authorNames) {
        this.authorNames = authorNames;
    }

    @Override
    public String toString() {
        return ""+authorNames;
    }
}
