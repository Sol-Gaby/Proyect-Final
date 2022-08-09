
package com.Portfolio.mgb.Repository;

import com.Portfolio.mgb.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
/**
 * @author Sol
 */