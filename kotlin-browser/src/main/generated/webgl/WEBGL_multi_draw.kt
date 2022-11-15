// Automatically generated - do not modify!

package webgl

import kotlinx.js.Int32Array

sealed external interface WEBGL_multi_draw {
    fun multiDrawArraysInstancedWEBGL(
        mode: GLenum,
        firstsList: Int32Array, /*  | GLint[] */
        firstsOffset: GLuint,
        countsList: Int32Array, /*  | GLsizei[] */
        countsOffset: GLuint,
        instanceCountsList: Int32Array, /*  | GLsizei[] */
        instanceCountsOffset: GLuint,
        drawcount: GLsizei,
    )

    fun multiDrawArraysWEBGL(
        mode: GLenum,
        firstsList: Int32Array, /*  | GLint[] */
        firstsOffset: GLuint,
        countsList: Int32Array, /*  | GLsizei[] */
        countsOffset: GLuint,
        drawcount: GLsizei,
    )

    fun multiDrawElementsInstancedWEBGL(
        mode: GLenum,
        countsList: Int32Array, /*  | GLsizei[] */
        countsOffset: GLuint,
        type: GLenum,
        offsetsList: Int32Array, /*  | GLsizei[] */
        offsetsOffset: GLuint,
        instanceCountsList: Int32Array, /*  | GLsizei[] */
        instanceCountsOffset: GLuint,
        drawcount: GLsizei,
    )

    fun multiDrawElementsWEBGL(
        mode: GLenum,
        countsList: Int32Array, /*  | GLsizei[] */
        countsOffset: GLuint,
        type: GLenum,
        offsetsList: Int32Array, /*  | GLsizei[] */
        offsetsOffset: GLuint,
        drawcount: GLsizei,
    )
}
