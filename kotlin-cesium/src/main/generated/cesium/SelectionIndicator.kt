// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import web.dom.Element

/**
 * A widget for displaying an indicator on a selected object.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicator.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The DOM element that will contain the widget.
 * @param [scene] The Scene instance to use.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicator.html">Online Documentation</a>
 */
external class SelectionIndicator(
    var container: Element,
    scene: Scene,
) {
    /**
     * Gets the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicator.html#viewModel">Online Documentation</a>
     */
    var viewModel: SelectionIndicatorViewModel

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicator.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SelectionIndicator.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
