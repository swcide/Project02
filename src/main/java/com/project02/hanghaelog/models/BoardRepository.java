package com.project02.hanghaelog.models;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board,Long> {
//    List<Board> findAllByOrderByIdDesc();
    List<Board> findAllByStatusTrueOrderByCreatedAtDesc();

}
