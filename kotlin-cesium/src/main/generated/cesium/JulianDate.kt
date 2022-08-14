// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import kotlinx.js.ReadonlyArray

/**
 * Represents an astronomical Julian date, which is the number of days since noon on January 1, -4712 (4713 BC).
 * For increased precision, this class stores the whole number part of the date and the seconds
 * part of the date in separate components.  In order to be safe for arithmetic and represent
 * leap seconds, the date is always stored in the International Atomic Time standard
 * [TimeStandard.TAI].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html">Online Documentation</a>
 *
 * @constructor
 * @param [julianDayNumber] The Julian Day Number representing the number of whole days.  Fractional days will also be handled correctly.
 *   Default value - `0.0`
 * @property [secondsOfDay] The number of seconds into the current Julian Day Number.  Fractional seconds, negative seconds and seconds greater than a day will be handled correctly.
 *   Default value - `0.0`
 * @param [timeStandard] The time standard in which the first two parameters are defined.
 *   Default value - [TimeStandard.UTC]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html">Online Documentation</a>
 */
external class JulianDate(
    julianDayNumber: Double? = definedExternally,
    var secondsOfDay: Double = definedExternally,
    timeStandard: TimeStandard? = definedExternally,
) {
    /**
     * Gets or sets the number of whole days.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#dayNumber">Online Documentation</a>
     */
    var dayNumber: Double

    /**
     * Duplicates this instance.
     * @param [result] An existing instance to use for the result.
     * @return The modified result parameter or a new instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#clone">Online Documentation</a>
     */
    fun clone(result: JulianDate? = definedExternally): JulianDate

    /**
     * Compares this and the provided instance and returns `true` if they are within `epsilon` seconds of
     * each other.  That is, in order for the dates to be considered equal (and for
     * this function to return `true`), the absolute value of the difference between them, in
     * seconds, must be less than `epsilon`.
     * @param [right] The second instance.
     * @param [epsilon] The maximum number of seconds that should separate the two instances.
     *   Default value - `0`
     * @return `true` if the two dates are within `epsilon` seconds of each other; otherwise `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        right: JulianDate? = definedExternally,
        epsilon: Double? = definedExternally,
    ): Boolean

    companion object {
        /**
         * Creates a new instance from a GregorianDate.
         * @param [date] A GregorianDate.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.fromGregorianDate">Online Documentation</a>
         */
        fun fromGregorianDate(
            date: GregorianDate,
            result: JulianDate? = definedExternally,
        ): JulianDate

        /**
         * Creates a new instance from a JavaScript Date.
         * @param [date] A JavaScript Date.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.fromDate">Online Documentation</a>
         */
        fun fromDate(
            date: kotlin.js.Date,
            result: JulianDate? = definedExternally,
        ): JulianDate

        /**
         * Creates a new instance from a from an [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) date.
         * This method is superior to `Date.parse` because it will handle all valid formats defined by the ISO 8601
         * specification, including leap seconds and sub-millisecond times, which discarded by most JavaScript implementations.
         * @param [iso8601String] An ISO 8601 date.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.fromIso8601">Online Documentation</a>
         */
        fun fromIso8601(
            iso8601String: String,
            result: JulianDate? = definedExternally,
        ): JulianDate

        /**
         * Creates a new instance that represents the current system time.
         * This is equivalent to calling `JulianDate.fromDate(new Date());`.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.now">Online Documentation</a>
         */
        fun now(result: JulianDate? = definedExternally): JulianDate

        /**
         * Creates a [GregorianDate] from the provided instance.
         * @param [julianDate] The date to be converted.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.toGregorianDate">Online Documentation</a>
         */
        fun toGregorianDate(
            julianDate: JulianDate,
            result: GregorianDate? = definedExternally,
        ): GregorianDate

        /**
         * Creates a JavaScript Date from the provided instance.
         * Since JavaScript dates are only accurate to the nearest millisecond and
         * cannot represent a leap second, consider using [JulianDate.toGregorianDate] instead.
         * If the provided JulianDate is during a leap second, the previous second is used.
         * @param [julianDate] The date to be converted.
         * @return A new instance representing the provided date.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.toDate">Online Documentation</a>
         */
        fun toDate(julianDate: JulianDate): kotlin.js.Date

        /**
         * Creates an ISO8601 representation of the provided date.
         * @param [julianDate] The date to be converted.
         * @param [precision] The number of fractional digits used to represent the seconds component.  By default, the most precise representation is used.
         * @return The ISO8601 representation of the provided date.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.toIso8601">Online Documentation</a>
         */
        fun toIso8601(
            julianDate: JulianDate,
            precision: Double? = definedExternally,
        ): String

        /**
         * Duplicates a JulianDate instance.
         * @param [julianDate] The date to duplicate.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided. Returns undefined if julianDate is undefined.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.clone">Online Documentation</a>
         */
        fun clone(
            julianDate: JulianDate,
            result: JulianDate? = definedExternally,
        ): JulianDate

        /**
         * Compares two instances.
         * @param [left] The first instance.
         * @param [right] The second instance.
         * @return A negative value if left is less than right, a positive value if left is greater than right, or zero if left and right are equal.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.compare">Online Documentation</a>
         */
        fun compare(
            left: JulianDate,
            right: JulianDate,
        ): Double

        /**
         * Compares two instances and returns `true` if they are equal, `false` otherwise.
         * @param [left] The first instance.
         * @param [right] The second instance.
         * @return `true` if the dates are equal; otherwise, `false`.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: JulianDate? = definedExternally,
            right: JulianDate? = definedExternally,
        ): Boolean

        /**
         * Compares two instances and returns `true` if they are within `epsilon` seconds of
         * each other.  That is, in order for the dates to be considered equal (and for
         * this function to return `true`), the absolute value of the difference between them, in
         * seconds, must be less than `epsilon`.
         * @param [left] The first instance.
         * @param [right] The second instance.
         * @param [epsilon] The maximum number of seconds that should separate the two instances.
         *   Default value - `0`
         * @return `true` if the two dates are within `epsilon` seconds of each other; otherwise `false`.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: JulianDate? = definedExternally,
            right: JulianDate? = definedExternally,
            epsilon: Double? = definedExternally,
        ): Boolean

        /**
         * Computes the total number of whole and fractional days represented by the provided instance.
         * @param [julianDate] The date.
         * @return The Julian date as single floating point number.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.totalDays">Online Documentation</a>
         */
        fun totalDays(julianDate: JulianDate): Double

        /**
         * Computes the difference in seconds between the provided instance.
         * @param [left] The first instance.
         * @param [right] The second instance.
         * @return The difference, in seconds, when subtracting `right` from `left`.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.secondsDifference">Online Documentation</a>
         */
        fun secondsDifference(
            left: JulianDate,
            right: JulianDate,
        ): Double

        /**
         * Computes the difference in days between the provided instance.
         * @param [left] The first instance.
         * @param [right] The second instance.
         * @return The difference, in days, when subtracting `right` from `left`.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.daysDifference">Online Documentation</a>
         */
        fun daysDifference(
            left: JulianDate,
            right: JulianDate,
        ): Double

        /**
         * Computes the number of seconds the provided instance is ahead of UTC.
         * @param [julianDate] The date.
         * @return The number of seconds the provided instance is ahead of UTC
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.computeTaiMinusUtc">Online Documentation</a>
         */
        fun computeTaiMinusUtc(julianDate: JulianDate): Double

        /**
         * Adds the provided number of seconds to the provided date instance.
         * @param [julianDate] The date.
         * @param [seconds] The number of seconds to add or subtract.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.addSeconds">Online Documentation</a>
         */
        fun addSeconds(
            julianDate: JulianDate,
            seconds: Int,
            result: JulianDate,
        ): JulianDate

        /**
         * Adds the provided number of minutes to the provided date instance.
         * @param [julianDate] The date.
         * @param [minutes] The number of minutes to add or subtract.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.addMinutes">Online Documentation</a>
         */
        fun addMinutes(
            julianDate: JulianDate,
            minutes: Int,
            result: JulianDate,
        ): JulianDate

        /**
         * Adds the provided number of hours to the provided date instance.
         * @param [julianDate] The date.
         * @param [hours] The number of hours to add or subtract.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.addHours">Online Documentation</a>
         */
        fun addHours(
            julianDate: JulianDate,
            hours: Int,
            result: JulianDate,
        ): JulianDate

        /**
         * Adds the provided number of days to the provided date instance.
         * @param [julianDate] The date.
         * @param [days] The number of days to add or subtract.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.addDays">Online Documentation</a>
         */
        fun addDays(
            julianDate: JulianDate,
            days: Int,
            result: JulianDate,
        ): JulianDate

        /**
         * Compares the provided instances and returns `true` if `left` is earlier than `right`, `false` otherwise.
         * @param [left] The first instance.
         * @param [right] The second instance.
         * @return `true` if `left` is earlier than `right`, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.lessThan">Online Documentation</a>
         */
        fun lessThan(
            left: JulianDate,
            right: JulianDate,
        ): Boolean

        /**
         * Compares the provided instances and returns `true` if `left` is earlier than or equal to `right`, `false` otherwise.
         * @param [left] The first instance.
         * @param [right] The second instance.
         * @return `true` if `left` is earlier than or equal to `right`, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.lessThanOrEquals">Online Documentation</a>
         */
        fun lessThanOrEquals(
            left: JulianDate,
            right: JulianDate,
        ): Boolean

        /**
         * Compares the provided instances and returns `true` if `left` is later than `right`, `false` otherwise.
         * @param [left] The first instance.
         * @param [right] The second instance.
         * @return `true` if `left` is later than `right`, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.greaterThan">Online Documentation</a>
         */
        fun greaterThan(
            left: JulianDate,
            right: JulianDate,
        ): Boolean

        /**
         * Compares the provided instances and returns `true` if `left` is later than or equal to `right`, `false` otherwise.
         * @param [left] The first instance.
         * @param [right] The second instance.
         * @return `true` if `left` is later than or equal to `right`, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.greaterThanOrEquals">Online Documentation</a>
         */
        fun greaterThanOrEquals(
            left: JulianDate,
            right: JulianDate,
        ): Boolean

        /**
         * Gets or sets the list of leap seconds used throughout Cesium.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/JulianDate.html#.leapSeconds">Online Documentation</a>
         */
        var leapSeconds: ReadonlyArray<LeapSecond>
    }
}
