package msa.commons.utils;

public class UseCaseResult<T> {
	private final T value;
    private final String message;
    
    private UseCaseResult(T value, String msg) {
        this.value = value;
        this.message = msg;
    }
    
    public static <T> UseCaseResult<T> success(T value) {
        return new UseCaseResult<>(value, "OK");
    }
    
    public static <T> UseCaseResult<T> failure(String errorMessage) {
        return new UseCaseResult<>(null, errorMessage);
    }
    
    public boolean isEmpty() {
        return this.value == null;
    }

    public boolean isPresent() {
        return this.value != null;
    }

    public T getValue() {
        return this.value;
    }

    public String getMessage() {
        return this.message;
    }
    
}