// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Determines how two pixels' values are combined.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#BlendEquation">Online Documentation</a>
 */

external enum class BlendEquation {

    /**
     * Pixel values are added componentwise.  This is used in additive blending for translucency.
     */
    ADD,

    /**
     * Pixel values are subtracted componentwise (source - destination).  This is used in alpha blending for translucency.
     */
    SUBTRACT,

    /**
     * Pixel values are subtracted componentwise (destination - source).
     */
    REVERSE_SUBTRACT,

    /**
     * Pixel values are given to the minimum function (min(source, destination)).
     *
     * This equation operates on each pixel color component.
     */
    MIN,

    /**
     * Pixel values are given to the maximum function (max(source, destination)).
     *
     * This equation operates on each pixel color component.
     */
    MAX,

    ;

}
