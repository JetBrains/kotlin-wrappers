// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * Describes a single leap second, which is constructed from a [JulianDate] and a
 * numerical offset representing the number of seconds TAI is ahead of the UTC time standard.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LeapSecond.html">Online Documentation</a>
 *
 * @constructor
 * @param [date] A Julian date representing the time of the leap second.
 * @property [offset] The cumulative number of seconds that TAI is ahead of UTC at the provided date.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LeapSecond.html">Online Documentation</a>
 */
external class LeapSecond(
    date: JulianDate? = definedExternally,
    var offset: Double = definedExternally,
) {
    /**
     * Gets or sets the date at which this leap second occurs.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/LeapSecond.html#julianDate">Online Documentation</a>
     */
    var julianDate: JulianDate
}
