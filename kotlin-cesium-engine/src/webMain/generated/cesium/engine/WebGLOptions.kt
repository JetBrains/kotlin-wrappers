// Automatically generated - do not modify!

package cesium.engine

import kotlinx.js.JsPlainObject
import web.gl.WebGLPowerPreference

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
@JsPlainObject
external interface WebGLOptions {
    val alpha: Boolean?
    val depth: Boolean?
    val stencil: Boolean?
    val antialias: Boolean?
    val premultipliedAlpha: Boolean?
    val preserveDrawingBuffer: Boolean?
    val powerPreference: WebGLPowerPreference?
    val failIfMajorPerformanceCaveat: Boolean?
}
