// Automatically generated - do not modify!

@file:JsModule("@cesium/widgets")

package cesium.widgets

import kotlinx.js.JsPlainObject
import web.dom.Element

/**
 * The NavigationHelpButton is a single button widget for displaying instructions for
 * navigating the globe with the mouse.<p style="clear: both;"></p><br/>
 * ```
 * // In HTML head, include a link to the NavigationHelpButton.css stylesheet,
 * // and in the body, include: <div id="navigationHelpButtonContainer"></div>
 *
 * const navigationHelpButton = new NavigationHelpButton({
 *     container : 'navigationHelpButtonContainer'
 * });
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NavigationHelpButton.html">Online Documentation</a>
 */
external class NavigationHelpButton(
    options: ConstructorOptions,
) {
    /**
     * @property [container] The DOM element that will contain the widget.
     * @property [instructionsInitiallyVisible] True if the navigation instructions should initially be visible; otherwise, false.
     *   Default value - `false`
     */
    @JsPlainObject
    sealed interface ConstructorOptions {
        var container: Element
        var instructionsInitiallyVisible: Boolean?
    }

    /**
     * Gets the parent container.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NavigationHelpButton.html#container">Online Documentation</a>
     */
    var container: Element

    /**
     * Gets the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NavigationHelpButton.html#viewModel">Online Documentation</a>
     */
    var viewModel: NavigationHelpButtonViewModel

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NavigationHelpButton.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/NavigationHelpButton.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
