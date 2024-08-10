// Generated by Karakum - do not modify it manually!

@file:JsModule("node:url")

package node.url

/**
 * Returns the Unicode serialization of the `domain`. If `domain` is an invalid
 * domain, the empty string is returned.
 *
 * It performs the inverse operation to {@link domainToASCII}.
 *
 * ```js
 * import url from 'node:url';
 *
 * console.log(url.domainToUnicode('xn--espaol-zwa.com'));
 * // Prints español.com
 * console.log(url.domainToUnicode('xn--fiq228c.com'));
 * // Prints 中文.com
 * console.log(url.domainToUnicode('xn--iñvalid.com'));
 * // Prints an empty string
 * ```
 * @since v7.4.0, v6.13.0
 */
external fun domainToUnicode(domain: String): String
