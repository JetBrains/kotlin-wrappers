// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A [DataSource] implementation which can be used to manually manage a group of entities.
 * ```
 * const dataSource = new CustomDataSource('myData');
 *
 * const entity = dataSource.entities.add({
 *    position : Cartesian3.fromDegrees(1, 2, 0),
 *    billboard : {
 *        image : 'image.png'
 *    }
 * });
 *
 * viewer.dataSources.add(dataSource);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomDataSource.html">Online Documentation</a>
 *
 * @constructor
 * @property [name] A human-readable name for this instance.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomDataSource.html">Online Documentation</a>
 */
external class CustomDataSource(var name: String = definedExternally) {
    /**
     * Gets or sets the clock for this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomDataSource.html#clock">Online Documentation</a>
     */
    var clock: DataSourceClock

    /**
     * Gets the collection of [Entity] instances.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomDataSource.html#entities">Online Documentation</a>
     */
    var entities: EntityCollection

    /**
     * Gets or sets whether the data source is currently loading data.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomDataSource.html#isLoading">Online Documentation</a>
     */
    var isLoading: Boolean

    /**
     * Gets an event that will be raised when the underlying data changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomDataSource.html#changedEvent">Online Documentation</a>
     */
    var changedEvent: Event

    /**
     * Gets an event that will be raised if an error is encountered during processing.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomDataSource.html#errorEvent">Online Documentation</a>
     */
    var errorEvent: Event

    /**
     * Gets an event that will be raised when the data source either starts or stops loading.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomDataSource.html#loadingEvent">Online Documentation</a>
     */
    var loadingEvent: Event

    /**
     * Gets whether or not this data source should be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomDataSource.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the clustering options for this data source. This object can be shared between multiple data sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomDataSource.html#clustering">Online Documentation</a>
     */
    var clustering: EntityCluster

    /**
     * Updates the data source to the provided time.  This function is optional and
     * is not required to be implemented.  It is provided for data sources which
     * retrieve data based on the current animation time or scene state.
     * If implemented, update will be called by [DataSourceDisplay] once a frame.
     * @param [time] The simulation time.
     * @return True if this data source is ready to be displayed at the provided time, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CustomDataSource.html#update">Online Documentation</a>
     */
    fun update(time: JulianDate): Boolean
}
