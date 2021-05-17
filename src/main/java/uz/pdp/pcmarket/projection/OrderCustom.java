package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Article;
import uz.pdp.pcmarket.entity.Attachment;
import uz.pdp.pcmarket.entity.Order;
import uz.pdp.pcmarket.entity.UserBasket;

import java.util.Date;

@Projection(types = Order.class)
public interface OrderCustom {

    Integer getId();

   Date getDate();

   String getDetails();

   UserBasket getUserBasket();

}
