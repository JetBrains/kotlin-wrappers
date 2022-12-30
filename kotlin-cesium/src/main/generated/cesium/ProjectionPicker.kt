// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import web.dom.Element

/**
 * The ProjectionPicker is a single button widget for switching between perspective and orthographic projections.
 * ```
 * // In HTML head, include a link to the ProjectionPicker.css stylesheet,
 * // and in the body, include: <div id="projectionPickerContainer"></div>
 * // Note: This code assumes you already have a Scene instance.
 *
 * const projectionPicker = new ProjectionPicker('projectionPickerContainer', scene);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPicker.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The DOM element that will contain the widget.
 * @param [scene] The Scene instance to use.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPicker.html">Online Documentation</a>
 */
external class ProjectionPicker(
    var container: Element,
    scene: Scene,
) {
    /**
     * Gets the view model.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPicker.html#viewModel">Online Documentation</a>
     */
    var viewModel: ProjectionPickerViewModel

    /**
     * @return true if the object has been destroyed, false otherwise.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPicker.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    /**
     * Destroys the widget.  Should be called if permanently
     * removing the widget from layout.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ProjectionPicker.html#destroy">Online Documentation</a>
     */
    fun destroy()
}
