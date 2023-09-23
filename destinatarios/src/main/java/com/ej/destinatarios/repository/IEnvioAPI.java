package com.ej.destinatarios.repository;

import com.ej.destinatarios.model.Envio;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "enviosApi", url="http://localhost:9001/envio")
public interface IEnvioAPI {
    @GetMapping("/getId/{id}")
    public List<Envio> getEnviosByDest (@PathVariable("id")Long id);
}
