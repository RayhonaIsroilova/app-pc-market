package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.UserBasket;
import uz.pdp.pcmarket.projection.ArticleCustom;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "userBasket",collectionResourceRel = "list",excerptProjection = ArticleCustom.class)
public interface UserBasketRepository extends JpaRepository<UserBasket, Integer> {

}
