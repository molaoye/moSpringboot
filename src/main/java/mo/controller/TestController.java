package mo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import mo.pojo.Test;

//1
//@Controller
//2
@RestController
@RequestMapping("/test")
//3
//@Controller
//@RequestMapping("/test")
public class TestController {

//    @RequestMapping("/test1")
//    @PostMapping("/test1")
    @GetMapping("/test1")//等同@RequestMapping
    @ResponseBody//返回，没有@ResponseBody报错：Whitelabel Error Page
    public String test1(){
        return "success";
    }

    //1
//    @GetMapping("/test2")
//    @ResponseBody
    //2
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    @ResponseBody
    public Test test2(){
        Test test = new Test();
        test.setId(1);
        test.setName("MacBook Pro 2019");
        test.setPrice(16999.99);
        test.setDealDate(new Date());
        return test;
    }

}
