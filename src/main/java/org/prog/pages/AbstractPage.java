package org.prog.pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {

    protected final WebDriver driver;
    private final String url;

    public AbstractPage(String url, WebDriver driver) {
        this.driver = driver;
        this.url = url;
    }

    public void loadPage() {
        driver.get("about:blank");
        driver.get(url);
    }

    public void quiteDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
