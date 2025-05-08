package com.diary.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diary.travel.entity.DiarioViagens;

@Repository
public interface DiarioViagensRepository extends JpaRepository<DiarioViagens, Long> {

}
