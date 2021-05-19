package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pcmarket.entity.Users;
import uz.pdp.pcmarket.projection.ArticleCustom;
import uz.pdp.pcmarket.projection.UsersCustom;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "users",collectionResourceRel = "list",excerptProjection = UsersCustom.class)
public interface UserRepository extends JpaRepository<Users, Integer> {

    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN','MODERATOR','OPERATOR')")
    @Override
    List<Users> findAll();


    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN','MODERATOR','OPERATOR')")
    @Override
    Optional<Users> findById(Integer integer);

    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN','MODERATOR','OPERATOR')")
    @Override
    <S extends Users> S save(S s);

    @PreAuthorize(value = "hasRole('SUPER_ADMIN')")
    @Override
    void deleteById(Integer integer);
}
