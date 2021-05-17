package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Position;
import uz.pdp.pcmarket.entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierCustom {

    Integer getId();

    String getFullName();

    String getEmail();

    String getPhoneNumber();

    String getMessageBody();

}
