package deliveryapp.domain;

import deliveryapp.OverseasDeliveryApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "OverseasDelivery_table")
@Data
public class OverseasDelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    private String countryCode;

    private String userId;

    private String qty;

    private Long orderId;

    public static OverseasDeliveryRepository repository() {
        OverseasDeliveryRepository overseasDeliveryRepository = OverseasDeliveryApplication.applicationContext.getBean(
            OverseasDeliveryRepository.class
        );
        return overseasDeliveryRepository;
    }
}
