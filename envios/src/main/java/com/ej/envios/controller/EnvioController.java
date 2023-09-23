/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ej.envios.controller;

import com.ej.envios.model.Envio;
import com.ej.envios.service.IEnvioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/envio")
public class EnvioController {
    @Autowired
    private IEnvioService envServ;
    
    @GetMapping("/get")
    public List<Envio> getEnvio(){
        return envServ.getEnvio();
    }
    
    @PostMapping("/post")
    public String saveEnvio(@RequestBody Envio envio){
        envServ.saveEnvio(envio);
        return "Alta";
    }
    
    @GetMapping("/getId/{id_destinatario}")
    public List<Envio> getById(@PathVariable Long id_destinatario){
        return envServ.findByIdDest(id_destinatario);
    }
}
