// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Determines the function used to compare two depths for the depth test.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#DepthFunction">Online Documentation</a>
 */
sealed /* enum */
external interface DepthFunction {
    companion object {

        /**
         * The depth test never passes.
         *
         * Value - [WebGL2RenderingContext.NEVER]
         */
        val NEVER: DepthFunction

        /**
         * The depth test passes if the incoming depth is less than the stored depth.
         *
         * Value - [WebGL2RenderingContext.LESS]
         */
        val LESS: DepthFunction

        /**
         * The depth test passes if the incoming depth is equal to the stored depth.
         *
         * Value - [WebGL2RenderingContext.EQUAL]
         */
        val EQUAL: DepthFunction

        /**
         * The depth test passes if the incoming depth is less than or equal to the stored depth.
         *
         * Value - [WebGL2RenderingContext.LEQUAL]
         */
        val LESS_OR_EQUAL: DepthFunction

        /**
         * The depth test passes if the incoming depth is greater than the stored depth.
         *
         * Value - [WebGL2RenderingContext.GREATER]
         */
        val GREATER: DepthFunction

        /**
         * The depth test passes if the incoming depth is not equal to the stored depth.
         *
         * Value - [WebGL2RenderingContext.NOTEQUAL]
         */
        val NOT_EQUAL: DepthFunction

        /**
         * The depth test passes if the incoming depth is greater than or equal to the stored depth.
         *
         * Value - [WebGL2RenderingContext.GEQUAL]
         */
        val GREATER_OR_EQUAL: DepthFunction

        /**
         * The depth test always passes.
         *
         * Value - [WebGL2RenderingContext.ALWAYS]
         */
        val ALWAYS: DepthFunction
    }
}
