package js.uri

/**
 * Gets the unencoded version of an encoded component of a Uniform Resource Identifier (URI).
 * @param encodedURIComponent A value representing an encoded URI component.
 */
external fun decodeURIComponent(
    encodedURIComponent: String,
): String
