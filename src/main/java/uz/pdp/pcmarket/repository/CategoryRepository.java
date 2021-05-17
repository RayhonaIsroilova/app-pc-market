package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Category;
import uz.pdp.pcmarket.projection.CategoryCustom;

@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = CategoryCustom.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {


}
