/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ej.envios.service;

import com.ej.envios.model.Envio;
import java.util.List;


public interface IEnvioService {
    public List<Envio> getEnvio();
    public void saveEnvio(Envio envio);
    public List<Envio> findByIdDest(Long id_destinatario);
}
