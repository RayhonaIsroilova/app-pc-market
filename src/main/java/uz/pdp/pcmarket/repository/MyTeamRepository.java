package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Category;
import uz.pdp.pcmarket.entity.MyTeam;
import uz.pdp.pcmarket.projection.CategoryCustom;
import uz.pdp.pcmarket.projection.MyTeamCustom;

@RepositoryRestResource(path = "myTeam",collectionResourceRel = "list",excerptProjection = MyTeamCustom.class)
public interface MyTeamRepository extends JpaRepository<MyTeam, Integer> {


}
