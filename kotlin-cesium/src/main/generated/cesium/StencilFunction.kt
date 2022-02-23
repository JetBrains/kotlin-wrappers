// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Determines the function used to compare stencil values for the stencil test.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#StencilFunction">Online Documentation</a>
 */

external enum class StencilFunction {

    /**
     * The stencil test never passes.
     */
    NEVER,

    /**
     * The stencil test passes when the masked reference value is less than the masked stencil value.
     */
    LESS,

    /**
     * The stencil test passes when the masked reference value is equal to the masked stencil value.
     */
    EQUAL,

    /**
     * The stencil test passes when the masked reference value is less than or equal to the masked stencil value.
     */
    LESS_OR_EQUAL,

    /**
     * The stencil test passes when the masked reference value is greater than the masked stencil value.
     */
    GREATER,

    /**
     * The stencil test passes when the masked reference value is not equal to the masked stencil value.
     */
    NOT_EQUAL,

    /**
     * The stencil test passes when the masked reference value is greater than or equal to the masked stencil value.
     */
    GREATER_OR_EQUAL,

    /**
     * The stencil test always passes.
     */
    ALWAYS,

    ;

}
