package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Details;
import uz.pdp.pcmarket.entity.Position;
import uz.pdp.pcmarket.projection.DetailsCustom;
import uz.pdp.pcmarket.projection.PositionCustom;

@RepositoryRestResource(path = "position",collectionResourceRel = "list",excerptProjection = PositionCustom.class)
public interface PositionRepository extends JpaRepository<Position,Integer> {
}
