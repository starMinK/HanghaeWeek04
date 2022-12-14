package com.sparta.week04.repository;

import com.sparta.week04.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemoRepository extends JpaRepository<Memo, Long> {

    Optional<Memo> findByIdAndUserName(Long id, String username);

    Optional<Memo> deleteByIdAndUserName(Long id, String username);

}
