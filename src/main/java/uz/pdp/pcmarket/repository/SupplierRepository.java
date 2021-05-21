package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pcmarket.entity.Supplier;
import uz.pdp.pcmarket.projection.SupplierCustom;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list",excerptProjection = SupplierCustom.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {


}

