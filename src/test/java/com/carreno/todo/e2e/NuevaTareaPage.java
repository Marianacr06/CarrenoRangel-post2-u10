package com.carreno.todo.e2e;

import org.openqa.selenium.WebDriver;

public class NuevaTareaPage {
    private final WebDriver driver;

    public NuevaTareaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String obtenerTituloPagina() {
        return driver.getTitle();
    }
}
