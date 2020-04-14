package com.yuqiliu.Dao.impl;

import com.yuqiliu.Dao.StudentDao;
import com.yuqiliu.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yuqiliu
 * @create 2020-04-14  13:40
 */

@Repository
public class StudentDaoImpl implements StudentDao {

    private static Map<Long,Student> studentMap;

    static {
        studentMap=new HashMap<>();
        studentMap.put(1L,new Student(1L,"张胜男",22));
        studentMap.put(2L,new Student(2L,"驻京",23));
        studentMap.put(3L,new Student(3L,"郁其柳",22));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student fingById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
