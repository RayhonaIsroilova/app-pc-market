package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.*;

@Projection(types = UserBasket.class)
public interface UserBasketCustom {

    Integer getId();

    String getAllSum();

    Users getUsers();

    OutputProduct getProduct();

}
