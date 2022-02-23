// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * The view model for [InfoBox].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBoxViewModel.html">Online Documentation</a>
 */
external class InfoBoxViewModel {
    /**
     * Gets or sets the maximum height of the info box in pixels.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBoxViewModel.html#maxHeight">Online Documentation</a>
     */
    var maxHeight: Double

    /**
     * Gets or sets whether the camera tracking icon is enabled.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBoxViewModel.html#enableCamera">Online Documentation</a>
     */
    var enableCamera: Boolean

    /**
     * Gets or sets the status of current camera tracking of the selected object.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBoxViewModel.html#isCameraTracking">Online Documentation</a>
     */
    var isCameraTracking: Boolean

    /**
     * Gets or sets the visibility of the info box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBoxViewModel.html#showInfo">Online Documentation</a>
     */
    var showInfo: Boolean

    /**
     * Gets or sets the title text in the info box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBoxViewModel.html#titleText">Online Documentation</a>
     */
    var titleText: String

    /**
     * Gets or sets the description HTML for the info box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBoxViewModel.html#description">Online Documentation</a>
     */
    var description: String

    /**
     * Gets the SVG path of the camera icon, which can change to be "crossed out" or not.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBoxViewModel.html#cameraIconPath">Online Documentation</a>
     */
    var cameraIconPath: String

    /**
     * Gets the maximum height of sections within the info box, minus an offset, in CSS-ready form.
     * @param [offset] The offset in pixels.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBoxViewModel.html#maxHeightOffset">Online Documentation</a>
     */
    fun maxHeightOffset(offset: Double): String

    /**
     * Gets an [Event] that is fired when the user clicks the camera icon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBoxViewModel.html#cameraClicked">Online Documentation</a>
     */
    var cameraClicked: Event

    /**
     * Gets an [Event] that is fired when the user closes the info box.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBoxViewModel.html#closeClicked">Online Documentation</a>
     */
    var closeClicked: Event
}
