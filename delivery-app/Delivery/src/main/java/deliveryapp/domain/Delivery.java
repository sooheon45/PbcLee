package deliveryapp.domain;

import deliveryapp.DeliveryApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name = "Delivery_table")
@Data
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    private String userId;

    private Integer qty;

    private Long orderId;

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = applicationContext()
            .getBean(DeliveryRepository.class);
        return deliveryRepository;
    }

    public static ApplicationContext applicationContext() {
        return DeliveryApplication.applicationContext;
    }
}
