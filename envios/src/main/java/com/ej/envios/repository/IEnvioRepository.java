
package com.ej.envios.repository;

import com.ej.envios.model.Envio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnvioRepository extends JpaRepository <Envio, Long>{
    @Query("SELECT e FROM Envio e WHERE e.id_destinatario = :id_destinatario")
    List<Envio> findByIdDest(Long id_destinatario);
}
