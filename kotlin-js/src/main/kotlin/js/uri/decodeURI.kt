package js.uri

/**
 * Gets the unencoded version of an encoded Uniform Resource Identifier (URI).
 * @param encodedURI A value representing an encoded URI.
 */
external fun decodeURI(
    encodedURI: String,
): String
