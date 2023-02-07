// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * The vertical location of an origin relative to an object, e.g., a [Billboard]
 * or [Label].  For example, setting the vertical origin to `TOP`
 * or `BOTTOM` will display a billboard above or below (in screen space)
 * the anchor position.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#VerticalOrigin">Online Documentation</a>
 */

external enum class VerticalOrigin {

    /**
     * The origin is at the vertical center between `BASELINE` and `TOP`.
     */
    CENTER,

    /**
     * The origin is at the bottom of the object.
     */
    BOTTOM,

    /**
     * If the object contains text, the origin is at the baseline of the text, else the origin is at the bottom of the object.
     */
    BASELINE,

    /**
     * The origin is at the top of the object.
     */
    TOP,

    ;

}
