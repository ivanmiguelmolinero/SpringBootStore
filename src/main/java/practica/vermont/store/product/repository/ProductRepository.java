package practica.vermont.store.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practica.vermont.store.product.entity.Category;
import practica.vermont.store.product.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}
