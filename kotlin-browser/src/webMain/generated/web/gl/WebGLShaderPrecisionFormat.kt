// Automatically generated - do not modify!

package web.gl

/**
 * The **`WebGLShaderPrecisionFormat`** interface is part of the WebGL API and represents the information returned by calling the WebGLRenderingContext.getShaderPrecisionFormat() method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLShaderPrecisionFormat)
 */
open external class WebGLShaderPrecisionFormat
private constructor() {
    /**
     * The read-only **`WebGLShaderPrecisionFormat.precision`** property returns the number of bits of precision that can be represented.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLShaderPrecisionFormat/precision)
     */
    open val precision: GLint

    /**
     * The read-only **`WebGLShaderPrecisionFormat.rangeMax`** property returns the base 2 log of the absolute value of the maximum value that can be represented.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLShaderPrecisionFormat/rangeMax)
     */
    open val rangeMax: GLint

    /**
     * The read-only **`WebGLShaderPrecisionFormat.rangeMin`** property returns the base 2 log of the absolute value of the minimum value that can be represented.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLShaderPrecisionFormat/rangeMin)
     */
    open val rangeMin: GLint
}
