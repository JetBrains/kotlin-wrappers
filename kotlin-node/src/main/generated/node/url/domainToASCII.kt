// Automatically generated - do not modify!

@file:JsModule("node:url")
@file:JsNonModule

package node.url

/**
 * Returns the [Punycode](https://tools.ietf.org/html/rfc5891#section-4.4) ASCII serialization of the `domain`. If `domain` is an
 * invalid domain, the empty string is returned.
 *
 * It performs the inverse operation to {@link domainToUnicode}.
 *
 * This feature is only available if the `node` executable was compiled with `ICU` enabled. If not, the domain names are passed through unchanged.
 *
 * ```js
 * import url from 'url';
 *
 * console.log(url.domainToASCII('español.com'));
 * // Prints xn--espaol-zwa.com
 * console.log(url.domainToASCII('中文.com'));
 * // Prints xn--fiq228c.com
 * console.log(url.domainToASCII('xn--iñvalid.com'));
 * // Prints an empty string
 * ```
 * @since v7.4.0, v6.13.0
 */
external fun domainToASCII(
    domain: String,
): String
