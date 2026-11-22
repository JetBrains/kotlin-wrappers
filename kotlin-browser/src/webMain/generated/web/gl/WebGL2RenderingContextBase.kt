// Automatically generated - do not modify!

package web.gl

import js.array.ReadonlyArray
import js.buffer.ArrayBufferLike
import js.buffer.ArrayBufferView
import js.internal.InternalApi
import js.numbers.UInt53

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface WebGL2RenderingContextBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/beginQuery)
     */
    fun beginQuery(
        target: GLenum,
        query: WebGLQuery,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/beginTransformFeedback)
     */
    fun beginTransformFeedback(primitiveMode: GLenum)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindBufferBase)
     */
    fun bindBufferBase(
        target: GLenum,
        index: GLuint,
        buffer: WebGLBuffer?,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindBufferRange)
     */
    fun bindBufferRange(
        target: GLenum,
        index: GLuint,
        buffer: WebGLBuffer?,
        offset: GLintptr,
        size: GLsizeiptr,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindSampler)
     */
    fun bindSampler(
        unit: GLuint,
        sampler: WebGLSampler?,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindTransformFeedback)
     */
    fun bindTransformFeedback(
        target: GLenum,
        tf: WebGLTransformFeedback?,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindVertexArray)
     */
    fun bindVertexArray(array: WebGLVertexArrayObject?)

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
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer)
     */
    fun clearBufferfi(
        buffer: GLenum,
        drawbuffer: GLint,
        depth: GLfloat,
        stencil: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer)
     */
    fun clearBufferfv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Float32List,
        srcOffset: UInt53 = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer)
     */
    fun clearBufferiv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Int32List,
        srcOffset: UInt53 = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer)
     */
    fun clearBufferuiv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Uint32List,
        srcOffset: UInt53 = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clientWaitSync)
     */
    fun clientWaitSync(
        sync: WebGLSync,
        flags: GLbitfield,
        timeout: GLuint64,
    ): GLenum

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
    )

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
    )

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
    )

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
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/copyBufferSubData)
     */
    fun copyBufferSubData(
        readTarget: GLenum,
        writeTarget: GLenum,
        readOffset: GLintptr,
        writeOffset: GLintptr,
        size: GLsizeiptr,
    )

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
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createQuery)
     */
    fun createQuery(): WebGLQuery

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createSampler)
     */
    fun createSampler(): WebGLSampler

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createTransformFeedback)
     */
    fun createTransformFeedback(): WebGLTransformFeedback

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createVertexArray)
     */
    fun createVertexArray(): WebGLVertexArrayObject

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteQuery)
     */
    fun deleteQuery(query: WebGLQuery?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteSampler)
     */
    fun deleteSampler(sampler: WebGLSampler?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteSync)
     */
    fun deleteSync(sync: WebGLSync?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteTransformFeedback)
     */
    fun deleteTransformFeedback(tf: WebGLTransformFeedback?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteVertexArray)
     */
    fun deleteVertexArray(vertexArray: WebGLVertexArrayObject?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawArraysInstanced)
     */
    fun drawArraysInstanced(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
        instanceCount: GLsizei,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawBuffers)
     */
    fun drawBuffers(buffers: ReadonlyArray<GLenum>)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawElementsInstanced)
     */
    fun drawElementsInstanced(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
        instanceCount: GLsizei,
    )

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
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/endQuery)
     */
    fun endQuery(target: GLenum)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/endTransformFeedback)
     */
    fun endTransformFeedback()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/fenceSync)
     */
    fun fenceSync(
        condition: GLenum,
        flags: GLbitfield,
    ): WebGLSync?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/framebufferTextureLayer)
     */
    fun framebufferTextureLayer(
        target: GLenum,
        attachment: GLenum,
        texture: WebGLTexture?,
        level: GLint,
        layer: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getActiveUniformBlockName)
     */
    fun getActiveUniformBlockName(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
    ): String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getActiveUniformBlockParameter)
     */
    fun getActiveUniformBlockParameter(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getActiveUniforms)
     */
    fun getActiveUniforms(
        program: WebGLProgram,
        uniformIndices: ReadonlyArray<GLuint>,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getBufferSubData)
     */
    fun getBufferSubData(
        target: GLenum,
        srcByteOffset: GLintptr,
        dstBuffer: ArrayBufferView<ArrayBufferLike>,
        dstOffset: UInt53 = definedExternally,
        length: GLuint = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getFragDataLocation)
     */
    fun getFragDataLocation(
        program: WebGLProgram,
        name: String,
    ): GLint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getIndexedParameter)
     */
    fun getIndexedParameter(
        target: GLenum,
        index: GLuint,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getInternalformatParameter)
     */
    fun getInternalformatParameter(
        target: GLenum,
        internalformat: GLenum,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getQuery)
     */
    fun getQuery(
        target: GLenum,
        pname: GLenum,
    ): WebGLQuery?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getQueryParameter)
     */
    fun getQueryParameter(
        query: WebGLQuery,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getSamplerParameter)
     */
    fun getSamplerParameter(
        sampler: WebGLSampler,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getSyncParameter)
     */
    fun getSyncParameter(
        sync: WebGLSync,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getTransformFeedbackVarying)
     */
    fun getTransformFeedbackVarying(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getUniformBlockIndex)
     */
    fun getUniformBlockIndex(
        program: WebGLProgram,
        uniformBlockName: String,
    ): GLuint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getUniformIndices)
     */
    fun getUniformIndices(
        program: WebGLProgram,
        uniformNames: ReadonlyArray<JsString>,
    ): ReadonlyArray<GLuint>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/invalidateFramebuffer)
     */
    fun invalidateFramebuffer(
        target: GLenum,
        attachments: ReadonlyArray<GLenum>,
    )

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
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isQuery)
     */
    fun isQuery(query: WebGLQuery?): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isSampler)
     */
    fun isSampler(sampler: WebGLSampler?): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isSync)
     */
    fun isSync(sync: WebGLSync?): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isTransformFeedback)
     */
    fun isTransformFeedback(tf: WebGLTransformFeedback?): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isVertexArray)
     */
    fun isVertexArray(vertexArray: WebGLVertexArrayObject?): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/pauseTransformFeedback)
     */
    fun pauseTransformFeedback()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/readBuffer)
     */
    fun readBuffer(src: GLenum)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/renderbufferStorageMultisample)
     */
    fun renderbufferStorageMultisample(
        target: GLenum,
        samples: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/resumeTransformFeedback)
     */
    fun resumeTransformFeedback()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/samplerParameter)
     */
    fun samplerParameterf(
        sampler: WebGLSampler,
        pname: GLenum,
        param: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/samplerParameter)
     */
    fun samplerParameteri(
        sampler: WebGLSampler,
        pname: GLenum,
        param: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/texImage3D)
     */
    fun texImage3D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        pboOffset: GLintptr,
    )

    fun texImage3D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        source: TexImageSource,
    )

    fun texImage3D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        srcData: ArrayBufferView<ArrayBufferLike>?,
    )

    fun texImage3D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        srcData: ArrayBufferView<ArrayBufferLike>,
        srcOffset: UInt53,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/texStorage2D)
     */
    fun texStorage2D(
        target: GLenum,
        levels: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

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
    )

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
    )

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
    )

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
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings)
     */
    fun transformFeedbackVaryings(
        program: WebGLProgram,
        varyings: ReadonlyArray<JsString>,
        bufferMode: GLenum,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform1ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform1uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform2ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform2uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform3ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
        v2: GLuint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform3uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform4ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
        v2: GLuint,
        v3: GLuint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform)
     */
    fun uniform4uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformBlockBinding)
     */
    fun uniformBlockBinding(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
        uniformBlockBinding: GLuint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix2x3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix2x4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix3x2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix3x4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix4x2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix)
     */
    fun uniformMatrix4x3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53 = definedExternally,
        srcLength: GLuint = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribDivisor)
     */
    fun vertexAttribDivisor(
        index: GLuint,
        divisor: GLuint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI)
     */
    fun vertexAttribI4i(
        index: GLuint,
        x: GLint,
        y: GLint,
        z: GLint,
        w: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI)
     */
    fun vertexAttribI4iv(
        index: GLuint,
        values: Int32List,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI)
     */
    fun vertexAttribI4ui(
        index: GLuint,
        x: GLuint,
        y: GLuint,
        z: GLuint,
        w: GLuint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI)
     */
    fun vertexAttribI4uiv(
        index: GLuint,
        values: Uint32List,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribIPointer)
     */
    fun vertexAttribIPointer(
        index: GLuint,
        size: GLint,
        type: GLenum,
        stride: GLsizei,
        offset: GLintptr,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/waitSync)
     */
    fun waitSync(
        sync: WebGLSync,
        flags: GLbitfield,
        timeout: GLint64,
    )
}
