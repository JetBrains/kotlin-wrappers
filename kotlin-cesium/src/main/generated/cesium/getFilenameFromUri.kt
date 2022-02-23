// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Given a URI, returns the last segment of the URI, removing any path or query information.
 * ```
 * //fileName will be"simple.czml";
 * const fileName = getFilenameFromUri('/Gallery/simple.czml?value=true&example=false');
 * ```
 * @param [uri] The Uri.
 * @return The last segment of the Uri.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/getFilenameFromUri.html">Online Documentation</a>
 */
external fun getFilenameFromUri(uri: String): String
