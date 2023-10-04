package fiap.com.fiap.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository repository;

    public List<Student> findAll(){
        return repository.findAll();
    }

    public boolean delete(Long id) {
        var task =  repository.findById(id);
        if (task.isEmpty()) return false;
        repository.deleteById(id);
        return true;
    }
}