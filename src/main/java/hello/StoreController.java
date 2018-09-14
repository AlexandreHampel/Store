package hello;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.Collection;
import java.util.List;

@Controller
public class StoreController {
	
	private final StoreRepository repository;
	
	public StoreController(StoreRepository store) {
		this.repository = store;
	}

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }
	
	//  @GetMapping("/products")
    // public String showNew() {
    //     return "";
    // }

    /*@PostMapping("/")
    public String saveMessage(@ModelAttribute(name="message")Message message, BindingResult result) {
    	repository.save(message);  

        return "redirect:/";
    }*/
}