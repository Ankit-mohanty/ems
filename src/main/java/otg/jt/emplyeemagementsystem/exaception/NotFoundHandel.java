package otg.jt.emplyeemagementsystem.exaception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NotFoundHandel {
@ExceptionHandler(IndexOutOfBoundsException.class)
    public ProblemDetail handel(IndexOutOfBoundsException i){
    return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(404),i.getMessage());
}


}
