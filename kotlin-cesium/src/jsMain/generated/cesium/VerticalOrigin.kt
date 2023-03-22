// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * The vertical location of an origin relative to an object, e.g., a [Billboard]
 * or [Label].  For example, setting the vertical origin to `TOP`
 * or `BOTTOM` will display a billboard above or below (in screen space)
 * the anchor position.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#VerticalOrigin">Online Documentation</a>
 */
sealed external interface VerticalOrigin {
    companion object {

        /**
         * The origin is at the vertical center between `BASELINE` and `TOP`.
         */
        val CENTER: VerticalOrigin

        /**
         * The origin is at the bottom of the object.
         */
        val BOTTOM: VerticalOrigin

        /**
         * If the object contains text, the origin is at the baseline of the text, else the origin is at the bottom of the object.
         */
        val BASELINE: VerticalOrigin

        /**
         * The origin is at the top of the object.
         */
        val TOP: VerticalOrigin
    }
}
