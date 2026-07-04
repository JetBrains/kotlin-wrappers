// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Determines the function used to compare stencil values for the stencil test.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#StencilFunction">Online Documentation</a>
 */
sealed /* enum */
external interface StencilFunction {
    companion object {

        /**
         * The stencil test never passes.
         *
         * Value - [WebGL2RenderingContext.NEVER]
         */
        val NEVER: StencilFunction

        /**
         * The stencil test passes when the masked reference value is less than the masked stencil value.
         *
         * Value - [WebGL2RenderingContext.LESS]
         */
        val LESS: StencilFunction

        /**
         * The stencil test passes when the masked reference value is equal to the masked stencil value.
         *
         * Value - [WebGL2RenderingContext.EQUAL]
         */
        val EQUAL: StencilFunction

        /**
         * The stencil test passes when the masked reference value is less than or equal to the masked stencil value.
         *
         * Value - [WebGL2RenderingContext.LEQUAL]
         */
        val LESS_OR_EQUAL: StencilFunction

        /**
         * The stencil test passes when the masked reference value is greater than the masked stencil value.
         *
         * Value - [WebGL2RenderingContext.GREATER]
         */
        val GREATER: StencilFunction

        /**
         * The stencil test passes when the masked reference value is not equal to the masked stencil value.
         *
         * Value - [WebGL2RenderingContext.NOTEQUAL]
         */
        val NOT_EQUAL: StencilFunction

        /**
         * The stencil test passes when the masked reference value is greater than or equal to the masked stencil value.
         *
         * Value - [WebGL2RenderingContext.GEQUAL]
         */
        val GREATER_OR_EQUAL: StencilFunction

        /**
         * The stencil test always passes.
         *
         * Value - [WebGL2RenderingContext.ALWAYS]
         */
        val ALWAYS: StencilFunction
    }
}
