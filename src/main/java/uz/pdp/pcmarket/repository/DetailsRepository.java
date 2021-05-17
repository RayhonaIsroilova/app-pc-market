package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Details;
import uz.pdp.pcmarket.projection.DetailsCustom;

@RepositoryRestResource(path = "details",collectionResourceRel = "list",excerptProjection = DetailsCustom.class)
public interface DetailsRepository extends JpaRepository<Details,Integer> {
}
