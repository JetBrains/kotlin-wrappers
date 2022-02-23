// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A non-overlapping collection of [TimeInterval] instances sorted by start time.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html">Online Documentation</a>
 *
 * @constructor
 * @param [intervals] An array of intervals to add to the collection.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html">Online Documentation</a>
 */
external class TimeIntervalCollection(intervals: Array<out TimeInterval>? = definedExternally) {
    /**
     * Gets an event that is raised whenever the collection of intervals change.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#changedEvent">Online Documentation</a>
     */
    val changedEvent: Event

    /**
     * Gets the start time of the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#start">Online Documentation</a>
     */
    val start: JulianDate

    /**
     * Gets whether or not the start time is included in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#isStartIncluded">Online Documentation</a>
     */
    val isStartIncluded: Boolean

    /**
     * Gets the stop time of the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#stop">Online Documentation</a>
     */
    val stop: JulianDate

    /**
     * Gets whether or not the stop time is included in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#isStopIncluded">Online Documentation</a>
     */
    val isStopIncluded: Boolean

    /**
     * Gets the number of intervals in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#length">Online Documentation</a>
     */
    val length: Int

    /**
     * Gets whether or not the collection is empty.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#isEmpty">Online Documentation</a>
     */
    val isEmpty: Boolean

    /**
     * Compares this instance against the provided instance componentwise and returns
     * `true` if they are equal, `false` otherwise.
     * @param [right] The right hand side collection.
     * @param [dataComparer] A function which compares the data of the two intervals.  If omitted, reference equality is used.
     * @return `true` if they are equal, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#equals">Online Documentation</a>
     */
    fun equals(
        right: TimeIntervalCollection? = definedExternally,
        dataComparer: DataComparer? = definedExternally,
    ): Boolean

    /**
     * Gets the interval at the specified index.
     * @param [index] The index of the interval to retrieve.
     * @return The interval at the specified index, or `undefined` if no interval exists as that index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#get">Online Documentation</a>
     */
    fun get(index: Int): TimeInterval?

    /**
     * Removes all intervals from the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll()

    /**
     * Finds and returns the interval that contains the specified date.
     * @param [date] The date to search for.
     * @return The interval containing the specified date, `undefined` if no such interval exists.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#findIntervalContainingDate">Online Documentation</a>
     */
    fun findIntervalContainingDate(date: JulianDate): TimeInterval?

    /**
     * Finds and returns the data for the interval that contains the specified date.
     * @param [date] The date to search for.
     * @return The data for the interval containing the specified date, or `undefined` if no such interval exists.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#findDataForIntervalContainingDate">Online Documentation</a>
     */
    fun findDataForIntervalContainingDate(date: JulianDate): Any

    /**
     * Checks if the specified date is inside this collection.
     * @param [julianDate] The date to check.
     * @return `true` if the collection contains the specified date, `false` otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#contains">Online Documentation</a>
     */
    fun contains(julianDate: JulianDate): Boolean

    /**
     * Finds and returns the index of the interval in the collection that contains the specified date.
     * @param [date] The date to search for.
     * @return The index of the interval that contains the specified date, if no such interval exists,
     *   it returns a negative number which is the bitwise complement of the index of the next interval that
     *   starts after the date, or if no interval starts after the specified date, the bitwise complement of
     *   the length of the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#indexOf">Online Documentation</a>
     */
    fun indexOf(date: JulianDate): Int

    /**
     * Returns the first interval in the collection that matches the specified parameters.
     * All parameters are optional and `undefined` parameters are treated as a don't care condition.
     * @return The first interval in the collection that matches the specified parameters.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#findInterval">Online Documentation</a>
     */
    fun findInterval(options: FindIntervalOptions? = definedExternally): TimeInterval?

    /**
     * @property [start] The start time of the interval.
     * @property [stop] The stop time of the interval.
     * @property [isStartIncluded] `true` if `options.start` is included in the interval, `false` otherwise.
     * @property [isStopIncluded] `true` if `options.stop` is included in the interval, `false` otherwise.
     */
    interface FindIntervalOptions {
        var start: JulianDate?
        var stop: JulianDate?
        var isStartIncluded: Boolean?
        var isStopIncluded: Boolean?
    }

    /**
     * Adds an interval to the collection, merging intervals that contain the same data and
     * splitting intervals of different data as needed in order to maintain a non-overlapping collection.
     * The data in the new interval takes precedence over any existing intervals in the collection.
     * @param [interval] The interval to add.
     * @param [dataComparer] A function which compares the data of the two intervals.  If omitted, reference equality is used.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#addInterval">Online Documentation</a>
     */
    fun addInterval(
        interval: TimeInterval,
        dataComparer: DataComparer? = definedExternally,
    )

    /**
     * Removes the specified interval from this interval collection, creating a hole over the specified interval.
     * The data property of the input interval is ignored.
     * @param [interval] The interval to remove.
     * @return `true` if the interval was removed, `false` if no part of the interval was in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#removeInterval">Online Documentation</a>
     */
    fun removeInterval(interval: TimeInterval): Boolean

    /**
     * Creates a new instance that is the intersection of this collection and the provided collection.
     * @param [other] The collection to intersect with.
     * @param [dataComparer] A function which compares the data of the two intervals.  If omitted, reference equality is used.
     * @param [mergeCallback] A function which merges the data of the two intervals. If omitted, the data from the left interval will be used.
     * @return A new TimeIntervalCollection which is the intersection of this collection and the provided collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#intersect">Online Documentation</a>
     */
    fun intersect(
        other: TimeIntervalCollection,
        dataComparer: DataComparer? = definedExternally,
        mergeCallback: MergeCallback? = definedExternally,
    ): TimeIntervalCollection

    companion object {
        /**
         * Creates a new instance from a JulianDate array.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#.fromJulianDateArray">Online Documentation</a>
         */
        fun fromJulianDateArray(
            options: FromJulianDateArrayOptions,
            result: TimeIntervalCollection? = definedExternally,
        ): TimeIntervalCollection

        /**
         * @property [julianDates] An array of ISO 8601 dates.
         * @property [isStartIncluded] `true` if start time is included in the interval, `false` otherwise.
         *   Default value - `true`
         * @property [isStopIncluded] `true` if stop time is included in the interval, `false` otherwise.
         *   Default value - `true`
         * @property [leadingInterval] `true` if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  `false` otherwise.
         *   Default value - `false`
         * @property [trailingInterval] `true` if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  `false` otherwise.
         *   Default value - `false`
         * @property [dataCallback] A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
         */
        interface FromJulianDateArrayOptions {
            var julianDates: Array<out JulianDate>
            var isStartIncluded: Boolean?
            var isStopIncluded: Boolean?
            var leadingInterval: Boolean?
            var trailingInterval: Boolean?
            var dataCallback: Function<*>?
        }

        /**
         * Creates a new instance from an [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) time interval (start/end/duration).
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#.fromIso8601">Online Documentation</a>
         */
        fun fromIso8601(
            options: FromIso8601Options,
            result: TimeIntervalCollection? = definedExternally,
        ): TimeIntervalCollection

        /**
         * @property [iso8601] An ISO 8601 interval.
         * @property [isStartIncluded] `true` if start time is included in the interval, `false` otherwise.
         *   Default value - `true`
         * @property [isStopIncluded] `true` if stop time is included in the interval, `false` otherwise.
         *   Default value - `true`
         * @property [leadingInterval] `true` if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  `false` otherwise.
         *   Default value - `false`
         * @property [trailingInterval] `true` if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  `false` otherwise.
         *   Default value - `false`
         * @property [dataCallback] A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
         */
        interface FromIso8601Options {
            var iso8601: String
            var isStartIncluded: Boolean?
            var isStopIncluded: Boolean?
            var leadingInterval: Boolean?
            var trailingInterval: Boolean?
            var dataCallback: Function<*>?
        }

        /**
         * Creates a new instance from a [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) date array.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#.fromIso8601DateArray">Online Documentation</a>
         */
        fun fromIso8601DateArray(
            options: FromIso8601DateArrayOptions,
            result: TimeIntervalCollection? = definedExternally,
        ): TimeIntervalCollection

        /**
         * @property [iso8601Dates] An array of ISO 8601 dates.
         * @property [isStartIncluded] `true` if start time is included in the interval, `false` otherwise.
         *   Default value - `true`
         * @property [isStopIncluded] `true` if stop time is included in the interval, `false` otherwise.
         *   Default value - `true`
         * @property [leadingInterval] `true` if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  `false` otherwise.
         *   Default value - `false`
         * @property [trailingInterval] `true` if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  `false` otherwise.
         *   Default value - `false`
         * @property [dataCallback] A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
         */
        interface FromIso8601DateArrayOptions {
            var iso8601Dates: Array<out String>
            var isStartIncluded: Boolean?
            var isStopIncluded: Boolean?
            var leadingInterval: Boolean?
            var trailingInterval: Boolean?
            var dataCallback: Function<*>?
        }

        /**
         * Creates a new instance from a [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601) duration array.
         * @param [result] An existing instance to use for the result.
         * @return The modified result parameter or a new instance if none was provided.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TimeIntervalCollection.html#.fromIso8601DurationArray">Online Documentation</a>
         */
        fun fromIso8601DurationArray(
            options: FromIso8601DurationArrayOptions,
            result: TimeIntervalCollection? = definedExternally,
        ): TimeIntervalCollection

        /**
         * @property [epoch] An date that the durations are relative to.
         * @property [iso8601Durations] An array of ISO 8601 durations.
         * @property [relativeToPrevious] `true` if durations are relative to previous date, `false` if always relative to the epoch.
         *   Default value - `false`
         * @property [isStartIncluded] `true` if start time is included in the interval, `false` otherwise.
         *   Default value - `true`
         * @property [isStopIncluded] `true` if stop time is included in the interval, `false` otherwise.
         *   Default value - `true`
         * @property [leadingInterval] `true` if you want to add a interval from Iso8601.MINIMUM_VALUE to start time,  `false` otherwise.
         *   Default value - `false`
         * @property [trailingInterval] `true` if you want to add a interval from stop time to Iso8601.MAXIMUM_VALUE,  `false` otherwise.
         *   Default value - `false`
         * @property [dataCallback] A function that will be return the data that is called with each interval before it is added to the collection. If unspecified, the data will be the index in the collection.
         */
        interface FromIso8601DurationArrayOptions {
            var epoch: JulianDate
            var iso8601Durations: String
            var relativeToPrevious: Boolean?
            var isStartIncluded: Boolean?
            var isStopIncluded: Boolean?
            var leadingInterval: Boolean?
            var trailingInterval: Boolean?
            var dataCallback: Function<*>?
        }
    }
}
