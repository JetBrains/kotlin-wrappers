// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.core.ReadonlyArray

/**
 * A [DataSource] which processes [CZML](https://github.com/AnalyticalGraphicsInc/czml-writer/wiki/CZML-Guide).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html">Online Documentation</a>
 *
 * @constructor
 * @property [name] An optional name for the data source.  This value will be overwritten if a loaded document contains a name.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html">Online Documentation</a>
 */
external class CzmlDataSource(var name: String = definedExternally) {
    /**
     * Gets the clock settings defined by the loaded CZML.  If no clock is explicitly
     * defined in the CZML, the combined availability of all objects is returned.  If
     * only static data exists, this value is undefined.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#clock">Online Documentation</a>
     */
    var clock: DataSourceClock

    /**
     * Gets the collection of [Entity] instances.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#entities">Online Documentation</a>
     */
    var entities: EntityCollection

    /**
     * Gets a value indicating if the data source is currently loading data.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#isLoading">Online Documentation</a>
     */
    var isLoading: Boolean

    /**
     * Gets an event that will be raised when the underlying data changes.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#changedEvent">Online Documentation</a>
     */
    var changedEvent: DefaultEvent

    /**
     * Gets an event that will be raised if an error is encountered during processing.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#errorEvent">Online Documentation</a>
     */
    var errorEvent: DefaultEvent

    /**
     * Gets an event that will be raised when the data source either starts or stops loading.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#loadingEvent">Online Documentation</a>
     */
    var loadingEvent: DefaultEvent

    /**
     * Gets whether or not this data source should be displayed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets the clustering options for this data source. This object can be shared between multiple data sources.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#clustering">Online Documentation</a>
     */
    var clustering: EntityCluster

    /**
     * Gets the credit that will be displayed for the data source
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#credit">Online Documentation</a>
     */
    var credit: Credit

    /**
     * Processes the provided url or CZML object without clearing any existing data.
     * @param [czml] A url or CZML object to be processed.
     * @param [options] An object specifying configuration options
     * @return A promise that resolves to this instances once the data is processed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#process">Online Documentation</a>
     */
    fun process(
        czml: Resource,
        options: LoadOptions? = definedExternally,
    ): kotlin.js.Promise<CzmlDataSource>

    fun process(
        czml: String,
        options: LoadOptions? = definedExternally,
    ): kotlin.js.Promise<CzmlDataSource>

    fun process(
        czml: Any,
        options: LoadOptions? = definedExternally,
    ): kotlin.js.Promise<CzmlDataSource>

    /**
     * Loads the provided url or CZML object, replacing any existing data.
     * @param [czml] A url or CZML object to be processed.
     * @param [options] An object specifying configuration options
     * @return A promise that resolves to this instances once the data is processed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#load">Online Documentation</a>
     */
    fun load(
        czml: Resource,
        options: LoadOptions? = definedExternally,
    ): kotlin.js.Promise<CzmlDataSource>

    fun load(
        czml: String,
        options: LoadOptions? = definedExternally,
    ): kotlin.js.Promise<CzmlDataSource>

    fun load(
        czml: Any,
        options: LoadOptions? = definedExternally,
    ): kotlin.js.Promise<CzmlDataSource>

    /**
     * Updates the data source to the provided time.  This function is optional and
     * is not required to be implemented.  It is provided for data sources which
     * retrieve data based on the current animation time or scene state.
     * If implemented, update will be called by [DataSourceDisplay] once a frame.
     * @param [time] The simulation time.
     * @return True if this data source is ready to be displayed at the provided time, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#update">Online Documentation</a>
     */
    fun update(time: JulianDate): Boolean

    companion object {
        /**
         * Creates a Promise to a new instance loaded with the provided CZML data.
         * @param [czml] A url or CZML object to be processed.
         * @param [options] An object specifying configuration options
         * @return A promise that resolves to the new instance once the data is processed.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#.load">Online Documentation</a>
         */
        fun load(
            czml: Resource,
            options: LoadOptions? = definedExternally,
        ): kotlin.js.Promise<CzmlDataSource>

        fun load(
            czml: String,
            options: LoadOptions? = definedExternally,
        ): kotlin.js.Promise<CzmlDataSource>

        fun load(
            czml: Any,
            options: LoadOptions? = definedExternally,
        ): kotlin.js.Promise<CzmlDataSource>

        /**
         * Gets the array of CZML processing functions.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#.updaters">Online Documentation</a>
         */
        var updaters: ReadonlyArray<UpdaterFunction>

        /**
         * A helper function used by custom CZML updater functions
         * which creates or updates a [Property] from a CZML packet.
         * @param [type] The constructor function for the property being processed.
         * @param [object] The object on which the property will be added or updated.
         * @param [propertyName] The name of the property on the object.
         * @param [packetData] The CZML packet being processed.
         * @param [interval] A constraining interval for which the data is valid.
         * @param [sourceUri] The originating uri of the data being processed.
         * @param [entityCollection] The collection being processsed.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#.processPacketData">Online Documentation</a>
         */
        fun processPacketData(
            type: Function<*>,
            obj: Any,
            propertyName: String,
            packetData: Any,
            interval: TimeInterval,
            sourceUri: String,
            entityCollection: EntityCollection,
        )

        /**
         * A helper function used by custom CZML updater functions
         * which creates or updates a [PositionProperty] from a CZML packet.
         * @param [object] The object on which the property will be added or updated.
         * @param [propertyName] The name of the property on the object.
         * @param [packetData] The CZML packet being processed.
         * @param [interval] A constraining interval for which the data is valid.
         * @param [sourceUri] The originating uri of the data being processed.
         * @param [entityCollection] The collection being processsed.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#.processPositionPacketData">Online Documentation</a>
         */
        fun processPositionPacketData(
            obj: Any,
            propertyName: String,
            packetData: Any,
            interval: TimeInterval,
            sourceUri: String,
            entityCollection: EntityCollection,
        )

        /**
         * A helper function used by custom CZML updater functions
         * which creates or updates a [MaterialProperty] from a CZML packet.
         * @param [object] The object on which the property will be added or updated.
         * @param [propertyName] The name of the property on the object.
         * @param [packetData] The CZML packet being processed.
         * @param [interval] A constraining interval for which the data is valid.
         * @param [sourceUri] The originating uri of the data being processed.
         * @param [entityCollection] The collection being processsed.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#.processMaterialPacketData">Online Documentation</a>
         */
        fun processMaterialPacketData(
            obj: Any,
            propertyName: String,
            packetData: Any,
            interval: TimeInterval,
            sourceUri: String,
            entityCollection: EntityCollection,
        )

        /**
         * Initialization options for the `load` method.
         * @property [sourceUri] Overrides the url to use for resolving relative links.
         * @property [credit] A credit for the data source, which is displayed on the canvas.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#.LoadOptions">Online Documentation</a>
         */
        interface LoadOptions {
            var sourceUri: Resource?
            var credit: Credit?
        }
    }
}

/**
 * Function
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CzmlDataSource.html#.UpdaterFunction">Online Documentation</a>
 */
typealias UpdaterFunction = (entity: Entity, packet: Any, entityCollection: EntityCollection, sourceUri: String) -> Unit
