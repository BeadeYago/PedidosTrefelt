package com.pedidos.trefelt.repository;

import com.pedidos.trefelt.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {

    List<Material> findByCodeIn(List<String> codes);

    boolean existsByCode(String code);

    Material findByCode(String code);
}
