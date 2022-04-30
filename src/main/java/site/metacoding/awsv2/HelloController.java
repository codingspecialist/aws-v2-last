package site.metacoding.awsv2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/aws/v2/last")
    public String hello(@RequestParam(defaultValue = "1") Integer number){
        if(number == 1){ // info 로그
            log.info("/aws/v2/last 이 호출되었어요. info 로그 #####################################");
        }else if(number == -1){ // error 로그
            log.error("/aws/v2/last 이 호출되었어요. error 로그 #####################################");
        }else if(number == 0){ // warn 로그
            log.warn("/aws/v2/last 이 호출되었어요. warn 로그 #####################################");
        }
        
        return "<h1>aws v2 last</h1>";
    }
}
