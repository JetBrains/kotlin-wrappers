// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Defines the interface for visualizers. Visualizers are plug-ins to
 * [DataSourceDisplay] that render data associated with
 * [DataSource] instances.
 * This object is an interface for documentation purposes and is not intended
 * to be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Visualizer.html">Online Documentation</a>
 */
abstract external class Visualizer {
    /**
     * Updates the visualization to the provided time.
     * @param [time] The time.
     * @return True if the display was updated to the provided time,
     *   false if the visualizer is waiting for an asynchronous operation to
     *   complete before data can be updated.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Visualizer.html#update">Online Documentation</a>
     */
    abstract fun update(time: JulianDate): Boolean

    /**
     * Returns true if this object was destroyed; otherwise, false.
     * @return True if this object was destroyed; otherwise, false.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Visualizer.html#isDestroyed">Online Documentation</a>
     */
    abstract fun isDestroyed(): Boolean

    /**
     * Removes all visualization and cleans up any resources associated with this instance.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Visualizer.html#destroy">Online Documentation</a>
     */
    abstract fun destroy()
}
