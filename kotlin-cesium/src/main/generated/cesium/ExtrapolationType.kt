// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Constants to determine how an interpolated value is extrapolated
 * when querying outside the bounds of available data.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ExtrapolationType">Online Documentation</a>
 */

external enum class ExtrapolationType {

    /**
     * No extrapolation occurs.
     */
    NONE,

    /**
     * The first or last value is used when outside the range of sample data.
     */
    HOLD,

    /**
     * The value is extrapolated.
     */
    EXTRAPOLATE,

    ;

}
