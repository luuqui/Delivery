 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ej.destinatarios.service;

import com.ej.destinatarios.dto.DestinatarioDTO;
import com.ej.destinatarios.model.Destinatario;
import com.ej.destinatarios.model.Envio;
import com.ej.destinatarios.repository.IDestinatarioRepository;
import com.ej.destinatarios.repository.IEnvioAPI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinatarioService implements IDestinatarioService{
    @Autowired
    private IDestinatarioRepository destRepo;
    
    @Autowired
    private IEnvioAPI envApi;
    
    @Override
    public List<Destinatario> getDestinatarios() {
        return destRepo.findAll();
    }
    
    

    @Override
    public DestinatarioDTO getEnviosByDest(Long id) {
        Destinatario dest = this.findById(id);
        List<Envio> listaEnvios = envApi.getEnviosByDest(id);
        DestinatarioDTO destinatarioDto = new DestinatarioDTO();
        destinatarioDto.setNombre(dest.getNombre());
        destinatarioDto.setApellido(dest.getApellido());
        destinatarioDto.setLista_envios(listaEnvios);
        return destinatarioDto;
    }   

    @Override
    public void save(Destinatario destinatario) {
        destRepo.save(destinatario);
    }

    @Override
    public Destinatario findById(Long id) {
        return destRepo.findById(id).orElse(null);
    }

}
