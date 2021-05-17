package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.projection.ArticleCustom;

@RepositoryRestResource(path = "article",collectionResourceRel = "list",excerptProjection = ArticleCustom.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {


}
