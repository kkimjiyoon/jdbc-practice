package com.nhnacademy.jdbc.student.repository.impl;

import com.nhnacademy.jdbc.student.domain.Student;
import com.nhnacademy.jdbc.student.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class PreparedStatementStudentRepository implements StudentRepository {

    @Override
    public int save(Student student){
        //todo#1 학생 등록

        return 0;
    }

    @Override
    public Optional<Student> findById(String id){
        //todo#2 학생 조회
        return Optional.empty();
    }

    @Override
    public int update(Student student){
        //todo#3 학생 수정 , name 수정

        return 0;
    }

    @Override
    public int deleteById(String id){
        //todo#4 학생 삭제
        return 0;
    }

}
