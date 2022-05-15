package styled

/**
 * Provides some [cssSuffix] to be used in construction of CSS class names.
 * Simple hash codes are not suitable for this as they are not very human-readable
 * and their computation can be more complex than needed.
 * */
interface HasCssSuffix {

    /** A suffix to be used in name constructions of CSS classes. */
    val cssSuffix: String

}
