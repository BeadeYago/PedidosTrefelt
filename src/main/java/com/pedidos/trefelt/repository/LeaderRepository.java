package com.pedidos.trefelt.repository;

import com.pedidos.trefelt.entity.Leader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderRepository extends JpaRepository<Leader, Integer> {
}
