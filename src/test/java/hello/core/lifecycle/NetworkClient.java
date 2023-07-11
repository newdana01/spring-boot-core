package hello.core.lifecycle;


public class NetworkClient {
    private String url;

    public NetworkClient() {
        System.out.println("Constructor invoked url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("connect: " + url);
    }

    public void call(String message) {
        System.out.println("call = " + url + " message = " + message);
    }

    public void disconnect() {
        System.out.println("close: " + url);
    }

    public void init(){
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메세지");
    }

    public void close(){
        System.out.println("NetworkClient.close");
        disconnect();
    }
}
