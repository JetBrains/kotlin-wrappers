// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Determines how two pixels' values are combined.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#BlendEquation">Online Documentation</a>
 */
sealed external interface BlendEquation {
    companion object {

        /**
         * Pixel values are added componentwise.  This is used in additive blending for translucency.
         */
        val ADD: BlendEquation

        /**
         * Pixel values are subtracted componentwise (source - destination).  This is used in alpha blending for translucency.
         */
        val SUBTRACT: BlendEquation

        /**
         * Pixel values are subtracted componentwise (destination - source).
         */
        val REVERSE_SUBTRACT: BlendEquation

        /**
         * Pixel values are given to the minimum function (min(source, destination)).
         *
         * This equation operates on each pixel color component.
         */
        val MIN: BlendEquation

        /**
         * Pixel values are given to the maximum function (max(source, destination)).
         *
         * This equation operates on each pixel color component.
         */
        val MAX: BlendEquation
    }
}
