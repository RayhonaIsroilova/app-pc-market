package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pcmarket.entity.Category;
import uz.pdp.pcmarket.entity.MyTeam;
import uz.pdp.pcmarket.projection.CategoryCustom;
import uz.pdp.pcmarket.projection.MyTeamCustom;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "myTeam",collectionResourceRel = "list",excerptProjection = MyTeamCustom.class)
public interface MyTeamRepository extends JpaRepository<MyTeam, Integer> {

    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN','MODERATOR','OPERATOR')")
    @Override
    List<MyTeam> findAll();

    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN','MODERATOR','OPERATOR')")
    @Override
    Optional<MyTeam> findById(Integer integer);

    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN','MODERATOR','OPERATOR')")
    @Override
    <S extends MyTeam> S save(S s);

    @PreAuthorize(value = "hasRole('SUPER_ADMIN')")
    @Override
    void deleteById(Integer integer);
}
