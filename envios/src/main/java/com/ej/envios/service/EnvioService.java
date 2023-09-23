/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ej.envios.service;

import com.ej.envios.model.Envio;
import com.ej.envios.repository.IEnvioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvioService implements IEnvioService{
    @Autowired
    private IEnvioRepository envRepo;

    @Override
    public List<Envio> getEnvio() {
        return envRepo.findAll();
    }

    @Override
    public void saveEnvio(Envio envio) {
        envRepo.save(envio);
    }

    @Override
    public List<Envio> findByIdDest(Long id_destinatario) {
        return envRepo.findByIdDest(id_destinatario);
    }
    
}