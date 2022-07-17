/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entity.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import java.security.Provider;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author clayt
 */
@RestController
@RequestMapping(value="/sales")
public class SaleController {
    
    @Autowired
    private SaleService service;
    
    @GetMapping
    public Page<Sale> findSales(
            @RequestParam(value="minDate", defaultValue="") String minDate,
            @RequestParam(value="minDate", defaultValue="") String maxDate,
            Pageable pageable){
        return service.findSales(minDate,maxDate,pageable);
    }
}
