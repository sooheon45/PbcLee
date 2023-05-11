package storeapp.domain;

import java.util.*;
import lombok.*;
import storeapp.domain.*;
import storeapp.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String qty;
    private String name;
    private Integer stock;

    public StockIncreased() {
        super();
    }
}
