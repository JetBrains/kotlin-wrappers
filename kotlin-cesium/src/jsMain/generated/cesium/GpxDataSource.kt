// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import kotlin.js.Promise

/**
 * A [DataSource] which processes the GPS Exchange Format (GPX).
 * ```
 * const viewer = new Viewer('cesiumContainer');
 * viewer.dataSources.add(GpxDataSource.load('../../SampleData/track.gpx'));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html">Online Documentation</a>
 */
external class GpxDataSource {
    /**
     * Gets a human-readable name for this instance.
     * This will be automatically be set to the GPX document name on load.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#name">Online Documentation</a>
     */
    var name: String

    /**
     * Gets the version of the GPX Schema in use.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#version">Online Documentation</a>
     */
    var version: String

    /**
     * Gets the creator of the GPX document.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#creator">Online Documentation</a>
     */
    var creator: String

    /**
     * Gets an object containing metadata about the GPX file.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#metadata">Online Documentation</a>
     */
    var metadata: Any

    /**
     * Gets the clock settings defined by the loaded GPX. This represents the total
     * availability interval for all time-dynamic data. If the GPX does not contain
     * time-dynamic data, this value is undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#clock">Online Documentation</a>
     */
    var clock: DataSourceClock

    /**
     * Gets the collection of [Entity] instances.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#entities">Online Documentation</a>
     */
    var entities: EntityCollection

    /**
     * Gets a value indicating if the data source is currently loading data.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#isLoading">Online Documentation</a>
     */
    var isLoading: Boolean

    /**
     * Gets an event that will be raised when the underlying data changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#changedEvent">Online Documentation</a>
     */
    var changedEvent: DefaultEvent

    /**
     * Gets an event that will be raised if an error is encountered during processing.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#errorEvent">Online Documentation</a>
     */
    var errorEvent: DefaultEvent

    /**
     * Gets an event that will be raised when the data source either starts or stops loading.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#loadingEvent">Online Documentation</a>
     */
    var loadingEvent: DefaultEvent

    /**
     * Gets whether or not this data source should be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the clustering options for this data source. This object can be shared between multiple data sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#clustering">Online Documentation</a>
     */
    var clustering: EntityCluster

    /**
     * Updates the data source to the provided time.  This function is optional and
     * is not required to be implemented.  It is provided for data sources which
     * retrieve data based on the current animation time or scene state.
     * If implemented, update will be called by [DataSourceDisplay] once a frame.
     * @param [time] The simulation time.
     * @return True if this data source is ready to be displayed at the provided time, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#update">Online Documentation</a>
     */
    fun update(time: JulianDate): Boolean

    /**
     * Asynchronously loads the provided GPX data, replacing any existing data.
     * @param [data] A url, parsed GPX document, or Blob containing binary GPX data or a parsed GPX document.
     * @return A promise that will resolve to this instances once the GPX is loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#load">Online Documentation</a>
     */
    fun load(
        data: dynamic,
        options: LoadOptions? = definedExternally,
    ): Promise<GpxDataSource>

    /**
     * @property [clampToGround] True if the symbols should be rendered at the same height as the terrain
     * @property [waypointImage] Image to use for waypoint billboards.
     * @property [trackImage] Image to use for track billboards.
     * @property [trackColor] Color to use for track lines.
     * @property [routeColor] Color to use for route lines.
     */
    interface LoadOptions {
        var clampToGround: Boolean?
        var waypointImage: String?
        var trackImage: String?
        var trackColor: String?
        var routeColor: String?
    }

    companion object {
        /**
         * Creates a Promise to a new instance loaded with the provided GPX data.
         * @param [data] A url, parsed GPX document, or Blob containing binary GPX data.
         * @return A promise that will resolve to a new GpxDataSource instance once the gpx is loaded.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GpxDataSource.html#.load">Online Documentation</a>
         */
        fun load(
            data: dynamic,
            options: LoadOptions? = definedExternally,
        ): Promise<GpxDataSource>

        /**
         * @property [clampToGround] True if the symbols should be rendered at the same height as the terrain
         * @property [waypointImage] Image to use for waypoint billboards.
         * @property [trackImage] Image to use for track billboards.
         * @property [trackColor] Color to use for track lines.
         * @property [routeColor] Color to use for route lines.
         */
        interface LoadOptions {
            var clampToGround: Boolean?
            var waypointImage: String?
            var trackImage: String?
            var trackColor: String?
            var routeColor: String?
        }
    }
}
