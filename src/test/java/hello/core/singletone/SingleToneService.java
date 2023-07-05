package hello.core.singletone;

public class SingleToneService {
    // 1. 스태틱 영역에 객체를 한개만 생성
    private static final SingleToneService instance = new SingleToneService();

    // 2. 객체 인스턴스가 필요하면 해당 public static 메서드를 통해서만 인스턴스에 접근하도록 허용한다.
    public static SingleToneService getInstance() {
        return instance;
    }
    // 3. 생성자를 private 으로 선언하여 외부에서 new 키워드로 생성할 수 없도록 막는다.
    private SingleToneService(){

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}