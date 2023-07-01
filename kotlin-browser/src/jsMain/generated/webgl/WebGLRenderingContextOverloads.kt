// Automatically generated - do not modify!

package webgl

import js.buffer.AllowSharedBufferSource
import js.buffer.ArrayBufferView

sealed external interface WebGLRenderingContextOverloads {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bufferData) */
    fun bufferData(
        target: GLenum,
        size: GLsizeiptr,
        usage: GLenum,
    )

    fun bufferData(
        target: GLenum,
        data: AllowSharedBufferSource?,
        usage: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bufferSubData) */
    fun bufferSubData(
        target: GLenum,
        offset: GLintptr,
        data: AllowSharedBufferSource,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compressedTexImage2D) */
    fun compressedTexImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        data: ArrayBufferView,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D) */
    fun compressedTexSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        data: ArrayBufferView,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/readPixels) */
    fun readPixels(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        pixels: ArrayBufferView?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texImage2D) */
    fun texImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLint,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        pixels: ArrayBufferView?,
    )

    fun texImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLint,
        format: GLenum,
        type: GLenum,
        source: TexImageSource,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texSubImage2D) */
    fun texSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        pixels: ArrayBufferView?,
    )

    fun texSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        format: GLenum,
        type: GLenum,
        source: TexImageSource,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform1fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform1iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform2fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform2iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform3fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform3iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform4fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform4iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix) */
    fun uniformMatrix2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        value: Float32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix) */
    fun uniformMatrix3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        value: Float32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix) */
    fun uniformMatrix4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        value: Float32List,
    )
}
