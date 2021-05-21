package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.OutputProduct;
import uz.pdp.pcmarket.projection.ArticleCustom;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "list",excerptProjection = OutputProductRepository.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {


}
