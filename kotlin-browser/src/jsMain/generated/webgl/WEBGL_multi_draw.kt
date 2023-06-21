// Automatically generated - do not modify!

package webgl

import js.typedarrays.Int32Array

sealed external interface WEBGL_multi_draw {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawArraysInstancedWEBGL) */
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

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawArraysWEBGL) */
    fun multiDrawArraysWEBGL(
        mode: GLenum,
        firstsList: Int32Array, /*  | GLint[] */
        firstsOffset: GLuint,
        countsList: Int32Array, /*  | GLsizei[] */
        countsOffset: GLuint,
        drawcount: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawElementsInstancedWEBGL) */
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

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawElementsWEBGL) */
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
