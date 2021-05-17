package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Attachment;
import uz.pdp.pcmarket.entity.Category;
import uz.pdp.pcmarket.entity.Product;

@Projection(types = Product.class)
public interface ProductCustom {

    Integer getId();

    String getModel();

    Double getPrice();

    boolean getActive();

    Category getCategory();

    Attachment getAttachment();

}
