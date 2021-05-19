package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pcmarket.entity.Details;
import uz.pdp.pcmarket.entity.Position;
import uz.pdp.pcmarket.projection.DetailsCustom;
import uz.pdp.pcmarket.projection.PositionCustom;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "position",collectionResourceRel = "list",excerptProjection = PositionCustom.class)
public interface PositionRepository extends JpaRepository<Position,Integer> {

    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN','MODERATOR','OPERATOR')")
    @Override
    List<Position> findAll();


    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN','MODERATOR','OPERATOR')")
    @Override
    Optional<Position> findById(Integer integer);


    @PreAuthorize(value = "hasAnyRole('SUPER_ADMIN','MODERATOR','OPERATOR')")
    @Override
    <S extends Position> S save(S s);

    @PreAuthorize(value = "hasRole('SUPER_ADMIN')")
    @Override
    void deleteById(Integer integer);
}
