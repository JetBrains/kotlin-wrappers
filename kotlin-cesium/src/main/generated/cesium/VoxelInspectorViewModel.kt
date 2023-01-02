// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * The view model for [VoxelInspector].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @property [scene] The scene instance to use.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html">Online Documentation</a>
 */
external class VoxelInspectorViewModel(val scene: Scene) {
    /**
     * Gets or sets the primitive of the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html#voxelPrimitive">Online Documentation</a>
     */
    var voxelPrimitive: VoxelPrimitive

    /**
     * Toggles the inspector visibility
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html#toggleInspector">Online Documentation</a>
     */
    fun toggleInspector()

    /**
     * Toggles the visibility of the display section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html#toggleDisplay">Online Documentation</a>
     */
    fun toggleDisplay()

    /**
     * Toggles the visibility of the transform section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html#toggleTransform">Online Documentation</a>
     */
    fun toggleTransform()

    /**
     * Toggles the visibility of the bounds section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html#toggleBounds">Online Documentation</a>
     */
    fun toggleBounds()

    /**
     * Toggles the visibility of the clipping section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html#toggleClipping">Online Documentation</a>
     */
    fun toggleClipping()

    /**
     * Toggles the visibility of the shader section
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html#toggleShader">Online Documentation</a>
     */
    fun toggleShader()

    /**
     * Compiles the shader in the shader editor.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html#compileShader">Online Documentation</a>
     */
    fun compileShader()

    /**
     * Handles key press events on the shader editor.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html#shaderEditorKeyPress">Online Documentation</a>
     */
    fun shaderEditorKeyPress()

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VoxelInspectorViewModel.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
