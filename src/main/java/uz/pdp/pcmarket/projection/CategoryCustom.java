package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Attachment;
import uz.pdp.pcmarket.entity.Category;

@Projection(types = Category.class)
public interface CategoryCustom {

    Integer getId();

    String getName();

    Category getParentCategoryId();

}
