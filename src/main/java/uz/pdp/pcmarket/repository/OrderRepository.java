package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Order;
import uz.pdp.pcmarket.projection.ArticleCustom;
import uz.pdp.pcmarket.projection.OrderCustom;

@RepositoryRestResource(path = "order",collectionResourceRel = "list",excerptProjection = OrderCustom.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {


}
