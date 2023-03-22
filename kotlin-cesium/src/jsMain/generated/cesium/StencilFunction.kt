// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Determines the function used to compare stencil values for the stencil test.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#StencilFunction">Online Documentation</a>
 */

sealed external interface StencilFunction {
    companion object {

        /**
         * The stencil test never passes.
         */
        val NEVER: StencilFunction

        /**
         * The stencil test passes when the masked reference value is less than the masked stencil value.
         */
        val LESS: StencilFunction

        /**
         * The stencil test passes when the masked reference value is equal to the masked stencil value.
         */
        val EQUAL: StencilFunction

        /**
         * The stencil test passes when the masked reference value is less than or equal to the masked stencil value.
         */
        val LESS_OR_EQUAL: StencilFunction

        /**
         * The stencil test passes when the masked reference value is greater than the masked stencil value.
         */
        val GREATER: StencilFunction

        /**
         * The stencil test passes when the masked reference value is not equal to the masked stencil value.
         */
        val NOT_EQUAL: StencilFunction

        /**
         * The stencil test passes when the masked reference value is greater than or equal to the masked stencil value.
         */
        val GREATER_OR_EQUAL: StencilFunction

        /**
         * The stencil test always passes.
         */
        val ALWAYS: StencilFunction
    }
}
