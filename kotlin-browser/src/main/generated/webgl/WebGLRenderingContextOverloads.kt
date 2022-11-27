// Automatically generated - do not modify!

package webgl

import js.buffer.ArrayBufferView
import js.buffer.BufferSource

sealed external interface WebGLRenderingContextOverloads {
    fun bufferData(
        target: GLenum,
        size: GLsizeiptr,
        usage: GLenum,
    )

    fun bufferData(
        target: GLenum,
        data: BufferSource?,
        usage: GLenum,
    )

    fun bufferSubData(
        target: GLenum,
        offset: GLintptr,
        data: BufferSource,
    )

    fun compressedTexImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        data: ArrayBufferView,
    )

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

    fun readPixels(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        pixels: ArrayBufferView?,
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

    fun uniform1fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    fun uniform1iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    fun uniform2fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    fun uniform2iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    fun uniform3fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    fun uniform3iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    fun uniform4fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    fun uniform4iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    fun uniformMatrix2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        value: Float32List,
    )

    fun uniformMatrix3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        value: Float32List,
    )

    fun uniformMatrix4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        value: Float32List,
    )
}
