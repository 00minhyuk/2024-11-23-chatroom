package me.kimminhyuk.chatroom.domain.chat.chatroom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat/rooms")
public class ApiV1ChatRoomControllers {

   @GetMapping("/hi")
    public String getChatRooms() {
       return "채팅방 목록";
   }
}
