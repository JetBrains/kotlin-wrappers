// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

/**
 * A Knockout binding handler that creates a DOM element for a single SVG path.
 * This binding handler will be registered as cesiumSvgPath.
 *
 * The parameter to this binding is an object with the following properties:
 *
 * - path: The SVG path as a string.
 * - width: The width of the SVG path with no transformations applied.
 * - height: The height of the SVG path with no transformations applied.
 * - css: Optional. A string containing additional CSS classes to apply to the SVG. 'cesium-svgPath-svg' is always applied.
 * ```
 * // Create an SVG as a child of a div
 * <div data-bind="cesiumSvgPath: { path: 'M 100 100 L 300 100 L 200 300 z', width: 28, height: 28 }"></div>
 *
 * // parameters can be observable from the view model
 * <div data-bind="cesiumSvgPath: { path: currentPath, width: currentWidth, height: currentHeight }"></div>
 *
 * // or the whole object can be observable from the view model
 * <div data-bind="cesiumSvgPath: svgPathOptions"></div>
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/SvgPathBindingHandler.html">Online Documentation</a>
 */
external object SvgPathBindingHandler {
    fun register()
}
