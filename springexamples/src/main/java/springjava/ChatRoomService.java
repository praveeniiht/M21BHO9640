package springjava;

import org.springframework.stereotype.Component;

@Component
public class ChatRoomService {

    public void start(){
        System.out.println("Starting chat room");
    }
}