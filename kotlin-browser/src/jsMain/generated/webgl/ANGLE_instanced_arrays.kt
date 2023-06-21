// Automatically generated - do not modify!

package webgl

sealed external interface ANGLE_instanced_arrays {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ANGLE_instanced_arrays/drawArraysInstancedANGLE) */
    fun drawArraysInstancedANGLE(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
        primcount: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ANGLE_instanced_arrays/drawElementsInstancedANGLE) */
    fun drawElementsInstancedANGLE(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
        primcount: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ANGLE_instanced_arrays/vertexAttribDivisorANGLE) */
    fun vertexAttribDivisorANGLE(
        index: GLuint,
        divisor: GLuint,
    )

    val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum
}
