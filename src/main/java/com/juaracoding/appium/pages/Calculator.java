package com.juaracoding.appium.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

public class Calculator {

    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locator
//    By btnSatu = By.id("com.google.android.calculator:id/digit_1");
//    By btnDua = By.id("com.google.android.calculator:id/digit_2");
//    By btnTambah = By.id("com.google.android.calculator:id/op_add");
//    By btnSamaDengan = By.id("com.google.android.calculator:id/eq");
//    By hasil = By.id("com.google.android.calculator:id/result_final");
    // com.google.android.calculator:id/digit_4
    /* web: xpath = //taghtml[contains(@attr, value)] */
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    private MobileElement btnEmpat;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    private MobileElement btnLima;


    @AndroidFindBy(id = "com.google.android.calculator:id/digit_0")
    private MobileElement btnKosong;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    private MobileElement btnDua;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    private MobileElement btnKali;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_div")
    private MobileElement btnBagi;

    //
    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    private MobileElement btnKurang;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    private MobileElement btnSamaDengan;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    private MobileElement hasil;



    //Method
    public void calcKali() {
        btnEmpat.click();
        btnKali.click();
        btnDua.click();
        btnSamaDengan.click();
    }

    public void calcBagi(){
        btnLima.click();
        btnKosong.click();
        btnBagi.click();
        btnLima.click();
        btnSamaDengan.click();

    }

    public void calcKurang(){
        btnLima.click();
        btnKosong.click();
        btnKurang.click();
        btnEmpat.click();
        btnKosong.click();
        btnSamaDengan.click();

    }


    //
    public String getTxtResult() {
        return hasil.getText();
    }

}
