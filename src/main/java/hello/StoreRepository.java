package hello;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<Product, Integer> {

    
}
