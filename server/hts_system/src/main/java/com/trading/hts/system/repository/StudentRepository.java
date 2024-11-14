package com.trading.hts.system.repository;

import com.trading.hts.system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // 기본 CRUD 작업은 그대로 유지
    List<Student> findByMajor(String major);  // 전공으로 검색
    Optional<Student> findByName(String name); // 이름으로 검색
}