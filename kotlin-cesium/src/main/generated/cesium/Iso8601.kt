// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Constants related to ISO8601 support.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Iso8601.html">Online Documentation</a>
 */
external object Iso8601 {
    /**
     * A [JulianDate] representing the earliest time representable by an ISO8601 date.
     * This is equivalent to the date string '0000-01-01T00:00:00Z'
     */
    val MINIMUM_VALUE: JulianDate

    /**
     * A [JulianDate] representing the latest time representable by an ISO8601 date.
     * This is equivalent to the date string '9999-12-31T24:00:00Z'
     */
    val MAXIMUM_VALUE: JulianDate

    /**
     * A [TimeInterval] representing the largest interval representable by an ISO8601 interval.
     * This is equivalent to the interval string '0000-01-01T00:00:00Z/9999-12-31T24:00:00Z'
     */
    val MAXIMUM_INTERVAL: JulianDate
}
