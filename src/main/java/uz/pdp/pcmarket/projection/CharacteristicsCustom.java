package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.*;

@Projection(types = Characteristics.class)
public interface CharacteristicsCustom {

    Integer getId();

    String getValue();

    Details getDetails();

    Product getProduct();
}
