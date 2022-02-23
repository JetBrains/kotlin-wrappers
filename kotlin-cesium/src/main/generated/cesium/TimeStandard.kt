// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Provides the type of time standards which JulianDate can take as input.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#TimeStandard">Online Documentation</a>
 */

external enum class TimeStandard {

    /**
     * Represents the coordinated Universal Time (UTC) time standard.
     *
     * UTC is related to TAI according to the relationship
     * `UTC = TAI - deltaT` where `deltaT` is the number of leap
     * seconds which have been introduced as of the time in TAI.
     */
    UTC,

    /**
     * Represents the International Atomic Time (TAI) time standard.
     * TAI is the principal time standard to which the other time standards are related.
     */
    TAI,

    ;

}
