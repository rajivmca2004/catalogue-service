package com.online.store.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.online.store.demo.model.Catalogue;
import com.online.store.demo.repository.CatalogueRepository;

/**
 * @author rasrivastava
 *
 */
@Controller
public class CatalogueController {
	
	@Autowired
	private CatalogueRepository catalogueRepository;

    @GetMapping ("/cataloguedisplay")
    public String fetchProductsDisplay (Model model)
    {
        List<Catalogue> products = catalogueRepository.findAll();

        model.addAttribute("catalogues", products);

        return "catalogues";
    }
    
    @GetMapping("/catalogue")
    @ResponseBody
    public Object fetchProducts ()
    {
        List<Catalogue> products = catalogueRepository.findAll();
        return products;
    }

}
