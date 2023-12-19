package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {

    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
    WebElement clickOnAdmin;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement clickOnAdd;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='profile picture']")
    WebElement clickOnUserProfileLogo;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement mouseHoverOnLogout;

    public void clickOnAdminButton() {
        clickOnElement(clickOnAdmin);
        log.info("Clicking on admin " + clickOnAdmin.toString());
    }

    public void clickOnAddButton() {
        clickOnElement(clickOnAdd);
        log.info("Clicking on add button " + clickOnAdd.toString());
    }

    public void ClickOnUserProfileLogo() {
        clickOnElement(clickOnUserProfileLogo);
        log.info("Clicking on user profile logo " + clickOnUserProfileLogo.toString());
    }

    public void MouseHoverOnLogout() {
        mouseHoverToElementAndClick(mouseHoverOnLogout);
        log.info("Mouseover on logout " + mouseHoverOnLogout.toString());
    }


}
