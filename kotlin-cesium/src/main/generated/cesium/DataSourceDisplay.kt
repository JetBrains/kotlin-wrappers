// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

import js.core.ReadonlyArray
import js.core.jso

/**
 * Visualizes a collection of [DataSource] instances.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceDisplay.html">Online Documentation</a>
 */
external class DataSourceDisplay(options: ConstructorOptions) {
    /**
     * @property [scene] The scene in which to display the data.
     * @property [dataSourceCollection] The data sources to display.
     * @property [visualizersCallback] A function which creates an array of visualizers used for visualization.
     *   If undefined, all standard visualizers are used.
     *   Default value - [DataSourceDisplay.defaultVisualizersCallback]
     */
    interface ConstructorOptions {
        var scene: Scene
        var dataSourceCollection: DataSourceCollection
        var visualizersCallback: VisualizersCallback?
    }

    /**
     * Gets the scene associated with this display.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceDisplay.html#scene">Online Documentation</a>
     */
    var scene: Scene

    /**
     * Gets the collection of data sources to display.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceDisplay.html#dataSources">Online Documentation</a>
     */
    var dataSources: DataSourceCollection

    /**
     * Gets the default data source instance which can be used to
     * manually create and visualize entities not tied to
     * a specific data source. This instance is always available
     * and does not appear in the list dataSources collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceDisplay.html#defaultDataSource">Online Documentation</a>
     */
    var defaultDataSource: CustomDataSource

    /**
     * Gets a value indicating whether or not all entities in the data source are ready
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceDisplay.html#ready">Online Documentation</a>
     */
    val ready: Boolean

    /**
     * Returns true if this object was destroyed; otherwise, false.
     *
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceDisplay.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * dataSourceDisplay = dataSourceDisplay.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceDisplay.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Updates the display to the provided time.
     * @param [time] The simulation time.
     * @return True if all data sources are ready to be displayed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceDisplay.html#update">Online Documentation</a>
     */
    fun update(time: JulianDate): Boolean

    companion object {
        /**
         * Gets or sets the default function which creates an array of visualizers used for visualization.
         * By default, this function uses all standard visualizers.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceDisplay.html#.defaultVisualizersCallback">Online Documentation</a>
         */
        fun defaultVisualizersCallback()
    }
}

/**
 * A function which creates an array of visualizers used for visualization.
 * ```
 * function createVisualizers(scene, dataSource) {
 *     return [new BillboardVisualizer(scene, dataSource.entities)];
 * }
 * ```
 * @param [scene] The scene to create visualizers for.
 * @param [dataSource] The data source to create visualizers for.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceDisplay.html#.VisualizersCallback">Online Documentation</a>
 */
typealias VisualizersCallback = (scene: Scene, dataSource: DataSource) -> ReadonlyArray<Visualizer>

inline fun DataSourceDisplay(
    block: DataSourceDisplay.ConstructorOptions.() -> Unit,
): DataSourceDisplay =
    DataSourceDisplay(options = jso(block))
