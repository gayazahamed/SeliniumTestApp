package com.stegeman.otn;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test3 {
    public Test3() {
        super();
    }
    private Selenium selenium;

    @Before
    public void setUp() throws Exception {
       selenium =
                new DefaultSelenium("localhost", 4444, "*firefox C:\\Users\\gshaik\\AppData\\Local\\Mozilla Firefox\\firefox.exe", "https://businessq1.socalgas.com/");
        //        selenium =
            //    new DefaultSelenium("localhost", 4444, "*googlechrome C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "https://businessi3.socalgas.com/");
        selenium.start();
    }

    @Test
    public void testMyFirst() throws Exception {
        selenium.open("/security/signin.fcc?TYPE=33554433&REALMOID=06-000c9f34-b347-13b1-b26f-a537ac12904c&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-hrtJ%2fYPYat5ksJN3IVD74ZT%2fj%2fOl4sZCKSiWwbSbVNzbV1H8q9vqkBw2OWg3Ucfn&TARGET=-SM-HTTP%3a%2f%2fmyaccountnewi3%2esocalgas%2ecom%2fmyAccount%2ffaces%2fadf%2etask--flow%3fadf%2etfId%3dmanage--bankinfo--flow%26adf%2etfDoc%3d%2fWEB--INF%2ftaskflows%2fmanageBankInfo%2fmanage--bankinfo--flow%2exml");
                        selenium.click("id=USER");
                        selenium.type("id=USER", "novem1");
                        selenium.click("id=PASSWORD");
                        selenium.type("id=PASSWORD", "password");
                        selenium.click("id=loginButton");
                        selenium.waitForPageToLoad("30000");
                        selenium.click("id=pt1:pt_dc2:i1:1:navParentLink");
                        selenium.waitForPageToLoad("30000");
                        selenium.click("//a[@id='pt1:cl22']/span");
                        selenium.waitForPageToLoad("30000");
                        selenium.click("id=pt1:cb2");
                        selenium.waitForPageToLoad("30000");
                        selenium.type("id=pt1:pli1:baNickName::content", "asd");
                        Thread.sleep(1000);
                        selenium.type("id=pt1:pli1:baNickName::content", "asd");
                        selenium.type("id=pt1:pli3:routingNumber::content", "111000025");
                        Thread.sleep(1000);
                        selenium.type("id=pt1:pli3:routingNumber::content", "111000025");
                        selenium.type("id=pt1:pli5:bankAcct::content", "45698");
                        Thread.sleep(1000);
                        selenium.type("id=pt1:pli5:bankAcct::content", "45698");
                        selenium.type("id=pt1:pli4:confBaAcct::content", "45698");
                        Thread.sleep(1000);
                        selenium.type("id=pt1:pli4:confBaAcct::content", "45698");
                        selenium.click("id=pt1:next-btn");
                        selenium.waitForPageToLoad("30000");
                        selenium.click("id=pt1:submit-btn");
                        selenium.waitForPageToLoad("30000");
                       // assertEquals("Success!", selenium.getText("css=span.header-text"));

                        // <tr>
                        //      <td>clickAndWait</td>
                        //      <td>id=pt1:logout-btn</td>
                        //      <td></td>
                        // </tr>

                }

                @After
                public void tearDown() throws Exception {
                        selenium.stop();
                }
        }
