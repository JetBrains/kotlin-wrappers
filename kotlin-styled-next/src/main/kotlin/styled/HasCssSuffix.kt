package styled

/**
 * Provides a [cssSuffix] to be used when constructing CSS class names.
 * Simple hash codes are not suitable for this as they are not very human-readable
 * and their computation can be more complex than needed.
 * */
interface HasCssSuffix {
    /** A suffix to be used when constructing names of CSS classes. */
    val cssSuffix: String
}
