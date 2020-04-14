package com.yuqiliu.Dao;

import com.yuqiliu.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author yuqiliu
 * @create 2020-04-14  13:38
 */

@Repository
public interface StudentDao {
    public Collection<Student> findAll();
    public Student fingById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
