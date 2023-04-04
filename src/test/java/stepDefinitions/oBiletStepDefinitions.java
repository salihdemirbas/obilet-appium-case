package stepDefinitions;
import io.cucumber.java.en.When;
import pages.oBiletPages;
import util.DriverFactory;
public class oBiletStepDefinitions {
    oBiletPages oBiletPages = new oBiletPages(DriverFactory.getDriver());
    @When("Hesabima tiklanir")
    public void hesabimaTiklanir() {
        oBiletPages.hesapTiklama();
    }

    @When("Uye girisi yapin tiklanir")
    public void uyeGirisiYapinTiklanir() {
        oBiletPages.uyeGirisiYapinTiklama();
    }

    @When("Hemen uye ol tiklanir")
    public void hemenUyeOlTiklanir() {
        oBiletPages.hemenUyeOlTiklama();
    }

    @When("Mail alani tiklanir")
    public void mailAlaniTiklanir() {
        oBiletPages.mailAlaniTiklama();
    }

    @When("Mail girilir")
    public void mailGirilir() {
        oBiletPages.mailGir();
    }

    @When("Sifre alani tiklanir")
    public void sifreAlaniTiklanir() {
        oBiletPages.sifreAlaniTiklama();
    }

    @When("Sifre girilir")
    public void sifreGirilir() {
        oBiletPages.sifreGir();
    }

    @When("Uye ol butonuna tiklanir")
    public void uyeOlButonunaTiklanir() {
        oBiletPages.uyeolButonuTiklama();
    }

    @When("Ara butonuna tiklanir")
    public void araButonunaTiklanir() {
        oBiletPages.araButonunaTiklanir();
    }

    @When ("Otel tabina tiklanir")
    public void otelTabinaTiklanir(){
        oBiletPages.otelTabinaTikla();

    }

    @When ("Nereye textine tiklanir")
    public void nereyeTextineTiklanir(){
        oBiletPages.nereyeTextineTikla();

    }
    @When ("Gidilecek yer secilir")
    public void gidilecekYerSecilir(){
        oBiletPages.gidilecekYerSec();
    }
    @When ("Giris tarihi alanına tiklanir")
    public void girisTarihiAlaninaTiklanir(){
        oBiletPages.girisTarihiAlaniTikla();
    }
    @When ("Giris tarihi secilir")
    public void girisTarihiSecilir(){
        oBiletPages.girisTarihiSec();
    }
    @When ("Cikis tarihi secilir")
    public void cikisTarihiSecilir(){
        oBiletPages.cikisTarihiSec();
    }
    @When ("Otel ara butonuna tiklanir")
    public void otelAraButonunaTiklanir(){
        oBiletPages.otelAraButonuTikla();
    }
    @When ("Otel secilir")
    public void otelSecilir(){
        oBiletPages.otelSec();
    }
    @When ("Oda sec butonuna tiklanir")
    public void odaSecButonuaTiklanir(){
            oBiletPages.odaSecButonuTikla();
    }
    @When ("Odayı sec butonuna tiklanir")
    public void odayiSecButonunatiklanir(){
            oBiletPages.odayiSecButonuTikla();
    }


}