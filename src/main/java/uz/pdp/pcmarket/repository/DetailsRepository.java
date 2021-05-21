package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pcmarket.entity.Details;
import uz.pdp.pcmarket.projection.DetailsCustom;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "details", collectionResourceRel = "list", excerptProjection = DetailsCustom.class)
public interface DetailsRepository extends JpaRepository<Details, Integer> {


}
