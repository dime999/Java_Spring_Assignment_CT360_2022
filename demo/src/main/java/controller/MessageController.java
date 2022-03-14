package controller;


import entitiy.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/hello")
public class MessageController {

    @GetMapping
    public List<Message> GetMessage(){
        return List.of(
                new Message(1,"USA","HelloWorld")
        );

    }
}
