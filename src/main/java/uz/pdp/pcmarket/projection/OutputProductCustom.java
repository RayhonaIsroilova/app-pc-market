package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Attachment;
import uz.pdp.pcmarket.entity.OutputProduct;
import uz.pdp.pcmarket.entity.Product;

@Projection(types = OutputProduct.class)
public interface OutputProductCustom {

    Integer getId();

    String getAmount();

    Product getProduct();

}
