@file:JsModule("inline-style-prefixer")
@file:JsNonModule

package styled

/**
 * [Online Documentation](https://github.com/rofrischmann/inline-style-prefixer/blob/master/docs/api/prefix.md)
 *
 * @param data an object containing a valid prefixMap and a plugins list
 * @return custom prefix function
 */
external fun createPrefixer(data: dynamic): dynamic

/**
 * [Online Documentation](https://github.com/rofrischmann/inline-style-prefixer/blob/master/docs/api/createPrefixer.md)
 *
 * @param style an object containing valid style declarations
 * @return an object containing all style declarations with vendor prefixes
 */
external fun prefix(style: dynamic): dynamic
