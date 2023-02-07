// Automatically generated - do not modify!

package cesium

/**
 * WebGL options to be passed on to HTMLCanvasElement.getContext().
 * See [WebGLContextAttributes](https://registry.khronos.org/webgl/specs/latest/1.0/#5.2)
 * but note the modified defaults for 'alpha', 'stencil', and 'powerPreference'
 *
 * `alpha` defaults to false, which can improve performance
 * compared to the standard WebGL default of true.  If an application needs
 * to composite Cesium above other HTML elements using alpha-blending, set
 * `alpha` to true.
 */
external interface WebGLOptions {
    var alpha: Boolean?
    var depth: Boolean?
    var stencil: Boolean?
    var antialias: Boolean?
    var premultipliedAlpha: Boolean?
    var preserveDrawingBuffer: Boolean?
    var powerPreference: dynamic
    var failIfMajorPerformanceCaveat: Boolean?
}
