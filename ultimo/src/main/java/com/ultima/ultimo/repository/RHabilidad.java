
package com.ultima.ultimo.repository;

import com.ultima.ultimo.molde.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Long>{
    
}
