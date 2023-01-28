// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Represents desired clock settings for a particular [DataSource].  These settings may be applied
 * to the [Clock] when the DataSource is loaded.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceClock.html">Online Documentation</a>
 */
external class DataSourceClock {
    /**
     * Gets the event that is raised whenever a new property is assigned.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceClock.html#definitionChanged">Online Documentation</a>
     */
    val definitionChanged: DefaultEvent

    /**
     * Gets or sets the desired start time of the clock.
     * See [Clock.startTime].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceClock.html#startTime">Online Documentation</a>
     */
    var startTime: JulianDate

    /**
     * Gets or sets the desired stop time of the clock.
     * See [Clock.stopTime].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceClock.html#stopTime">Online Documentation</a>
     */
    var stopTime: JulianDate

    /**
     * Gets or sets the desired current time when this data source is loaded.
     * See [Clock.currentTime].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceClock.html#currentTime">Online Documentation</a>
     */
    var currentTime: JulianDate

    /**
     * Gets or sets the desired clock range setting.
     * See [Clock.clockRange].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceClock.html#clockRange">Online Documentation</a>
     */
    var clockRange: ClockRange

    /**
     * Gets or sets the desired clock step setting.
     * See [Clock.clockStep].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceClock.html#clockStep">Online Documentation</a>
     */
    var clockStep: ClockStep

    /**
     * Gets or sets the desired clock multiplier.
     * See [Clock.multiplier].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceClock.html#multiplier">Online Documentation</a>
     */
    var multiplier: Double

    /**
     * Duplicates a DataSourceClock instance.
     * @param [result] The object onto which to store the result.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceClock.html#clone">Online Documentation</a>
     */
    fun clone(result: DataSourceClock? = definedExternally): DataSourceClock

    /**
     * Assigns each unassigned property on this object to the value
     * of the same property on the provided source object.
     * @param [source] The object to be merged into this object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceClock.html#merge">Online Documentation</a>
     */
    fun merge(source: DataSourceClock)

    /**
     * Gets the value of this clock instance as a [Clock] object.
     * @return The modified result parameter or a new instance if one was not provided.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceClock.html#getValue">Online Documentation</a>
     */
    fun getValue(): Clock
}
