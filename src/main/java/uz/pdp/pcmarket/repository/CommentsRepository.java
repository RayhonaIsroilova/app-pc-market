package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.pdp.pcmarket.entity.Comments;
import uz.pdp.pcmarket.projection.CommentsCustom;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "comments", collectionResourceRel = "list", excerptProjection = CommentsCustom.class)
public interface CommentsRepository extends JpaRepository<Comments, Integer> {


}
