
package com.ultima.ultimo.repository;

import com.ultima.ultimo.molde.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona, Long>{
    
}


