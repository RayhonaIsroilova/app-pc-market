package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Product;
import uz.pdp.pcmarket.projection.ArticleCustom;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = ArticleCustom.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
