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

}
