package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Details;
import uz.pdp.pcmarket.entity.Position;

@Projection(types = Position.class)
public interface PositionCustom {

    Integer getId();

    String getName();

}
