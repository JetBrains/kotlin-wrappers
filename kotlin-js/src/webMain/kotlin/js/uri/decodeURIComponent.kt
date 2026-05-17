package js.uri

/**
 * Gets the unencoded version of an encoded component of a Uniform Resource Identifier (URI).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/decodeURIComponent)
 *
 * @param encodedURIComponent A value representing an encoded URI component.
 */
external fun decodeURIComponent(
    encodedURIComponent: String,
): String
