package org.decibel.test.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GoogleElements {

    public static final SelenideElement SEARCH_BAR = $(byXpath(""));
}
