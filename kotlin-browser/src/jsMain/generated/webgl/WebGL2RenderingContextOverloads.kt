// Automatically generated - do not modify!

package webgl

import js.buffer.ArrayBufferView
import js.buffer.BufferSource

sealed external interface WebGL2RenderingContextOverloads {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bufferData) */
    fun bufferData(
        target: GLenum,
        size: GLsizeiptr,
        usage: GLenum,
    )

    fun bufferData(
        target: GLenum,
        srcData: BufferSource?,
        usage: GLenum,
    )

    fun bufferData(
        target: GLenum,
        srcData: ArrayBufferView,
        usage: GLenum,
        srcOffset: GLuint,
        length: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bufferSubData) */
    fun bufferSubData(
        target: GLenum,
        dstByteOffset: GLintptr,
        srcData: BufferSource,
    )

    fun bufferSubData(
        target: GLenum,
        dstByteOffset: GLintptr,
        srcData: ArrayBufferView,
        srcOffset: GLuint,
        length: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compressedTexImage2D) */
    fun compressedTexImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        imageSize: GLsizei,
        offset: GLintptr,
    )

    fun compressedTexImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        srcData: ArrayBufferView,
        srcOffset: GLuint?,
        srcLengthOverride: GLuint?,
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
        imageSize: GLsizei,
        offset: GLintptr,
    )

    fun compressedTexSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        srcData: ArrayBufferView,
        srcOffset: GLuint?,
        srcLengthOverride: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/readPixels) */
    fun readPixels(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        dstData: ArrayBufferView?,
    )

    fun readPixels(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        offset: GLintptr,
    )

    fun readPixels(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        dstData: ArrayBufferView,
        dstOffset: GLuint,
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

    fun texImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLint,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        pboOffset: GLintptr,
    )

    fun texImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLint,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        source: TexImageSource,
    )

    fun texImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLint,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        srcData: ArrayBufferView,
        srcOffset: GLuint,
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

    fun texSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        pboOffset: GLintptr,
    )

    fun texSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        source: TexImageSource,
    )

    fun texSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        srcData: ArrayBufferView,
        srcOffset: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform1fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform1iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform2fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform2iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform3fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform3iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform4fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform4iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix) */
    fun uniformMatrix2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix) */
    fun uniformMatrix3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix) */
    fun uniformMatrix4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )
}
