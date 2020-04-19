@file:JsModule("inline-style-prefixer")

package styled

/**
 * https://github.com/rofrischmann/inline-style-prefixer/blob/master/docs/api/prefix.md
 *
 * data: an object containing a valid prefixMap and a plugins list
 * Returns: custom prefix function
 */
external fun createPrefixer(data: dynamic): dynamic

/**
 * https://github.com/rofrischmann/inline-style-prefixer/blob/master/docs/api/createPrefixer.md
 *
 * style: an object containing valid style declarations
 * Returns: an object containing all style declarations with vendor prefixes
 */
external fun prefix(style: dynamic): dynamic
