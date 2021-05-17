package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.OutputProduct;
import uz.pdp.pcmarket.projection.ArticleCustom;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "list",excerptProjection = OutputProductRepository.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {


}
