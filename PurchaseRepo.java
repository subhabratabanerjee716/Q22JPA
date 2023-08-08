package com.Subha.ineuron.q22.Q22.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.Subha.ineuron.q22.Q22.Entity.purchace;

@Component
public interface PurchaseRepo extends JpaRepository<purchace, Integer> {

}
