// Automatically generated - do not modify!

package web.gl

import js.buffer.ArrayBufferLike
import js.typedarrays.Int32Array

sealed external interface WEBGL_multi_draw {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawArraysInstancedWEBGL)
     */
    fun multiDrawArraysInstancedWEBGL(
        mode: GLenum,
        firstsList: Int32Array<ArrayBufferLike>, /* | GLint[] */
        firstsOffset: Int, /* GLuint */
        countsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        countsOffset: Int, /* GLuint */
        instanceCountsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        instanceCountsOffset: Int, /* GLuint */
        drawcount: GLsizei,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawArraysWEBGL)
     */
    fun multiDrawArraysWEBGL(
        mode: GLenum,
        firstsList: Int32Array<ArrayBufferLike>, /* | GLint[] */
        firstsOffset: Int, /* GLuint */
        countsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        countsOffset: Int, /* GLuint */
        drawcount: GLsizei,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawElementsInstancedWEBGL)
     */
    fun multiDrawElementsInstancedWEBGL(
        mode: GLenum,
        countsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        countsOffset: Int, /* GLuint */
        type: GLenum,
        offsetsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        offsetsOffset: Int, /* GLuint */
        instanceCountsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        instanceCountsOffset: Int, /* GLuint */
        drawcount: GLsizei,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawElementsWEBGL)
     */
    fun multiDrawElementsWEBGL(
        mode: GLenum,
        countsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        countsOffset: Int, /* GLuint */
        type: GLenum,
        offsetsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        offsetsOffset: Int, /* GLuint */
        drawcount: GLsizei,
    )
}
