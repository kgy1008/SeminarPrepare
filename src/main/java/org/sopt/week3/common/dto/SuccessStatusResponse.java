package org.sopt.week3.common.dto;

public record SuccessStatusResponse<T>(
        int status,
        String message,
        T data
) {
    public static SuccessStatusResponse of(SuccessMessage successMessage) {
        return new SuccessStatusResponse(successMessage.getStatus(), successMessage.getMessage(), null);
    }

    public static <T> SuccessStatusResponse<T> of(SuccessMessage successMessage, T data) {
        return new SuccessStatusResponse<>(successMessage.getStatus(), successMessage.getMessage(), data);
    }
}

