package com.testms.microservice1.ressources;

import com.testms.microservice1.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalog {

    //Return the list in http://localhost:8080/catalog/foo
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId")  String userId) {
        return Collections.singletonList(
                new CatalogItem("test", "first test", 1)
        );
    }

    }

