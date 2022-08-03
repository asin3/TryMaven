package com.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;



public class basic {
   
    public static void main(string [] args) {
        //Validate if "add place" API is working.

        //given: all input data
        //when: submit the API
        //then: validate the reponse

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        ((Object) given()).queryParam("key", "qaclick123").header("Content-Type", "application-json")
        .body("{
            "location": {
                "lat": -38.383494,
                "lng": 33.427362
            },
            "accuracy": 50,
            "name": "Frontline house",
            "phone_number": "(+91) 983 893 3937",
            "address": "29, side layout, cohen 09",
            "types": [
                "shoe park",
                "shop"
            ],
            "website": "http://google.com",
            "language": "French-IN"
        }");


    }
}
