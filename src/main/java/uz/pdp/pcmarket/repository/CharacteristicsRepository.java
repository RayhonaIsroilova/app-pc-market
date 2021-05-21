package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Characteristics;
import uz.pdp.pcmarket.projection.ArticleCustom;
import uz.pdp.pcmarket.projection.CharacteristicsCustom;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "characteristics",collectionResourceRel = "list",excerptProjection = CharacteristicsCustom.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics, Integer> {


}
