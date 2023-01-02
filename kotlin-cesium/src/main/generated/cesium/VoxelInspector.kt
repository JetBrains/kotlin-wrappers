// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import web.dom.Element

/**
 * Inspector widget to aid in debugging voxels
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspector.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The DOM element that will contain the widget.
 * @param [scene] the Scene instance to use.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspector.html">Online Documentation</a>
 */
external class VoxelInspector(
    var container: Element,
    scene: Scene,
) {
    /**
     * Gets the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspector.html#viewModel">Online Documentation</a>
     */
    var viewModel: VoxelInspectorViewModel

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspector.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspector.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
