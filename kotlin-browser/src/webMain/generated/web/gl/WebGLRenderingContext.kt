// Automatically generated - do not modify!

package web.gl

import js.array.ReadonlyArray
import js.buffer.AllowSharedBufferSource
import js.buffer.ArrayBufferLike
import js.buffer.ArrayBufferView
import js.promise.Promise
import js.reflect.unsafeCast
import js.void.Void
import web.events.EventTarget
import web.images.PredefinedColorSpace
import web.rendering.OffscreenRenderingContext
import web.rendering.RenderingContext
import web.rendering.RenderingContextId

/**
 * The **`WebGLRenderingContext`** interface provides an interface to the OpenGL ES 2.0 graphics rendering context for the drawing surface of an HTML <canvas> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext)
 */
open external class WebGLRenderingContext
private constructor() :
    WebGLRenderingContextBase,
    WebGLRenderingContextOverloads,
    OffscreenRenderingContext,
    RenderingContext {

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

    /* `WebGLRenderingContextOverloads` overrides */

    override fun bufferData(
        target: GLenum,
        size: GLsizeiptr,
        usage: GLenum,
    )

    override fun bufferData(
        target: GLenum,
        data: AllowSharedBufferSource?,
        usage: GLenum,
    )

    override fun bufferSubData(
        target: GLenum,
        offset: GLintptr,
        data: AllowSharedBufferSource,
    )

    override fun compressedTexImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
        data: ArrayBufferView<ArrayBufferLike>,
    )

    override fun compressedTexSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        data: ArrayBufferView<ArrayBufferLike>,
    )

    override fun readPixels(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
        format: GLenum,
        type: GLenum,
        pixels: ArrayBufferView<ArrayBufferLike>?,
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

    override fun uniform1fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    override fun uniform1iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    override fun uniform2fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    override fun uniform2iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    override fun uniform3fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    override fun uniform3iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    override fun uniform4fv(
        location: WebGLUniformLocation?,
        v: Float32List,
    )

    override fun uniform4iv(
        location: WebGLUniformLocation?,
        v: Int32List,
    )

    override fun uniformMatrix2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        value: Float32List,
    )

    override fun uniformMatrix3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        value: Float32List,
    )

    override fun uniformMatrix4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        value: Float32List,
    )

    companion object
}

inline val WebGLRenderingContext.Companion.ID: RenderingContextId<WebGLRenderingContext, WebGLContextAttributes>
    get() = unsafeCast("webgl")
