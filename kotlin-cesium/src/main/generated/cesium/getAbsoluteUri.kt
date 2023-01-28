// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Given a relative Uri and a base Uri, returns the absolute Uri of the relative Uri.
 * ```
 * //absolute Uri will be "https://test.com/awesome.png";
 * const absoluteUri = getAbsoluteUri('awesome.png', 'https://test.com');
 * ```
 * @param [relative] The relative Uri.
 * @param [base] The base Uri.
 * @return The absolute Uri of the given relative Uri.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/getAbsoluteUri.html">Online Documentation</a>
 */
external fun getAbsoluteUri(
    relative: String,
    base: String? = definedExternally,
): String
