// Automatically generated - do not modify!

package web.gl

import js.array.ReadonlyArray
import js.internal.InternalApi
import js.promise.Promise
import js.promise.await
import js.void.Void
import web.events.EventTarget
import web.images.PredefinedColorSpace

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface WebGLRenderingContextBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/canvas)
     */
    val canvas: EventTarget /* HTMLCanvasElement | OffscreenCanvas */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawingBufferColorSpace)
     */
    var drawingBufferColorSpace: PredefinedColorSpace

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawingBufferHeight)
     */
    val drawingBufferHeight: GLsizei

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawingBufferWidth)
     */
    val drawingBufferWidth: GLsizei

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/unpackColorSpace)
     */
    var unpackColorSpace: PredefinedColorSpace

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/activeTexture)
     */
    fun activeTexture(texture: GLenum)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/attachShader)
     */
    fun attachShader(
        program: WebGLProgram,
        shader: WebGLShader,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindAttribLocation)
     */
    fun bindAttribLocation(
        program: WebGLProgram,
        index: GLuint,
        name: String,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindBuffer)
     */
    fun bindBuffer(
        target: GLenum,
        buffer: WebGLBuffer?,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindFramebuffer)
     */
    fun bindFramebuffer(
        target: GLenum,
        framebuffer: WebGLFramebuffer?,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindRenderbuffer)
     */
    fun bindRenderbuffer(
        target: GLenum,
        renderbuffer: WebGLRenderbuffer?,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindTexture)
     */
    fun bindTexture(
        target: GLenum,
        texture: WebGLTexture?,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendColor)
     */
    fun blendColor(
        red: GLclampf,
        green: GLclampf,
        blue: GLclampf,
        alpha: GLclampf,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendEquation)
     */
    fun blendEquation(mode: GLenum)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendEquationSeparate)
     */
    fun blendEquationSeparate(
        modeRGB: GLenum,
        modeAlpha: GLenum,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendFunc)
     */
    fun blendFunc(
        sfactor: GLenum,
        dfactor: GLenum,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendFuncSeparate)
     */
    fun blendFuncSeparate(
        srcRGB: GLenum,
        dstRGB: GLenum,
        srcAlpha: GLenum,
        dstAlpha: GLenum,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/checkFramebufferStatus)
     */
    fun checkFramebufferStatus(target: GLenum): GLenum

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clear)
     */
    fun clear(mask: GLbitfield)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearColor)
     */
    fun clearColor(
        red: GLclampf,
        green: GLclampf,
        blue: GLclampf,
        alpha: GLclampf,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearDepth)
     */
    fun clearDepth(depth: GLclampf)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearStencil)
     */
    fun clearStencil(s: GLint)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/colorMask)
     */
    fun colorMask(
        red: GLboolean,
        green: GLboolean,
        blue: GLboolean,
        alpha: GLboolean,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compileShader)
     */
    fun compileShader(shader: WebGLShader)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/copyTexImage2D)
     */
    fun copyTexImage2D(
        target: GLenum,
        level: GLint,
        internalformat: GLenum,
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
        border: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/copyTexSubImage2D)
     */
    fun copyTexSubImage2D(
        target: GLenum,
        level: GLint,
        xoffset: GLint,
        yoffset: GLint,
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createBuffer)
     */
    fun createBuffer(): WebGLBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createFramebuffer)
     */
    fun createFramebuffer(): WebGLFramebuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createProgram)
     */
    fun createProgram(): WebGLProgram

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createRenderbuffer)
     */
    fun createRenderbuffer(): WebGLRenderbuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createShader)
     */
    fun createShader(type: GLenum): WebGLShader?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createTexture)
     */
    fun createTexture(): WebGLTexture

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/cullFace)
     */
    fun cullFace(mode: GLenum)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteBuffer)
     */
    fun deleteBuffer(buffer: WebGLBuffer?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteFramebuffer)
     */
    fun deleteFramebuffer(framebuffer: WebGLFramebuffer?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteProgram)
     */
    fun deleteProgram(program: WebGLProgram?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteRenderbuffer)
     */
    fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteShader)
     */
    fun deleteShader(shader: WebGLShader?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteTexture)
     */
    fun deleteTexture(texture: WebGLTexture?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthFunc)
     */
    fun depthFunc(func: GLenum)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthMask)
     */
    fun depthMask(flag: GLboolean)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthRange)
     */
    fun depthRange(
        zNear: GLclampf,
        zFar: GLclampf,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/detachShader)
     */
    fun detachShader(
        program: WebGLProgram,
        shader: WebGLShader,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/disable)
     */
    fun disable(cap: GLenum)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/disableVertexAttribArray)
     */
    fun disableVertexAttribArray(index: GLuint)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawArrays)
     */
    fun drawArrays(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawElements)
     */
    fun drawElements(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/enable)
     */
    fun enable(cap: GLenum)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/enableVertexAttribArray)
     */
    fun enableVertexAttribArray(index: GLuint)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/finish)
     */
    fun finish()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/flush)
     */
    fun flush()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/framebufferRenderbuffer)
     */
    fun framebufferRenderbuffer(
        target: GLenum,
        attachment: GLenum,
        renderbuffertarget: GLenum,
        renderbuffer: WebGLRenderbuffer?,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/framebufferTexture2D)
     */
    fun framebufferTexture2D(
        target: GLenum,
        attachment: GLenum,
        textarget: GLenum,
        texture: WebGLTexture?,
        level: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/frontFace)
     */
    fun frontFace(mode: GLenum)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/generateMipmap)
     */
    fun generateMipmap(target: GLenum)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getActiveAttrib)
     */
    fun getActiveAttrib(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getActiveUniform)
     */
    fun getActiveUniform(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getAttachedShaders)
     */
    fun getAttachedShaders(program: WebGLProgram): ReadonlyArray<WebGLShader>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getAttribLocation)
     */
    fun getAttribLocation(
        program: WebGLProgram,
        name: String,
    ): GLint

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getBufferParameter)
     */
    fun getBufferParameter(
        target: GLenum,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getContextAttributes)
     */
    fun getContextAttributes(): WebGLContextAttributes?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getError)
     */
    fun getError(): GLenum

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getExtension)
     */
    @InternalApi
    @JsName("getExtension")
    fun <T : JsAny?> getExtensionOrNullUnsafe(name: String): T?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getFramebufferAttachmentParameter)
     */
    fun getFramebufferAttachmentParameter(
        target: GLenum,
        attachment: GLenum,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getParameter)
     */
    fun getParameter(pname: GLenum): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getProgramInfoLog)
     */
    fun getProgramInfoLog(program: WebGLProgram): String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getProgramParameter)
     */
    fun getProgramParameter(
        program: WebGLProgram,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getRenderbufferParameter)
     */
    fun getRenderbufferParameter(
        target: GLenum,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderInfoLog)
     */
    fun getShaderInfoLog(shader: WebGLShader): String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderParameter)
     */
    fun getShaderParameter(
        shader: WebGLShader,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderPrecisionFormat)
     */
    fun getShaderPrecisionFormat(
        shadertype: GLenum,
        precisiontype: GLenum,
    ): WebGLShaderPrecisionFormat?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderSource)
     */
    fun getShaderSource(shader: WebGLShader): String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getSupportedExtensions)
     */
    fun getSupportedExtensions(): ReadonlyArray<JsString>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getTexParameter)
     */
    fun getTexParameter(
        target: GLenum,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getUniform)
     */
    fun getUniform(
        program: WebGLProgram,
        location: WebGLUniformLocation,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getUniformLocation)
     */
    fun getUniformLocation(
        program: WebGLProgram,
        name: String,
    ): WebGLUniformLocation?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getVertexAttrib)
     */
    fun getVertexAttrib(
        index: GLuint,
        pname: GLenum,
    ): JsAny?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getVertexAttribOffset)
     */
    fun getVertexAttribOffset(
        index: GLuint,
        pname: GLenum,
    ): GLintptr

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/hint)
     */
    fun hint(
        target: GLenum,
        mode: GLenum,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isBuffer)
     */
    fun isBuffer(buffer: WebGLBuffer?): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isContextLost)
     */
    fun isContextLost(): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isEnabled)
     */
    fun isEnabled(cap: GLenum): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isFramebuffer)
     */
    fun isFramebuffer(framebuffer: WebGLFramebuffer?): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isProgram)
     */
    fun isProgram(program: WebGLProgram?): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isRenderbuffer)
     */
    fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isShader)
     */
    fun isShader(shader: WebGLShader?): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isTexture)
     */
    fun isTexture(texture: WebGLTexture?): GLboolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/lineWidth)
     */
    fun lineWidth(width: GLfloat)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/linkProgram)
     */
    fun linkProgram(program: WebGLProgram)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/pixelStorei)
     */
    fun pixelStorei(
        pname: GLenum,
        param: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/pixelStorei)
     */
    fun pixelStorei(
        pname: GLenum,
        param: GLboolean,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/polygonOffset)
     */
    fun polygonOffset(
        factor: GLfloat,
        units: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/renderbufferStorage)
     */
    fun renderbufferStorage(
        target: GLenum,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/sampleCoverage)
     */
    fun sampleCoverage(
        value: GLclampf,
        invert: GLboolean,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/scissor)
     */
    fun scissor(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/shaderSource)
     */
    fun shaderSource(
        shader: WebGLShader,
        source: String,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilFunc)
     */
    fun stencilFunc(
        func: GLenum,
        ref: GLint,
        mask: GLuint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilFuncSeparate)
     */
    fun stencilFuncSeparate(
        face: GLenum,
        func: GLenum,
        ref: GLint,
        mask: GLuint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilMask)
     */
    fun stencilMask(mask: GLuint)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilMaskSeparate)
     */
    fun stencilMaskSeparate(
        face: GLenum,
        mask: GLuint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilOp)
     */
    fun stencilOp(
        fail: GLenum,
        zfail: GLenum,
        zpass: GLenum,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilOpSeparate)
     */
    fun stencilOpSeparate(
        face: GLenum,
        fail: GLenum,
        zfail: GLenum,
        zpass: GLenum,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texParameter)
     */
    fun texParameterf(
        target: GLenum,
        pname: GLenum,
        param: GLenum,
    )

    fun texParameterf(
        target: GLenum,
        pname: GLenum,
        param: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texParameter)
     */
    fun texParameteri(
        target: GLenum,
        pname: GLenum,
        param: GLenum,
    )

    fun texParameteri(
        target: GLenum,
        pname: GLenum,
        param: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform1f(
        location: WebGLUniformLocation?,
        x: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform1i(
        location: WebGLUniformLocation?,
        x: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform2f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform2i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform3f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform3i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
        z: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform4f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
        w: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform4i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
        z: GLint,
        w: GLint,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/useProgram)
     */
    fun useProgram(program: WebGLProgram?)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/validateProgram)
     */
    fun validateProgram(program: WebGLProgram)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib1f(
        index: GLuint,
        x: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib1fv(
        index: GLuint,
        values: Float32List,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib2f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib2fv(
        index: GLuint,
        values: Float32List,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib3f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib3fv(
        index: GLuint,
        values: Float32List,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib4f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
        w: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib4fv(
        index: GLuint,
        values: Float32List,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttribPointer)
     */
    fun vertexAttribPointer(
        index: GLuint,
        size: GLint,
        type: GLenum,
        normalized: GLboolean,
        stride: GLsizei,
        offset: GLintptr,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/viewport)
     */
    fun viewport(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    @JsName("makeXRCompatible")
    fun makeXRCompatibleAsync(): Promise<Void>
}

suspend inline fun WebGLRenderingContextBase.makeXRCompatible() {
    makeXRCompatibleAsync().await()
}

private fun <T : Any> WebGLRenderingContextBase.getExtensionUnsafe(
    name: String,
): T =
    requireNotNull(getExtensionOrNullUnsafe(name)) {
        "WebGL extension with name '$name' not found"
    }

fun <T : ANGLE_instanced_arrays> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("ANGLE_instanced_arrays")

inline fun <T : ANGLE_instanced_arrays> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("ANGLE_instanced_arrays")

fun <T : EXT_blend_minmax> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("EXT_blend_minmax")

inline fun <T : EXT_blend_minmax> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("EXT_blend_minmax")

fun <T : EXT_color_buffer_float> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("EXT_color_buffer_float")

inline fun <T : EXT_color_buffer_float> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("EXT_color_buffer_float")

fun <T : EXT_color_buffer_half_float> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("EXT_color_buffer_half_float")

inline fun <T : EXT_color_buffer_half_float> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("EXT_color_buffer_half_float")

fun <T : EXT_float_blend> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("EXT_float_blend")

inline fun <T : EXT_float_blend> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("EXT_float_blend")

fun <T : EXT_frag_depth> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("EXT_frag_depth")

inline fun <T : EXT_frag_depth> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("EXT_frag_depth")

fun <T : EXT_sRGB> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("EXT_sRGB")

inline fun <T : EXT_sRGB> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("EXT_sRGB")

fun <T : EXT_shader_texture_lod> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("EXT_shader_texture_lod")

inline fun <T : EXT_shader_texture_lod> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("EXT_shader_texture_lod")

fun <T : EXT_texture_compression_bptc> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("EXT_texture_compression_bptc")

inline fun <T : EXT_texture_compression_bptc> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("EXT_texture_compression_bptc")

fun <T : EXT_texture_compression_rgtc> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("EXT_texture_compression_rgtc")

inline fun <T : EXT_texture_compression_rgtc> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("EXT_texture_compression_rgtc")

fun <T : EXT_texture_filter_anisotropic> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("EXT_texture_filter_anisotropic")

inline fun <T : EXT_texture_filter_anisotropic> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("EXT_texture_filter_anisotropic")

fun <T : KHR_parallel_shader_compile> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("KHR_parallel_shader_compile")

inline fun <T : KHR_parallel_shader_compile> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("KHR_parallel_shader_compile")

fun <T : OES_element_index_uint> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("OES_element_index_uint")

inline fun <T : OES_element_index_uint> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("OES_element_index_uint")

fun <T : OES_fbo_render_mipmap> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("OES_fbo_render_mipmap")

inline fun <T : OES_fbo_render_mipmap> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("OES_fbo_render_mipmap")

fun <T : OES_standard_derivatives> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("OES_standard_derivatives")

inline fun <T : OES_standard_derivatives> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("OES_standard_derivatives")

fun <T : OES_texture_float> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("OES_texture_float")

inline fun <T : OES_texture_float> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("OES_texture_float")

fun <T : OES_texture_float_linear> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("OES_texture_float_linear")

inline fun <T : OES_texture_float_linear> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("OES_texture_float_linear")

fun <T : OES_texture_half_float> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("OES_texture_half_float")

inline fun <T : OES_texture_half_float> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("OES_texture_half_float")

fun <T : OES_texture_half_float_linear> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("OES_texture_half_float_linear")

inline fun <T : OES_texture_half_float_linear> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("OES_texture_half_float_linear")

fun <T : OES_vertex_array_object> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("OES_vertex_array_object")

inline fun <T : OES_vertex_array_object> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("OES_vertex_array_object")

fun <T : OVR_multiview2> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("OVR_multiview2")

inline fun <T : OVR_multiview2> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("OVR_multiview2")

fun <T : WEBGL_color_buffer_float> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_color_buffer_float")

inline fun <T : WEBGL_color_buffer_float> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_color_buffer_float")

fun <T : WEBGL_compressed_texture_astc> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_compressed_texture_astc")

inline fun <T : WEBGL_compressed_texture_astc> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_compressed_texture_astc")

fun <T : WEBGL_compressed_texture_etc> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_compressed_texture_etc")

inline fun <T : WEBGL_compressed_texture_etc> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_compressed_texture_etc")

fun <T : WEBGL_compressed_texture_etc1> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_compressed_texture_etc1")

inline fun <T : WEBGL_compressed_texture_etc1> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_compressed_texture_etc1")

fun <T : WEBGL_compressed_texture_pvrtc> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_compressed_texture_pvrtc")

inline fun <T : WEBGL_compressed_texture_pvrtc> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_compressed_texture_pvrtc")

fun <T : WEBGL_compressed_texture_s3tc> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_compressed_texture_s3tc")

inline fun <T : WEBGL_compressed_texture_s3tc> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_compressed_texture_s3tc")

fun <T : WEBGL_compressed_texture_s3tc_srgb> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_compressed_texture_s3tc_srgb")

inline fun <T : WEBGL_compressed_texture_s3tc_srgb> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_compressed_texture_s3tc_srgb")

fun <T : WEBGL_debug_renderer_info> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_debug_renderer_info")

inline fun <T : WEBGL_debug_renderer_info> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_debug_renderer_info")

fun <T : WEBGL_debug_shaders> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_debug_shaders")

inline fun <T : WEBGL_debug_shaders> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_debug_shaders")

fun <T : WEBGL_depth_texture> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_depth_texture")

inline fun <T : WEBGL_depth_texture> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_depth_texture")

fun <T : WEBGL_draw_buffers> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_draw_buffers")

inline fun <T : WEBGL_draw_buffers> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_draw_buffers")

fun <T : WEBGL_lose_context> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_lose_context")

inline fun <T : WEBGL_lose_context> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_lose_context")

fun <T : WEBGL_multi_draw> WebGLRenderingContextBase.getExtension(`_`: T? = null): T =
    getExtensionUnsafe("WEBGL_multi_draw")

inline fun <T : WEBGL_multi_draw> WebGLRenderingContextBase.getExtensionOrNull(`_`: T? = null): T? =
    getExtensionOrNullUnsafe("WEBGL_multi_draw")
