// Automatically generated - do not modify!

package web.gl

import js.reflect.unsafeCast
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContext
import web.rendering.RenderingContextId

/**
 * The **`WebGLRenderingContext`** interface provides an interface to the OpenGL ES 2.0 graphics rendering context for the drawing surface of an HTML <canvas> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext)
 */
open external class WebGLRenderingContext
private constructor() :
    WebGLRenderingContextBase,
    WebGLRenderingContextOverloads,
    OffscreenRenderingContext,
    RenderingContext {
    companion object
}

inline val WebGLRenderingContext.Companion.ID: RenderingContextId<WebGLRenderingContext, WebGLContextAttributes>
    get() = unsafeCast("webgl")
