package springjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("chats")
public class ChatService {


    private final HistoryService historyService;

	
    private final ChatRoomService chatRoomService;

    @Autowired
    public ChatService(HistoryService historyService, ChatRoomService chatRoomService) {
        this.historyService = historyService;
        this.chatRoomService = chatRoomService;
    }
    

/*
 * <bean id="b1" class="classaname">
 * 	<constructor-arg ref="history" />
 *  <construcotr-arg ref="chat" />
 *  </bean>
 * 
 * 
 */
    public void test1() {
    	historyService.store();
    }
    
    public void test2() {
    	chatRoomService.start();
    }
}