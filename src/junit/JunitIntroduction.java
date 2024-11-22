package junit;

import org.junit.*;

public class JunitIntroduction {
    @BeforeClass
    public static void connectionDB(){
        System.out.println("DB Connection");

    }
    @AfterClass
    public static void closeDBConnection(){

    }

    @Before
    public void openBrowser(){
        System.out.println("Opening Browser");

    }
    @After
    public void closeBrowser(){
        System.out.println("Close the browser");

    }
   @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        System.out.println("navigate to page");
       Assert.assertTrue(true);
    }
    @Test
    public void test(){
        System.out.println("This is Test method");
        Assert.assertEquals("Nnnn", "Nnnn");
    }
}
