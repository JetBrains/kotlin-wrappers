// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Determines the action taken based on the result of the stencil test.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#StencilOperation">Online Documentation</a>
 */
sealed /* enum */
external interface StencilOperation {
    companion object {

        /**
         * Sets the stencil buffer value to zero.
         *
         * Value - [WebGL2RenderingContext.ZERO]
         */
        val ZERO: StencilOperation

        /**
         * Does not change the stencil buffer.
         *
         * Value - [WebGL2RenderingContext.KEEP]
         */
        val KEEP: StencilOperation

        /**
         * Replaces the stencil buffer value with the reference value.
         *
         * Value - [WebGL2RenderingContext.REPLACE]
         */
        val REPLACE: StencilOperation

        /**
         * Increments the stencil buffer value, clamping to unsigned byte.
         *
         * Value - [WebGL2RenderingContext.INCR]
         */
        val INCREMENT: StencilOperation

        /**
         * Decrements the stencil buffer value, clamping to zero.
         *
         * Value - [WebGL2RenderingContext.DECR]
         */
        val DECREMENT: StencilOperation

        /**
         * Bitwise inverts the existing stencil buffer value.
         *
         * Value - [WebGL2RenderingContext.INVERT]
         */
        val INVERT: StencilOperation

        /**
         * Increments the stencil buffer value, wrapping to zero when exceeding the unsigned byte range.
         *
         * Value - [WebGL2RenderingContext.INCR_WRAP]
         */
        val INCREMENT_WRAP: StencilOperation

        /**
         * Decrements the stencil buffer value, wrapping to the maximum unsigned byte instead of going below zero.
         *
         * Value - [WebGL2RenderingContext.DECR_WRAP]
         */
        val DECREMENT_WRAP: StencilOperation
    }
}
