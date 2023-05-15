
package com.ultima.ultimo.repository;

import com.ultima.ultimo.molde.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository <Experiencia, Long>{
    
}
