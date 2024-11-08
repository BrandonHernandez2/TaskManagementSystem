public enum Priority {
    LOW("Low urgency."),
    MEDIUM("Medium urgency."),
    HIGH("High urgency.");

    private final String descriptiom;

    Priority(String descriptiom) {
        this.descriptiom = descriptiom;
    }

    public String getDescription(){
        return descriptiom;
    }
}
