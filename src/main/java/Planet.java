public enum Planet {
    MERCURY("Merkurius", 88.0),
    VENUS("Venus", 225.0),
    EARTH("Jorden", 365.25),
    MARS("Mars", 365.25*1.88),
    JUPITER("Jupiter", 365.25*11.86),
    SATURN("Saturnus", 365.25*29.45),
    URANUS("Uranus", 365.25*84.0),
    NEPTUNE("Neptunus", 365.25*164.81);

    private final String name;
    private final double earthDaysForYear;

    Planet(String name, double earthDaysForYear) {
        this.name = name;
        this.earthDaysForYear = earthDaysForYear;
    }

    public String getName() {
        return name;
    }

    public double getEarthDaysForYear() {
        return earthDaysForYear;
    }
}
