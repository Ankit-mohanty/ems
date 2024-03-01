package otg.jt.emplyeemagementsystem.exaception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NotFoundHandel {
@ExceptionHandler(IndexOutOfBoundsException.class)
    public ProblemDetail handel(IndexOutOfBoundsException i){
    return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(404),i.getMessage());
}
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ProblemDetail handel(MethodArgumentNotValidException m){
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(404),m.getMessage());
    }
    @ExceptionHandler(RuntimeException.class)
    public ProblemDetail handel(RuntimeException r){
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(404),r.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public ProblemDetail handel(Exception e){
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(404),e.getMessage());
    }

}
