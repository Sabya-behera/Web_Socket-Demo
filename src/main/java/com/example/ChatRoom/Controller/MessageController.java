package com.example.ChatRoom.Controller;

import com.example.ChatRoom.Model.Messages;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/message")   //The client sends message in this URL and getContent() is called. /*---INput*---*/
    @SendTo("/topic/return-to")  //THe people have subscribed this url to those this message will be delivered/*---OUTPUT---*/
    public Messages getContent(@RequestBody Messages messages)
    {
//      try {
//         // Thread.sleep(2000);
//      }catch (InterruptedException e)
//      {
//           e.printStackTrace();
//      }
        return messages;  //Returns same message to everyone
    }
}
