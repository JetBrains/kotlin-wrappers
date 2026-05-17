package js.uri

/**
 * Gets the unencoded version of an encoded Uniform Resource Identifier (URI).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/decodeURI)
 *
 * @param encodedURI A value representing an encoded URI.
 */
external fun decodeURI(
    encodedURI: String,
): String
