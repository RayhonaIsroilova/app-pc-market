package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Characteristics;
import uz.pdp.pcmarket.projection.ArticleCustom;
import uz.pdp.pcmarket.projection.CharacteristicsCustom;

@RepositoryRestResource(path = "characteristics",collectionResourceRel = "list",excerptProjection = CharacteristicsCustom.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics, Integer> {


}
