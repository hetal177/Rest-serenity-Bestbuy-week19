package com.bestbuy.testbase;


import com.bestbuy.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * @author Hetal Patel
 * @project BestBuy-API-Serenity
 * @created 09/01/2022
 */

public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init(){
        propertyReader=PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
      //  RestAssured.basePath = Path.PRODUCTS;

    }

}
