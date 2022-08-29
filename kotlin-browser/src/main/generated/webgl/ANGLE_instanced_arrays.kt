// Automatically generated - do not modify!

package webgl

sealed external interface ANGLE_instanced_arrays {
    fun drawArraysInstancedANGLE(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
        primcount: GLsizei,
    )

    fun drawElementsInstancedANGLE(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
        primcount: GLsizei,
    )

    fun vertexAttribDivisorANGLE(
        index: GLuint,
        divisor: GLuint,
    )

    val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum
}
