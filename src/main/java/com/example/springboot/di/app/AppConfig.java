package com.example.springboot.di.app;

import com.example.springboot.di.app.models.domain.ItemFactura;
import com.example.springboot.di.app.models.domain.Producto;
import com.example.springboot.di.app.models.service.IServicio;
import com.example.springboot.di.app.models.service.MiServicio;
import com.example.springboot.di.app.models.service.MiServicioComplejo;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Primary
    @Bean("miServicioSimple")
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }
    
    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }
    
    @Bean("itemFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara Sony", 100);
        Producto producto2 = new Producto("Bicicleta Bianchi aro 26", 100);
        
        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);
        
        return Arrays.asList(linea1,linea2);
    }
    
    @Bean("itemFacturaOficina")
    @Primary
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Monitor LG 24' ", 250);
        Producto producto2 = new Producto("Notebook ASUS", 500);
        Producto producto3 = new Producto("Impresora HP", 300);
        Producto producto4 = new Producto("Escritorio oficina", 80);
        
        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 3);
        ItemFactura linea3 = new ItemFactura(producto3, 1);
        ItemFactura linea4 = new ItemFactura(producto4, 4);
        
        return Arrays.asList(linea1,linea2, linea3, linea3);
    }
}
