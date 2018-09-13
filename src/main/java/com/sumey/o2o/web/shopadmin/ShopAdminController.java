package com.sumey.o2o.web.shopadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author sumey
 * @date 2018/9/13 上午9:23
 */

@Controller
@RequestMapping(value = "shopadmin", method = {RequestMethod.GET})
public class ShopAdminController {

    @RequestMapping(value = "/shopoperation")  //http://localhost:8080/shopadmin/shopoperation地址栏输入这个就可以访问
    public String shopOperation() {
        return "shop/shopoperation";
    }

}
