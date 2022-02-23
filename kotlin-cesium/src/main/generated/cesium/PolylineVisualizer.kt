// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * A visualizer for polylines represented by [Primitive] instances.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVisualizer.html">Online Documentation</a>
 *
 * @constructor
 * @param [scene] The scene the primitives will be rendered in.
 * @param [entityCollection] The entityCollection to visualize.
 * @param [primitives] A collection to add primitives related to the entities
 *   Default value - [scene.primitives]
 * @param [groundPrimitives] A collection to add ground primitives related to the entities
 *   Default value - [scene.groundPrimitives]
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVisualizer.html">Online Documentation</a>
 */
external class PolylineVisualizer(
    scene: Scene,
    entityCollection: EntityCollection,
    primitives: PrimitiveCollection? = definedExternally,
    groundPrimitives: PrimitiveCollection? = definedExternally,
) : Visualizer {
    /**
     * Updates all of the primitives created by this visualizer to match their
     * Entity counterpart at the given time.
     * @param [time] The time to update to.
     * @return True if the visualizer successfully updated to the provided time,
     *   false if the visualizer is waiting for asynchronous primitives to be created.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVisualizer.html#update">Online Documentation</a>
     */
    override fun update(time: JulianDate): Boolean

    /**
     * Returns true if this object was destroyed; otherwise, false.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVisualizer.html#isDestroyed">Online Documentation</a>
     */
    override fun isDestroyed(): Boolean

    /**
     * Removes and destroys all primitives created by this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PolylineVisualizer.html#destroy">Online Documentation</a>
     */
    override fun destroy()
}
