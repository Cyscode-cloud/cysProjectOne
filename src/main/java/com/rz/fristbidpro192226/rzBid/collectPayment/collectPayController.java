package com.rz.fristbidpro192226.rzBid.collectPayment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rzBid")
public class collectPayController {

     @RequestMapping("/getCollectPayment")
     String getCollectPayment(){
          return  "name: John, age: 30";
     }

}
