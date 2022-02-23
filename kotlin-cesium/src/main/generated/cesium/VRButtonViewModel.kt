// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * The view model for [VRButton].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButtonViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @param [scene] The scene.
 * @property [vrElement] The element or id to be placed into VR mode.
 *   Default value - `document.body`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButtonViewModel.html">Online Documentation</a>
 */
external class VRButtonViewModel(
    scene: Scene,
    var vrElement: org.w3c.dom.Element = definedExternally,
) {
    /**
     * Gets whether or not VR mode is active.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButtonViewModel.html#isVRMode">Online Documentation</a>
     */
    var isVRMode: Boolean

    /**
     * Gets or sets whether or not VR functionality should be enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButtonViewModel.html#isVREnabled">Online Documentation</a>
     */
    var isVREnabled: Boolean

    /**
     * Gets the tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButtonViewModel.html#tooltip">Online Documentation</a>
     */
    var tooltip: String

    /**
     * Gets the Command to toggle VR mode.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButtonViewModel.html#command">Online Documentation</a>
     */
    var command: Command

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButtonViewModel.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the view model.  Should be called to
     * properly clean up the view model when it is no longer needed.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/VRButtonViewModel.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
