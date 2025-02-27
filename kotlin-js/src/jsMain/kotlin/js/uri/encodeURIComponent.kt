package js.uri

/**
 * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
 * @param uriComponent A value representing an unencoded URI component.
 */
external fun encodeURIComponent(
    uriComponent: String,
): String

external fun encodeURIComponent(
    uriComponent: Int,
): String

external fun encodeURIComponent(
    uriComponent: Double,
): String

external fun encodeURIComponent(
    uriComponent: Boolean,
): String
