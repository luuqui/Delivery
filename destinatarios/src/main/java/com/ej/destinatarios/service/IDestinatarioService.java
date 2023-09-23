package com.ej.destinatarios.service;

import com.ej.destinatarios.dto.DestinatarioDTO;
import com.ej.destinatarios.model.Destinatario;
import java.util.List;

public interface IDestinatarioService {
    public List<Destinatario> getDestinatarios();
    public void save(Destinatario destinatario);
    public Destinatario findById(Long id);
    
    public DestinatarioDTO getEnviosByDest(Long id);
}
