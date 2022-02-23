// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Determines the action taken based on the result of the stencil test.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#StencilOperation">Online Documentation</a>
 */

external enum class StencilOperation {

    /**
     * Sets the stencil buffer value to zero.
     */
    ZERO,

    /**
     * Does not change the stencil buffer.
     */
    KEEP,

    /**
     * Replaces the stencil buffer value with the reference value.
     */
    REPLACE,

    /**
     * Increments the stencil buffer value, clamping to unsigned byte.
     */
    INCREMENT,

    /**
     * Decrements the stencil buffer value, clamping to zero.
     */
    DECREMENT,

    /**
     * Bitwise inverts the existing stencil buffer value.
     */
    INVERT,

    /**
     * Increments the stencil buffer value, wrapping to zero when exceeding the unsigned byte range.
     */
    INCREMENT_WRAP,

    /**
     * Decrements the stencil buffer value, wrapping to the maximum unsigned byte instead of going below zero.
     */
    DECREMENT_WRAP,

    ;

}
