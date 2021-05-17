package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Attachment;
import uz.pdp.pcmarket.entity.MyTeam;
import uz.pdp.pcmarket.entity.Position;

@Projection(types = MyTeam.class)
public interface MyTeamCustom {

    Integer getId();

    String getFullName();

    Position getPosition();

    Attachment getAttachment();

}
