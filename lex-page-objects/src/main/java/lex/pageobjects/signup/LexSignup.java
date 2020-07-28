package lex.pageobjects.signup;

import org.openqa.selenium.WebDriver;
import lex.framework.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LexSignup extends BasePage {

    private final String url = "https://www.lexingtonlaw.com/signup";

    ///////////////* Locators *///////////////
    @FindBy(how = How.CSS, using = "title")
    private WebElement pageTitle;

    @FindBy(how = How.CSS, using = "#signup-v2 > div.submit_button_wrap > button")
    private WebElement submitStepOne;

    @FindBy(how = How.CSS, using = "")
    private WebElement submitStepTwo;

    @FindBy(how = How.CSS, using = "div.step1.active")
    private List<WebElement> stepOne;

    @FindBy(how = How.CSS, using = "div.step2.active")
    private List<WebElement> stepTwo;

    @FindBy(how = How.CSS, using = "div.step3.active")
    private List<WebElement> stepThree;

    /////////////// Header & Footer Locators ///////////////
    @FindBy(how = How.CSS, using = "span.mobile-phone")
    private WebElement lexCountryCode;

    @FindBy(how = How.CSS, using = "span.lexingtonPhoneNumber.phoneNumber")
    private WebElement lexPhone;

    @FindBy(how = How.CSS, using = "a[href='/info/terms']")
    private WebElement termsOfUseFooter;

    @FindBy(how = How.CSS, using = "a[href='/info/privacy-policy']")
    private WebElement privacyPolicyFooter;

    @FindBy(how = How.CSS, using = "a[href='/info/sms-terms']")
    private WebElement textMessageTermsFooter;

    @FindBy(how = How.CSS, using = "a[href='https://www.lexingtonlaw.com/info/terms.html']")
    private WebElement termsOfUse;

    @FindBy(how = How.CSS, using = "a[href='https://www.lexingtonlaw.com/info/privacy-policy.html']")
    private WebElement privacyPolicy;

    @FindBy(how = How.CSS, using = "a[href='https://www.lexingtonlaw.com/info/terms#arbitration-provision']")
    private WebElement arbitrationProvision;

    /////////////// Step 1 Locators ///////////////
    @FindBy(how = How.ID, using = "FirstName")
    private WebElement firstName;

    @FindBy(how = How.ID, using = "LastName")
    private WebElement lastName;

    @FindBy(how = How.ID, using = "Email")
    private WebElement email;

    @FindBy(how = How.ID, using = "Phone")
    private WebElement phone;

    @FindBy(how = How.ID, using = "Address")
    private WebElement streetAddress;

    @FindBy(how = How.ID, using = "Zip")
    private WebElement zipCode;

    @FindBy(how = How.ID, using = "yes-ffd")
    private WebElement familyCheckbox;

    @FindBy(how = How.ID, using = "FirstName-ffhd")
    private WebElement familyMemberFirstName;

    @FindBy(how = How.ID, using = "LastName-ffhd")
    private WebElement familyMemberLastName;

    @FindBy(how = How.ID, using = "Email-ffhd")
    private WebElement familyMemberEmail;

    @FindBy(how = How.ID, using = "Phone-ffhd")
    private WebElement familyMemberPhone;

    @FindBy(how = How.ID, using = "Address-ffhd")
    private WebElement familyMemberAddress;

    @FindBy(how = How.ID, using = "Zip-ffhd")
    private WebElement familyMemberZip;

    @FindBy(how = How.CSS, using = "h2.family-sign-up-wording.step-1-headers[style='display: none;']")
    private List<WebElement> ffdOff;

    @FindBy(how = How.CSS, using = "h2.family-sign-up-wording.step-1-headers[style='display: block;']")
    private List<WebElement> ffdOn;

    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "California")
    private WebElement californiaPrivacyRights;

    /////////////// Step 2 Locators ///////////////
    @FindBy(how = How.CSS, using = "label[for='premier-plus-option']")
    private WebElement premierPlusCheckbox;

    @FindBy(how = How.CSS, using = "label[for='concord-premier-option']")
    private WebElement concordPremierCheckbox;

    @FindBy(how = How.CSS, using = "label[for='concord-standard-option']")
    private WebElement concordStandardCheckbox;

    @FindBy(how = How.CSS, using = "label[for='yes-same-service']")
    private WebElement yesSameServiceCheckbox;

    @FindBy(how = How.CSS, using = "label[for='no-same-service']")
    private WebElement noSameServiceCheckbox;

    @FindBy(how = How.CSS, using = "label[for='same-billing-check']")
    private WebElement sameBillingCheckbox;

    @FindBy(how = How.ID, using = "quickstart-check")
    private WebElement quickstartCheckbox;

    @FindBy(how = How.CSS, using = "span.billing-total-fee.primary-user")
    private WebElement totalDueToday;

    @FindBy(how = How.CSS, using = "a.billing-info-edit#primary-user")
    private WebElement billingInfoEdit;

    @FindBy(how = How.CSS, using = "a.billing-info-edit#ffhd-user")
    private WebElement billingInfoEditFamilyMember;

    @FindBy(how = How.ID, using = "cc_num_0")
    private WebElement cardNumber;

    @FindBy(how = How.ID, using = "cc_exp")
    private WebElement expiration;

    @FindBy(how = How.ID, using = "cc_cvv")
    private WebElement cvv;

    @FindBy(how = How.ID, using = "cc-name")
    private WebElement nameOnCard;

    @FindBy(how = How.ID, using = "cc-street")
    private WebElement billingAddress;

    @FindBy(how = How.ID, using = "cc-zip")
    private WebElement billingZipCode;

    @FindBy(how = How.ID, using = "cc_num_0-ffhd")
    private WebElement cardNumberSecondary;

    @FindBy(how = How.ID, using = "cc_exp-ffhd")
    private WebElement expirationSecondary;

    @FindBy(how = How.ID, using = "cc_cvv-ffhd")
    private WebElement cvvSecondary;

    @FindBy(how = How.ID, using = "cc-name-ffhd")
    private WebElement nameOnCardSecondary;

    @FindBy(how = How.ID, using = "cc-street-ffhd")
    private WebElement billingAddressSecondary;

    @FindBy(how = How.ID, using = "cc-zip-ffhd")
    private WebElement billingZipCodeSecondary;

    @FindBy(how = How.ID, using = "next")
    private WebElement nextReview;

    @FindBy(how = How.ID, using = "prev")
    private WebElement prevReview;

    @FindBy(how = How.LINK_TEXT, using = "Info About Our Testimonials")
    private WebElement testimonialLink;

    /////////////// Step 3 Locators ///////////////
    @FindBy(how = How.ID, using = "username")
    private WebElement username;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.CSS, using = "label[for='select_all_checkbox']")
    private WebElement selectAllCheckbox;

    @FindBy(how = How.CSS, using = "label[for='ESignDisclosures']")
    private WebElement eSignCheckbox;

    @FindBy(how = How.CSS, using = "label[for='FederalDisclosures']")
    private WebElement federalDisclosureCheckbox;

    @FindBy(how = How.CSS, using = "label[for='StateDisclosures']")
    private WebElement stateDisclosureCheckbox;

    @FindBy(how = How.CSS, using = "label[for='RetainerAgreement']")
    private WebElement serviceAgreementCheckbox;

    @FindBy(how = How.CSS, using = "label[for='FederalCancellation']")
    private WebElement federalCancellationCheckbox;

    @FindBy(how = How.CSS, using = "label[for='StateCancellation']")
    private WebElement stateCancellationCheckbox;

    @FindBy(how = How.ID, using = "digital_signature")
    private WebElement legalSignature;

    @FindBy(how = How.ID, using = "ssn")
    private WebElement socialSecurityNumber;

    @FindBy(how = How.ID, using = "dob")
    private WebElement dob;

    // Constructors
    public LexSignup(WebDriver driver) {
        super(driver);
        driver.get(url);
    }
    public LexSignup(WebDriver driver, Boolean x) {
        super(driver);
    }

    /* Driver Methods */
    public WebElement getPageTitle() {
        return pageTitle;
    }

    public boolean isHome() {
        return getPageTitle().getAttribute("text").contains("Sign Up");
    }

    public void submitStepOne() {
        submitStepOne.click();
    }

    public boolean atStepOne() {
        return stepOne.size() != 0;
    }

    public boolean atStepTwo() {
        return stepTwo.size() != 0;
    }

    public boolean atStepThree() {
        return stepThree.size() != 0;
    }

    public String getPhoneNumber() {
        return lexCountryCode.getText() + lexPhone.getText();
    }

    public void clickTermsOfUseFooter() {

    }

    public void clickTermsOfUse() {

    }

    public boolean atTermsOfUse() {
        return true; // Need to implement
    }

    public void clickPrivacyPolicyFooter() {

    }

    public void clickPrivacyPolicy() {

    }

    public boolean atPrivacyPolicy() {
        return true; // Need to implement
    }

    public void clickTextMessageTerms() {

    }

    public boolean atTextMessageTerms() {
        return true; // Need to implement
    }

    public void clickArbitrationProvision() {

    }

    public boolean atArbitrationProvision() {
        return true; // Need to implement
    }

    public void setFirstName(String fname) {
        firstName.clear();
        firstName.sendKeys(fname);
    }

    public void setLastName(String lname) {
        lastName.clear();
        lastName.sendKeys(lname);
    }

    public void setEmail(String emale) {
        email.clear();
        email.sendKeys(emale);
    }

    public void setPhone(String ph) {
        phone.clear();
        phone.sendKeys(ph);
    }

    public void setAddress(String addr) {
        streetAddress.clear();
        streetAddress.sendKeys(addr);
    }

    public void setZip(String zp) {
        zipCode.clear();
        zipCode.sendKeys(zp);
    }

    public void setSecondaryFirstName(String fname) {
        familyMemberFirstName.clear();
        familyMemberFirstName.sendKeys(fname);
    }

    public void setSecondaryLastName(String lname) {
        familyMemberLastName.clear();
        familyMemberLastName.sendKeys();
    }

    public void setSecondaryEmail(String emale) {
        familyMemberEmail.clear();
        familyMemberEmail.sendKeys(emale);
    }

    public void setSecondaryPhone(String ph) {
        familyMemberPhone.clear();
        familyMemberPhone.sendKeys(ph);
    }

    public void setSecondaryAddress(String addr) {
        familyMemberAddress.clear();
        familyMemberAddress.sendKeys(addr);
    }

    public void setSecondaryZip(String zp) {
        familyMemberZip.clear();
        familyMemberZip.sendKeys(zp);
    }

    public boolean ffdDisplayed() {
        return ffdOn.size() != 0;
    }

    public boolean ffdNotDisplayed() {
        return ffdOff.size() != 0;
    }

    public void toggleOnFFD() {
        if (ffdNotDisplayed()){
            familyCheckbox.click();
        } // else the checkbox is already toggled on
    }

    public void toggleOffFFD() {
        if (ffdDisplayed()) {
            familyCheckbox.click();
        } // else the checkbox is already toggled off
    }

    public void clickCaliforniaPrivacyRights() {

    }

    public boolean atCaliforniaPrivacy() {
        return true;
    }

    public void clickPremierPlus() {
        premierPlusCheckbox.click();
    }

    public void clickConcordPremier() {
        concordPremierCheckbox.click();
    }

    public void clickConcordStandard() {
        concordStandardCheckbox.click();
    }

    public void clickQuickstartCheckbox() {
        quickstartCheckbox.click();
    }

    public boolean isCaseQuickstarted() {
        return getTotalDueToday() == "$14.99";
    }

    public void clickBillingAddressEdit() {
        billingInfoEdit.click();
    }

    public void clickBillingAddressEdit2() {
        billingInfoEditFamilyMember.click();
    }

    public void setCardNumber(String cardNum) {
        cardNumber.clear();
        cardNumber.sendKeys(cardNum);
    }

    public void setExpiration(String exp) {
        expiration.clear();
        expiration.sendKeys(exp);
    }

    public void setCVV(String _cvv) {
        cvv.clear();
        cvv.sendKeys(_cvv);
    }

    public void setCardInfo(String cardNum, String exp, String _cvv) { // send all primary card info
        setCardNumber(cardNum);
        setExpiration(exp);
        setCVV(_cvv);
    }

    public void setNameOnCard(String newName) {
        nameOnCard.clear();
        nameOnCard.sendKeys(newName);
    }

    public void setBillingAddress(String billAddress) {
        billingAddress.clear();
        billingAddress.sendKeys(billAddress);
    }

    public void setBillingZipCode(String newZip) {
        billingZipCode.clear();
        billingZipCode.sendKeys();
    }

    public void changeBillingInfo(String newName, String billAddress, String newZip) { // set all billing address info
        setNameOnCard(newName);
        setBillingAddress(billAddress);
        setBillingZipCode(newZip);
    }

    public void setCardNumber2(String cardNum) {
        cardNumberSecondary.clear();
        cardNumberSecondary.sendKeys(cardNum);
    }

    public void setExpiration2(String exp) {
        expirationSecondary.clear();
        expirationSecondary.sendKeys(exp);
    }

    public void setCVV2(String _cvv) {
        cvvSecondary.clear();
        cvvSecondary.sendKeys(_cvv);
    }

    public void setCardInfo2(String cardNum, String exp, String _cvv) { // send all secondary card info
        setCardNumber2(cardNum);
        setExpiration2(exp);
        setCVV2(_cvv);
    }

    public void setNameOnCard2(String val) {
        nameOnCardSecondary.clear();
        nameOnCardSecondary.sendKeys(val);
    }

    public void setBillingAddress2(String val) {
        billingAddressSecondary.clear();
        billingAddressSecondary.sendKeys(val);
    }

    public void setBillingZipCode2(String val) {
        billingZipCodeSecondary.clear();
        billingZipCodeSecondary.sendKeys(val);
    }

    public void clickNextTestomonial() {
        nextReview.click();
    }

    public void clickPreviousTestomonial() {
        prevReview.click();
    }

    public void clickInfoAboutOurTestomonials() {
        testimonialLink.click();
    }

    public void clickNext() {
        nextReview.click();
    }

    public void clickPrevious() {
        prevReview.click();
    }

    public void clickTestimonialLink() {
        testimonialLink.click();
    }

    public String getTotalDueToday() {
        return totalDueToday.getText();
    }

    public void setUsername(String usr) {
        username.clear();
        username.sendKeys(usr);
    }

    public void setPassword(String pass) {
        password.clear();
        password.sendKeys(pass);
    }

    public void clickSelectAllCheckbox() {
        selectAllCheckbox.click();
    }

    public void setLegalSignature(String signature) {
        legalSignature.clear();
        legalSignature.sendKeys(signature);
    }

    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber.clear();
        socialSecurityNumber.sendKeys(ssn);
    }

    public void setDateOfBirth(String val) {
        dob.clear();
        dob.sendKeys(val);
    }

    public void goHome() {
        driver.get(url);
    }

}

