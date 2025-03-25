package com.sgtesting.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.security.interfaces.XECPrivateKey;

public class Actipage {
    public Actipage(WebDriver obrowser){
        PageFactory.initElements(obrowser,this);
    }
    // Enter the username
    @FindBy(xpath ="//input[@name='username']")
    private WebElement enter_username;
    public WebElement getEnter_username(){
        return enter_username;
    }
    // Enter the password
    @FindBy(xpath = "//input[@class=\"textField pwdfield\"]")
    private WebElement enter_password;
    public WebElement getEnter_password(){return enter_password;}

    //Enter the Login Button
    @FindBy(xpath = "//div[text()='Login ']")
    private WebElement click_login;
    public WebElement getClick_login(){return click_login;}

    //Click on flyout window
    private WebElement gettingStartedShortcutsMenuCloseId;
    public WebElement getFlyout(){return gettingStartedShortcutsMenuCloseId;}

    //Click on usertab
     @FindBy(xpath = "//div[text()='USERS']")
    private WebElement Add_user;
    public WebElement getAdd_user(){return Add_user;}

    // Click on the createUser
    @FindBy(xpath = "//div[text()='Add User']")
    private WebElement Create_User;
    public WebElement getCreate_Useer(){return Create_User;}

    // Enter the user username
    @FindBy(xpath = "//input[@id=\"userDataLightBox_firstNameField\"]")
    private WebElement enter_user_username;
    public WebElement getEnter_user_username(){return enter_user_username;}

    //enter the user lastname
    @FindBy(xpath = "//input[@id=\"userDataLightBox_lastNameField\"]")
    private WebElement enter_user_lastname;
    public WebElement getEnter_user_lastname(){return enter_user_lastname;}

    // enter the gmail
    @FindBy(xpath = "//input[@id=\"userDataLightBox_emailField\"]")
    private WebElement enter_gmail;
    public WebElement getEnter_gmail(){return enter_gmail;}

    // Enter the login username
    @FindBy(xpath = "//input[@id=\"userDataLightBox_usernameField\"]")
    private WebElement create_login_username;
    public WebElement getCreate_login_username(){return create_login_username;}

    //// enter the user password
    @FindBy(xpath = "//input[@id=\"userDataLightBox_passwordField\"]")
    private WebElement create_user_password;
    public WebElement getCreate_user_password(){return create_user_password;}

    // enter the user re password
    @FindBy(xpath = "//input[@placeholder=\"Retype Password\"]")
    private WebElement create_user_retypepassword;
    public WebElement getCreate_user_retypepassword(){return create_user_retypepassword;}

    //click create user
    @FindBy(xpath = "//Span[text()='Create User']")
    private WebElement click_create_user;
    public WebElement getClick_create_user(){return click_create_user;}

    // click created user
    @FindBy(xpath = "//span[text()='user1, admin' and @class=\"userNameSpan\"]")
    private WebElement click_created_user;
    public WebElement getClick_created_user(){return click_created_user;}

    //click on delete button
    @FindBy(xpath = "//button[@style=\"visibility: visible;\"]")
    private WebElement click_on_delete_button;
    public WebElement getClick_on_delete_button(){return click_on_delete_button;}

    //Click on logout button
    @FindBy(xpath = "//a[text()='Logout']")
    private  WebElement click_logout_button;
    public WebElement getClick_logout_button(){return click_logout_button;}

   // Modify the userpassword
    @FindBy(xpath = "//input[@id=\"userDataLightBox_passwordField\"]")
    private WebElement modify_password;
    public WebElement getModify_password(){return modify_password;}

    //Modify the retypepassword
    @FindBy(xpath = "//input[@placeholder=\"Retype Password\"]")
    private WebElement modify_retypepassword;
    public WebElement getModify_retypepassword(){return modify_retypepassword;}

    //click on task
    @FindBy(xpath = "//div[text()='TASKS']")
    private WebElement click_task;
    public WebElement getClick_task(){return click_task;}

    //click on addnew
    @FindBy(xpath = "//div[text()='Add New']")
    private WebElement select_addnew;
    public WebElement getSelect_addnew(){return select_addnew;}

    // click New Customer
    @FindBy(xpath = "//div[@class=\"item createNewCustomer ellipsis\"]")
    private WebElement click_newcustomer;
    public WebElement getClick_newcustomer(){return click_newcustomer;}

    // add new customer
    @FindBy(xpath = "//input[@class=\"inputFieldWithPlaceholder\"]")
    private WebElement add_new_customer;
    public WebElement getAdd_new_customer(){return add_new_customer;}

