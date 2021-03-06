// Generated by delombok at Sun Feb 26 12:31:38 KST 2017
package scouter.bytebuddy.matcher;

/**
 * An element matcher that returns a fixed result.
 *
 * @param <T> The actual matched type of this matcher.
 */
public class BooleanMatcher<T> extends ElementMatcher.Junction.AbstractBase<T> {
    /**
     * The predefined result.
     */
    private final boolean matches;

    /**
     * Creates a new boolean element matcher.
     *
     * @param matches The predefined result.
     */
    public BooleanMatcher(boolean matches) {
        this.matches = matches;
    }

    @Override
    public boolean matches(T target) {
        return matches;
    }

    @Override
    public String toString() {
        return Boolean.toString(matches);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof BooleanMatcher)) return false;
        final BooleanMatcher<?> other = (BooleanMatcher<?>) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (this.matches != other.matches) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof BooleanMatcher;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.matches ? 79 : 97);
        return result;
    }
}
