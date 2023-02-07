// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * Represents a Gregorian date in a more precise format than the JavaScript Date object.
 * In addition to submillisecond precision, this object can also represent leap seconds.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GregorianDate.html">Online Documentation</a>
 *
 * @constructor
 * @property [year] The year as a whole number.
 * @property [month] The month as a whole number with range [1, 12].
 * @property [day] The day of the month as a whole number starting at 1.
 * @property [hour] The hour as a whole number with range [0, 23].
 * @property [minute] The minute of the hour as a whole number with range [0, 59].
 * @property [second] The second of the minute as a whole number with range [0, 60], with 60 representing a leap second.
 * @property [millisecond] The millisecond of the second as a floating point number with range [0.0, 1000.0).
 * @property [isLeapSecond] Whether this time is during a leap second.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GregorianDate.html">Online Documentation</a>
 */
external class GregorianDate(
    var year: Int = definedExternally,
    var month: Int = definedExternally,
    var day: Int = definedExternally,
    var hour: Int = definedExternally,
    var minute: Int = definedExternally,
    var second: Int = definedExternally,
    var millisecond: Int = definedExternally,
    var isLeapSecond: Boolean = definedExternally,
)
