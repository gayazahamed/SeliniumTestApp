package com.stegeman.otn;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class myFirstTest {
    private Selenium selenium;

    @Before
    public void setUp() throws Exception {
        selenium =
                new DefaultSelenium("localhost", 4444, "*firefox C:\\Users\\gshaik\\AppData\\Local\\Mozilla Firefox\\firefox.exe", "https://businessi3.socalgas.com/");
        selenium.start();
    }

    @Test
    public void testMyFirst() throws Exception {
        selenium.open("/security/signin.fcc?TYPE=33554433&REALMOID=06-000190f7-e240-13e8-b26f-a537ac12904c&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-hrtJ%2fYPYat5ksJN3IVD74ZT%2fj%2fOl4sZCKSiWwbSbVNzbV1H8q9vqkBw2OWg3Ucfn&TARGET=-SM-http%3a%2f%2fbusinessi3%2esocalgas%2ecom%2fportal%2f");
        assertEquals("Log In to My Account | Business My Account | SoCalGas",
                     selenium.getTitle());
//        assertTrue(selenium.getText("//form[@id='loginForm']/table/tbody/tr[2]/td").matches("^exact:[\\s\\S]*Required Password\\. Passwords are case sensitive\\.:$"));
//        selenium.click("id=not-you");
        assertEquals("", selenium.getText("id=USER"));
        selenium.type("id=USER", "gshaik102");
        assertEquals("", selenium.getText("id=PASSWORD"));
        selenium.type("id=PASSWORD", "matrix12");
        selenium.click("id=PASSWORD");
        selenium.click("id=loginButton");
        selenium.waitForPageToLoad("30000");
        selenium.open("/portal/faces/adf.task-flow?adf.tfId=manage-bankinfo-flow&adf.tfDoc=/WEB-INF/taskflows/manageBankInfo/manage-bankinfo-flow.xml");
        assertEquals("Manage Bank Information",
                     selenium.getText("css=h1.af_panelHeader_title-text0."));
        selenium.click("id=pt1:cb2");
        selenium.waitForPageToLoad("30000");
        selenium.click("id=pt1:pli4:confBaAcct::content");
        selenium.type("id=pt1:pli4:confBaAcct::content", "4563");
        assertEquals("", selenium.getText("id=pt1:pli4:confBaAcct::content"));
    }

    @After
    public void tearDown() throws Exception {
        selenium.stop();
    }
}
