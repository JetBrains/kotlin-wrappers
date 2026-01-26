// Automatically generated - do not modify!

package web.gl

/**
 * The **`WEBGL_debug_shaders`** extension is part of the WebGL API and exposes a method to debug shaders from privileged contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_debug_shaders)
 */
external interface WEBGL_debug_shaders {
    /**
     * The **`WEBGL_debug_shaders.getTranslatedShaderSource()`** method is part of the WebGL API and allows you to debug a translated shader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_debug_shaders/getTranslatedShaderSource)
     */
    fun getTranslatedShaderSource(shader: WebGLShader): String
}
