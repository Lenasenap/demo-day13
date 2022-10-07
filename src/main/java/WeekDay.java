public enum WeekDay {
    MONDAY("Måndag", "Blå"),
    TUESDAY("Tisdag", "Vit"),
    WEDNESDAY("Onsdag", "Brun"),
    THURSDAY("Torsdag", "Röd"),
    FRIDAY("Fredag", "Gul"),
    SATURDAY("Lördag", "Röd"),
    SUNDAY("Söndag", "Grön");

    // TODO lägg till
    private final String dayName;
    private final String colour;

    WeekDay(String dayName, String colour) {
        this.dayName = dayName;
        this.colour = colour;
    }

    public String getDayName() {
        return dayName;
    }

    public String getColour() {
        return colour;
    }
}
