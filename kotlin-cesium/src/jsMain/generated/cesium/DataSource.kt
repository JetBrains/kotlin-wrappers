// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * Defines the interface for data sources, which turn arbitrary data into a
 * [EntityCollection] for generic consumption. This object is an interface
 * for documentation purposes and is not intended to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSource.html">Online Documentation</a>
 */
abstract external class DataSource {
    /**
     * Gets a human-readable name for this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSource.html#name">Online Documentation</a>
     */
    abstract var name: String

    /**
     * Gets the preferred clock settings for this data source.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSource.html#clock">Online Documentation</a>
     */
    abstract var clock: DataSourceClock

    /**
     * Gets the collection of [Entity] instances.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSource.html#entities">Online Documentation</a>
     */
    abstract var entities: EntityCollection

    /**
     * Gets a value indicating if the data source is currently loading data.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSource.html#isLoading">Online Documentation</a>
     */
    abstract var isLoading: Boolean

    /**
     * Gets an event that will be raised when the underlying data changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSource.html#changedEvent">Online Documentation</a>
     */
    abstract var changedEvent: DefaultEvent

    /**
     * Gets an event that will be raised if an error is encountered during processing.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSource.html#errorEvent">Online Documentation</a>
     */
    abstract var errorEvent: Event<(arg1: RequestErrorEvent) -> Unit>

    /**
     * Gets an event that will be raised when the value of isLoading changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSource.html#loadingEvent">Online Documentation</a>
     */
    abstract var loadingEvent: Event<(arg1: Boolean) -> Unit>

    /**
     * Gets whether or not this data source should be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSource.html#show">Online Documentation</a>
     */
    abstract var show: Boolean

    /**
     * Gets or sets the clustering options for this data source. This object can be shared between multiple data sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSource.html#clustering">Online Documentation</a>
     */
    abstract var clustering: EntityCluster

    /**
     * Updates the data source to the provided time.  This function is optional and
     * is not required to be implemented.  It is provided for data sources which
     * retrieve data based on the current animation time or scene state.
     * If implemented, update will be called by [DataSourceDisplay] once a frame.
     * @param [time] The simulation time.
     * @return True if this data source is ready to be displayed at the provided time, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSource.html#update">Online Documentation</a>
     */
    abstract fun update(time: JulianDate): Boolean
}
