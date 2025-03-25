package com.sgtesting.Stepdefinition;

import com.sgtesting.Pom.Actipage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Stepdefinitions {
    public static WebDriver obrowser = null;
    public static Actipage opage=null;

    //Actions oaction=null;


    // Launch the browser
    @Given("^I launch the browser$")
    public void I_launch_the_browser() {
        try {
            obrowser = new ChromeDriver();
            opage=new Actipage(obrowser);
            obrowser.manage().window().maximize();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Navigate to url
    @And("^I navigate to Actitime Page$")
    public void I_navigate_Actitime_page() {
        try {
            obrowser.navigate().to("http://localhost:81/login.do");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Enter the username
    @When("^I enter user username$")
    public void Enter_The_Username() {
        try {
            //obrowser.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
            opage.getEnter_username().sendKeys("admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Enter the password
    @When("^I enter the password$")
    public void Enter_the_password() {
        try {
            //obrowser.findElement(By.xpath("//input[@class=\"textField pwdfield\"]")).sendKeys("manager");
            opage.getEnter_password().sendKeys("manager");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Enter the Login Button
    @And("^I click on the login button$")
    public void click_login_button() {
        try {
            obrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            opage.getClick_login().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Click on flyout window
    @And("^I clicked the flyout window$")
    public void click_Flyout_Window() {
        try {
           // obrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
            opage.getFlyout().click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Click on usertab
    @And("^I clicked the user usertab$")
    public void click_usertab() {
        try {
            //obrowser.findElement(By.xpath("//div[text()='USERS']")).click();
            opage.getAdd_user().click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Click on the createUser
    @And("^I clicked the Adduser$")
    public void click_Add_User() {
        try {
            //obrowser.findElement(By.xpath("//div[text()='Add User']")).click();
            opage.getCreate_Useer().click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Enter the user username
    @When("I enter the user firstname$")
    public void enter_user_firstname() {
        try {
            //obrowser.findElement(By.xpath("//input[@id=\"userDataLightBox_firstNameField\"]")).sendKeys("admin");
            opage.getEnter_user_username().sendKeys("admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //enter the user lastname
    @When("^I enter the user lastname$")
    public void enter_user_lastname() {
        try {
           // obrowser.findElement(By.xpath("//input[@id=\"userDataLightBox_lastNameField\"]")).sendKeys("user1");
            opage.getEnter_user_lastname().sendKeys("user1");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // enter the gmail
    @When("^I enter the gmail$")
    public void enter_gmail() {
        try {
           // obrowser.findElement(By.xpath("//input[@id=\"userDataLightBox_emailField\"]")).sendKeys("jbnsoma21498@gmail.com");
            opage.getEnter_gmail().sendKeys("jbnsoma21498@gmail.com");
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Enter the login username
    @When("^I eneter the login username$")
    public void enter_login_username() {
        try {
            //obrowser.findElement(By.xpath("//input[@id=\"userDataLightBox_usernameField\"]")).sendKeys("demouser1");
            opage.getCreate_login_username().sendKeys("demouser1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // enter the user password
    @When("^I enter the userpassword$")
    public void enter_user_password() {
        try {
            //obrowser.findElement(By.xpath("//input[@id=\"userDataLightBox_passwordField\"]")).sendKeys("Soma123");
            opage.getCreate_user_password().sendKeys("Soma123");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // enter the user re password
    @When("^I enter the retype password$")
    public void enter_retype_password() {
        try {
            //obrowser.findElement(By.xpath("//input[@placeholder=\"Retype Password\"]")).sendKeys("Soma123");
            opage.getCreate_user_retypepassword().sendKeys("Soma123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //click create user

    @And("^I clicked the create user$")
    public void click_createUser() {
        try {
            //obrowser.findElement(By.xpath("//Span[text()='Create User']")).click();
            opage.getClick_create_user().click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // click on created User
    @And("^I click on created user$")
    public void click_on_createdUser() {
        try {
            //obrowser.findElement(By.xpath("//span[text()='user1, admin' and @class=\"userNameSpan\"]")).click();
            opage.getClick_created_user().click();
            // obrowser.quit();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //click on delete button

    @And("^I click on delete button$")
    public void click_DeleteButton() {
        try {
           // obrowser.findElement(By.xpath("//button[@style=\"visibility: visible;\"]")).click();
            opage.getClick_on_delete_button().click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Handle the Alerts
    @And("^I handle the alert$")
    public void handle_Alerts() {
        try {
            Alert a = obrowser.switchTo().alert();
            a.accept();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Click on logout button
    @And("^I clicked the logout button$")
    public void click_logout() {
        try {
            obrowser.findElement(By.xpath("//a[text()='Logout']")).click();
            opage.getClick_on_delete_button().click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
// Close the application
    @And("^I close the apllication$")
    public void close_application() {
        try {
            obrowser.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Modify the userpassword
    @When("^I enter the modify userpassword$")
    public void modify_userpassword() {
        try {
            //obrowser.findElement(By.xpath("//input[@id=\"userDataLightBox_passwordField\"]")).sendKeys("Soma321");
            opage.getModify_password().sendKeys("Soma321");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Modify the retypepassword
    @When("^I enter the modify retypepassword$")
    public void modify_user_retype_password() {
        try {
            //obrowser.findElement(By.xpath("//input[@placeholder=\"Retype Password\"]")).sendKeys("Soma321");
            opage.getModify_retypepassword().sendKeys("Soma321");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //click on task
    @And("^I click on tasks$")
    public void click_Task() {
        try {
            //obrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
            opage.getClick_task().click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //click on addnew
    @And("^I click on addnew$")
    public void click_addnew() {
        try {
            //obrowser.findElement(By.xpath("//div[text()='Add New']")).click();
            opage.getSelect_addnew().click();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // click New Customer
    @And("^I click on new customer$")
    public void create_newCustomer() {
        try {
            //obrowser.findElement(By.xpath("//div[@class=\"item createNewCustomer ellipsis\"]")).click();
            opage.getClick_newcustomer().click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // add new customer
    @When("^I enter the new customer$")
    public void add_new_customer() {
        try {
            //obrowser.findElement(By.xpath("//input[@class=\"inputFieldWithPlaceholder\"]")).sendKeys("User1");
            opage.getAdd_new_customer().sendKeys("User1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // click on create customer
    @And("^I click on create customer$")
    public void click_create_customer() {
        try {
            obrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
            opage.getClick_create_customer().click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //I click on created customer
    @And("^I click on created customer$")
    public void click_Created_Customer() {
        try {
            //obrowser.findElement(By.xpath("//div[text()='User1 ' ]/following::div[@class=\"editButton available\"]")).click();
            opage.getClick_created_customer().click();
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //I click on actions button
    @And("^I click on actions button$")
    public void click_Actions_Button() {
        try {
            //oaction=new Actions(obrowser);
            //obrowser.findElement(By.xpath("//div[@class=\"edit_customer_sliding_panel sliding_panel\"]/div[@class=\"headerBlock\"]/div[4]")).click();
            opage.getClick_actions_button().click();
            // oaction.click(obrowser.findElement(By.xpath("//div[@class=\"edit_customer_sliding_panel sliding_panel\"]/div[@class=\"headerBlock\"]/div[4]"))).click();
            // oaction.moveToElement(obrowser.findElement(By.xpath("//div[@class=\"edit_customer_sliding_panel sliding_panel\"]/div[@class=\"headerBlock\"]/div[4]"))).click();
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //I click on customerDelete Button
    @And("^I click on customerDelete Button$")
    public void click_CustomerDelete_Button() {
        try {
            // oaction=new Actions(obrowser);
            //obrowser.findElement(By.xpath("//div[@class=\"dropdownContainer actionsMenu\"]/div[@class=\"buttonsWrapper\" and @style=\"width: 112px;\"]/div[3]/div[text()='Delete']")).click();
            opage.getClick_customerdelete_button().click();
            //oaction.click(obrowser.findElement(By.xpath("//div[@class=\"dropdownContainer actionsMenu\"]/div[@class=\"buttonsWrapper\" and @style=\"width: 112px;\"]/div[3]/div[text()='Delete']"))).click();
            // oaction.moveToElement(obrowser.findElement(By.xpath("//div[@class=\"dropdownContainer actionsMenu\"]/div[@class=\"buttonsWrapper\" and @style=\"width: 112px;\"]/div[3]/div[text()='Delete']"))).click();
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //I click on permanent customerDelete Button
    @And("^I click on permanent customerDelete Button$")
    public void click_permanent_delete_button() {
        try {
            //oaction=new Actions(obrowser);
            //obrowser.findElement(By.xpath("//span[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
            opage.getClick_permanent_customerDelete_Button().click();
            // oaction.click(obrowser.findElement(By.xpath("//span[@id=\"customerPanel_deleteConfirm_submitTitle\"]"))).click();
            // oaction.moveToElement(obrowser.findElement(By.xpath("//span[@id=\"customerPanel_deleteConfirm_submitTitle\"]"))).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // I click on customer checkbox
    @And("^I click on checkbox$")
    public void Add_Description() {
        try {
            //obrowser.findElement(By.xpath("//td[@class=\"selection\"]/div[@class=\"checkbox inactive\"]")).click();
            opage.getClick_customer_checkbox().click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  // click on user1
    @And("^I click on User1$")
    public void click_user1() {
        try {
            //obrowser.findElement(By.xpath("I click on User1")).click();
            opage.getClick_user1().click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // I click on New Project
    @And("^I click on New Project$")
    public void click_on_new_project() {
        try {
            //obrowser.findElement(By.xpath("//div[@class=\"item createNewProject ellipsis\"]")).click();
            opage.getClick_newproject().click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //I give the Project Name
    @When("^I give the Project Name$")
    public void give_project_name() {
        try {
            //obrowser.findElement(By.xpath("//input[@class=\"projectNameField inputFieldWithPlaceholder\"]")).sendKeys("Actitime");
            opage.getGive_projectname().sendKeys("Actitime");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //I click on Select customer
    @And("^I click on Select Customer$")
    public void select_customer() {
        try {
            //obrowser.findElement(By.xpath("//button[@id=\"ext-gen23\"]")).click();
            opage.getClick_select_customer().click();
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // I select New Customer
    @And("^I select New Customer$")
    public void select_new_customer() {
        try {
            //obrowser.findElement(By.xpath("//a[text()=\"-- New Customer --\"]")).click();
            opage.getSelect_new_customer().click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //I give the CustomerName
    @When("^I give the CustomerName$")
    public void Give_Customer_Name() {
        try {
            //obrowser.findElement(By.xpath("//input[@class=\"newCustomer inputFieldWithPlaceholder\"]")).sendKeys("ADMIN");
            opage.getGive_customerame().sendKeys("ADMIN");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // I click on Create Project
    @And("^I click on Create Project$")
    public void click_CreateProject() {
        try {
            //obrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
            opage.getClick_creatproject().click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //I click on Created Customer
    @And("^I click on Created Customer$")
    public void click_Created_Customer_Project() {
        try {
            //obrowser.findElement(By.xpath("//div[text()='ADMIN ']/following-sibling::div[@class=\"editButton available\"]")).click();
            opage.getClick_createdcustomer().click();
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // I click on Active Button
    @And("^I click on Active Button$")
    public void click_Active_Button(){
        try{
            //obrowser.findElement(By.xpath("//div[@class=\"edit_customer_sliding_panel sliding_panel\"]/div[@class=\"headerBlock\"]/div[4]")).click();
            opage.getClick_active_button().click();
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // I click on Delete Button
    @And("^I click on Delete Button$")
    public void click_Delete_Button(){
        try{
           // obrowser.findElement(By.xpath("//div[@class=\"dropdownContainer actionsMenu\"]/div[@class=\"buttonsWrapper\" and @style=\"width: 112px;\"]/div[3]/div[text()='Delete']")).click();
            opage.getClick_Delete_Button().click();
            Thread.sleep(1000);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    // I click on Permanent Delete Button
    @And("^I click on Permanent Delete Button$")
    public void click_Permanent_DeleteButton(){
        try{
            //obrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
            opage.getClick_permanent_deleton().click();
            Thread.sleep(1000);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    // I click on Created Customer Admin
    @And("^I click on Created Customer Admin$")

    public  void click_Customer_Admin(){
        try{
            //obrowser.findElement(By.xpath("//div[@class=\"title\" and text()='ADMIN ']")).click();
            opage.getClick_CreateCustomerAdmin().click();
            Thread.sleep(1000);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    // I click on Admin CheckBox
    @And("^I click on Admin CheckBox$")

    public void click_Admin_Checkbox(){
       try{
           //obrowser.findElement(By.xpath("//div[@class=\"checkbox inactive\"]/div[@class=\"img\"]")).click();
           opage.getClick_Admin_checkbox().click();
           Thread.sleep(1000);

       }catch (Exception e) {
           e.printStackTrace();
       }
    }
}