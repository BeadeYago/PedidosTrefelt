package com.pedidos.trefelt.repository;

import com.pedidos.trefelt.entity.Gap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GapRepository extends JpaRepository<Gap, Integer> {
}
