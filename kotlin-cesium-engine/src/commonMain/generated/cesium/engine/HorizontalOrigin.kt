// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * The horizontal location of an origin relative to an object, e.g., a [Billboard]
 * or [Label].  For example, setting the horizontal origin to `LEFT`
 * or `RIGHT` will display a billboard to the left or right (in screen space)
 * of the anchor position.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#HorizontalOrigin">Online Documentation</a>
 */
sealed external interface HorizontalOrigin {
    companion object {

        /**
         * The origin is at the horizontal center of the object.
         */
        val CENTER: HorizontalOrigin

        /**
         * The origin is on the left side of the object.
         */
        val LEFT: HorizontalOrigin

        /**
         * The origin is on the right side of the object.
         */
        val RIGHT: HorizontalOrigin
    }
}
