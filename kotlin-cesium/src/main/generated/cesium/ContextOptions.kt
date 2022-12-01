// Automatically generated - do not modify!

package cesium

/**
 * Options to control the setting up of a WebGL Context.
 *
 * `allowTextureFilterAnisotropic` defaults to true, which enables
 * anisotropic texture filtering when the WebGL extension is supported.
 * Setting this to false will improve performance, but hurt visual quality,
 * especially for horizon views.
 * @property [requestWebGl2] If true and the browser supports it, use a WebGL 2 rendering context
 *   Default value - `false`
 * @property [allowTextureFilterAnisotropic] If true, use anisotropic filtering during texture sampling
 *   Default value - `true`
 * @property [webgl] WebGL options to be passed on to canvas.getContext
 * @property [getWebGLStub] A function to create a WebGL stub for testing
 */
external interface ContextOptions {
    var requestWebGl2: Boolean?
    var allowTextureFilterAnisotropic: Boolean?
    var webgl: WebGLOptions?
    var getWebGLStub: Function<*>?
}
