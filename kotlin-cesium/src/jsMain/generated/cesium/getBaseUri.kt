// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Given a URI, returns the base path of the URI.
 * ```
 * // basePath will be "/Gallery/";
 * const basePath = getBaseUri('/Gallery/simple.czml?value=true&example=false');
 *
 * // basePath will be "/Gallery/?value=true&example=false";
 * const basePath = getBaseUri('/Gallery/simple.czml?value=true&example=false', true);
 * ```
 * @param [uri] The Uri.
 * @param [includeQuery] Whether or not to include the query string and fragment form the uri
 *   Default value - `false`
 * @return The base path of the Uri.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#getBaseUri">Online Documentation</a>
 */
external fun getBaseUri(
    uri: String,
    includeQuery: Boolean? = definedExternally,
): String
