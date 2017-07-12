package com.oreily.boot.quickstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Александр on 12.07.2017.
 */
@RestController
public class GameOfThronesController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String winterIsComing(@RequestParam(defaultValue = "Stranger") String name){
        return "Hello," + name + " do you pledge your life and honor to the night's watch?";
    }
}
