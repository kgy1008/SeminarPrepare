package org.sopt.week3.exception;

import lombok.Getter;
import org.sopt.week3.common.dto.ErrorMessage;

@Getter
public class BusinessException extends RuntimeException {
    private ErrorMessage errorMessage;

    public BusinessException(ErrorMessage errorMessage){
        super(errorMessage.getMessage());
        this.errorMessage = errorMessage;
    }
}
