@file:JsModule("inline-style-prefixer")

package styled

import js.objects.Record

/**
 * [Online Documentation](https://github.com/rofrischmann/inline-style-prefixer/blob/master/docs/api/createPrefixer.md)
 *
 * @param data an object containing a valid prefixMap and a plugins list
 * @return custom prefix function
 */
external fun createPrefixer(data: dynamic): Record<String, Any?>

/**
 * [Online Documentation](https://github.com/rofrischmann/inline-style-prefixer/blob/master/docs/api/prefix.md)
 *
 * @param style an object containing valid style declarations
 * @return an object containing all style declarations with vendor prefixes
 */
external fun prefix(style: dynamic): Record<String, Any?>
