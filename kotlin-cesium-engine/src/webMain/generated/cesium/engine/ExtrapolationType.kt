// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Constants to determine how an interpolated value is extrapolated
 * when querying outside the bounds of available data.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ExtrapolationType">Online Documentation</a>
 */
sealed /* enum */
external interface ExtrapolationType {
    companion object {

        /**
         * No extrapolation occurs.
         *
         * Value - `0`
         */
        val NONE: ExtrapolationType

        /**
         * The first or last value is used when outside the range of sample data.
         *
         * Value - `1`
         */
        val HOLD: ExtrapolationType

        /**
         * The value is extrapolated.
         *
         * Value - `2`
         */
        val EXTRAPOLATE: ExtrapolationType
    }
}
