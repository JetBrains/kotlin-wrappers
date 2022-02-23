// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package cesium

/**
 * Defines how screen space objects (billboards, points, labels) are clustered.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html">Online Documentation</a>
 */
external class EntityCluster {
    /**
     * Determines if entities in this collection will be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html#show">Online Documentation</a>
     */
    var show: Boolean

    /**
     * Gets or sets whether clustering is enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html#enabled">Online Documentation</a>
     */
    var enabled: Boolean

    /**
     * Gets or sets the pixel range to extend the screen space bounding box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html#pixelRange">Online Documentation</a>
     */
    var pixelRange: Int

    /**
     * Gets or sets the minimum number of screen space objects that can be clustered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html#minimumClusterSize">Online Documentation</a>
     */
    var minimumClusterSize: Int

    /**
     * Gets the event that will be raised when a new cluster will be displayed. The signature of the event listener is [EntityCluster.newClusterCallback].
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html#clusterEvent">Online Documentation</a>
     */
    var clusterEvent: Event

    /**
     * Gets or sets whether clustering billboard entities is enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html#clusterBillboards">Online Documentation</a>
     */
    var clusterBillboards: Boolean

    /**
     * Gets or sets whether clustering labels entities is enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html#clusterLabels">Online Documentation</a>
     */
    var clusterLabels: Boolean

    /**
     * Gets or sets whether clustering point entities is enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html#clusterPoints">Online Documentation</a>
     */
    var clusterPoints: Boolean

    /**
     * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
     * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
     *
     * Unlike other objects that use WebGL resources, this object can be reused. For example, if a data source is removed
     * from a data source collection and added to another.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html#destroy">Online Documentation</a>
     */
    fun destroy()
}

/**
 * A event listener function used to style clusters.
 * ```
 * // The default cluster values.
 * dataSource.clustering.clusterEvent.addEventListener(function(entities, cluster) {
 *     cluster.label.show = true;
 *     cluster.label.text = entities.length.toLocaleString();
 * });
 * ```
 * @param [clusteredEntities] An array of the entities contained in the cluster.
 * @param [cluster] An object containing billboard, label, and point properties. The values are the same as
 *   billboard, label and point entities, but must be the values of the ConstantProperty.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/EntityCluster.html#.newClusterCallback">Online Documentation</a>
 */
typealias newClusterCallback = (clusteredEntities: Array<out Entity>, cluster: Any) -> Unit

inline fun EntityCluster(
    block: EntityCluster.() -> Unit,
): EntityCluster =
    EntityCluster().apply(block)
