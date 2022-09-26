// Automatically generated - do not modify!

package webgl

import kotlinx.js.ArrayBufferView
import kotlinx.js.BufferSource

sealed external interface WebGL2RenderingContextOverloads {
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

    fun uniform1fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniform1iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniform2fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniform2iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniform3fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniform3iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniform4fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniform4iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniformMatrix2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniformMatrix3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniformMatrix4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )
}
