package org.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hashTag_StepDef { private final By pageTitle=By.xpath("//a/child::img[@id='logo']");
    private final By menuServices=By.xpath("//a[text()='Services']");
    private final By menuSpopify=By.xpath("//a[text()='Shopify ']");
    private final By menuCareers=By.xpath("//a[text()='Careers ']");
    private final By menuCaseStudies=By.xpath("//a[text()='Case studies ']");
    private final By menuAboutUs=By.xpath("//a[text()='About Us ']");
    private final By menuBlog=By.xpath("//a[text()='Blog ']");
    private final By menuContactUs=By.xpath("//a[text()='Contact Us ']");
    private final By btn_EN=By.xpath("//a/child::i[@class='fa fa-angle-down']");
    private final By btn_Speak=By.xpath("(//button/child::a)[2]");
    private final By lbl_JoinUs=By.xpath("//span[text()='Join us']");
    private final By lbl_Name=By.xpath("//label[text()='Name']");
    private final By lbl_EnterName=By.xpath("//input[@name='name']");
    private final By lbl_Email=By.xpath("//label[text()='Email']");
    private final By lbl_EnterEmail=By.xpath("//input[@name='email']");
    private final By lbl_Phone=By.xpath("//label[text()='Phone']");
    private final By lbl_EnterPhone=By.xpath("//input[@name='phone']");
    private final By lbl_resume=By.xpath("//input[@name='resume']");
    private final By lbl_Description=By.xpath("//label[text()='Description']");
    private final By lbl_EnterDescription=By.xpath("//textarea[@name='description']");
    private final By btn_Apply=By.xpath("//button[text()='APPLY NOW']");
    private final By lbl_footerMenu=By.xpath("//p[text()='MENU']");
    private final By lbl_footerServices=By.xpath("//p[text()='SERVICES']");

    WebDriver driver=new ChromeDriver();
    @Given("user navigate to hashtag landing page")
    public void userNavigateToHashtagLandingPage() {
        driver.manage().window().maximize();
        driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
        driver.getTitle().equalsIgnoreCase("Full Stack Web Development Company - California");

    }
    @When("user verifies hashtag page logo in header bar")
    public void userVerifiesHashtagPageLogoInHeaderBar() {
        driver.findElement(pageTitle);
    }
    @Then("user verifies {string},{string},{string},{string} nav bar menus in landing page")
    public void userVerifiesNavBarMenusInLandingPage(String Services, String Shopify ,String Blog, String Careers) {
        driver.findElement(menuServices).equals(Services);
        driver.findElement(menuSpopify).equals(Shopify);
        driver.findElement(menuBlog).equals(Blog);
        driver.findElement(menuCareers).equals(Careers);

    }


    @And("user verifies Services dropdown for Services menu in landing page")
    public void userVerifiesServicesDropdownForServicesMenuInLandingPage() {
        driver.findElement(btn_EN);
    }


    @And("user verifies {string} Button in hashtag page")
    public void userVerifiesButtonInHashtagPage(String letsSpeck) {
        driver.findElement(btn_Speak);
    }
    @And("user verifies case studies menu in hashtag page")
    public void userVerifiesCaseStudiesMenuInHashtagPage() {
        driver.findElement(menuCaseStudies);
    }

    @And("user verifies about us menu in hashtag page")
    public void userVerifiesAboutUsMenuInHashtagPage() {
        driver.findElement(menuAboutUs);
    }
    @And("user verifies contact us menu in hashtag page")
    public void userVerifiesContactUsMenuInHashtagPage() {
        driver.findElement(menuContactUs);
    }

    @Then("verifies Join us title in hashtag page")
    public void verifiesJoinUsTitleInHashtagPage() {
        driver.findElement(lbl_JoinUs);
    }

    @And("user verifies and provide name of hashtag in hashtag page")
    public void userVerifiesAndProvideNameOfHashtagInHashtagPage() {
        driver.findElement(lbl_Name);
        driver.findElement(lbl_EnterName).sendKeys("Manjula");

    }

    @Then("user verifies and provide email in hashtag page")
    public void userVerifiesAndProvideEmailInHashtagPage() {
        driver.findElement(lbl_Email);
        driver.findElement(lbl_EnterEmail).sendKeys("manjula@gmail.com");
    }

    @And("user verifies and provide phone in hashtag page")
    public void userVerifiesAndProvidePhoneInHashtagPage() {
        driver.findElement(lbl_Phone);
        driver.findElement(lbl_EnterPhone).sendKeys("0987654321");
    }

    @And("user verifies and enter resume in hashtag page")
    public void userVerifiesAndEnterResumeInHashtagPage() {
        driver.findElement(lbl_resume).sendKeys("/Users/manjula/Downloads");
    }
    @Then("user verifies and enter description in hashtag page")
    public void userVerifiesAndEnterDescriptionInHashtagPage() {
        driver.findElement(lbl_Description);
        driver.findElement(lbl_EnterDescription).sendKeys("I have a 2 years of experience in automation testing,API testing and database validation");
    }
    @And("user verifies apply now button in hashtag page")
    public void userClickApplyNowButtonInHashtagPage() {
        driver.findElement(btn_Apply);
    }

    @Then("user verifies footer section Menu in hashtag page")
    public void userVerifiesFooterSectionMenuInHashtagPage() {
        driver.findElement(lbl_footerMenu);
    }

    @And("user verifies Services in hashtag page")
    public void userVerifiesServicesInHashtagPage() {
        driver.findElement(lbl_footerServices);
    }
}