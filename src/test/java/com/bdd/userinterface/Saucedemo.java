package com.bdd.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Saucedemo {
    public static final Target txt_username= Target.the("Input username").locatedBy("//input[@id='user-name']");
    public static final Target txt_password= Target.the("Input password").locatedBy("//input[@id='password']");
    public static final Target btn_Login= Target.the("Button Login").locatedBy("//input[@id='login-button']");

    public static final Target btn_Produc01= Target.the("Button product one").locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static final Target btn_Produc02= Target.the("Button product two").locatedBy("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    public static final Target btn_cart= Target.the("shopping_cart_link").locatedBy("//*[@id='shopping_cart_container']");
    public static final Target btn_checkout= Target.the("button checkout").locatedBy("//button[@id='checkout']");

    public static final Target lbl_FirstName= Target.the("input first Name").locatedBy("//input[@id='first-name']");

    public static final Target lbl_lastName= Target.the("input last Name").locatedBy("//input[@id='last-name']");
    public static final Target lbl_PostalCode= Target.the("input postal Code").locatedBy("//input[@id='postal-code']");

    public static final Target btn_continue= Target.the("button continue").locatedBy("//input[@id='continue']");
    public static final Target btn_finish= Target.the("button finish").locatedBy("//button[@id='finish']");

    public static final Target lbl_thank= Target.the("Thank you for your order").locatedBy("//*[@id='checkout_complete_container']/h2");

}
