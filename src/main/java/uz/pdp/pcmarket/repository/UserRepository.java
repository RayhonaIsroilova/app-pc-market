package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Users;
import uz.pdp.pcmarket.projection.ArticleCustom;
import uz.pdp.pcmarket.projection.UsersCustom;

@RepositoryRestResource(path = "users",collectionResourceRel = "list",excerptProjection = UsersCustom.class)
public interface UserRepository extends JpaRepository<Users, Integer> {


}
