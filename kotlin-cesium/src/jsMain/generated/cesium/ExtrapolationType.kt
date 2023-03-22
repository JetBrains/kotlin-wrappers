// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Constants to determine how an interpolated value is extrapolated
 * when querying outside the bounds of available data.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ExtrapolationType">Online Documentation</a>
 */
sealed external interface ExtrapolationType {
    companion object {

        /**
         * No extrapolation occurs.
         */
        val NONE: ExtrapolationType

        /**
         * The first or last value is used when outside the range of sample data.
         */
        val HOLD: ExtrapolationType

        /**
         * The value is extrapolated.
         */
        val EXTRAPOLATE: ExtrapolationType
    }
}
