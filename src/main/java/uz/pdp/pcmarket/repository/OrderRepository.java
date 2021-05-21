package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Order;
import uz.pdp.pcmarket.projection.ArticleCustom;
import uz.pdp.pcmarket.projection.OrderCustom;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "order",collectionResourceRel = "list",excerptProjection = OrderCustom.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
