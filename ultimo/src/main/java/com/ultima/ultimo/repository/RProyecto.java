
package com.ultima.ultimo.repository;

import com.ultima.ultimo.molde.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto, Long>{
    
}
