// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import kotlin.js.Promise

/**
 * A [DataSource] which processes both
 * [GeoJSON](http://www.geojson.org/) and [TopoJSON](https://github.com/mbostock/topojson) data.
 * [simplestyle-spec](https://github.com/mapbox/simplestyle-spec) properties will also be used if they
 * are present.
 * ```
 * const viewer = new Viewer('cesiumContainer');
 * viewer.dataSources.add(GeoJsonDataSource.load('../../SampleData/ne_10m_us_states.topojson', {
 *   stroke: Color.HOTPINK,
 *   fill: Color.PINK,
 *   strokeWidth: 3,
 *   markerSymbol: '?'
 * }));
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html">Online Documentation</a>
 *
 * @constructor
 * @property [name] The name of this data source.  If undefined, a name will be taken from
 *   the name of the GeoJSON file.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html">Online Documentation</a>
 */
external class GeoJsonDataSource(var name: String = definedExternally) {
    /**
     * This DataSource only defines static data, therefore this property is always undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#clock">Online Documentation</a>
     */
    var clock: DataSourceClock

    /**
     * Gets the collection of [Entity] instances.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#entities">Online Documentation</a>
     */
    var entities: EntityCollection

    /**
     * Gets a value indicating if the data source is currently loading data.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#isLoading">Online Documentation</a>
     */
    var isLoading: Boolean

    /**
     * Gets an event that will be raised when the underlying data changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#changedEvent">Online Documentation</a>
     */
    var changedEvent: DefaultEvent

    /**
     * Gets an event that will be raised if an error is encountered during processing.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#errorEvent">Online Documentation</a>
     */
    var errorEvent: DefaultEvent

    /**
     * Gets an event that will be raised when the data source either starts or stops loading.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#loadingEvent">Online Documentation</a>
     */
    var loadingEvent: DefaultEvent

    /**
     * Gets whether or not this data source should be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the clustering options for this data source. This object can be shared between multiple data sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#clustering">Online Documentation</a>
     */
    var clustering: EntityCluster

    /**
     * Gets the credit that will be displayed for the data source
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#credit">Online Documentation</a>
     */
    var credit: Credit

    /**
     * Asynchronously loads the provided GeoJSON or TopoJSON data, replacing any existing data.
     * @param [data] A url, GeoJSON object, or TopoJSON object to be loaded.
     * @param [options] An object specifying configuration options
     * @return a promise that will resolve when the GeoJSON is loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#load">Online Documentation</a>
     */
    fun load(
        data: Resource,
        options: LoadOptions? = definedExternally,
    ): Promise<GeoJsonDataSource>

    fun load(
        data: String,
        options: LoadOptions? = definedExternally,
    ): Promise<GeoJsonDataSource>

    fun load(
        data: Any,
        options: LoadOptions? = definedExternally,
    ): Promise<GeoJsonDataSource>

    /**
     * Asynchronously loads the provided GeoJSON or TopoJSON data, without replacing any existing data.
     * @param [data] A url, GeoJSON object, or TopoJSON object to be loaded.
     * @param [options] An object specifying configuration options
     * @return a promise that will resolve when the GeoJSON is loaded.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#process">Online Documentation</a>
     */
    fun process(
        data: Resource,
        options: LoadOptions? = definedExternally,
    ): Promise<GeoJsonDataSource>

    fun process(
        data: String,
        options: LoadOptions? = definedExternally,
    ): Promise<GeoJsonDataSource>

    fun process(
        data: Any,
        options: LoadOptions? = definedExternally,
    ): Promise<GeoJsonDataSource>

    /**
     * Updates the data source to the provided time.  This function is optional and
     * is not required to be implemented.  It is provided for data sources which
     * retrieve data based on the current animation time or scene state.
     * If implemented, update will be called by [DataSourceDisplay] once a frame.
     * @param [time] The simulation time.
     * @return True if this data source is ready to be displayed at the provided time, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#update">Online Documentation</a>
     */
    fun update(time: JulianDate): Boolean

    companion object {
        /**
         * Creates a Promise to a new instance loaded with the provided GeoJSON or TopoJSON data.
         * @param [data] A url, GeoJSON object, or TopoJSON object to be loaded.
         * @param [options] An object specifying configuration options
         * @return A promise that will resolve when the data is loaded.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.load">Online Documentation</a>
         */
        fun load(
            data: Resource,
            options: LoadOptions? = definedExternally,
        ): Promise<GeoJsonDataSource>

        fun load(
            data: String,
            options: LoadOptions? = definedExternally,
        ): Promise<GeoJsonDataSource>

        fun load(
            data: Any,
            options: LoadOptions? = definedExternally,
        ): Promise<GeoJsonDataSource>

        /**
         * Gets or sets the default size of the map pin created for each point, in pixels.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.markerSize">Online Documentation</a>
         */
        var markerSize: Double

        /**
         * Gets or sets the default symbol of the map pin created for each point.
         * This can be any valid [Maki](http://mapbox.com/maki/) identifier, any single character,
         * or blank if no symbol is to be used.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.markerSymbol">Online Documentation</a>
         */
        var markerSymbol: String

        /**
         * Gets or sets the default color of the map pin created for each point.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.markerColor">Online Documentation</a>
         */
        var markerColor: Color

        /**
         * Gets or sets the default color of polylines and polygon outlines.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.stroke">Online Documentation</a>
         */
        var stroke: Color

        /**
         * Gets or sets the default width of polylines and polygon outlines.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.strokeWidth">Online Documentation</a>
         */
        var strokeWidth: Double

        /**
         * Gets or sets default color for polygon interiors.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.fill">Online Documentation</a>
         */
        var fill: Color

        /**
         * Gets or sets default of whether to clamp to the ground.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.clampToGround">Online Documentation</a>
         */
        var clampToGround: Boolean

        /**
         * Gets an object that maps the name of a crs to a callback function which takes a GeoJSON coordinate
         * and transforms it into a WGS84 Earth-fixed Cartesian.  Older versions of GeoJSON which
         * supported the EPSG type can be added to this list as well, by specifying the complete EPSG name,
         * for example 'EPSG:4326'.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.crsNames">Online Documentation</a>
         */
        var crsNames: Any

        /**
         * Gets an object that maps the href property of a crs link to a callback function
         * which takes the crs properties object and returns a Promise that resolves
         * to a function that takes a GeoJSON coordinate and transforms it into a WGS84 Earth-fixed Cartesian.
         * Items in this object take precedence over those defined in `crsLinkHrefs`, assuming
         * the link has a type specified.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.crsLinkHrefs">Online Documentation</a>
         */
        var crsLinkHrefs: Any

        /**
         * Gets an object that maps the type property of a crs link to a callback function
         * which takes the crs properties object and returns a Promise that resolves
         * to a function that takes a GeoJSON coordinate and transforms it into a WGS84 Earth-fixed Cartesian.
         * Items in `crsLinkHrefs` take precedence over this object.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.crsLinkTypes">Online Documentation</a>
         */
        var crsLinkTypes: Any

        /**
         * Initialization options for the `load` method.
         * @property [sourceUri] Overrides the url to use for resolving relative links.
         * @property [describe] A function which returns a Property object (or just a string).
         *   Default value - [GeoJsonDataSource.defaultDescribeProperty]
         * @property [markerSize] The default size of the map pin created for each point, in pixels.
         *   Default value - [GeoJsonDataSource.markerSize]
         * @property [markerSymbol] The default symbol of the map pin created for each point.
         *   Default value - [GeoJsonDataSource.markerSymbol]
         * @property [markerColor] The default color of the map pin created for each point.
         *   Default value - [GeoJsonDataSource.markerColor]
         * @property [stroke] The default color of polylines and polygon outlines.
         *   Default value - [GeoJsonDataSource.stroke]
         * @property [strokeWidth] The default width of polylines and polygon outlines.
         *   Default value - [GeoJsonDataSource.strokeWidth]
         * @property [fill] The default color for polygon interiors.
         *   Default value - [GeoJsonDataSource.fill]
         * @property [clampToGround] true if we want the geometry features (polygons or linestrings) clamped to the ground.
         *   Default value - [GeoJsonDataSource.clampToGround]
         * @property [credit] A credit for the data source, which is displayed on the canvas.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.LoadOptions">Online Documentation</a>
         */
        interface LoadOptions {
            var sourceUri: String?
            var describe: describe?
            var markerSize: Double?
            var markerSymbol: String?
            var markerColor: Color?
            var stroke: Color?
            var strokeWidth: Double?
            var fill: Color?
            var clampToGround: Boolean?
            var credit: Credit?
        }
    }
}

/**
 * This callback is displayed as part of the GeoJsonDataSource class.
 * @param [properties] The properties of the feature.
 * @param [nameProperty] The property key that Cesium estimates to have the name of the feature.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/GeoJsonDataSource.html#.describe">Online Documentation</a>
 */
typealias describe = (properties: Any, nameProperty: String) -> Unit
