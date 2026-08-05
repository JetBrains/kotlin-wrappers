// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

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
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawingBufferColorSpace)
     */
    var drawingBufferColorSpace: PredefinedColorSpace
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawingBufferHeight)
     */
    val drawingBufferHeight: GLsizei
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawingBufferWidth)
     */
    val drawingBufferWidth: GLsizei
        get() = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/unpackColorSpace)
     */
    var unpackColorSpace: PredefinedColorSpace
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/activeTexture)
     */
    fun activeTexture(texture: GLenum): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/attachShader)
     */
    fun attachShader(
        program: WebGLProgram,
        shader: WebGLShader,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindAttribLocation)
     */
    fun bindAttribLocation(
        program: WebGLProgram,
        index: GLuint,
        name: String,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindBuffer)
     */
    fun bindBuffer(
        target: GLenum,
        buffer: WebGLBuffer?,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindFramebuffer)
     */
    fun bindFramebuffer(
        target: GLenum,
        framebuffer: WebGLFramebuffer?,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindRenderbuffer)
     */
    fun bindRenderbuffer(
        target: GLenum,
        renderbuffer: WebGLRenderbuffer?,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindTexture)
     */
    fun bindTexture(
        target: GLenum,
        texture: WebGLTexture?,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendColor)
     */
    fun blendColor(
        red: GLclampf,
        green: GLclampf,
        blue: GLclampf,
        alpha: GLclampf,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendEquation)
     */
    fun blendEquation(mode: GLenum): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendEquationSeparate)
     */
    fun blendEquationSeparate(
        modeRGB: GLenum,
        modeAlpha: GLenum,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendFunc)
     */
    fun blendFunc(
        sfactor: GLenum,
        dfactor: GLenum,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendFuncSeparate)
     */
    fun blendFuncSeparate(
        srcRGB: GLenum,
        dstRGB: GLenum,
        srcAlpha: GLenum,
        dstAlpha: GLenum,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/checkFramebufferStatus)
     */
    fun checkFramebufferStatus(target: GLenum): GLenum = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clear)
     */
    fun clear(mask: GLbitfield): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearColor)
     */
    fun clearColor(
        red: GLclampf,
        green: GLclampf,
        blue: GLclampf,
        alpha: GLclampf,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearDepth)
     */
    fun clearDepth(depth: GLclampf): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearStencil)
     */
    fun clearStencil(s: GLint): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/colorMask)
     */
    fun colorMask(
        red: GLboolean,
        green: GLboolean,
        blue: GLboolean,
        alpha: GLboolean,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compileShader)
     */
    fun compileShader(shader: WebGLShader): Unit = definedExternally

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
    ): Unit = definedExternally

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
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createBuffer)
     */
    fun createBuffer(): WebGLBuffer = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createFramebuffer)
     */
    fun createFramebuffer(): WebGLFramebuffer = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createProgram)
     */
    fun createProgram(): WebGLProgram = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createRenderbuffer)
     */
    fun createRenderbuffer(): WebGLRenderbuffer = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createShader)
     */
    fun createShader(type: GLenum): WebGLShader? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createTexture)
     */
    fun createTexture(): WebGLTexture = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/cullFace)
     */
    fun cullFace(mode: GLenum): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteBuffer)
     */
    fun deleteBuffer(buffer: WebGLBuffer?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteFramebuffer)
     */
    fun deleteFramebuffer(framebuffer: WebGLFramebuffer?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteProgram)
     */
    fun deleteProgram(program: WebGLProgram?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteRenderbuffer)
     */
    fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteShader)
     */
    fun deleteShader(shader: WebGLShader?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteTexture)
     */
    fun deleteTexture(texture: WebGLTexture?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthFunc)
     */
    fun depthFunc(func: GLenum): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthMask)
     */
    fun depthMask(flag: GLboolean): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthRange)
     */
    fun depthRange(
        zNear: GLclampf,
        zFar: GLclampf,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/detachShader)
     */
    fun detachShader(
        program: WebGLProgram,
        shader: WebGLShader,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/disable)
     */
    fun disable(cap: GLenum): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/disableVertexAttribArray)
     */
    fun disableVertexAttribArray(index: GLuint): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawArrays)
     */
    fun drawArrays(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawElements)
     */
    fun drawElements(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/enable)
     */
    fun enable(cap: GLenum): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/enableVertexAttribArray)
     */
    fun enableVertexAttribArray(index: GLuint): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/finish)
     */
    fun finish(): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/flush)
     */
    fun flush(): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/framebufferRenderbuffer)
     */
    fun framebufferRenderbuffer(
        target: GLenum,
        attachment: GLenum,
        renderbuffertarget: GLenum,
        renderbuffer: WebGLRenderbuffer?,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/framebufferTexture2D)
     */
    fun framebufferTexture2D(
        target: GLenum,
        attachment: GLenum,
        textarget: GLenum,
        texture: WebGLTexture?,
        level: GLint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/frontFace)
     */
    fun frontFace(mode: GLenum): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/generateMipmap)
     */
    fun generateMipmap(target: GLenum): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getActiveAttrib)
     */
    fun getActiveAttrib(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getActiveUniform)
     */
    fun getActiveUniform(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getAttachedShaders)
     */
    fun getAttachedShaders(program: WebGLProgram): ReadonlyArray<WebGLShader>? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getAttribLocation)
     */
    fun getAttribLocation(
        program: WebGLProgram,
        name: String,
    ): GLint = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getBufferParameter)
     */
    fun getBufferParameter(
        target: GLenum,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getContextAttributes)
     */
    fun getContextAttributes(): WebGLContextAttributes? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getError)
     */
    fun getError(): GLenum = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getExtension)
     */
    fun getExtension(
        name: String,
    ): JsAny? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.ANGLE_instanced_arrays,
    ): ANGLE_instanced_arrays? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.EXT_blend_minmax,
    ): EXT_blend_minmax? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.EXT_color_buffer_float,
    ): EXT_color_buffer_float? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.EXT_color_buffer_half_float,
    ): EXT_color_buffer_half_float? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.EXT_float_blend,
    ): EXT_float_blend? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.EXT_frag_depth,
    ): EXT_frag_depth? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.EXT_sRGB,
    ): EXT_sRGB? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.EXT_shader_texture_lod,
    ): EXT_shader_texture_lod? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.EXT_texture_compression_bptc,
    ): EXT_texture_compression_bptc? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.EXT_texture_compression_rgtc,
    ): EXT_texture_compression_rgtc? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.EXT_texture_filter_anisotropic,
    ): EXT_texture_filter_anisotropic? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.KHR_parallel_shader_compile,
    ): KHR_parallel_shader_compile? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.OES_element_index_uint,
    ): OES_element_index_uint? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.OES_fbo_render_mipmap,
    ): OES_fbo_render_mipmap? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.OES_standard_derivatives,
    ): OES_standard_derivatives? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.OES_texture_float,
    ): OES_texture_float? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.OES_texture_float_linear,
    ): OES_texture_float_linear? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.OES_texture_half_float,
    ): OES_texture_half_float? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.OES_texture_half_float_linear,
    ): OES_texture_half_float_linear? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.OES_vertex_array_object,
    ): OES_vertex_array_object? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.OVR_multiview2,
    ): OVR_multiview2? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_color_buffer_float,
    ): WEBGL_color_buffer_float? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_compressed_texture_astc,
    ): WEBGL_compressed_texture_astc? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_compressed_texture_etc,
    ): WEBGL_compressed_texture_etc? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_compressed_texture_etc1,
    ): WEBGL_compressed_texture_etc1? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_compressed_texture_pvrtc,
    ): WEBGL_compressed_texture_pvrtc? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_compressed_texture_s3tc,
    ): WEBGL_compressed_texture_s3tc? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_compressed_texture_s3tc_srgb,
    ): WEBGL_compressed_texture_s3tc_srgb? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_debug_renderer_info,
    ): WEBGL_debug_renderer_info? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_debug_shaders,
    ): WEBGL_debug_shaders? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_depth_texture,
    ): WEBGL_depth_texture? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_draw_buffers,
    ): WEBGL_draw_buffers? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_lose_context,
    ): WEBGL_lose_context? = definedExternally

    fun getExtension(
        extensionName: WebGLExtension.WEBGL_multi_draw,
    ): WEBGL_multi_draw? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getFramebufferAttachmentParameter)
     */
    fun getFramebufferAttachmentParameter(
        target: GLenum,
        attachment: GLenum,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getParameter)
     */
    fun getParameter(pname: GLenum): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getProgramInfoLog)
     */
    fun getProgramInfoLog(program: WebGLProgram): String? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getProgramParameter)
     */
    fun getProgramParameter(
        program: WebGLProgram,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getRenderbufferParameter)
     */
    fun getRenderbufferParameter(
        target: GLenum,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderInfoLog)
     */
    fun getShaderInfoLog(shader: WebGLShader): String? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderParameter)
     */
    fun getShaderParameter(
        shader: WebGLShader,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderPrecisionFormat)
     */
    fun getShaderPrecisionFormat(
        shadertype: GLenum,
        precisiontype: GLenum,
    ): WebGLShaderPrecisionFormat? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderSource)
     */
    fun getShaderSource(shader: WebGLShader): String? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getSupportedExtensions)
     */
    fun getSupportedExtensions(): ReadonlyArray<JsString>? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getTexParameter)
     */
    fun getTexParameter(
        target: GLenum,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getUniform)
     */
    fun getUniform(
        program: WebGLProgram,
        location: WebGLUniformLocation,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getUniformLocation)
     */
    fun getUniformLocation(
        program: WebGLProgram,
        name: String,
    ): WebGLUniformLocation? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getVertexAttrib)
     */
    fun getVertexAttrib(
        index: GLuint,
        pname: GLenum,
    ): JsAny? = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getVertexAttribOffset)
     */
    fun getVertexAttribOffset(
        index: GLuint,
        pname: GLenum,
    ): GLintptr = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/hint)
     */
    fun hint(
        target: GLenum,
        mode: GLenum,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isBuffer)
     */
    fun isBuffer(buffer: WebGLBuffer?): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isContextLost)
     */
    fun isContextLost(): Boolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isEnabled)
     */
    fun isEnabled(cap: GLenum): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isFramebuffer)
     */
    fun isFramebuffer(framebuffer: WebGLFramebuffer?): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isProgram)
     */
    fun isProgram(program: WebGLProgram?): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isRenderbuffer)
     */
    fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isShader)
     */
    fun isShader(shader: WebGLShader?): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isTexture)
     */
    fun isTexture(texture: WebGLTexture?): GLboolean = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/lineWidth)
     */
    fun lineWidth(width: GLfloat): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/linkProgram)
     */
    fun linkProgram(program: WebGLProgram): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/pixelStorei)
     */
    fun pixelStorei(
        pname: GLenum,
        param: GLint,
    ): Unit = definedExternally

    fun pixelStorei(
        pname: GLenum,
        param: GLboolean,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/polygonOffset)
     */
    fun polygonOffset(
        factor: GLfloat,
        units: GLfloat,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/renderbufferStorage)
     */
    fun renderbufferStorage(
        target: GLenum,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/sampleCoverage)
     */
    fun sampleCoverage(
        value: GLclampf,
        invert: GLboolean,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/scissor)
     */
    fun scissor(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/shaderSource)
     */
    fun shaderSource(
        shader: WebGLShader,
        source: String,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilFunc)
     */
    fun stencilFunc(
        func: GLenum,
        ref: GLint,
        mask: GLuint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilFuncSeparate)
     */
    fun stencilFuncSeparate(
        face: GLenum,
        func: GLenum,
        ref: GLint,
        mask: GLuint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilMask)
     */
    fun stencilMask(mask: GLuint): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilMaskSeparate)
     */
    fun stencilMaskSeparate(
        face: GLenum,
        mask: GLuint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilOp)
     */
    fun stencilOp(
        fail: GLenum,
        zfail: GLenum,
        zpass: GLenum,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilOpSeparate)
     */
    fun stencilOpSeparate(
        face: GLenum,
        fail: GLenum,
        zfail: GLenum,
        zpass: GLenum,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texParameter)
     */
    fun texParameterf(
        target: GLenum,
        pname: GLenum,
        param: GLenum,
    ): Unit = definedExternally

    fun texParameterf(
        target: GLenum,
        pname: GLenum,
        param: GLfloat,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texParameter)
     */
    fun texParameteri(
        target: GLenum,
        pname: GLenum,
        param: GLenum,
    ): Unit = definedExternally

    fun texParameteri(
        target: GLenum,
        pname: GLenum,
        param: GLint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform1f(
        location: WebGLUniformLocation?,
        x: GLfloat,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform1i(
        location: WebGLUniformLocation?,
        x: GLint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform2f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform2i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform3f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform3i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
        z: GLint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform4f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
        w: GLfloat,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     */
    fun uniform4i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
        z: GLint,
        w: GLint,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/useProgram)
     */
    fun useProgram(program: WebGLProgram?): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/validateProgram)
     */
    fun validateProgram(program: WebGLProgram): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib1f(
        index: GLuint,
        x: GLfloat,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib1fv(
        index: GLuint,
        values: Float32List,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib2f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib2fv(
        index: GLuint,
        values: Float32List,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib3f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib3fv(
        index: GLuint,
        values: Float32List,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib4f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
        w: GLfloat,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib)
     */
    fun vertexAttrib4fv(
        index: GLuint,
        values: Float32List,
    ): Unit = definedExternally

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
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/viewport)
     */
    fun viewport(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    ): Unit = definedExternally

    @JsName("makeXRCompatible")
    fun makeXRCompatibleAsync(): Promise<Void> = definedExternally
}

suspend inline fun WebGLRenderingContextBase.makeXRCompatible() {
    makeXRCompatibleAsync().await()
}
