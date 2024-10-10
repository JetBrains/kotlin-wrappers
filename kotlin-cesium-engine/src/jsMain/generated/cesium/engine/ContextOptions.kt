// Automatically generated - do not modify!

package cesium.engine

import kotlinx.js.JsPlainObject

/**
 * Options to control the setting up of a WebGL Context.
 *
 * `allowTextureFilterAnisotropic` defaults to true, which enables
 * anisotropic texture filtering when the WebGL extension is supported.
 * Setting this to false will improve performance, but hurt visual quality,
 * especially for horizon views.
 * @property [requestWebgl1] If true and the browser supports it, use a WebGL 1 rendering context
 *   Default value - `false`
 * @property [allowTextureFilterAnisotropic] If true, use anisotropic filtering during texture sampling
 *   Default value - `true`
 * @property [webgl] WebGL options to be passed on to canvas.getContext
 * @property [getWebGLStub] A function to create a WebGL stub for testing
 */
@JsPlainObject
external interface ContextOptions {
    val requestWebgl1: Boolean?
    val allowTextureFilterAnisotropic: Boolean?
    val webgl: WebGLOptions?
    val getWebGLStub: Function<*>?
}
