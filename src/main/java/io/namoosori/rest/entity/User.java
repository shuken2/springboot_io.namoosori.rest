package io.namoosori.rest.entity;


import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.UUID;

@Getter
@Setter
@ToString
public class User {

    private String id;                           // id는 randomUUID 로 랜덤하게 생성
    private String name;
    private String email;

    public User(){                               //아무것도 없는 default 생성자
        this.id = UUID.randomUUID().toString();  // 새로운 User id 객체생성 시 Random id 부여
    }

    public User(String name, String email){ // name 과 email을 파라미터로 받는 생성자 정의
        this();                             // this 생성자를 통해서 random id 를 호출
        this.name = name;                   // this.name 은 name으로 초기화
        this.email = email;                 // this.email은 email로 초기화
    }

    public static User sample(){
        return new User("Park", "park@namoosori.io");
    }

    public static void main(String[] args) {
        User user = new User("kim","kim@namoosori.io");
        System.out.println(new Gson().toJson(user));
    }
}
