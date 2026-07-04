// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Determines how two pixels' values are combined.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#BlendEquation">Online Documentation</a>
 */
sealed /* enum */
external interface BlendEquation {
    companion object {

        /**
         * Pixel values are added componentwise.  This is used in additive blending for translucency.
         *
         * Value - [WebGL2RenderingContext.FUNC_ADD]
         */
        val ADD: BlendEquation

        /**
         * Pixel values are subtracted componentwise (source - destination).  This is used in alpha blending for translucency.
         *
         * Value - [WebGL2RenderingContext.FUNC_SUBTRACT]
         */
        val SUBTRACT: BlendEquation

        /**
         * Pixel values are subtracted componentwise (destination - source).
         *
         * Value - [WebGL2RenderingContext.FUNC_REVERSE_SUBTRACT]
         */
        val REVERSE_SUBTRACT: BlendEquation

        /**
         * Pixel values are given to the minimum function (min(source, destination)).
         *
         * This equation operates on each pixel color component.
         *
         * Value - [WebGL2RenderingContext.MIN]
         */
        val MIN: BlendEquation

        /**
         * Pixel values are given to the maximum function (max(source, destination)).
         *
         * This equation operates on each pixel color component.
         *
         * Value - [WebGL2RenderingContext.MAX]
         */
        val MAX: BlendEquation
    }
}
