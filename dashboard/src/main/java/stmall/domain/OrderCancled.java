package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class OrderCancled extends AbstractEvent {

    private Long id;
    private String customerid;
    private String itemid;
    private String status;
    private Integer qty;
}
