// Automatically generated - do not modify!

package web.gl

import js.reflect.unsafeCast
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContext
import web.rendering.RenderingContextId

/**
 * The **`WebGL2RenderingContext`** interface provides the OpenGL ES 3.0 rendering context for the drawing surface of an HTML <canvas> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext)
 */
open external class WebGL2RenderingContext
private constructor() :
    WebGL2RenderingContextBase,
    WebGL2RenderingContextOverloads,
    WebGLRenderingContextBase,
    OffscreenRenderingContext,
    RenderingContext {
    companion object
}

inline val WebGL2RenderingContext.Companion.ID: RenderingContextId<WebGL2RenderingContext, WebGLContextAttributes>
    get() = unsafeCast("webgl2")
