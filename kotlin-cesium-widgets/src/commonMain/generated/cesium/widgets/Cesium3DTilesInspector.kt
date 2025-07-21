// Automatically generated - do not modify!

@file:JsModule("@cesium/widgets")

package cesium.widgets

import cesium.engine.Scene
import web.dom.Element

/**
 * Inspector widget to aid in debugging 3D Tiles
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspector.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The DOM element that will contain the widget.
 * @param [scene] the Scene instance to use.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspector.html">Online Documentation</a>
 */
external class Cesium3DTilesInspector(
    var container: Element,
    scene: Scene,
) {
    /**
     * Gets the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspector.html#viewModel">Online Documentation</a>
     */
    var viewModel: Cesium3DTilesInspectorViewModel

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspector.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesInspector.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
