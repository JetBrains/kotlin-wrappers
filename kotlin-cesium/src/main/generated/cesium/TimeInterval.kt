// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * An interval defined by a start and a stop time; optionally including those times as part of the interval.
 * Arbitrary data can optionally be associated with each instance for used with [TimeIntervalCollection].
 * ```
 * // Create an instance that spans August 1st, 1980 and is associated
 * // with a Cartesian position.
 * const timeInterval = new TimeInterval({
 *     start : JulianDate.fromIso8601('1980-08-01T00:00:00Z'),
 *     stop : JulianDate.fromIso8601('1980-08-02T00:00:00Z'),
 *     isStartIncluded : true,
 *     isStopIncluded : false,
 *     data : Cartesian3.fromDegrees(39.921037, -75.170082)
 * });
 * ```
 * ```
 * // Create two instances from ISO 8601 intervals with associated numeric data
 * // then compute their intersection, summing the data they contain.
 * const left = TimeInterval.fromIso8601({
 *     iso8601 : '2000/2010',
 *     data : 2
 * });
 *
 * const right = TimeInterval.fromIso8601({
 *     iso8601 : '1995/2005',
 *     data : 3
 * });
 *
 * //The result of the below intersection will be an interval equivalent to
 * //const intersection = TimeInterval.fromIso8601({
 * //  iso8601 : '2000/2005',
 * //  data : 5
 * //});
 * const intersection = new TimeInterval();
 * TimeInterval.intersect(left, right, intersection, function(leftData, rightData) {
 *     return leftData + rightData;
 * });
 * ```
 * ```
 * // Check if an interval contains a specific time.
 * const dateToCheck = JulianDate.fromIso8601('1982-09-08T11:30:00Z');
 * const containsDate = TimeInterval.contains(timeInterval, dateToCheck);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html">Online Documentation</a>
 */
external class TimeInterval {
    /**
     * Gets or sets the start time of this interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#start">Online Documentation</a>
     */
    var start: JulianDate

    /**
     * Gets or sets the stop time of this interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#stop">Online Documentation</a>
     */
    var stop: JulianDate

    /**
     * Gets or sets the data associated with this interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#data">Online Documentation</a>
     */
    var data: Any

    /**
     * Gets or sets whether or not the start time is included in this interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#isStartIncluded">Online Documentation</a>
     */
    var isStartIncluded: Boolean

    /**
     * Gets or sets whether or not the stop time is included in this interval.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#isStopIncluded">Online Documentation</a>
     */
    var isStopIncluded: Boolean

    /**
     * Gets whether or not this interval is empty.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#isEmpty">Online Documentation</a>
     */
    val isEmpty: Boolean

    /**
     * Duplicates this instance.
     * @param [result] An existing instance to use for the result.
     * @return The modified result parameter or a new instance if none was provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#clone">Online Documentation</a>
     */
    fun clone(result: TimeInterval? = definedExternally): TimeInterval

    /**
     * Compares this instance against the provided instance componentwise and returns
     * `true` if they are equal, `false` otherwise.
     * @param [right] The right hand side interval.
     * @param [dataComparer] A function which compares the data of the two intervals.  If omitted, reference equality is used.
     * @return `true` if they are equal, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#equals">Online Documentation</a>
     */
    fun equals(
        right: TimeInterval? = definedExternally,
        dataComparer: DataComparer? = definedExternally,
    ): Boolean

    /**
     * Compares this instance against the provided instance componentwise and returns
     * `true` if they are within the provided epsilon,
     * `false` otherwise.
     * @param [right] The right hand side interval.
     * @param [epsilon] The epsilon to use for equality testing.
     *   Default value - `0`
     * @param [dataComparer] A function which compares the data of the two intervals.  If omitted, reference equality is used.
     * @return `true` if they are within the provided epsilon, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#equalsEpsilon">Online Documentation</a>
     */
    fun equalsEpsilon(
        right: TimeInterval? = definedExternally,
        epsilon: Double? = definedExternally,
        dataComparer: DataComparer? = definedExternally,
    ): Boolean

    companion object {
        /**
         * Creates a new instance from a [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) interval.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#.fromIso8601">Online Documentation</a>
         */
        fun fromIso8601(
            options: FromIso8601Options,
            result: TimeInterval? = definedExternally,
        ): TimeInterval

        /**
         * @property [iso8601] An ISO 8601 interval.
         * @property [isStartIncluded] `true` if `options.start` is included in the interval, `false` otherwise.
         *   Default value - `true`
         * @property [isStopIncluded] `true` if `options.stop` is included in the interval, `false` otherwise.
         *   Default value - `true`
         * @property [data] Arbitrary data associated with this interval.
         */
        interface FromIso8601Options {
            var iso8601: String
            var isStartIncluded: Boolean?
            var isStopIncluded: Boolean?
            var data: Any?
        }

        /**
         * Creates an ISO8601 representation of the provided interval.
         * @param [timeInterval] The interval to be converted.
         * @param [precision] The number of fractional digits used to represent the seconds component.  By default, the most precise representation is used.
         * @return The ISO8601 representation of the provided interval.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#.toIso8601">Online Documentation</a>
         */
        fun toIso8601(
            timeInterval: TimeInterval,
            precision: Double? = definedExternally,
        ): String

        /**
         * Duplicates the provided instance.
         * @param [timeInterval] The instance to clone.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#.clone">Online Documentation</a>
         */
        fun clone(
            timeInterval: TimeInterval? = definedExternally,
            result: TimeInterval? = definedExternally,
        ): TimeInterval

        /**
         * Compares two instances and returns `true` if they are equal, `false` otherwise.
         * @param [left] The first instance.
         * @param [right] The second instance.
         * @param [dataComparer] A function which compares the data of the two intervals.  If omitted, reference equality is used.
         * @return `true` if the dates are equal; otherwise, `false`.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: TimeInterval? = definedExternally,
            right: TimeInterval? = definedExternally,
            dataComparer: DataComparer? = definedExternally,
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
         * @param [dataComparer] A function which compares the data of the two intervals.  If omitted, reference equality is used.
         * @return `true` if the two dates are within `epsilon` seconds of each other; otherwise `false`.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#.equalsEpsilon">Online Documentation</a>
         */
        fun equalsEpsilon(
            left: TimeInterval? = definedExternally,
            right: TimeInterval? = definedExternally,
            epsilon: Double? = definedExternally,
            dataComparer: DataComparer? = definedExternally,
        ): Boolean

        /**
         * Computes the intersection of two intervals, optionally merging their data.
         * @param [left] The first interval.
         * @param [right] The second interval.
         * @param [result] An existing instance to use for the result.
         * @param [mergeCallback] A function which merges the data of the two intervals. If omitted, the data from the left interval will be used.
         * @return The modified result parameter.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#.intersect">Online Documentation</a>
         */
        fun intersect(
            left: TimeInterval,
            right: TimeInterval? = definedExternally,
            result: TimeInterval? = definedExternally,
            mergeCallback: MergeCallback? = definedExternally,
        ): TimeInterval

        /**
         * Checks if the specified date is inside the provided interval.
         * @param [timeInterval] The interval.
         * @param [julianDate] The date to check.
         * @return `true` if the interval contains the specified date, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#.contains">Online Documentation</a>
         */
        fun contains(
            timeInterval: TimeInterval,
            julianDate: JulianDate,
        ): Boolean

        /**
         * An immutable empty interval.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#.EMPTY">Online Documentation</a>
         */
        val EMPTY: TimeInterval
    }
}

/**
 * Function interface for merging interval data.
 * @param [leftData] The first data instance.
 * @param [rightData] The second data instance.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#.MergeCallback">Online Documentation</a>
 */
typealias MergeCallback = (leftData: Any, rightData: Any) -> Any

/**
 * Function interface for comparing interval data.
 * @param [leftData] The first data instance.
 * @param [rightData] The second data instance.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeInterval.html#.DataComparer">Online Documentation</a>
 */
typealias DataComparer = (leftData: Any, rightData: Any) -> Boolean

inline fun TimeInterval(
    block: TimeInterval.() -> Unit,
): TimeInterval =
    TimeInterval().apply(block)
