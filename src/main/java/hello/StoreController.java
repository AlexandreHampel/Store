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
import javax.servlet.http.HttpServletRequest;

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

    @GetMapping("/products")
    public String showProductsList(Model model) {
        model.addAttribute("productsList", repository.findAll());
        return "products";
    }

    @GetMapping("/newproduct")
    public String showNewProduct() {
        return "newproduct";
    }

    @PostMapping("/newproduct")
    public String newProduct(HttpServletRequest request) {
		String name = request.getParameter("name");
		Double price = Double.parseDouble(request.getParameter("price"));

		repository.save(new Product(name, price));
		
		return "redirect:/";
    }
}