package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Category;
import uz.pdp.pcmarket.entity.Comments;
import uz.pdp.pcmarket.entity.Users;

@Projection(types = Comments.class)
public interface CommentsCustom {

    Integer getId();

    String getBody();

    Integer getNumberStars();

    Users getUsers();

}
