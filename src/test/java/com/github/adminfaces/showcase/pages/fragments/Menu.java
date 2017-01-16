package com.github.adminfaces.showcase.pages.fragments;

import org.jboss.arquillian.graphene.GrapheneElement;
import org.jboss.arquillian.graphene.findby.FindByJQuery;
import org.jboss.arquillian.graphene.fragment.Root;

import static org.jboss.arquillian.graphene.Graphene.guardHttp;

/**
 * Created by rafael-pestano on 16/01/17.
 */
public class Menu {

    @Root
    private GrapheneElement menu;

    @FindByJQuery("li a[href$='index.xhtml']")
    private GrapheneElement home;

    @FindByJQuery("li a[href$='exception.xhtml']")
    private GrapheneElement exception;

    @FindByJQuery("li a[href$='forms.xhtml']")
    private GrapheneElement forms;


    public void goToHomePage(){
        guardHttp(home).click();
    }

    public void goToExceptionPage(){
        guardHttp(exception).click();
    }


    public GrapheneElement getHome() {
        return home;
    }

    public GrapheneElement getException() {
        return exception;
    }

    public GrapheneElement getForms() {
        return forms;
    }
}