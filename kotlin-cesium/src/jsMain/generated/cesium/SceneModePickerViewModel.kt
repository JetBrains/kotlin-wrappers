// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * The view model for [SceneModePicker].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @property [scene] The Scene to morph
 * @property [duration] The duration of scene morph animations, in seconds
 *   Default value - `2.0`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html">Online Documentation</a>
 */
external class SceneModePickerViewModel(
    var scene: Scene,
    var duration: Double = definedExternally,
) {
    /**
     * Gets or sets the current SceneMode.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#sceneMode">Online Documentation</a>
     */
    var sceneMode: SceneMode

    /**
     * Gets or sets whether the button drop-down is currently visible.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#dropDownVisible">Online Documentation</a>
     */
    var dropDownVisible: Boolean

    /**
     * Gets or sets the 2D tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#tooltip2D">Online Documentation</a>
     */
    var tooltip2D: String

    /**
     * Gets or sets the 3D tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#tooltip3D">Online Documentation</a>
     */
    var tooltip3D: String

    /**
     * Gets or sets the Columbus View tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#tooltipColumbusView">Online Documentation</a>
     */
    var tooltipColumbusView: String

    /**
     * Gets the currently active tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#selectedTooltip">Online Documentation</a>
     */
    var selectedTooltip: String

    /**
     * Gets the command to toggle the drop down box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#toggleDropDown">Online Documentation</a>
     */
    var toggleDropDown: Command

    /**
     * Gets the command to morph to 2D.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#morphTo2D">Online Documentation</a>
     */
    var morphTo2D: Command

    /**
     * Gets the command to morph to 3D.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#morphTo3D">Online Documentation</a>
     */
    var morphTo3D: Command

    /**
     * Gets the command to morph to Columbus View.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#morphToColumbusView">Online Documentation</a>
     */
    var morphToColumbusView: Command

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SceneModePickerViewModel.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
