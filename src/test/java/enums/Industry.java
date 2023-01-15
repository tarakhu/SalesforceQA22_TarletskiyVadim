package enums;

public enum Industry {

    NONE("--None--"), BANKING("Banking"), APPAREL("Apparel"), CHEMICALS("Chemicals");

    private final String name;

    Industry(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Industry fromString(String value) {
        for (Industry industry : Industry.values()) {
            if (industry.getName().equals(value)) {
                return industry;
            }
        }
        return null;
    }
}
