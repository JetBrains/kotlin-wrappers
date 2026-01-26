// Automatically generated - do not modify!

package web.gl

/**
 * The **`ANGLE_instanced_arrays`** extension is part of the WebGL API and allows to draw the same object, or groups of similar objects multiple times, if they share the same vertex data, primitive count and type.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ANGLE_instanced_arrays)
 */
external interface ANGLE_instanced_arrays {
    /**
     * The **`ANGLE_instanced_arrays.drawArraysInstancedANGLE()`** method of the WebGL API renders primitives from array data like the gl.drawArrays() method. In addition, it can execute multiple instances of the range of elements.
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
     * The **`ANGLE_instanced_arrays.drawElementsInstancedANGLE()`** method of the WebGL API renders primitives from array data like the gl.drawElements() method. In addition, it can execute multiple instances of a set of elements.
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
     * The **`ANGLE_instanced_arrays.vertexAttribDivisorANGLE()`** method of the WebGL API modifies the rate at which generic vertex attributes advance when rendering multiple instances of primitives with ext.drawArraysInstancedANGLE() and ext.drawElementsInstancedANGLE().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ANGLE_instanced_arrays/vertexAttribDivisorANGLE)
     */
    fun vertexAttribDivisorANGLE(
        index: GLuint,
        divisor: GLuint,
    )

    val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum
}
