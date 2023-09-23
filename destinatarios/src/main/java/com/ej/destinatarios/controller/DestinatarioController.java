package com.ej.destinatarios.controller;

import com.ej.destinatarios.dto.DestinatarioDTO;
import com.ej.destinatarios.model.Destinatario;
import com.ej.destinatarios.model.Envio;
import com.ej.destinatarios.service.IDestinatarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("destinatario")
public class DestinatarioController {
    @Autowired
    private IDestinatarioService destServ;
    
    @GetMapping("/get")
    public List<Destinatario> getDestinatarios(){
        return destServ.getDestinatarios();
    }
    
    @PostMapping("/save")
    public String save(@RequestBody Destinatario destinatario){
        destServ.save(destinatario);
        return "Alta";
    }
    
    @GetMapping("/getEnviosByDestinatarios/{id_usuario}")
    public DestinatarioDTO getEnvioByDest(@PathVariable("id_usuario")Long id){
        return destServ.getEnviosByDest(id);
    }
}
