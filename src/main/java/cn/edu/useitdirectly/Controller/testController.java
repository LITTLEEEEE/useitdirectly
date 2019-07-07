package cn.edu.useitdirectly.Controller;



import cn.edu.useitdirectly.Service.Impl.testServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("prototype")
@RequestMapping("/")
public class testController {
    @Autowired
    testServiceImpl testService;
    @RequestMapping("getcount")
    @ResponseBody
    public int search(){

        return testService.getcount();
    }
}
