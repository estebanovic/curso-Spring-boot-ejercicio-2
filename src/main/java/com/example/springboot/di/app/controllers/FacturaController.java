/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springboot.di.app.controllers;

import com.example.springboot.di.app.models.domain.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Esteban
 */
@Controller
@RequestMapping("/factura")
public class FacturaController {
    
    @Autowired
    private Factura factura;
    
    @GetMapping("/ver")
    public String ver(Model model){
        model.addAttribute("factura", factura);
        model.addAttribute("titulo","Ejemplo Factura con inyeccion de dependencia");
        return "factura/ver";
    }
}
