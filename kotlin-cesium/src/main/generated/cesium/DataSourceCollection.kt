// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A collection of [DataSource] instances.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html">Online Documentation</a>
 */
external class DataSourceCollection {
    /**
     * Gets the number of data sources in this collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#length">Online Documentation</a>
     */
    val length: Int

    /**
     * An event that is raised when a data source is added to the collection.
     * Event handlers are passed the data source that was added.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#dataSourceAdded">Online Documentation</a>
     */
    val dataSourceAdded: Event

    /**
     * An event that is raised when a data source is removed from the collection.
     * Event handlers are passed the data source that was removed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#dataSourceRemoved">Online Documentation</a>
     */
    val dataSourceRemoved: Event

    /**
     * An event that is raised when a data source changes position in the collection.  Event handlers are passed the data source
     * that was moved, its new index after the move, and its old index prior to the move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#dataSourceMoved">Online Documentation</a>
     */
    val dataSourceMoved: Event

    /**
     * Adds a data source to the collection.
     * @param [dataSource] A data source or a promise to a data source to add to the collection.
     *   When passing a promise, the data source will not actually be added
     *   to the collection until the promise resolves successfully.
     * @return A Promise that resolves once the data source has been added to the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#add">Online Documentation</a>
     */
    fun add(dataSource: DataSource): kotlin.js.Promise<DataSource>

    fun add(dataSource: kotlin.js.Promise<DataSource>): kotlin.js.Promise<DataSource>

    /**
     * Removes a data source from this collection, if present.
     * @param [dataSource] The data source to remove.
     * @param [destroy] Whether to destroy the data source in addition to removing it.
     *   Default value - `false`
     * @return true if the data source was in the collection and was removed,
     *   false if the data source was not in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#remove">Online Documentation</a>
     */
    fun remove(
        dataSource: DataSource,
        destroy: Boolean? = definedExternally,
    ): Boolean

    /**
     * Removes all data sources from this collection.
     * @param [destroy] whether to destroy the data sources in addition to removing them.
     *   Default value - `false`
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#removeAll">Online Documentation</a>
     */
    fun removeAll(destroy: Boolean? = definedExternally)

    /**
     * Checks to see if the collection contains a given data source.
     * @param [dataSource] The data source to check for.
     * @return true if the collection contains the data source, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#contains">Online Documentation</a>
     */
    fun contains(dataSource: DataSource): Boolean

    /**
     * Determines the index of a given data source in the collection.
     * @param [dataSource] The data source to find the index of.
     * @return The index of the data source in the collection, or -1 if the data source does not exist in the collection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#indexOf">Online Documentation</a>
     */
    fun indexOf(dataSource: DataSource): Int

    /**
     * Gets a data source by index from the collection.
     * @param [index] the index to retrieve.
     * @return The data source at the specified index.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#get">Online Documentation</a>
     */
    fun get(index: Int): DataSource

    /**
     * Gets a data source by name from the collection.
     * @param [name] The name to retrieve.
     * @return A list of all data sources matching the provided name.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#getByName">Online Documentation</a>
     */
    fun getByName(name: String): Array<out DataSource>

    /**
     * Raises a data source up one position in the collection.
     * @param [dataSource] The data source to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#raise">Online Documentation</a>
     */
    fun raise(dataSource: DataSource)

    /**
     * Lowers a data source down one position in the collection.
     * @param [dataSource] The data source to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#lower">Online Documentation</a>
     */
    fun lower(dataSource: DataSource)

    /**
     * Raises a data source to the top of the collection.
     * @param [dataSource] The data source to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#raiseToTop">Online Documentation</a>
     */
    fun raiseToTop(dataSource: DataSource)

    /**
     * Lowers a data source to the bottom of the collection.
     * @param [dataSource] The data source to move.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#lowerToBottom">Online Documentation</a>
     */
    fun lowerToBottom(dataSource: DataSource)

    /**
     * Returns true if this object was destroyed; otherwise, false.
     * If this object was destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.
     * @return true if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the resources held by all data sources in this collection.  Explicitly destroying this
     * object allows for deterministic release of WebGL resources, instead of relying on the garbage
     * collector. Once this object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * ```
     * dataSourceCollection = dataSourceCollection && dataSourceCollection.destroy();
     * ```
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DataSourceCollection.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
