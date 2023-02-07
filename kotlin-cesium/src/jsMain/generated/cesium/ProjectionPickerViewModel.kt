// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * The view model for [ProjectionPicker].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html">Online Documentation</a>
 *
 * @constructor
 * @property [scene] The Scene to switch projections.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html">Online Documentation</a>
 */
external class ProjectionPickerViewModel(var scene: Scene) {
    /**
     * Gets or sets whether the button drop-down is currently visible.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html#dropDownVisible">Online Documentation</a>
     */
    var dropDownVisible: Boolean

    /**
     * Gets or sets the perspective projection tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html#tooltipPerspective">Online Documentation</a>
     */
    var tooltipPerspective: String

    /**
     * Gets or sets the orthographic projection tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html#tooltipOrthographic">Online Documentation</a>
     */
    var tooltipOrthographic: String

    /**
     * Gets the currently active tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html#selectedTooltip">Online Documentation</a>
     */
    var selectedTooltip: String

    /**
     * Gets or sets the current SceneMode.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html#sceneMode">Online Documentation</a>
     */
    var sceneMode: SceneMode

    /**
     * Gets the command to toggle the drop down box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html#toggleDropDown">Online Documentation</a>
     */
    var toggleDropDown: Command

    /**
     * Gets the command to switch to a perspective projection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html#switchToPerspective">Online Documentation</a>
     */
    var switchToPerspective: Command

    /**
     * Gets the command to switch to orthographic projection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html#switchToOrthographic">Online Documentation</a>
     */
    var switchToOrthographic: Command

    /**
     * Gets whether the scene is currently using an orthographic projection.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html#isOrthographicProjection">Online Documentation</a>
     */
    var isOrthographicProjection: Command

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPickerViewModel.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
