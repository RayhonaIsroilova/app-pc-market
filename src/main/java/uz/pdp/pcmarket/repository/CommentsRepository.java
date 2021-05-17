package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Comments;
import uz.pdp.pcmarket.projection.ArticleCustom;
import uz.pdp.pcmarket.projection.CommentsCustom;

@RepositoryRestResource(path = "comments",collectionResourceRel = "list",excerptProjection = CommentsCustom.class)
public interface CommentsRepository extends JpaRepository<Comments, Integer> {


}
