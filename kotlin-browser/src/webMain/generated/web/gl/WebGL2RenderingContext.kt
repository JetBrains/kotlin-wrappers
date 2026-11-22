// Automatically generated - do not modify!

package web.gl

import js.array.ReadonlyArray
import js.buffer.AllowSharedBufferSource
import js.buffer.ArrayBufferLike
import js.buffer.ArrayBufferView
import js.numbers.UInt53
import js.promise.Promise
import js.reflect.unsafeCast
import js.void.Void
import web.events.EventTarget
import web.images.PredefinedColorSpace
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContext
import web.rendering.RenderingContextId

/**
 * The **`WebGL2RenderingContext`** interface provides the OpenGL ES 3.0 rendering context for the drawing surface of an HTML <canvas> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext)
 */
open external class WebGL2RenderingContext
private constructor() :
    WebGL2RenderingContextBase,
    WebGL2RenderingContextOverloads,
    WebGLRenderingContextBase,
    OffscreenRenderingContext,
    RenderingContext {

    /* `WebGL2RenderingContextBase` overrides */

    override fun beginQuery(
        target: GLenum,
        query: WebGLQuery,
    )

    override fun beginTransformFeedback(primitiveMode: GLenum)
    override fun bindBufferBase(
        target: GLenum,
        index: GLuint,
        buffer: WebGLBuffer?,
    )

    override fun bindBufferRange(
        target: GLenum,
        index: GLuint,
        buffer: WebGLBuffer?,
        offset: GLintptr,
        size: GLsizeiptr,
    )

    override fun bindSampler(
        unit: GLuint,
        sampler: WebGLSampler?,
    )

    override fun bindTransformFeedback(
        target: GLenum,
        tf: WebGLTransformFeedback?,
    )

    override fun bindVertexArray(array: WebGLVertexArrayObject?)
    override fun blitFramebuffer(
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

    override fun clearBufferfi(
        buffer: GLenum,
        drawbuffer: GLint,
        depth: GLfloat,
        stencil: GLint,
    )

    override fun clearBufferfv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Float32List,
        srcOffset: UInt53,
    )

    override fun clearBufferiv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Int32List,
        srcOffset: UInt53,
    )

    override fun clearBufferuiv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Uint32List,
        srcOffset: UInt53,
    )

    override fun clientWaitSync(
        sync: WebGLSync,
        flags: GLbitfield,
        timeout: GLuint64,
    ): GLenum

    override fun compressedTexImage3D(
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

    override fun compressedTexImage3D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
        border: GLint,
        srcData: ArrayBufferView<ArrayBufferLike>,
        srcOffset: UInt53,
        srcLengthOverride: GLuint,
    )

    override fun compressedTexSubImage3D(
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

    override fun compressedTexSubImage3D(
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
        srcOffset: UInt53,
        srcLengthOverride: GLuint,
    )

    override fun copyBufferSubData(
        readTarget: GLenum,
        writeTarget: GLenum,
        readOffset: GLintptr,
        writeOffset: GLintptr,
        size: GLsizeiptr,
    )

    override fun copyTexSubImage3D(
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

    override fun createQuery(): WebGLQuery
    override fun createSampler(): WebGLSampler
    override fun createTransformFeedback(): WebGLTransformFeedback
    override fun createVertexArray(): WebGLVertexArrayObject
    override fun deleteQuery(query: WebGLQuery?)
    override fun deleteSampler(sampler: WebGLSampler?)
    override fun deleteSync(sync: WebGLSync?)
    override fun deleteTransformFeedback(tf: WebGLTransformFeedback?)
    override fun deleteVertexArray(vertexArray: WebGLVertexArrayObject?)
    override fun drawArraysInstanced(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
        instanceCount: GLsizei,
    )

    override fun drawBuffers(buffers: ReadonlyArray<GLenum>)
    override fun drawElementsInstanced(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
        instanceCount: GLsizei,
    )

    override fun drawRangeElements(
        mode: GLenum,
        start: GLuint,
        end: GLuint,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
    )

    override fun endQuery(target: GLenum)
    override fun endTransformFeedback()
    override fun fenceSync(
        condition: GLenum,
        flags: GLbitfield,
    ): WebGLSync?

    override fun framebufferTextureLayer(
        target: GLenum,
        attachment: GLenum,
        texture: WebGLTexture?,
        level: GLint,
        layer: GLint,
    )

    override fun getActiveUniformBlockName(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
    ): String?

    override fun getActiveUniformBlockParameter(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
        pname: GLenum,
    ): JsAny?

    override fun getActiveUniforms(
        program: WebGLProgram,
        uniformIndices: ReadonlyArray<GLuint>,
        pname: GLenum,
    ): JsAny?

    override fun getBufferSubData(
        target: GLenum,
        srcByteOffset: GLintptr,
        dstBuffer: ArrayBufferView<ArrayBufferLike>,
        dstOffset: UInt53,
        length: GLuint,
    )

    override fun getFragDataLocation(
        program: WebGLProgram,
        name: String,
    ): GLint

    override fun getIndexedParameter(
        target: GLenum,
        index: GLuint,
    ): JsAny?

    override fun getInternalformatParameter(
        target: GLenum,
        internalformat: GLenum,
        pname: GLenum,
    ): JsAny?

    override fun getQuery(
        target: GLenum,
        pname: GLenum,
    ): WebGLQuery?

    override fun getQueryParameter(
        query: WebGLQuery,
        pname: GLenum,
    ): JsAny?

    override fun getSamplerParameter(
        sampler: WebGLSampler,
        pname: GLenum,
    ): JsAny?

    override fun getSyncParameter(
        sync: WebGLSync,
        pname: GLenum,
    ): JsAny?

    override fun getTransformFeedbackVarying(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    override fun getUniformBlockIndex(
        program: WebGLProgram,
        uniformBlockName: String,
    ): GLuint

    override fun getUniformIndices(
        program: WebGLProgram,
        uniformNames: ReadonlyArray<JsString>,
    ): ReadonlyArray<GLuint>?

    override fun invalidateFramebuffer(
        target: GLenum,
        attachments: ReadonlyArray<GLenum>,
    )

    override fun invalidateSubFramebuffer(
        target: GLenum,
        attachments: ReadonlyArray<GLenum>,
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    override fun isQuery(query: WebGLQuery?): GLboolean
    override fun isSampler(sampler: WebGLSampler?): GLboolean
    override fun isSync(sync: WebGLSync?): GLboolean
    override fun isTransformFeedback(tf: WebGLTransformFeedback?): GLboolean
    override fun isVertexArray(vertexArray: WebGLVertexArrayObject?): GLboolean
    override fun pauseTransformFeedback()
    override fun readBuffer(src: GLenum)
    override fun renderbufferStorageMultisample(
        target: GLenum,
        samples: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

    override fun resumeTransformFeedback()
    override fun samplerParameterf(
        sampler: WebGLSampler,
        pname: GLenum,
        param: GLfloat,
    )

    override fun samplerParameteri(
        sampler: WebGLSampler,
        pname: GLenum,
        param: GLint,
    )

    override fun texImage3D(
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

    override fun texImage3D(
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

    override fun texImage3D(
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

    override fun texImage3D(
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

    override fun texStorage2D(
        target: GLenum,
        levels: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

    override fun texStorage3D(
        target: GLenum,
        levels: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
    )

    override fun texSubImage3D(
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

    override fun texSubImage3D(
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

    override fun texSubImage3D(
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
        srcOffset: UInt53,
    )

    override fun transformFeedbackVaryings(
        program: WebGLProgram,
        varyings: ReadonlyArray<JsString>,
        bufferMode: GLenum,
    )

    override fun uniform1ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
    )

    override fun uniform1uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniform2ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
    )

    override fun uniform2uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniform3ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
        v2: GLuint,
    )

    override fun uniform3uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniform4ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
        v2: GLuint,
        v3: GLuint,
    )

    override fun uniform4uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniformBlockBinding(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
        uniformBlockBinding: GLuint,
    )

    override fun uniformMatrix2x3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniformMatrix2x4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniformMatrix3x2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniformMatrix3x4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniformMatrix4x2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniformMatrix4x3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun vertexAttribDivisor(
        index: GLuint,
        divisor: GLuint,
    )

    override fun vertexAttribI4i(
        index: GLuint,
        x: GLint,
        y: GLint,
        z: GLint,
        w: GLint,
    )

    override fun vertexAttribI4iv(
        index: GLuint,
        values: Int32List,
    )

    override fun vertexAttribI4ui(
        index: GLuint,
        x: GLuint,
        y: GLuint,
        z: GLuint,
        w: GLuint,
    )

    override fun vertexAttribI4uiv(
        index: GLuint,
        values: Uint32List,
    )

    override fun vertexAttribIPointer(
        index: GLuint,
        size: GLint,
        type: GLenum,
        stride: GLsizei,
        offset: GLintptr,
    )

    override fun waitSync(
        sync: WebGLSync,
        flags: GLbitfield,
        timeout: GLint64,
    )

    /* `WebGL2RenderingContextOverloads` overrides */

    override fun bufferData(
        target: GLenum,
        size: GLsizeiptr,
        usage: GLenum,
    )

    override fun bufferData(
        target: GLenum,
        srcData: AllowSharedBufferSource?,
        usage: GLenum,
    )

    override fun bufferData(
        target: GLenum,
        srcData: ArrayBufferView<ArrayBufferLike>,
        usage: GLenum,
        srcOffset: UInt53,
        length: GLuint,
    )

    override fun bufferSubData(
        target: GLenum,
        dstByteOffset: GLintptr,
        srcData: AllowSharedBufferSource,
    )

    override fun bufferSubData(
        target: GLenum,
        dstByteOffset: GLintptr,
        srcData: ArrayBufferView<ArrayBufferLike>,
        srcOffset: UInt53,
        length: GLuint,
    )

    override fun compressedTexImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        imageSize: GLsizei,
        offset: GLintptr,
    )

    override fun compressedTexImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        srcData: ArrayBufferView<ArrayBufferLike>,
        srcOffset: UInt53,
        srcLengthOverride: GLuint,
    )

    override fun compressedTexSubImage2D(
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

    override fun compressedTexSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        srcData: ArrayBufferView<ArrayBufferLike>,
        srcOffset: UInt53,
        srcLengthOverride: GLuint,
    )

    override fun readPixels(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        dstData: ArrayBufferView<ArrayBufferLike>?,
    )

    override fun readPixels(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        offset: GLintptr,
    )

    override fun readPixels(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        dstData: ArrayBufferView<ArrayBufferLike>,
        dstOffset: UInt53,
    )

    override fun texImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        pixels: ArrayBufferView<ArrayBufferLike>?,
    )

    override fun texImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        format: GLenum,
        type: GLenum,
        source: TexImageSource,
    )

    override fun texImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        pboOffset: GLintptr,
    )

    override fun texImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        source: TexImageSource,
    )

    override fun texImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        format: GLenum,
        type: GLenum,
        srcData: ArrayBufferView<ArrayBufferLike>,
        srcOffset: UInt53,
    )

    override fun texSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        pixels: ArrayBufferView<ArrayBufferLike>?,
    )

    override fun texSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        format: GLenum,
        type: GLenum,
        source: TexImageSource,
    )

    override fun texSubImage2D(
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

    override fun texSubImage2D(
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

    override fun texSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        srcData: ArrayBufferView<ArrayBufferLike>,
        srcOffset: UInt53,
    )

    override fun uniform1fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniform1iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniform2fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniform2iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniform3fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniform3iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniform4fv(
        location: WebGLUniformLocation?,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniform4iv(
        location: WebGLUniformLocation?,
        data: Int32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniformMatrix2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniformMatrix3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    override fun uniformMatrix4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: UInt53,
        srcLength: GLuint,
    )

    /* `WebGLRenderingContextBase` overrides */

    override val canvas: EventTarget /* HTMLCanvasElement | OffscreenCanvas */
    override var drawingBufferColorSpace: PredefinedColorSpace
    override val drawingBufferHeight: GLsizei
    override val drawingBufferWidth: GLsizei
    override var unpackColorSpace: PredefinedColorSpace
    override fun activeTexture(texture: GLenum)
    override fun attachShader(
        program: WebGLProgram,
        shader: WebGLShader,
    )

    override fun bindAttribLocation(
        program: WebGLProgram,
        index: GLuint,
        name: String,
    )

    override fun bindBuffer(
        target: GLenum,
        buffer: WebGLBuffer?,
    )

    override fun bindFramebuffer(
        target: GLenum,
        framebuffer: WebGLFramebuffer?,
    )

    override fun bindRenderbuffer(
        target: GLenum,
        renderbuffer: WebGLRenderbuffer?,
    )

    override fun bindTexture(
        target: GLenum,
        texture: WebGLTexture?,
    )

    override fun blendColor(
        red: GLclampf,
        green: GLclampf,
        blue: GLclampf,
        alpha: GLclampf,
    )

    override fun blendEquation(mode: GLenum)
    override fun blendEquationSeparate(
        modeRGB: GLenum,
        modeAlpha: GLenum,
    )

    override fun blendFunc(
        sfactor: GLenum,
        dfactor: GLenum,
    )

    override fun blendFuncSeparate(
        srcRGB: GLenum,
        dstRGB: GLenum,
        srcAlpha: GLenum,
        dstAlpha: GLenum,
    )

    override fun checkFramebufferStatus(target: GLenum): GLenum
    override fun clear(mask: GLbitfield)
    override fun clearColor(
        red: GLclampf,
        green: GLclampf,
        blue: GLclampf,
        alpha: GLclampf,
    )

    override fun clearDepth(depth: GLclampf)
    override fun clearStencil(s: GLint)
    override fun colorMask(
        red: GLboolean,
        green: GLboolean,
        blue: GLboolean,
        alpha: GLboolean,
    )

    override fun compileShader(shader: WebGLShader)
    override fun copyTexImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
    )

    override fun copyTexSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    override fun createBuffer(): WebGLBuffer
    override fun createFramebuffer(): WebGLFramebuffer
    override fun createProgram(): WebGLProgram
    override fun createRenderbuffer(): WebGLRenderbuffer
    override fun createShader(type: GLenum): WebGLShader?
    override fun createTexture(): WebGLTexture
    override fun cullFace(mode: GLenum)
    override fun deleteBuffer(buffer: WebGLBuffer?)
    override fun deleteFramebuffer(framebuffer: WebGLFramebuffer?)
    override fun deleteProgram(program: WebGLProgram?)
    override fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?)
    override fun deleteShader(shader: WebGLShader?)
    override fun deleteTexture(texture: WebGLTexture?)
    override fun depthFunc(func: GLenum)
    override fun depthMask(flag: GLboolean)
    override fun depthRange(
        zNear: GLclampf,
        zFar: GLclampf,
    )

    override fun detachShader(
        program: WebGLProgram,
        shader: WebGLShader,
    )

    override fun disable(cap: GLenum)
    override fun disableVertexAttribArray(index: GLuint)
    override fun drawArrays(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
    )

    override fun drawElements(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
    )

    override fun enable(cap: GLenum)
    override fun enableVertexAttribArray(index: GLuint)
    override fun finish()
    override fun flush()
    override fun framebufferRenderbuffer(
        target: GLenum,
        attachment: GLenum,
        renderbuffertarget: GLenum,
        renderbuffer: WebGLRenderbuffer?,
    )

    override fun framebufferTexture2D(
        target: GLenum,
        attachment: GLenum,
        textarget: GLenum,
        texture: WebGLTexture?,
        level: GLint,
    )

    override fun frontFace(mode: GLenum)
    override fun generateMipmap(target: GLenum)
    override fun getActiveAttrib(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    override fun getActiveUniform(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    override fun getAttachedShaders(program: WebGLProgram): ReadonlyArray<WebGLShader>?
    override fun getAttribLocation(
        program: WebGLProgram,
        name: String,
    ): GLint

    override fun getBufferParameter(
        target: GLenum,
        pname: GLenum,
    ): JsAny?

    override fun getContextAttributes(): WebGLContextAttributes?
    override fun getError(): GLenum
    override fun <T : JsAny?> getExtensionOrNullUnsafe(name: String): T?
    override fun getFramebufferAttachmentParameter(
        target: GLenum,
        attachment: GLenum,
        pname: GLenum,
    ): JsAny?

    override fun getParameter(pname: GLenum): JsAny?
    override fun getProgramInfoLog(program: WebGLProgram): String?
    override fun getProgramParameter(
        program: WebGLProgram,
        pname: GLenum,
    ): JsAny?

    override fun getRenderbufferParameter(
        target: GLenum,
        pname: GLenum,
    ): JsAny?

    override fun getShaderInfoLog(shader: WebGLShader): String?
    override fun getShaderParameter(
        shader: WebGLShader,
        pname: GLenum,
    ): JsAny?

    override fun getShaderPrecisionFormat(
        shadertype: GLenum,
        precisiontype: GLenum,
    ): WebGLShaderPrecisionFormat?

    override fun getShaderSource(shader: WebGLShader): String?
    override fun getSupportedExtensions(): ReadonlyArray<JsString>?
    override fun getTexParameter(
        target: GLenum,
        pname: GLenum,
    ): JsAny?

    override fun getUniform(
        program: WebGLProgram,
        location: WebGLUniformLocation,
    ): JsAny?

    override fun getUniformLocation(
        program: WebGLProgram,
        name: String,
    ): WebGLUniformLocation?

    override fun getVertexAttrib(
        index: GLuint,
        pname: GLenum,
    ): JsAny?

    override fun getVertexAttribOffset(
        index: GLuint,
        pname: GLenum,
    ): GLintptr

    override fun hint(
        target: GLenum,
        mode: GLenum,
    )

    override fun isBuffer(buffer: WebGLBuffer?): GLboolean
    override fun isContextLost(): Boolean
    override fun isEnabled(cap: GLenum): GLboolean
    override fun isFramebuffer(framebuffer: WebGLFramebuffer?): GLboolean
    override fun isProgram(program: WebGLProgram?): GLboolean
    override fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): GLboolean
    override fun isShader(shader: WebGLShader?): GLboolean
    override fun isTexture(texture: WebGLTexture?): GLboolean
    override fun lineWidth(width: GLfloat)
    override fun linkProgram(program: WebGLProgram)
    override fun pixelStorei(
        pname: GLenum,
        param: GLint,
    )

    override fun pixelStorei(
        pname: GLenum,
        param: GLboolean,
    )

    override fun polygonOffset(
        factor: GLfloat,
        units: GLfloat,
    )

    override fun renderbufferStorage(
        target: GLenum,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

    override fun sampleCoverage(
        value: GLclampf,
        invert: GLboolean,
    )

    override fun scissor(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    override fun shaderSource(
        shader: WebGLShader,
        source: String,
    )

    override fun stencilFunc(
        func: GLenum,
        ref: GLint,
        mask: GLuint,
    )

    override fun stencilFuncSeparate(
        face: GLenum,
        func: GLenum,
        ref: GLint,
        mask: GLuint,
    )

    override fun stencilMask(mask: GLuint)
    override fun stencilMaskSeparate(
        face: GLenum,
        mask: GLuint,
    )

    override fun stencilOp(
        fail: GLenum,
        zfail: GLenum,
        zpass: GLenum,
    )

    override fun stencilOpSeparate(
        face: GLenum,
        fail: GLenum,
        zfail: GLenum,
        zpass: GLenum,
    )

    override fun texParameterf(
        target: GLenum,
        pname: GLenum,
        param: GLenum,
    )

    override fun texParameterf(
        target: GLenum,
        pname: GLenum,
        param: GLfloat,
    )

    override fun texParameteri(
        target: GLenum,
        pname: GLenum,
        param: GLenum,
    )

    override fun texParameteri(
        target: GLenum,
        pname: GLenum,
        param: GLint,
    )

    override fun uniform1f(
        location: WebGLUniformLocation?,
        x: GLfloat,
    )

    override fun uniform1i(
        location: WebGLUniformLocation?,
        x: GLint,
    )

    override fun uniform2f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
    )

    override fun uniform2i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
    )

    override fun uniform3f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
    )

    override fun uniform3i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
        z: GLint,
    )

    override fun uniform4f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
        w: GLfloat,
    )

    override fun uniform4i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
        z: GLint,
        w: GLint,
    )

    override fun useProgram(program: WebGLProgram?)
    override fun validateProgram(program: WebGLProgram)
    override fun vertexAttrib1f(
        index: GLuint,
        x: GLfloat,
    )

    override fun vertexAttrib1fv(
        index: GLuint,
        values: Float32List,
    )

    override fun vertexAttrib2f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
    )

    override fun vertexAttrib2fv(
        index: GLuint,
        values: Float32List,
    )

    override fun vertexAttrib3f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
    )

    override fun vertexAttrib3fv(
        index: GLuint,
        values: Float32List,
    )

    override fun vertexAttrib4f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
        w: GLfloat,
    )

    override fun vertexAttrib4fv(
        index: GLuint,
        values: Float32List,
    )

    override fun vertexAttribPointer(
        index: GLuint,
        size: GLint,
        type: GLenum,
        normalized: GLboolean,
        stride: GLsizei,
        offset: GLintptr,
    )

    override fun viewport(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    override fun makeXRCompatibleAsync(): Promise<Void>

    companion object
}

inline val WebGL2RenderingContext.Companion.ID: RenderingContextId<WebGL2RenderingContext, WebGLContextAttributes>
    get() = unsafeCast("webgl2")
