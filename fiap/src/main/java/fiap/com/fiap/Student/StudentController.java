package fiap.com.fiap.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("student", service.findAll());
        return "student/index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect){
        if(service.delete(id)){
            redirect.addFlashAttribute("success", "Estudante apagado(a) com sucesso");
        }else{
            redirect.addFlashAttribute("error", "Estudante não encontrada");
        }
        return "redirect:/student";
    }
}
