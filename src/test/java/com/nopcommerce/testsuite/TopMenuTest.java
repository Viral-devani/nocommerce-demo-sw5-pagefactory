package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.DesktopPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
    HomePage homepage;
    DesktopPage desktopPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homepage = new HomePage();
        desktopPage = new DesktopPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        homepage.selectMenu("Computers");
        homepage.mousehoverOnDesktopLinkAndClick();
        desktopPage.verifyProductsArrangedInAlphabeticallyDescendingOrder();

    }

}
