package utils;

import org.openqa.selenium.By;
/*
 * Mapeamento do elementos para interação. 
 */
public class Elements {
    public static By buttonSignin = (By) By.className("login");
    public static By inputEmail = (By) By.id("email_create");
    public static By buttonSubmit = (By) By.id("SubmitCreate");
    public static By checkText = (By) By.id("center_column");
    public static By radioGender = (By) By.id("id_gender1");
    public static By inputFirstname = (By) By.id("customer_firstname");
    public static By inputLastname = (By) By.id("customer_lastname");
    public static By inputPassword = (By) By.id("passwd");
    public static By selectDays = (By) By.cssSelector("#days > option:nth-child(2)");
    public static By selectMonths = (By) By.cssSelector("#months > option:nth-child(2)");
    public static By selectYears = (By) By.cssSelector("#years > option:nth-child(34)");
    public static By inputFirstname2 = (By) By.id("firstname");
    public static By inputLastname2 = (By) By.id("lastname");
    public static By inputCompany = (By) By.id("company");
    public static By inputAddress = (By) By.id("address1");
    public static By inputCity = (By) By.id("city");
    public static By selectState = (By) By.cssSelector("#id_state > option:nth-child(2)");
    public static By inputZipecode = (By) By.id("postcode");
    public static By selectCountry = (By) By.id("id_country");
    public static By inputPhone = (By) By.id("phone_mobile");
    public static By inputAlias = (By) By.id("alias");
    public static By buttonRegister = (By) By.id("submitAccount");
    public static By inputEmail2 = (By) By.id("email");
    public static By buttonLogin = (By) By.id("SubmitLogin");
    public static By inputSearch = (By) By.id("search_query_top");
    public static By buttonSearch = (By) By.cssSelector("#searchbox > button");
    public static By product = (By) By.cssSelector(
            "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.right-block > h5 > a");
    public static By colorProduct = (By) By.id("color_15");
    public static By selectSize = (By) By.cssSelector("#group_1 > option:nth-child(2)");
    public static By buttoAddCart = (By) By.id("add_to_cart");
    public static By buttonAdd = (By) By.cssSelector(
            "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span");
    public static By buttonAdd2 = (By) By.cssSelector(
            "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span > i");
    public static By product1 = (By) By.cssSelector("#center_column > ul > li > div > div.right-block > h5 > a");
    public static By colorProduct1 = (By) By.id("color_14");
    public static By product2 = (By) By.cssSelector("#center_column > ul > li > div > div.right-block > h5 > a");
    public static By buttonPlus = (By) By
            .cssSelector("#quantity_wanted_p > a.btn.btn-default.button-plus.product_quantity_up > span > i");
    public static By product3 = (By) By
            .cssSelector("#center_column > ul > li:nth-child(2) > div > div.right-block > h5 > a");
    public static By buttonCheckout = (By) By.cssSelector(
            "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
    public static By buttonCheckoutDefault = (By) By.cssSelector(
            "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span");
    public static By buttonCheckoutDefault1 = (By) By.cssSelector("#center_column > form > p > button > span");
    public static By buttonTerms = (By) By.id("uniform-cgv");
    public static By buttonCheckoutDefault2 = (By) By.cssSelector("#form > p > button > span");
    public static By buttonPayBank = (By) By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    public static By buttonConfirmOrder = (By) By.cssSelector("#cart_navigation > button > span");
    public static By checkOrderComplete = (By) By.cssSelector("#center_column > div > p > strong");
}