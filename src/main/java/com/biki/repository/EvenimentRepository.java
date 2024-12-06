package com.biki.repository;

import com.biki.model.Eveniment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenimentRepository extends JpaRepository<Eveniment, Long> {
}
