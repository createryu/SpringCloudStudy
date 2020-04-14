package com.yuqiliu.Controller;
import com.yuqiliu.Dao.impl.StudentDaoImpl;
import com.yuqiliu.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author yuqiliu
 * @create 2020-04-14  13:45
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentDaoImpl studentDao;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll()
    {
       return studentDao.findAll();
    }

    @RequestMapping("/findById/{id}")
    public Student findById(@PathVariable long id)
    {
        return studentDao.fingById(id);
    }


    @PostMapping("/save")
    public void save(@RequestBody Student student)
    {
        studentDao.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student)
    {
        studentDao.saveOrUpdate(student);
    }

    @GetMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") long id)
    {
        studentDao.deleteById(id);
    }


    @GetMapping("/index")
    public String index()
    {
        return "当前端口:"+this.port;
    }


}
