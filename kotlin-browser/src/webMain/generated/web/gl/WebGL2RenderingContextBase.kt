// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.gl

import js.array.ReadonlyArray
import js.buffer.ArrayBufferLike
import js.buffer.ArrayBufferView
import js.core.UInt53
import js.internal.InternalApi
import kotlin.js.JsAny
import kotlin.js.JsString
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface WebGL2RenderingContextBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/beginQuery)
     */
    fun beginQuery(
        target: GLenum,
        query: WebGLQuery,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/beginTransformFeedback)
     */
    fun beginTransformFeedback(primitiveMode: GLenum): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindBufferBase)
     */
    fun bindBufferBase(
        target: GLenum,
        index: GLuint,
        buffer: WebGLBuffer?,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindBufferRange)
     */
    fun bindBufferRange(
        target: GLenum,
        index: GLuint,
        buffer: WebGLBuffer?,
        offset: GLintptr,
        size: GLsizeiptr,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindSampler)
     */
    fun bindSampler(
        unit: GLuint,
        sampler: WebGLSampler?,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindTransformFeedback)
     */
    fun bindTransformFeedback(
        target: GLenum,
        tf: WebGLTransformFeedback?,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindVertexArray)
     */
    fun bindVertexArray(array: WebGLVertexArrayObject?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/blitFramebuffer)
     */
    fun blitFramebuffer(
        srcX0: GLint,
        srcY0: GLint,
        srcX1: GLint,
        srcY1: GLint,
        dstX0: GLint,
        dstY0: GLint,
        dstX1: GLint,
        dstY1: GLint,
        mask: GLbitfield,
        filter: GLenum,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer)
     */
    fun clearBufferfi(
        buffer: GLenum,
        drawbuffer: GLint,
        depth: GLfloat,
        stencil: GLint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer)
     */
    fun clearBufferfv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Float32List,
        srcOffset: UInt53 = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer)
     */
    fun clearBufferiv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Int32List,
        srcOffset: UInt53 = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer)
     */
    fun clearBufferuiv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Uint32List,
        srcOffset: UInt53 = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clientWaitSync)
     */
    fun clientWaitSync(
        sync: WebGLSync,
        flags: GLbitfield,
        timeout: GLuint64,
    ): GLenum = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/compressedTexImage3D)
     */
    fun compressedTexImage3D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        border: GLint,
        imageSize: GLsizei,
        offset: GLintptr,
    ): Unit = definedExternally

    fun compressedTexImage3D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        border: GLint,
        srcData: ArrayBufferView<ArrayBufferLike>,
        srcOffset: UInt53 = definedExternally,
        srcLengthOverride: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D)
     */
    fun compressedTexSubImage3D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        zoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        format: GLenum,
        imageSize: GLsizei,
        offset: GLintptr,
    ): Unit = definedExternally

    fun compressedTexSubImage3D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        zoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        format: GLenum,
        srcData: ArrayBufferView<ArrayBufferLike>,
        srcOffset: UInt53 = definedExternally,
        srcLengthOverride: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/copyBufferSubData)
     */
    fun copyBufferSubData(
        readTarget: GLenum,
        writeTarget: GLenum,
        readOffset: GLintptr,
        writeOffset: GLintptr,
        size: GLsizeiptr,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/copyTexSubImage3D)
     */
    fun copyTexSubImage3D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        zoffset: GLint,
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createQuery)
     */
    fun createQuery(): WebGLQuery = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createSampler)
     */
    fun createSampler(): WebGLSampler = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createTransformFeedback)
     */
    fun createTransformFeedback(): WebGLTransformFeedback = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createVertexArray)
     */
    fun createVertexArray(): WebGLVertexArrayObject = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteQuery)
     */
    fun deleteQuery(query: WebGLQuery?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteSampler)
     */
    fun deleteSampler(sampler: WebGLSampler?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteSync)
     */
    fun deleteSync(sync: WebGLSync?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteTransformFeedback)
     */
    fun deleteTransformFeedback(tf: WebGLTransformFeedback?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteVertexArray)
     */
    fun deleteVertexArray(vertexArray: WebGLVertexArrayObject?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawArraysInstanced)
     */
    fun drawArraysInstanced(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
        instanceCount: GLsizei,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawBuffers)
     */
    fun drawBuffers(buffers: ReadonlyArray<GLenum>): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawElementsInstanced)
     */
    fun drawElementsInstanced(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
        instanceCount: GLsizei,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawRangeElements)
     */
    fun drawRangeElements(
        mode: GLenum,
        start: GLuint,
        end: GLuint,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/endQuery)
     */
    fun endQuery(target: GLenum): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/endTransformFeedback)
     */
    fun endTransformFeedback(): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/fenceSync)
     */
    fun fenceSync(
        condition: GLenum,
        flags: GLbitfield,
    ): WebGLSync? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/framebufferTextureLayer)
     */
    fun framebufferTextureLayer(
        target: GLenum,
        attachment: GLenum,
        texture: WebGLTexture?,
        level: GLint,
        layer: GLint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getActiveUniformBlockName)
     */
    fun getActiveUniformBlockName(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
    ): String? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getActiveUniformBlockParameter)
     */
    fun getActiveUniformBlockParameter(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getActiveUniforms)
     */
    fun getActiveUniforms(
        program: WebGLProgram,
        uniformIndices: ReadonlyArray<GLuint>,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getBufferSubData)
     */
    fun getBufferSubData(
        target: GLenum,
        srcByteOffset: GLintptr,
        dstBuffer: ArrayBufferView<ArrayBufferLike>,
        dstOffset: UInt53 = definedExternally,
        length: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getFragDataLocation)
     */
    fun getFragDataLocation(
        program: WebGLProgram,
        name: String,
    ): GLint = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getIndexedParameter)
     */
    fun getIndexedParameter(
        target: GLenum,
        index: GLuint,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getInternalformatParameter)
     */
    fun getInternalformatParameter(
        target: GLenum,
        internalformat: GLenum,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getQuery)
     */
    fun getQuery(
        target: GLenum,
        pname: GLenum,
    ): WebGLQuery? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getQueryParameter)
     */
    fun getQueryParameter(
        query: WebGLQuery,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getSamplerParameter)
     */
    fun getSamplerParameter(
        sampler: WebGLSampler,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getSyncParameter)
     */
    fun getSyncParameter(
        sync: WebGLSync,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getTransformFeedbackVarying)
     */
    fun getTransformFeedbackVarying(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getUniformBlockIndex)
     */
    fun getUniformBlockIndex(
        program: WebGLProgram,
        uniformBlockName: String,
    ): GLuint = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getUniformIndices)
     */
    fun getUniformIndices(
        program: WebGLProgram,
        uniformNames: ReadonlyArray<JsString>,
    ): ReadonlyArray<GLuint>? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/invalidateFramebuffer)
     */
    fun invalidateFramebuffer(
        target: GLenum,
        attachments: ReadonlyArray<GLenum>,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/invalidateSubFramebuffer)
     */
    fun invalidateSubFramebuffer(
        target: GLenum,
        attachments: ReadonlyArray<GLenum>,
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isQuery)
     */
    fun isQuery(query: WebGLQuery?): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isSampler)
     */
    fun isSampler(sampler: WebGLSampler?): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isSync)
     */
    fun isSync(sync: WebGLSync?): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isTransformFeedback)
     */
    fun isTransformFeedback(tf: WebGLTransformFeedback?): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isVertexArray)
     */
    fun isVertexArray(vertexArray: WebGLVertexArrayObject?): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/pauseTransformFeedback)
     */
    fun pauseTransformFeedback(): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/readBuffer)
     */
    fun readBuffer(src: GLenum): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/renderbufferStorageMultisample)
     */
    fun renderbufferStorageMultisample(
        target: GLenum,
        samples: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/resumeTransformFeedback)
     */
    fun resumeTransformFeedback(): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/samplerParameter)
     */
    fun samplerParameterf(
        sampler: WebGLSampler,
        pname: GLenum,
        param: GLfloat,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/samplerParameter)
     */
    fun samplerParameteri(
        sampler: WebGLSampler,
        pname: GLenum,
        param: GLint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/texImage3D)
     */
    fun texImage3D(
        target: GLenum,
        level: GLint,
        internalformat: GLint,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        pboOffset: GLintptr,
    ): Unit = definedExternally

    fun texImage3D(
        target: GLenum,
        level: GLint,
        internalformat: GLint,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        source: TexImageSource,
    ): Unit = definedExternally

    fun texImage3D(
        target: GLenum,
        level: GLint,
        internalformat: GLint,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        srcData: ArrayBufferView<ArrayBufferLike>?,
    ): Unit = definedExternally

    fun texImage3D(
        target: GLenum,
        level: GLint,
        internalformat: GLint,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        srcData: ArrayBufferView<ArrayBufferLike>,
        srcOffset: UInt53,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/texStorage2D)
     */
    fun texStorage2D(
        target: GLenum,
        levels: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/texStorage3D)
     */
    fun texStorage3D(
        target: GLenum,
        levels: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/texSubImage3D)
     */
    fun texSubImage3D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        zoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        format: GLenum,
        type: GLenum,
        pboOffset: GLintptr,
    ): Unit = definedExternally

    fun texSubImage3D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        zoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        format: GLenum,
        type: GLenum,
        source: TexImageSource,
    ): Unit = definedExternally

    fun texSubImage3D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        zoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        format: GLenum,
        type: GLenum,
        srcData: ArrayBufferView<ArrayBufferLike>?,
        srcOffset: UInt53 = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings)
     */
    fun transformFeedbackVaryings(
        program: WebGLProgram,
        varyings: ReadonlyArray<JsString>,
        bufferMode: GLenum,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform1ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform1uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform2ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform2uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform3ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
        v2: GLuint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform3uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform4ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
        v2: GLuint,
        v3: GLuint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform4uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformBlockBinding)
     */
    fun uniformBlockBinding(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
        uniformBlockBinding: GLuint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix2x3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix2x4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix3x2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix3x4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix4x2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix4x3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribDivisor)
     */
    fun vertexAttribDivisor(
        index: GLuint,
        divisor: GLuint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI)
     */
    fun vertexAttribI4i(
        index: GLuint,
        x: GLint,
        y: GLint,
        z: GLint,
        w: GLint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI)
     */
    fun vertexAttribI4iv(
        index: GLuint,
        values: Int32List,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI)
     */
    fun vertexAttribI4ui(
        index: GLuint,
        x: GLuint,
        y: GLuint,
        z: GLuint,
        w: GLuint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI)
     */
    fun vertexAttribI4uiv(
        index: GLuint,
        values: Uint32List,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribIPointer)
     */
    fun vertexAttribIPointer(
        index: GLuint,
        size: GLint,
        type: GLenum,
        stride: GLsizei,
        offset: GLintptr,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/waitSync)
     */
    fun waitSync(
        sync: WebGLSync,
        flags: GLbitfield,
        timeout: GLint64,
    ): Unit = definedExternally

    val READ_BUFFER: GLenum
        get() = definedExternally
    val UNPACK_ROW_LENGTH: GLenum
        get() = definedExternally
    val UNPACK_SKIP_ROWS: GLenum
        get() = definedExternally
    val UNPACK_SKIP_PIXELS: GLenum
        get() = definedExternally
    val PACK_ROW_LENGTH: GLenum
        get() = definedExternally
    val PACK_SKIP_ROWS: GLenum
        get() = definedExternally
    val PACK_SKIP_PIXELS: GLenum
        get() = definedExternally
    val COLOR: GLenum
        get() = definedExternally
    val DEPTH: GLenum
        get() = definedExternally
    val STENCIL: GLenum
        get() = definedExternally
    val RED: GLenum
        get() = definedExternally
    val RGB8: GLenum
        get() = definedExternally
    val RGB10_A2: GLenum
        get() = definedExternally
    val TEXTURE_BINDING_3D: GLenum
        get() = definedExternally
    val UNPACK_SKIP_IMAGES: GLenum
        get() = definedExternally
    val UNPACK_IMAGE_HEIGHT: GLenum
        get() = definedExternally
    val TEXTURE_3D: GLenum
        get() = definedExternally
    val TEXTURE_WRAP_R: GLenum
        get() = definedExternally
    val MAX_3D_TEXTURE_SIZE: GLenum
        get() = definedExternally
    val UNSIGNED_INT_2_10_10_10_REV: GLenum
        get() = definedExternally
    val MAX_ELEMENTS_VERTICES: GLenum
        get() = definedExternally
    val MAX_ELEMENTS_INDICES: GLenum
        get() = definedExternally
    val TEXTURE_MIN_LOD: GLenum
        get() = definedExternally
    val TEXTURE_MAX_LOD: GLenum
        get() = definedExternally
    val TEXTURE_BASE_LEVEL: GLenum
        get() = definedExternally
    val TEXTURE_MAX_LEVEL: GLenum
        get() = definedExternally
    val MIN: GLenum
        get() = definedExternally
    val MAX: GLenum
        get() = definedExternally
    val DEPTH_COMPONENT24: GLenum
        get() = definedExternally
    val MAX_TEXTURE_LOD_BIAS: GLenum
        get() = definedExternally
    val TEXTURE_COMPARE_MODE: GLenum
        get() = definedExternally
    val TEXTURE_COMPARE_FUNC: GLenum
        get() = definedExternally
    val CURRENT_QUERY: GLenum
        get() = definedExternally
    val QUERY_RESULT: GLenum
        get() = definedExternally
    val QUERY_RESULT_AVAILABLE: GLenum
        get() = definedExternally
    val STREAM_READ: GLenum
        get() = definedExternally
    val STREAM_COPY: GLenum
        get() = definedExternally
    val STATIC_READ: GLenum
        get() = definedExternally
    val STATIC_COPY: GLenum
        get() = definedExternally
    val DYNAMIC_READ: GLenum
        get() = definedExternally
    val DYNAMIC_COPY: GLenum
        get() = definedExternally
    val MAX_DRAW_BUFFERS: GLenum
        get() = definedExternally
    val DRAW_BUFFER0: GLenum
        get() = definedExternally
    val DRAW_BUFFER1: GLenum
        get() = definedExternally
    val DRAW_BUFFER2: GLenum
        get() = definedExternally
    val DRAW_BUFFER3: GLenum
        get() = definedExternally
    val DRAW_BUFFER4: GLenum
        get() = definedExternally
    val DRAW_BUFFER5: GLenum
        get() = definedExternally
    val DRAW_BUFFER6: GLenum
        get() = definedExternally
    val DRAW_BUFFER7: GLenum
        get() = definedExternally
    val DRAW_BUFFER8: GLenum
        get() = definedExternally
    val DRAW_BUFFER9: GLenum
        get() = definedExternally
    val DRAW_BUFFER10: GLenum
        get() = definedExternally
    val DRAW_BUFFER11: GLenum
        get() = definedExternally
    val DRAW_BUFFER12: GLenum
        get() = definedExternally
    val DRAW_BUFFER13: GLenum
        get() = definedExternally
    val DRAW_BUFFER14: GLenum
        get() = definedExternally
    val DRAW_BUFFER15: GLenum
        get() = definedExternally
    val MAX_FRAGMENT_UNIFORM_COMPONENTS: GLenum
        get() = definedExternally
    val MAX_VERTEX_UNIFORM_COMPONENTS: GLenum
        get() = definedExternally
    val SAMPLER_3D: GLenum
        get() = definedExternally
    val SAMPLER_2D_SHADOW: GLenum
        get() = definedExternally
    val FRAGMENT_SHADER_DERIVATIVE_HINT: GLenum
        get() = definedExternally
    val PIXEL_PACK_BUFFER: GLenum
        get() = definedExternally
    val PIXEL_UNPACK_BUFFER: GLenum
        get() = definedExternally
    val PIXEL_PACK_BUFFER_BINDING: GLenum
        get() = definedExternally
    val PIXEL_UNPACK_BUFFER_BINDING: GLenum
        get() = definedExternally
    val FLOAT_MAT2x3: GLenum
        get() = definedExternally
    val FLOAT_MAT2x4: GLenum
        get() = definedExternally
    val FLOAT_MAT3x2: GLenum
        get() = definedExternally
    val FLOAT_MAT3x4: GLenum
        get() = definedExternally
    val FLOAT_MAT4x2: GLenum
        get() = definedExternally
    val FLOAT_MAT4x3: GLenum
        get() = definedExternally
    val SRGB: GLenum
        get() = definedExternally
    val SRGB8: GLenum
        get() = definedExternally
    val SRGB8_ALPHA8: GLenum
        get() = definedExternally
    val COMPARE_REF_TO_TEXTURE: GLenum
        get() = definedExternally
    val RGBA32F: GLenum
        get() = definedExternally
    val RGB32F: GLenum
        get() = definedExternally
    val RGBA16F: GLenum
        get() = definedExternally
    val RGB16F: GLenum
        get() = definedExternally
    val VERTEX_ATTRIB_ARRAY_INTEGER: GLenum
        get() = definedExternally
    val MAX_ARRAY_TEXTURE_LAYERS: GLenum
        get() = definedExternally
    val MIN_PROGRAM_TEXEL_OFFSET: GLenum
        get() = definedExternally
    val MAX_PROGRAM_TEXEL_OFFSET: GLenum
        get() = definedExternally
    val MAX_VARYING_COMPONENTS: GLenum
        get() = definedExternally
    val TEXTURE_2D_ARRAY: GLenum
        get() = definedExternally
    val TEXTURE_BINDING_2D_ARRAY: GLenum
        get() = definedExternally
    val R11F_G11F_B10F: GLenum
        get() = definedExternally
    val UNSIGNED_INT_10F_11F_11F_REV: GLenum
        get() = definedExternally
    val RGB9_E5: GLenum
        get() = definedExternally
    val UNSIGNED_INT_5_9_9_9_REV: GLenum
        get() = definedExternally
    val TRANSFORM_FEEDBACK_BUFFER_MODE: GLenum
        get() = definedExternally
    val MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: GLenum
        get() = definedExternally
    val TRANSFORM_FEEDBACK_VARYINGS: GLenum
        get() = definedExternally
    val TRANSFORM_FEEDBACK_BUFFER_START: GLenum
        get() = definedExternally
    val TRANSFORM_FEEDBACK_BUFFER_SIZE: GLenum
        get() = definedExternally
    val TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: GLenum
        get() = definedExternally
    val RASTERIZER_DISCARD: GLenum
        get() = definedExternally
    val MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: GLenum
        get() = definedExternally
    val MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: GLenum
        get() = definedExternally
    val INTERLEAVED_ATTRIBS: GLenum
        get() = definedExternally
    val SEPARATE_ATTRIBS: GLenum
        get() = definedExternally
    val TRANSFORM_FEEDBACK_BUFFER: GLenum
        get() = definedExternally
    val TRANSFORM_FEEDBACK_BUFFER_BINDING: GLenum
        get() = definedExternally
    val RGBA32UI: GLenum
        get() = definedExternally
    val RGB32UI: GLenum
        get() = definedExternally
    val RGBA16UI: GLenum
        get() = definedExternally
    val RGB16UI: GLenum
        get() = definedExternally
    val RGBA8UI: GLenum
        get() = definedExternally
    val RGB8UI: GLenum
        get() = definedExternally
    val RGBA32I: GLenum
        get() = definedExternally
    val RGB32I: GLenum
        get() = definedExternally
    val RGBA16I: GLenum
        get() = definedExternally
    val RGB16I: GLenum
        get() = definedExternally
    val RGBA8I: GLenum
        get() = definedExternally
    val RGB8I: GLenum
        get() = definedExternally
    val RED_INTEGER: GLenum
        get() = definedExternally
    val RGB_INTEGER: GLenum
        get() = definedExternally
    val RGBA_INTEGER: GLenum
        get() = definedExternally
    val SAMPLER_2D_ARRAY: GLenum
        get() = definedExternally
    val SAMPLER_2D_ARRAY_SHADOW: GLenum
        get() = definedExternally
    val SAMPLER_CUBE_SHADOW: GLenum
        get() = definedExternally
    val UNSIGNED_INT_VEC2: GLenum
        get() = definedExternally
    val UNSIGNED_INT_VEC3: GLenum
        get() = definedExternally
    val UNSIGNED_INT_VEC4: GLenum
        get() = definedExternally
    val INT_SAMPLER_2D: GLenum
        get() = definedExternally
    val INT_SAMPLER_3D: GLenum
        get() = definedExternally
    val INT_SAMPLER_CUBE: GLenum
        get() = definedExternally
    val INT_SAMPLER_2D_ARRAY: GLenum
        get() = definedExternally
    val UNSIGNED_INT_SAMPLER_2D: GLenum
        get() = definedExternally
    val UNSIGNED_INT_SAMPLER_3D: GLenum
        get() = definedExternally
    val UNSIGNED_INT_SAMPLER_CUBE: GLenum
        get() = definedExternally
    val UNSIGNED_INT_SAMPLER_2D_ARRAY: GLenum
        get() = definedExternally
    val DEPTH_COMPONENT32F: GLenum
        get() = definedExternally
    val DEPTH32F_STENCIL8: GLenum
        get() = definedExternally
    val FLOAT_32_UNSIGNED_INT_24_8_REV: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_RED_SIZE: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: GLenum
        get() = definedExternally
    val FRAMEBUFFER_DEFAULT: GLenum
        get() = definedExternally
    val UNSIGNED_INT_24_8: GLenum
        get() = definedExternally
    val DEPTH24_STENCIL8: GLenum
        get() = definedExternally
    val UNSIGNED_NORMALIZED: GLenum
        get() = definedExternally
    val DRAW_FRAMEBUFFER_BINDING: GLenum
        get() = definedExternally
    val READ_FRAMEBUFFER: GLenum
        get() = definedExternally
    val DRAW_FRAMEBUFFER: GLenum
        get() = definedExternally
    val READ_FRAMEBUFFER_BINDING: GLenum
        get() = definedExternally
    val RENDERBUFFER_SAMPLES: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: GLenum
        get() = definedExternally
    val MAX_COLOR_ATTACHMENTS: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT1: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT2: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT3: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT4: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT5: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT6: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT7: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT8: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT9: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT10: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT11: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT12: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT13: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT14: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT15: GLenum
        get() = definedExternally
    val FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: GLenum
        get() = definedExternally
    val MAX_SAMPLES: GLenum
        get() = definedExternally
    val HALF_FLOAT: GLenum
        get() = definedExternally
    val RG: GLenum
        get() = definedExternally
    val RG_INTEGER: GLenum
        get() = definedExternally
    val R8: GLenum
        get() = definedExternally
    val RG8: GLenum
        get() = definedExternally
    val R16F: GLenum
        get() = definedExternally
    val R32F: GLenum
        get() = definedExternally
    val RG16F: GLenum
        get() = definedExternally
    val RG32F: GLenum
        get() = definedExternally
    val R8I: GLenum
        get() = definedExternally
    val R8UI: GLenum
        get() = definedExternally
    val R16I: GLenum
        get() = definedExternally
    val R16UI: GLenum
        get() = definedExternally
    val R32I: GLenum
        get() = definedExternally
    val R32UI: GLenum
        get() = definedExternally
    val RG8I: GLenum
        get() = definedExternally
    val RG8UI: GLenum
        get() = definedExternally
    val RG16I: GLenum
        get() = definedExternally
    val RG16UI: GLenum
        get() = definedExternally
    val RG32I: GLenum
        get() = definedExternally
    val RG32UI: GLenum
        get() = definedExternally
    val VERTEX_ARRAY_BINDING: GLenum
        get() = definedExternally
    val R8_SNORM: GLenum
        get() = definedExternally
    val RG8_SNORM: GLenum
        get() = definedExternally
    val RGB8_SNORM: GLenum
        get() = definedExternally
    val RGBA8_SNORM: GLenum
        get() = definedExternally
    val SIGNED_NORMALIZED: GLenum
        get() = definedExternally
    val COPY_READ_BUFFER: GLenum
        get() = definedExternally
    val COPY_WRITE_BUFFER: GLenum
        get() = definedExternally
    val COPY_READ_BUFFER_BINDING: GLenum
        get() = definedExternally
    val COPY_WRITE_BUFFER_BINDING: GLenum
        get() = definedExternally
    val UNIFORM_BUFFER: GLenum
        get() = definedExternally
    val UNIFORM_BUFFER_BINDING: GLenum
        get() = definedExternally
    val UNIFORM_BUFFER_START: GLenum
        get() = definedExternally
    val UNIFORM_BUFFER_SIZE: GLenum
        get() = definedExternally
    val MAX_VERTEX_UNIFORM_BLOCKS: GLenum
        get() = definedExternally
    val MAX_FRAGMENT_UNIFORM_BLOCKS: GLenum
        get() = definedExternally
    val MAX_COMBINED_UNIFORM_BLOCKS: GLenum
        get() = definedExternally
    val MAX_UNIFORM_BUFFER_BINDINGS: GLenum
        get() = definedExternally
    val MAX_UNIFORM_BLOCK_SIZE: GLenum
        get() = definedExternally
    val MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: GLenum
        get() = definedExternally
    val MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: GLenum
        get() = definedExternally
    val UNIFORM_BUFFER_OFFSET_ALIGNMENT: GLenum
        get() = definedExternally
    val ACTIVE_UNIFORM_BLOCKS: GLenum
        get() = definedExternally
    val UNIFORM_TYPE: GLenum
        get() = definedExternally
    val UNIFORM_SIZE: GLenum
        get() = definedExternally
    val UNIFORM_BLOCK_INDEX: GLenum
        get() = definedExternally
    val UNIFORM_OFFSET: GLenum
        get() = definedExternally
    val UNIFORM_ARRAY_STRIDE: GLenum
        get() = definedExternally
    val UNIFORM_MATRIX_STRIDE: GLenum
        get() = definedExternally
    val UNIFORM_IS_ROW_MAJOR: GLenum
        get() = definedExternally
    val UNIFORM_BLOCK_BINDING: GLenum
        get() = definedExternally
    val UNIFORM_BLOCK_DATA_SIZE: GLenum
        get() = definedExternally
    val UNIFORM_BLOCK_ACTIVE_UNIFORMS: GLenum
        get() = definedExternally
    val UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: GLenum
        get() = definedExternally
    val UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: GLenum
        get() = definedExternally
    val UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: GLenum
        get() = definedExternally
    val INVALID_INDEX: GLenum
        get() = definedExternally
    val MAX_VERTEX_OUTPUT_COMPONENTS: GLenum
        get() = definedExternally
    val MAX_FRAGMENT_INPUT_COMPONENTS: GLenum
        get() = definedExternally
    val MAX_SERVER_WAIT_TIMEOUT: GLenum
        get() = definedExternally
    val OBJECT_TYPE: GLenum
        get() = definedExternally
    val SYNC_CONDITION: GLenum
        get() = definedExternally
    val SYNC_STATUS: GLenum
        get() = definedExternally
    val SYNC_FLAGS: GLenum
        get() = definedExternally
    val SYNC_FENCE: GLenum
        get() = definedExternally
    val SYNC_GPU_COMMANDS_COMPLETE: GLenum
        get() = definedExternally
    val UNSIGNALED: GLenum
        get() = definedExternally
    val SIGNALED: GLenum
        get() = definedExternally
    val ALREADY_SIGNALED: GLenum
        get() = definedExternally
    val TIMEOUT_EXPIRED: GLenum
        get() = definedExternally
    val CONDITION_SATISFIED: GLenum
        get() = definedExternally
    val WAIT_FAILED: GLenum
        get() = definedExternally
    val SYNC_FLUSH_COMMANDS_BIT: GLbitfield
        get() = definedExternally
    val VERTEX_ATTRIB_ARRAY_DIVISOR: GLenum
        get() = definedExternally
    val ANY_SAMPLES_PASSED: GLenum
        get() = definedExternally
    val ANY_SAMPLES_PASSED_CONSERVATIVE: GLenum
        get() = definedExternally
    val SAMPLER_BINDING: GLenum
        get() = definedExternally
    val RGB10_A2UI: GLenum
        get() = definedExternally
    val INT_2_10_10_10_REV: GLenum
        get() = definedExternally
    val TRANSFORM_FEEDBACK: GLenum
        get() = definedExternally
    val TRANSFORM_FEEDBACK_PAUSED: GLenum
        get() = definedExternally
    val TRANSFORM_FEEDBACK_ACTIVE: GLenum
        get() = definedExternally
    val TRANSFORM_FEEDBACK_BINDING: GLenum
        get() = definedExternally
    val TEXTURE_IMMUTABLE_FORMAT: GLenum
        get() = definedExternally
    val MAX_ELEMENT_INDEX: GLenum
        get() = definedExternally
    val TEXTURE_IMMUTABLE_LEVELS: GLenum
        get() = definedExternally
    val TIMEOUT_IGNORED: GLint64
        get() = definedExternally
    val MAX_CLIENT_WAIT_TIMEOUT_WEBGL: GLenum
        get() = definedExternally
}
