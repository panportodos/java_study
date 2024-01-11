package com.study.ch15;

public class SendMain  {

    public static void main(String[] args) { //이러면 자료형이 자동으로 오브젝트가 된다
        SendData<String> sendData1 = new SendData<>(200, "김범수");
//        send(sendData1);
        SendData<Member> sendData2 = new SendData<>(200, new Member("김범수","01029718867"));
        send(sendData2);
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("김한수","01044208877"));
        send(sendData3);
    }
//    public static void main(String[] args) { //generic의 기초
//        SendData<String> sendData1 = new SendData<String>(200, "김범수");
//        sendData1.send();
//        SendData<Member> sendData2 = new SendData<Member>(200, new Member("김범수","01029718867"));
//        sendData2.send();
//    }
//    public static void main(String[] args) { //뒤에는 괄호를 없애도 같은 의미다
//        SendData<String> sendData1 = new SendData<>(200, "김범수");
//        sendData1.send();
//        SendData<Member> sendData2 = new SendData<>(200, new Member("김범수","01029718867"));
//        sendData2.send();
//    }
//    public static void send(SendData<?> sendData) { //generic의 wildcard - 자료형이 무엇으로 나올지 모를 때
//    sendData.send();
//}    public static void send(SendData<? extends Member> sendData) { //wild card의 제한 - member만 받는다
//        sendData.send();
//    }


    public static void send(SendData<? super VipMember> sendData) { // wild card의 제한 - vipmember와 그 부모만 받는다
        sendData.send();
    }
}
