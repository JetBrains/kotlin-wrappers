// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Determines how blending factors are computed.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#BlendFunction">Online Documentation</a>
 */
sealed external interface BlendFunction {
    companion object {

        /**
         * The blend factor is zero.
         */
        val ZERO: BlendFunction

        /**
         * The blend factor is one.
         */
        val ONE: BlendFunction

        /**
         * The blend factor is the source color.
         */
        val SOURCE_COLOR: BlendFunction

        /**
         * The blend factor is one minus the source color.
         */
        val ONE_MINUS_SOURCE_COLOR: BlendFunction

        /**
         * The blend factor is the destination color.
         */
        val DESTINATION_COLOR: BlendFunction

        /**
         * The blend factor is one minus the destination color.
         */
        val ONE_MINUS_DESTINATION_COLOR: BlendFunction

        /**
         * The blend factor is the source alpha.
         */
        val SOURCE_ALPHA: BlendFunction

        /**
         * The blend factor is one minus the source alpha.
         */
        val ONE_MINUS_SOURCE_ALPHA: BlendFunction

        /**
         * The blend factor is the destination alpha.
         */
        val DESTINATION_ALPHA: BlendFunction

        /**
         * The blend factor is one minus the destination alpha.
         */
        val ONE_MINUS_DESTINATION_ALPHA: BlendFunction

        /**
         * The blend factor is the constant color.
         */
        val CONSTANT_COLOR: BlendFunction

        /**
         * The blend factor is one minus the constant color.
         */
        val ONE_MINUS_CONSTANT_COLOR: BlendFunction

        /**
         * The blend factor is the constant alpha.
         */
        val CONSTANT_ALPHA: BlendFunction

        /**
         * The blend factor is one minus the constant alpha.
         */
        val ONE_MINUS_CONSTANT_ALPHA: BlendFunction

        /**
         * The blend factor is the saturated source alpha.
         */
        val SOURCE_ALPHA_SATURATE: BlendFunction
    }
}
