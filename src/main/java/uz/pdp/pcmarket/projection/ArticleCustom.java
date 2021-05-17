package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Attachment;
import uz.pdp.pcmarket.entity.Details;

@Projection(types = Article.class)
public interface ArticleCustom {

    Integer getId();

    String getTitle();

    String getDescription();

    String getUrl_link();

    Attachment getAttachment();

}
