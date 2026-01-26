// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.gl

import js.array.ReadonlyArray
import web.events.EventTarget
import web.images.PredefinedColorSpace
import kotlin.js.JsAny
import kotlin.js.JsString
import kotlin.js.definedExternally

/* mixin */
sealed
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

    val DEPTH_BUFFER_BIT: GLbitfield
        get() = definedExternally
    val STENCIL_BUFFER_BIT: GLbitfield
        get() = definedExternally
    val COLOR_BUFFER_BIT: GLbitfield
        get() = definedExternally
    val POINTS: GLenum
        get() = definedExternally
    val LINES: GLenum
        get() = definedExternally
    val LINE_LOOP: GLenum
        get() = definedExternally
    val LINE_STRIP: GLenum
        get() = definedExternally
    val TRIANGLES: GLenum
        get() = definedExternally
    val TRIANGLE_STRIP: GLenum
        get() = definedExternally
    val TRIANGLE_FAN: GLenum
        get() = definedExternally
    val ZERO: GLenum
        get() = definedExternally
    val ONE: GLenum
        get() = definedExternally
    val SRC_COLOR: GLenum
        get() = definedExternally
    val ONE_MINUS_SRC_COLOR: GLenum
        get() = definedExternally
    val SRC_ALPHA: GLenum
        get() = definedExternally
    val ONE_MINUS_SRC_ALPHA: GLenum
        get() = definedExternally
    val DST_ALPHA: GLenum
        get() = definedExternally
    val ONE_MINUS_DST_ALPHA: GLenum
        get() = definedExternally
    val DST_COLOR: GLenum
        get() = definedExternally
    val ONE_MINUS_DST_COLOR: GLenum
        get() = definedExternally
    val SRC_ALPHA_SATURATE: GLenum
        get() = definedExternally
    val FUNC_ADD: GLenum
        get() = definedExternally
    val BLEND_EQUATION: GLenum
        get() = definedExternally
    val BLEND_EQUATION_RGB: GLenum
        get() = definedExternally
    val BLEND_EQUATION_ALPHA: GLenum
        get() = definedExternally
    val FUNC_SUBTRACT: GLenum
        get() = definedExternally
    val FUNC_REVERSE_SUBTRACT: GLenum
        get() = definedExternally
    val BLEND_DST_RGB: GLenum
        get() = definedExternally
    val BLEND_SRC_RGB: GLenum
        get() = definedExternally
    val BLEND_DST_ALPHA: GLenum
        get() = definedExternally
    val BLEND_SRC_ALPHA: GLenum
        get() = definedExternally
    val CONSTANT_COLOR: GLenum
        get() = definedExternally
    val ONE_MINUS_CONSTANT_COLOR: GLenum
        get() = definedExternally
    val CONSTANT_ALPHA: GLenum
        get() = definedExternally
    val ONE_MINUS_CONSTANT_ALPHA: GLenum
        get() = definedExternally
    val BLEND_COLOR: GLenum
        get() = definedExternally
    val ARRAY_BUFFER: GLenum
        get() = definedExternally
    val ELEMENT_ARRAY_BUFFER: GLenum
        get() = definedExternally
    val ARRAY_BUFFER_BINDING: GLenum
        get() = definedExternally
    val ELEMENT_ARRAY_BUFFER_BINDING: GLenum
        get() = definedExternally
    val STREAM_DRAW: GLenum
        get() = definedExternally
    val STATIC_DRAW: GLenum
        get() = definedExternally
    val DYNAMIC_DRAW: GLenum
        get() = definedExternally
    val BUFFER_SIZE: GLenum
        get() = definedExternally
    val BUFFER_USAGE: GLenum
        get() = definedExternally
    val CURRENT_VERTEX_ATTRIB: GLenum
        get() = definedExternally
    val FRONT: GLenum
        get() = definedExternally
    val BACK: GLenum
        get() = definedExternally
    val FRONT_AND_BACK: GLenum
        get() = definedExternally
    val CULL_FACE: GLenum
        get() = definedExternally
    val BLEND: GLenum
        get() = definedExternally
    val DITHER: GLenum
        get() = definedExternally
    val STENCIL_TEST: GLenum
        get() = definedExternally
    val DEPTH_TEST: GLenum
        get() = definedExternally
    val SCISSOR_TEST: GLenum
        get() = definedExternally
    val POLYGON_OFFSET_FILL: GLenum
        get() = definedExternally
    val SAMPLE_ALPHA_TO_COVERAGE: GLenum
        get() = definedExternally
    val SAMPLE_COVERAGE: GLenum
        get() = definedExternally
    val NO_ERROR: GLenum
        get() = definedExternally
    val INVALID_ENUM: GLenum
        get() = definedExternally
    val INVALID_VALUE: GLenum
        get() = definedExternally
    val INVALID_OPERATION: GLenum
        get() = definedExternally
    val OUT_OF_MEMORY: GLenum
        get() = definedExternally
    val CW: GLenum
        get() = definedExternally
    val CCW: GLenum
        get() = definedExternally
    val LINE_WIDTH: GLenum
        get() = definedExternally
    val ALIASED_POINT_SIZE_RANGE: GLenum
        get() = definedExternally
    val ALIASED_LINE_WIDTH_RANGE: GLenum
        get() = definedExternally
    val CULL_FACE_MODE: GLenum
        get() = definedExternally
    val FRONT_FACE: GLenum
        get() = definedExternally
    val DEPTH_RANGE: GLenum
        get() = definedExternally
    val DEPTH_WRITEMASK: GLenum
        get() = definedExternally
    val DEPTH_CLEAR_VALUE: GLenum
        get() = definedExternally
    val DEPTH_FUNC: GLenum
        get() = definedExternally
    val STENCIL_CLEAR_VALUE: GLenum
        get() = definedExternally
    val STENCIL_FUNC: GLenum
        get() = definedExternally
    val STENCIL_FAIL: GLenum
        get() = definedExternally
    val STENCIL_PASS_DEPTH_FAIL: GLenum
        get() = definedExternally
    val STENCIL_PASS_DEPTH_PASS: GLenum
        get() = definedExternally
    val STENCIL_REF: GLenum
        get() = definedExternally
    val STENCIL_VALUE_MASK: GLenum
        get() = definedExternally
    val STENCIL_WRITEMASK: GLenum
        get() = definedExternally
    val STENCIL_BACK_FUNC: GLenum
        get() = definedExternally
    val STENCIL_BACK_FAIL: GLenum
        get() = definedExternally
    val STENCIL_BACK_PASS_DEPTH_FAIL: GLenum
        get() = definedExternally
    val STENCIL_BACK_PASS_DEPTH_PASS: GLenum
        get() = definedExternally
    val STENCIL_BACK_REF: GLenum
        get() = definedExternally
    val STENCIL_BACK_VALUE_MASK: GLenum
        get() = definedExternally
    val STENCIL_BACK_WRITEMASK: GLenum
        get() = definedExternally
    val VIEWPORT: GLenum
        get() = definedExternally
    val SCISSOR_BOX: GLenum
        get() = definedExternally
    val COLOR_CLEAR_VALUE: GLenum
        get() = definedExternally
    val COLOR_WRITEMASK: GLenum
        get() = definedExternally
    val UNPACK_ALIGNMENT: GLenum
        get() = definedExternally
    val PACK_ALIGNMENT: GLenum
        get() = definedExternally
    val MAX_TEXTURE_SIZE: GLenum
        get() = definedExternally
    val MAX_VIEWPORT_DIMS: GLenum
        get() = definedExternally
    val SUBPIXEL_BITS: GLenum
        get() = definedExternally
    val RED_BITS: GLenum
        get() = definedExternally
    val GREEN_BITS: GLenum
        get() = definedExternally
    val BLUE_BITS: GLenum
        get() = definedExternally
    val ALPHA_BITS: GLenum
        get() = definedExternally
    val DEPTH_BITS: GLenum
        get() = definedExternally
    val STENCIL_BITS: GLenum
        get() = definedExternally
    val POLYGON_OFFSET_UNITS: GLenum
        get() = definedExternally
    val POLYGON_OFFSET_FACTOR: GLenum
        get() = definedExternally
    val TEXTURE_BINDING_2D: GLenum
        get() = definedExternally
    val SAMPLE_BUFFERS: GLenum
        get() = definedExternally
    val SAMPLES: GLenum
        get() = definedExternally
    val SAMPLE_COVERAGE_VALUE: GLenum
        get() = definedExternally
    val SAMPLE_COVERAGE_INVERT: GLenum
        get() = definedExternally
    val COMPRESSED_TEXTURE_FORMATS: GLenum
        get() = definedExternally
    val DONT_CARE: GLenum
        get() = definedExternally
    val FASTEST: GLenum
        get() = definedExternally
    val NICEST: GLenum
        get() = definedExternally
    val GENERATE_MIPMAP_HINT: GLenum
        get() = definedExternally
    val BYTE: GLenum
        get() = definedExternally
    val UNSIGNED_BYTE: GLenum
        get() = definedExternally
    val SHORT: GLenum
        get() = definedExternally
    val UNSIGNED_SHORT: GLenum
        get() = definedExternally
    val INT: GLenum
        get() = definedExternally
    val UNSIGNED_INT: GLenum
        get() = definedExternally
    val FLOAT: GLenum
        get() = definedExternally
    val DEPTH_COMPONENT: GLenum
        get() = definedExternally
    val ALPHA: GLenum
        get() = definedExternally
    val RGB: GLenum
        get() = definedExternally
    val RGBA: GLenum
        get() = definedExternally
    val LUMINANCE: GLenum
        get() = definedExternally
    val LUMINANCE_ALPHA: GLenum
        get() = definedExternally
    val UNSIGNED_SHORT_4_4_4_4: GLenum
        get() = definedExternally
    val UNSIGNED_SHORT_5_5_5_1: GLenum
        get() = definedExternally
    val UNSIGNED_SHORT_5_6_5: GLenum
        get() = definedExternally
    val FRAGMENT_SHADER: GLenum
        get() = definedExternally
    val VERTEX_SHADER: GLenum
        get() = definedExternally
    val MAX_VERTEX_ATTRIBS: GLenum
        get() = definedExternally
    val MAX_VERTEX_UNIFORM_VECTORS: GLenum
        get() = definedExternally
    val MAX_VARYING_VECTORS: GLenum
        get() = definedExternally
    val MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum
        get() = definedExternally
    val MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum
        get() = definedExternally
    val MAX_TEXTURE_IMAGE_UNITS: GLenum
        get() = definedExternally
    val MAX_FRAGMENT_UNIFORM_VECTORS: GLenum
        get() = definedExternally
    val SHADER_TYPE: GLenum
        get() = definedExternally
    val DELETE_STATUS: GLenum
        get() = definedExternally
    val LINK_STATUS: GLenum
        get() = definedExternally
    val VALIDATE_STATUS: GLenum
        get() = definedExternally
    val ATTACHED_SHADERS: GLenum
        get() = definedExternally
    val ACTIVE_UNIFORMS: GLenum
        get() = definedExternally
    val ACTIVE_ATTRIBUTES: GLenum
        get() = definedExternally
    val SHADING_LANGUAGE_VERSION: GLenum
        get() = definedExternally
    val CURRENT_PROGRAM: GLenum
        get() = definedExternally
    val NEVER: GLenum
        get() = definedExternally
    val LESS: GLenum
        get() = definedExternally
    val EQUAL: GLenum
        get() = definedExternally
    val LEQUAL: GLenum
        get() = definedExternally
    val GREATER: GLenum
        get() = definedExternally
    val NOTEQUAL: GLenum
        get() = definedExternally
    val GEQUAL: GLenum
        get() = definedExternally
    val ALWAYS: GLenum
        get() = definedExternally
    val KEEP: GLenum
        get() = definedExternally
    val REPLACE: GLenum
        get() = definedExternally
    val INCR: GLenum
        get() = definedExternally
    val DECR: GLenum
        get() = definedExternally
    val INVERT: GLenum
        get() = definedExternally
    val INCR_WRAP: GLenum
        get() = definedExternally
    val DECR_WRAP: GLenum
        get() = definedExternally
    val VENDOR: GLenum
        get() = definedExternally
    val RENDERER: GLenum
        get() = definedExternally
    val VERSION: GLenum
        get() = definedExternally
    val NEAREST: GLenum
        get() = definedExternally
    val LINEAR: GLenum
        get() = definedExternally
    val NEAREST_MIPMAP_NEAREST: GLenum
        get() = definedExternally
    val LINEAR_MIPMAP_NEAREST: GLenum
        get() = definedExternally
    val NEAREST_MIPMAP_LINEAR: GLenum
        get() = definedExternally
    val LINEAR_MIPMAP_LINEAR: GLenum
        get() = definedExternally
    val TEXTURE_MAG_FILTER: GLenum
        get() = definedExternally
    val TEXTURE_MIN_FILTER: GLenum
        get() = definedExternally
    val TEXTURE_WRAP_S: GLenum
        get() = definedExternally
    val TEXTURE_WRAP_T: GLenum
        get() = definedExternally
    val TEXTURE_2D: GLenum
        get() = definedExternally
    val TEXTURE: GLenum
        get() = definedExternally
    val TEXTURE_CUBE_MAP: GLenum
        get() = definedExternally
    val TEXTURE_BINDING_CUBE_MAP: GLenum
        get() = definedExternally
    val TEXTURE_CUBE_MAP_POSITIVE_X: GLenum
        get() = definedExternally
    val TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum
        get() = definedExternally
    val TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum
        get() = definedExternally
    val TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum
        get() = definedExternally
    val TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum
        get() = definedExternally
    val TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum
        get() = definedExternally
    val MAX_CUBE_MAP_TEXTURE_SIZE: GLenum
        get() = definedExternally
    val TEXTURE0: GLenum
        get() = definedExternally
    val TEXTURE1: GLenum
        get() = definedExternally
    val TEXTURE2: GLenum
        get() = definedExternally
    val TEXTURE3: GLenum
        get() = definedExternally
    val TEXTURE4: GLenum
        get() = definedExternally
    val TEXTURE5: GLenum
        get() = definedExternally
    val TEXTURE6: GLenum
        get() = definedExternally
    val TEXTURE7: GLenum
        get() = definedExternally
    val TEXTURE8: GLenum
        get() = definedExternally
    val TEXTURE9: GLenum
        get() = definedExternally
    val TEXTURE10: GLenum
        get() = definedExternally
    val TEXTURE11: GLenum
        get() = definedExternally
    val TEXTURE12: GLenum
        get() = definedExternally
    val TEXTURE13: GLenum
        get() = definedExternally
    val TEXTURE14: GLenum
        get() = definedExternally
    val TEXTURE15: GLenum
        get() = definedExternally
    val TEXTURE16: GLenum
        get() = definedExternally
    val TEXTURE17: GLenum
        get() = definedExternally
    val TEXTURE18: GLenum
        get() = definedExternally
    val TEXTURE19: GLenum
        get() = definedExternally
    val TEXTURE20: GLenum
        get() = definedExternally
    val TEXTURE21: GLenum
        get() = definedExternally
    val TEXTURE22: GLenum
        get() = definedExternally
    val TEXTURE23: GLenum
        get() = definedExternally
    val TEXTURE24: GLenum
        get() = definedExternally
    val TEXTURE25: GLenum
        get() = definedExternally
    val TEXTURE26: GLenum
        get() = definedExternally
    val TEXTURE27: GLenum
        get() = definedExternally
    val TEXTURE28: GLenum
        get() = definedExternally
    val TEXTURE29: GLenum
        get() = definedExternally
    val TEXTURE30: GLenum
        get() = definedExternally
    val TEXTURE31: GLenum
        get() = definedExternally
    val ACTIVE_TEXTURE: GLenum
        get() = definedExternally
    val REPEAT: GLenum
        get() = definedExternally
    val CLAMP_TO_EDGE: GLenum
        get() = definedExternally
    val MIRRORED_REPEAT: GLenum
        get() = definedExternally
    val FLOAT_VEC2: GLenum
        get() = definedExternally
    val FLOAT_VEC3: GLenum
        get() = definedExternally
    val FLOAT_VEC4: GLenum
        get() = definedExternally
    val INT_VEC2: GLenum
        get() = definedExternally
    val INT_VEC3: GLenum
        get() = definedExternally
    val INT_VEC4: GLenum
        get() = definedExternally
    val BOOL: GLenum
        get() = definedExternally
    val BOOL_VEC2: GLenum
        get() = definedExternally
    val BOOL_VEC3: GLenum
        get() = definedExternally
    val BOOL_VEC4: GLenum
        get() = definedExternally
    val FLOAT_MAT2: GLenum
        get() = definedExternally
    val FLOAT_MAT3: GLenum
        get() = definedExternally
    val FLOAT_MAT4: GLenum
        get() = definedExternally
    val SAMPLER_2D: GLenum
        get() = definedExternally
    val SAMPLER_CUBE: GLenum
        get() = definedExternally
    val VERTEX_ATTRIB_ARRAY_ENABLED: GLenum
        get() = definedExternally
    val VERTEX_ATTRIB_ARRAY_SIZE: GLenum
        get() = definedExternally
    val VERTEX_ATTRIB_ARRAY_STRIDE: GLenum
        get() = definedExternally
    val VERTEX_ATTRIB_ARRAY_TYPE: GLenum
        get() = definedExternally
    val VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum
        get() = definedExternally
    val VERTEX_ATTRIB_ARRAY_POINTER: GLenum
        get() = definedExternally
    val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum
        get() = definedExternally
    val IMPLEMENTATION_COLOR_READ_TYPE: GLenum
        get() = definedExternally
    val IMPLEMENTATION_COLOR_READ_FORMAT: GLenum
        get() = definedExternally
    val COMPILE_STATUS: GLenum
        get() = definedExternally
    val LOW_FLOAT: GLenum
        get() = definedExternally
    val MEDIUM_FLOAT: GLenum
        get() = definedExternally
    val HIGH_FLOAT: GLenum
        get() = definedExternally
    val LOW_INT: GLenum
        get() = definedExternally
    val MEDIUM_INT: GLenum
        get() = definedExternally
    val HIGH_INT: GLenum
        get() = definedExternally
    val FRAMEBUFFER: GLenum
        get() = definedExternally
    val RENDERBUFFER: GLenum
        get() = definedExternally
    val RGBA4: GLenum
        get() = definedExternally
    val RGB5_A1: GLenum
        get() = definedExternally
    val RGBA8: GLenum
        get() = definedExternally
    val RGB565: GLenum
        get() = definedExternally
    val DEPTH_COMPONENT16: GLenum
        get() = definedExternally
    val STENCIL_INDEX8: GLenum
        get() = definedExternally
    val DEPTH_STENCIL: GLenum
        get() = definedExternally
    val RENDERBUFFER_WIDTH: GLenum
        get() = definedExternally
    val RENDERBUFFER_HEIGHT: GLenum
        get() = definedExternally
    val RENDERBUFFER_INTERNAL_FORMAT: GLenum
        get() = definedExternally
    val RENDERBUFFER_RED_SIZE: GLenum
        get() = definedExternally
    val RENDERBUFFER_GREEN_SIZE: GLenum
        get() = definedExternally
    val RENDERBUFFER_BLUE_SIZE: GLenum
        get() = definedExternally
    val RENDERBUFFER_ALPHA_SIZE: GLenum
        get() = definedExternally
    val RENDERBUFFER_DEPTH_SIZE: GLenum
        get() = definedExternally
    val RENDERBUFFER_STENCIL_SIZE: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum
        get() = definedExternally
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum
        get() = definedExternally
    val COLOR_ATTACHMENT0: GLenum
        get() = definedExternally
    val DEPTH_ATTACHMENT: GLenum
        get() = definedExternally
    val STENCIL_ATTACHMENT: GLenum
        get() = definedExternally
    val DEPTH_STENCIL_ATTACHMENT: GLenum
        get() = definedExternally
    val NONE: GLenum
        get() = definedExternally
    val FRAMEBUFFER_COMPLETE: GLenum
        get() = definedExternally
    val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum
        get() = definedExternally
    val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum
        get() = definedExternally
    val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum
        get() = definedExternally
    val FRAMEBUFFER_UNSUPPORTED: GLenum
        get() = definedExternally
    val FRAMEBUFFER_BINDING: GLenum
        get() = definedExternally
    val RENDERBUFFER_BINDING: GLenum
        get() = definedExternally
    val MAX_RENDERBUFFER_SIZE: GLenum
        get() = definedExternally
    val INVALID_FRAMEBUFFER_OPERATION: GLenum
        get() = definedExternally
    val UNPACK_FLIP_Y_WEBGL: GLenum
        get() = definedExternally
    val UNPACK_PREMULTIPLY_ALPHA_WEBGL: GLenum
        get() = definedExternally
    val CONTEXT_LOST_WEBGL: GLenum
        get() = definedExternally
    val UNPACK_COLORSPACE_CONVERSION_WEBGL: GLenum
        get() = definedExternally
    val BROWSER_DEFAULT_WEBGL: GLenum
        get() = definedExternally
}