    // click on create customer
    @FindBy(xpath = "//span[text()='Create Customer']")
    private WebElement click_create_customer;
    public WebElement getClick_create_customer(){return click_create_customer;}

    //I click on created customer
    @FindBy(xpath ="//div[text()='User1 ' ]/following::div[@class=\"editButton available\"]")
    private WebElement click_created_customer;
    public WebElement getClick_created_customer(){return click_created_customer;}

    //I click on actions button
    @FindBy(xpath ="//div[@class=\"edit_customer_sliding_panel sliding_panel\"]/div[@class=\"headerBlock\"]/div[4]")
    private WebElement click_actions_button;
    public WebElement getClick_actions_button(){return click_actions_button;}

    //I click on customerDelete Button
    @FindBy(xpath = "//div[@class=\"dropdownContainer actionsMenu\"]/div[@class=\"buttonsWrapper\" and @style=\"width: 112px;\"]/div[3]/div[text()='Delete']")
    private WebElement click_customerdelete_button;
    public WebElement getClick_customerdelete_button(){return click_customerdelete_button;}

    //I click on permanent customerDelete Button
    @FindBy(xpath ="//span[@id=\"customerPanel_deleteConfirm_submitTitle\"]")
    private WebElement click_permanent_customerDelete_Button;
    public WebElement getClick_permanent_customerDelete_Button(){return click_permanent_customerDelete_Button;}

    // I click customer check box
    @FindBy(xpath = "//td[@class=\"selection\"]/div[@class=\"checkbox inactive\"]")
    private WebElement click_customer_checkbox;
    public WebElement getClick_customer_checkbox(){return click_customer_checkbox;}

    // click on user1
    @FindBy(xpath = "I click on User1")
    private WebElement click_user1;
    public WebElement getClick_user1(){return click_user1;}

    // I click on New Project
    @FindBy(xpath = "//div[@class=\"item createNewProject ellipsis\"]")
    private WebElement click_newproject;
    public WebElement getClick_newproject(){return click_newproject;}

    //I give the Project Name
    @FindBy(xpath ="//input[@class=\"projectNameField inputFieldWithPlaceholder\"]")
    private WebElement give_projectname;
    public WebElement getGive_projectname(){return give_projectname;}

    //I click on Select customer
    @FindBy(xpath = "//button[@id=\"ext-gen23\"]")
    private WebElement click_select_customer;
    public WebElement getClick_select_customer(){return click_select_customer;}

    // I select New Customer
    @FindBy(xpath = "//a[text()=\"-- New Customer --\"]")
    private WebElement select_new_customer;
    public WebElement getSelect_new_customer(){return select_new_customer;}

    //I give the CustomerName
    @FindBy(xpath = "//input[@class=\"newCustomer inputFieldWithPlaceholder\"]")
    private WebElement give_customerame;
    public WebElement getGive_customerame(){return give_customerame;}

    // I click on Create Project
    @FindBy(xpath = "//span[text()='Create Project']")
    private WebElement click_creatproject;
    public WebElement getClick_creatproject(){return click_creatproject;}

    //I click on Created Customer
    @FindBy(xpath ="//div[text()='ADMIN ']/following-sibling::div[@class=\"editButton available\"]")
    private WebElement click_createdcustomer;
    public  WebElement getClick_createdcustomer(){return click_createdcustomer;}

    //I click on Active Button
    @FindBy(xpath = "//div[@class=\"edit_customer_sliding_panel sliding_panel\"]/div[@class=\"headerBlock\"]/div[4]")
    private WebElement click_active_button;
    public WebElement getClick_active_button(){return click_active_button;}

    // I click on Delete Button
    @FindBy(xpath = "//div[@class=\"dropdownContainer actionsMenu\"]/div[@class=\"buttonsWrapper\" and @style=\"width: 112px;\"]/div[3]/div[text()='Delete']")
    private WebElement click_Delete_Button;
    public WebElement getClick_Delete_Button(){return click_Delete_Button;}

    // I click on Permanent Delete Button
    @FindBy(xpath ="//span[text()='Delete permanently']")
    private WebElement click_permanent_deleton;
    public WebElement getClick_permanent_deleton(){return click_permanent_deleton;}

    // I click on Created Customer Admin
    @FindBy(xpath = "//div[@class=\"title\" and text()='ADMIN ']")
    private WebElement click_CreateCustomerAdmin;
    public  WebElement getClick_CreateCustomerAdmin(){return click_CreateCustomerAdmin;}

    // I click on Admin CheckBox
    @FindBy(xpath = "//div[@class=\"checkbox inactive\"]/div[@class=\"img\"]")
    private WebElement click_Admin_checkbox;
    public WebElement getClick_Admin_checkbox(){return click_Admin_checkbox;}











}
