package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Attachment;
import uz.pdp.pcmarket.entity.Users;

@Projection(types = Users.class)
public interface UsersCustom {

    Integer getId();

    String getFullName();

    String getEmail();

    String getPassword();

    Attachment getAttachment();

}
