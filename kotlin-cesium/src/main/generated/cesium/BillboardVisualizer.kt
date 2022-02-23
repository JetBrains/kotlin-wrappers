// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A [Visualizer] which maps [Entity.billboard] to a [Billboard].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardVisualizer.html">Online Documentation</a>
 *
 * @constructor
 * @param [entityCluster] The entity cluster to manage the collection of billboards and optionally cluster with other entities.
 * @param [entityCollection] The entityCollection to visualize.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardVisualizer.html">Online Documentation</a>
 */
external class BillboardVisualizer(
    entityCluster: EntityCluster,
    entityCollection: EntityCollection,
) : Visualizer {
    /**
     * Updates the primitives created by this visualizer to match their
     * Entity counterpart at the given time.
     * @param [time] The time to update to.
     * @return This function always returns true.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardVisualizer.html#update">Online Documentation</a>
     */
    override fun update(time: JulianDate): Boolean

    /**
     * Returns true if this object was destroyed; otherwise, false.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardVisualizer.html#isDestroyed">Online Documentation</a>
     */
    override fun isDestroyed(): Boolean

    /**
     * Removes and destroys all primitives created by this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BillboardVisualizer.html#destroy">Online Documentation</a>
     */
    override fun destroy()
}
