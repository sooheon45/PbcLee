package springsaga.external;
import springsaga.domain.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Date;
@FeignClient(name = "Order", url = "${api.url.Order}")
public interface Service {
    @RequestMapping(method= RequestMethod.PUT, path="/undefined/{id}/ordercancel")
    public void orderCancel(@PathVariable("id")  , @RequestBody OrderCancelCommand orderCancelCommand );
    @RequestMapping(method= RequestMethod.PUT, path="/undefined/{id}/updatestatus")
    public void updateStatus(@PathVariable("id")  , @RequestBody UpdateStatusCommand updateStatusCommand );
}