// Automatically generated - do not modify!

package web.gl

import js.buffer.ArrayBufferLike
import js.core.UInt53
import js.typedarrays.Int32Array

/**
 * The **`WEBGL_multi_draw`** extension is part of the WebGL API and allows to render more than one primitive with a single function call. This can improve a WebGL application's performance as it reduces binding costs in the renderer and speeds up GPU thread time with uniform data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw)
 */
external interface WEBGL_multi_draw {
    /**
     * The **`WEBGL_multi_draw.multiDrawArraysInstancedWEBGL()`** method of the WebGL API renders multiple primitives from array data. It is identical to multiple calls to the gl.drawArraysInstanced() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawArraysInstancedWEBGL)
     */
    fun multiDrawArraysInstancedWEBGL(
        mode: GLenum,
        firstsList: Int32Array<ArrayBufferLike>, /* | GLint[] */
        firstsOffset: UInt53,
        countsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        countsOffset: UInt53,
        instanceCountsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        instanceCountsOffset: UInt53,
        drawcount: GLsizei,
    )

    /**
     * The **`WEBGL_multi_draw.multiDrawArraysWEBGL()`** method of the WebGL API renders multiple primitives from array data. It is identical to multiple calls to the gl.drawArrays() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawArraysWEBGL)
     */
    fun multiDrawArraysWEBGL(
        mode: GLenum,
        firstsList: Int32Array<ArrayBufferLike>, /* | GLint[] */
        firstsOffset: UInt53,
        countsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        countsOffset: UInt53,
        drawcount: GLsizei,
    )

    /**
     * The **`WEBGL_multi_draw.multiDrawElementsInstancedWEBGL()`** method of the WebGL API renders multiple primitives from array data. It is identical to multiple calls to the gl.drawElementsInstanced() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawElementsInstancedWEBGL)
     */
    fun multiDrawElementsInstancedWEBGL(
        mode: GLenum,
        countsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        countsOffset: UInt53,
        type: GLenum,
        offsetsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        offsetsOffset: UInt53,
        instanceCountsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        instanceCountsOffset: UInt53,
        drawcount: GLsizei,
    )

    /**
     * The **`WEBGL_multi_draw.multiDrawElementsWEBGL()`** method of the WebGL API renders multiple primitives from array data. It is identical to multiple calls to the gl.drawElements() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WEBGL_multi_draw/multiDrawElementsWEBGL)
     */
    fun multiDrawElementsWEBGL(
        mode: GLenum,
        countsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        countsOffset: UInt53,
        type: GLenum,
        offsetsList: Int32Array<ArrayBufferLike>, /* | GLsizei[] */
        offsetsOffset: UInt53,
        drawcount: GLsizei,
    )
}
