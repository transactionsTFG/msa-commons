package msa.commons.event.eventoperation;

public interface EventOperation {
    String getOperation();
    default String getQualifiedOperation() {
        return this.getClass().getSimpleName() + ":" + this.getOperation();
    }
}