package com.oreily.boot.quickstart;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Александр on 12.07.2017.
 */
@RestController
public class ShoppingController {
    @RequestMapping(value = "/searchitems", method = RequestMethod.GET)
    public List searchItems(@RequestParam(required = false) String name,
                           @RequestParam(required = false) Integer id,
                           @RequestParam(required = false) @DateTimeFormat(pattern = "dd.MM.yyyy") Date added){

        return Arrays.asList(new Item (name, id, added));
    }

    public static class Item {
        public String name;
        public Integer id;
        public Date added;

        public Item() {
        }

        public Item(String name, Integer id, Date added) {
            this.name = name;
            this.id = id;
            this.added = added;
        }
    }
}
