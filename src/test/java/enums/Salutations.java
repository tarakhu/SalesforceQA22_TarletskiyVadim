package enums;

public enum Salutations {
    MR("Mr."), MS("Ms."), MRS("Mrs."), DR("Dr."), PROF("Prof."), NONE("--None--");

    private final String name;

    Salutations(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Salutations fromString(String value) {
        for (Salutations salutations : Salutations.values()) {
            if (salutations.getName().equals(value)) {
                return salutations;
            }
        }
        return null;
    }
}


