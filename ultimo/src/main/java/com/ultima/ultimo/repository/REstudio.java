
package com.ultima.ultimo.repository;

import com.ultima.ultimo.molde.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REstudio extends JpaRepository <Estudio, Long>{
    
}
