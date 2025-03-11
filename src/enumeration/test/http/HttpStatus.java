package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

//  FIXME : static import 를 사용하여 객체 생성 없이도 호출 가능하도록 함.
    public static HttpStatus findByCode(int code) {
//      values() : 원래는 HttpStatus.values() 이지만 본인 클래스이기 때문에 values() 만 해도 출력 가능.
        for (HttpStatus httpStatus : values()) {
            if (httpStatus.code == code) {
                return httpStatus;
            }
        }
        return null;
    };

    public boolean isSuccess() {
        return (code >= 200 && code <= 299);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
