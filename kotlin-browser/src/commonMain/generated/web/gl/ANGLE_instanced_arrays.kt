// Automatically generated - do not modify!

package web.gl

sealed external interface ANGLE_instanced_arrays {
    /**
     * The **`ANGLE_instanced_arrays.drawArraysInstancedANGLE()`** method of the WebGL API renders primitives from array data like the WebGLRenderingContext.drawArrays() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ANGLE_instanced_arrays/drawArraysInstancedANGLE)
     */
    fun drawArraysInstancedANGLE(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
        primcount: GLsizei,
    )

    /**
     * The **`ANGLE_instanced_arrays.drawElementsInstancedANGLE()`** method of the WebGL API renders primitives from array data like the WebGLRenderingContext.drawElements() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ANGLE_instanced_arrays/drawElementsInstancedANGLE)
     */
    fun drawElementsInstancedANGLE(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
        primcount: GLsizei,
    )

    /**
     * The **ANGLE_instanced_arrays.vertexAttribDivisorANGLE()** method of the WebGL API modifies the rate at which generic vertex attributes advance when rendering multiple instances of primitives with ANGLE_instanced_arrays.drawArraysInstancedANGLE() and ANGLE_instanced_arrays.drawElementsInstancedANGLE().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ANGLE_instanced_arrays/vertexAttribDivisorANGLE)
     */
    fun vertexAttribDivisorANGLE(
        index: GLuint,
        divisor: GLuint,
    )

    val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum
}
