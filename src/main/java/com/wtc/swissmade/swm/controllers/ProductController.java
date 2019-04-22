package com.wtc.swissmade.swm.controllers;

import com.wtc.swissmade.swm.models.Product;
import com.wtc.swissmade.swm.services.Impl.ProductServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.context.MessageSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Locale;
import java.util.Optional;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Controller
public class ProductController {
    private static Logger logger = LoggerFactory.getLogger(ProductController.class);

    private ProductServiceImpl productService;
    MessageSource messageSource;


    @Autowired
    public ProductController(ProductServiceImpl productService, MessageSource messageSource){
        this.messageSource = messageSource;
        this.productService = productService;
    }

    private String getLocaleMessage(String message) {
        Locale locale = Locale.getDefault();
        return messageSource.getMessage(message, null, locale);
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ModelAndView products(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "", name = "search", required = false) String search){
        ModelAndView model;
        model = new ModelAndView("products");
        Pageable pageable = PageRequest.of(page, 10, new Sort(Sort.Direction.ASC,"name"));
        Page<Product> productPage = productService.findAllProductsByQueryName(search, pageable);
        model.addObject("data",productPage);
        model.addObject("search", search);
        model.addObject("currentPage",page);
        return model;
    }

    @RequestMapping(value = "/edit/product/{id}", method = RequestMethod.GET)
    public String showEditProductForm(@PathVariable("id")long id, ModelMap modelMap) {
        if(!modelMap.containsAttribute("product")){
            Optional<Product>  productOptional = productService.findById(id);
            Product productToEdit = productOptional.get();
            modelMap.addAttribute("product",productToEdit);
        }
        modelMap.addAttribute("action","/product/edit");
        modelMap.addAttribute("method","PUT");
        return "form_products";
    }
}
