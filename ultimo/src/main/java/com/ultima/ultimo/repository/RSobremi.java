
package com.ultima.ultimo.repository;

import com.ultima.ultimo.molde.Sobremi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSobremi extends JpaRepository <Sobremi, Long>{
    
}
