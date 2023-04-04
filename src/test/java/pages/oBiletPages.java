package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import java.util.Random;
public class oBiletPages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By hesabimButonu= MobileBy.id("com.obilet.androidside:id/bottom_nav_account");
    By uyeGirisiYapButonu = MobileBy.id("com.obilet.androidside:id/login_button_main_account");
    By hemenUyeOlButonu= MobileBy.id("com.obilet.androidside:id/sign_up_now_layout");
    By mailAlani=MobileBy.AndroidUIAutomator("new UiSelector().text(\"E-mail adresinizi giriniz.\")");
    By sifreAlani=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Doldurulması zorunludur.\")");
    By uyeOlButonu=MobileBy.id("com.obilet.androidside:id/sign_up_button");
    By araButonu=MobileBy.id("com.obilet.androidside:id/bottom_nav_find_journey");
    By otelButonu=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Otel\")");
    By nereyeText=MobileBy.id("com.obilet.androidside:id/find_hotel_reservation_to_where_textView");
    By ilSecimi=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.obilet.androidside:id/find_journey_location_name_textView\")");
    By girisTarihi=MobileBy.id("com.obilet.androidside:id/find_hotel_reservation_departure_date_layout");
    By girisGunu=MobileBy.AndroidUIAutomator("new UiSelector().text(\"27\")");
    By cikisGunu=MobileBy.AndroidUIAutomator("new UiSelector().text(\"30\")");
    By otelAraButonu=MobileBy.id("com.obilet.androidside:id/find_hotel_reservation_find_button");
    By otelSec=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.obilet.androidside:id/hotel_reservation_detail_container\")");
    By odaSec=MobileBy.id("com.obilet.androidside:id/select_room_button");
    By odayiSec = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Odayı Seç\")");

    public String randomMail(){
        String[] domains = {"gmail.com","hotmail.com", "outlook.com"};
        String[] names = {"salih", "eda", "emre", "ayse", "fatma", "emre"};

        Random random = new Random();
        String name = names[random.nextInt(names.length)];
        String domain = domains[random.nextInt(domains.length)];
        String email = name + "_" + random.nextInt(1000) + "@" + domain;
        return email;

    }
    public String randomSifre(){
        String[] names = {"otobus", "ucak", "otel", "arac", "feribot"};
        Random random = new Random();
        String name = names[random.nextInt(names.length)];
        String sifre = name + "*" + random.nextInt(1000)+ "_16";
        return sifre;
    }

    public oBiletPages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void hesapTiklama() {
        driver.findElement(hesabimButonu).click();
    }

    public void uyeGirisiYapinTiklama()  {
        driver.findElement(uyeGirisiYapButonu).click();

    }

    public void hemenUyeOlTiklama() {
        driver.findElement(hemenUyeOlButonu).click();
    }

    public void mailAlaniTiklama() {
        driver.findElement(mailAlani).click();

    }

    public void mailGir() {

        driver.findElement(mailAlani).sendKeys(randomMail());
    }

    public void sifreAlaniTiklama() {
        driver.findElement(sifreAlani).click();
    }

    public void sifreGir() {
        driver.findElement(sifreAlani).sendKeys(randomSifre());
    }

    public void uyeolButonuTiklama() {
        driver.findElement(uyeOlButonu).click();
    }

    public void araButonunaTiklanir() {
        driver.findElement(araButonu).click();
    }

    public void otelTabinaTikla() {
        driver.findElement(otelButonu).click();
    }

    public void nereyeTextineTikla() {
        driver.findElement(nereyeText).click();
    }

    public void gidilecekYerSec() {
        driver.findElement(ilSecimi).click();
    }

    public void girisTarihiAlaniTikla() {
        driver.findElement(girisTarihi).click();
    }

    public void girisTarihiSec() {
        driver.findElement(girisGunu).click();
    }

    public void cikisTarihiSec() {
        driver.findElement(cikisGunu).click();
    }

    public void otelAraButonuTikla() {
        driver.findElement(otelAraButonu).click();
    }

    public void otelSec() {
        driver.findElement(otelSec).click();
    }

    public void odaSecButonuTikla() {
        driver.findElement(odaSec).click();
    }

    public void odayiSecButonuTikla() {
        driver.findElement(odayiSec).click();
    }

}