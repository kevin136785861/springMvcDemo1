package demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("hellocon")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping(value = "/testhello",method = RequestMethod.POST)
    public String testhello(){
        System.out.println("testhello......");
        return "hello";
    }

    @RequestMapping(value = "/testhello1/{num}")
    public String testhello2(@PathVariable("num")Integer num){
        System.out.println("testhello......"+num);
        return "hello";
    }

    @RequestMapping(value="/testRESTGet/{id}",method=RequestMethod.GET)
    public String testRESTGet(@PathVariable(value="id")Integer id){
        System.out.println("testRESTGetid="+id);
        return"hello";
    }

    @RequestMapping(value="/testRESTPost",method=RequestMethod.POST)
    public String testRESTPost(){
        System.out.println("testRESTPost");
        return"hello";
    }

    @RequestMapping(value="/testRESTPut/{id}",method=RequestMethod.PUT)
    public String testRESTPut(@PathVariable("id")Integer id){
        System.out.println("testRESTPutid="+id);
        return"hello";
    }

    @RequestMapping(value="/testRESTDelete/{id}",method=RequestMethod.DELETE)
    public String testRESTDelete(@PathVariable("id")Integer id){
        System.out.println("testRESTDeleteid="+id);
        return"hello";
    }
}
