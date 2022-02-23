// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * The view model for [NavigationHelpButton].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NavigationHelpButtonViewModel.html">Online Documentation</a>
 */
external class NavigationHelpButtonViewModel {
    /**
     * Gets or sets whether the instructions are currently shown.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NavigationHelpButtonViewModel.html#showInstructions">Online Documentation</a>
     */
    var showInstructions: Boolean

    /**
     * Gets or sets the tooltip.  This property is observable.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NavigationHelpButtonViewModel.html#tooltip">Online Documentation</a>
     */
    var tooltip: String

    /**
     * Gets the Command that is executed when the button is clicked.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NavigationHelpButtonViewModel.html#command">Online Documentation</a>
     */
    var command: Command

    /**
     * Gets the Command that is executed when the mouse instructions should be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NavigationHelpButtonViewModel.html#showClick">Online Documentation</a>
     */
    var showClick: Command

    /**
     * Gets the Command that is executed when the touch instructions should be shown.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NavigationHelpButtonViewModel.html#showTouch">Online Documentation</a>
     */
    var showTouch: Command
}
