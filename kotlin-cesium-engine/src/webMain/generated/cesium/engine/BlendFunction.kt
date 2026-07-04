// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Determines how blending factors are computed.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#BlendFunction">Online Documentation</a>
 */
sealed /* enum */
external interface BlendFunction {
    companion object {

        /**
         * The blend factor is zero.
         *
         * Value - [WebGL2RenderingContext.ZERO]
         */
        val ZERO: BlendFunction

        /**
         * The blend factor is one.
         *
         * Value - [WebGL2RenderingContext.ONE]
         */
        val ONE: BlendFunction

        /**
         * The blend factor is the source color.
         *
         * Value - [WebGL2RenderingContext.SRC_COLOR]
         */
        val SOURCE_COLOR: BlendFunction

        /**
         * The blend factor is one minus the source color.
         *
         * Value - [WebGL2RenderingContext.ONE_MINUS_SRC_COLOR]
         */
        val ONE_MINUS_SOURCE_COLOR: BlendFunction

        /**
         * The blend factor is the destination color.
         *
         * Value - [WebGL2RenderingContext.DST_COLOR]
         */
        val DESTINATION_COLOR: BlendFunction

        /**
         * The blend factor is one minus the destination color.
         *
         * Value - [WebGL2RenderingContext.ONE_MINUS_DST_COLOR]
         */
        val ONE_MINUS_DESTINATION_COLOR: BlendFunction

        /**
         * The blend factor is the source alpha.
         *
         * Value - [WebGL2RenderingContext.SRC_ALPHA]
         */
        val SOURCE_ALPHA: BlendFunction

        /**
         * The blend factor is one minus the source alpha.
         *
         * Value - [WebGL2RenderingContext.ONE_MINUS_SRC_ALPHA]
         */
        val ONE_MINUS_SOURCE_ALPHA: BlendFunction

        /**
         * The blend factor is the destination alpha.
         *
         * Value - [WebGL2RenderingContext.DST_ALPHA]
         */
        val DESTINATION_ALPHA: BlendFunction

        /**
         * The blend factor is one minus the destination alpha.
         *
         * Value - [WebGL2RenderingContext.ONE_MINUS_DST_ALPHA]
         */
        val ONE_MINUS_DESTINATION_ALPHA: BlendFunction

        /**
         * The blend factor is the constant color.
         *
         * Value - [WebGL2RenderingContext.CONSTANT_COLOR]
         */
        val CONSTANT_COLOR: BlendFunction

        /**
         * The blend factor is one minus the constant color.
         *
         * Value - [WebGL2RenderingContext.ONE_MINUS_CONSTANT_COLOR]
         */
        val ONE_MINUS_CONSTANT_COLOR: BlendFunction

        /**
         * The blend factor is the constant alpha.
         *
         * Value - [WebGL2RenderingContext.CONSTANT_ALPHA]
         */
        val CONSTANT_ALPHA: BlendFunction

        /**
         * The blend factor is one minus the constant alpha.
         *
         * Value - [WebGL2RenderingContext.ONE_MINUS_CONSTANT_ALPHA]
         */
        val ONE_MINUS_CONSTANT_ALPHA: BlendFunction

        /**
         * The blend factor is the saturated source alpha.
         *
         * Value - [WebGL2RenderingContext.SRC_ALPHA_SATURATE]
         */
        val SOURCE_ALPHA_SATURATE: BlendFunction
    }
}
