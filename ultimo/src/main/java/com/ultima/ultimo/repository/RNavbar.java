
package com.ultima.ultimo.repository;

import com.ultima.ultimo.molde.Navbar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RNavbar extends JpaRepository <Navbar, Long>{
    
}
