package brightspot.recipe;

import com.psddev.dari.util.Utils;

/**
 * A level of Taste for a {@link Recipe}.
 */
public enum Taste {

    SWEET(1),
    SOUR(2),
    SPICY(3);

    private final int code;

    Taste(int code) {
        this.code = code;
    }

    // --- Getters ---

    public int getCode() {

        return code;
    }

    // --- Object support ---

    @Override
    public String toString() {
        return Utils.toLabel(name());
    }
}
