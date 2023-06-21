// Automatically generated - do not modify!

package webgl

import js.core.ReadonlyArray
import web.canvas.PredefinedColorSpace

sealed external interface WebGLRenderingContextBase {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/canvas) */
    val canvas: Any /* HTMLCanvasElement | OffscreenCanvas */
    var drawingBufferColorSpace: PredefinedColorSpace

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawingBufferHeight) */
    val drawingBufferHeight: GLsizei

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawingBufferWidth) */
    val drawingBufferWidth: GLsizei

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/activeTexture) */
    fun activeTexture(texture: GLenum)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/attachShader) */
    fun attachShader(
        program: WebGLProgram,
        shader: WebGLShader,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindAttribLocation) */
    fun bindAttribLocation(
        program: WebGLProgram,
        index: GLuint,
        name: String,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindBuffer) */
    fun bindBuffer(
        target: GLenum,
        buffer: WebGLBuffer?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindFramebuffer) */
    fun bindFramebuffer(
        target: GLenum,
        framebuffer: WebGLFramebuffer?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindRenderbuffer) */
    fun bindRenderbuffer(
        target: GLenum,
        renderbuffer: WebGLRenderbuffer?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bindTexture) */
    fun bindTexture(
        target: GLenum,
        texture: WebGLTexture?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendColor) */
    fun blendColor(
        red: GLclampf,
        green: GLclampf,
        blue: GLclampf,
        alpha: GLclampf,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendEquation) */
    fun blendEquation(mode: GLenum)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendEquationSeparate) */
    fun blendEquationSeparate(
        modeRGB: GLenum,
        modeAlpha: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendFunc) */
    fun blendFunc(
        sfactor: GLenum,
        dfactor: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/blendFuncSeparate) */
    fun blendFuncSeparate(
        srcRGB: GLenum,
        dstRGB: GLenum,
        srcAlpha: GLenum,
        dstAlpha: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/checkFramebufferStatus) */
    fun checkFramebufferStatus(target: GLenum): GLenum

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clear) */
    fun clear(mask: GLbitfield)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearColor) */
    fun clearColor(
        red: GLclampf,
        green: GLclampf,
        blue: GLclampf,
        alpha: GLclampf,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearDepth) */
    fun clearDepth(depth: GLclampf)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/clearStencil) */
    fun clearStencil(s: GLint)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/colorMask) */
    fun colorMask(
        red: GLboolean,
        green: GLboolean,
        blue: GLboolean,
        alpha: GLboolean,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compileShader) */
    fun compileShader(shader: WebGLShader)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/copyTexImage2D) */
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

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/copyTexSubImage2D) */
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

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createBuffer) */
    fun createBuffer(): WebGLBuffer?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createFramebuffer) */
    fun createFramebuffer(): WebGLFramebuffer?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createProgram) */
    fun createProgram(): WebGLProgram?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createRenderbuffer) */
    fun createRenderbuffer(): WebGLRenderbuffer?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createShader) */
    fun createShader(type: GLenum): WebGLShader?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/createTexture) */
    fun createTexture(): WebGLTexture?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/cullFace) */
    fun cullFace(mode: GLenum)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteBuffer) */
    fun deleteBuffer(buffer: WebGLBuffer?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteFramebuffer) */
    fun deleteFramebuffer(framebuffer: WebGLFramebuffer?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteProgram) */
    fun deleteProgram(program: WebGLProgram?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteRenderbuffer) */
    fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteShader) */
    fun deleteShader(shader: WebGLShader?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/deleteTexture) */
    fun deleteTexture(texture: WebGLTexture?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthFunc) */
    fun depthFunc(func: GLenum)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthMask) */
    fun depthMask(flag: GLboolean)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/depthRange) */
    fun depthRange(
        zNear: GLclampf,
        zFar: GLclampf,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/detachShader) */
    fun detachShader(
        program: WebGLProgram,
        shader: WebGLShader,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/disable) */
    fun disable(cap: GLenum)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/disableVertexAttribArray) */
    fun disableVertexAttribArray(index: GLuint)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawArrays) */
    fun drawArrays(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/drawElements) */
    fun drawElements(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/enable) */
    fun enable(cap: GLenum)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/enableVertexAttribArray) */
    fun enableVertexAttribArray(index: GLuint)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/finish) */
    fun finish()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/flush) */
    fun flush()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/framebufferRenderbuffer) */
    fun framebufferRenderbuffer(
        target: GLenum,
        attachment: GLenum,
        renderbuffertarget: GLenum,
        renderbuffer: WebGLRenderbuffer?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/framebufferTexture2D) */
    fun framebufferTexture2D(
        target: GLenum,
        attachment: GLenum,
        textarget: GLenum,
        texture: WebGLTexture?,
        level: GLint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/frontFace) */
    fun frontFace(mode: GLenum)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/generateMipmap) */
    fun generateMipmap(target: GLenum)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getActiveAttrib) */
    fun getActiveAttrib(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getActiveUniform) */
    fun getActiveUniform(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getAttachedShaders) */
    fun getAttachedShaders(program: WebGLProgram): ReadonlyArray<WebGLShader>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getAttribLocation) */
    fun getAttribLocation(
        program: WebGLProgram,
        name: String,
    ): GLint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getBufferParameter) */
    fun getBufferParameter(
        target: GLenum,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getContextAttributes) */
    fun getContextAttributes(): WebGLContextAttributes?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getError) */
    fun getError(): GLenum

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getExtension) */
    fun getExtension(extensionName: WebGLExtension.ANGLE_instanced_arrays): ANGLE_instanced_arrays?
    fun getExtension(extensionName: WebGLExtension.EXT_blend_minmax): EXT_blend_minmax?
    fun getExtension(extensionName: WebGLExtension.EXT_color_buffer_float): EXT_color_buffer_float?
    fun getExtension(extensionName: WebGLExtension.EXT_color_buffer_half_float): EXT_color_buffer_half_float?
    fun getExtension(extensionName: WebGLExtension.EXT_float_blend): EXT_float_blend?
    fun getExtension(extensionName: WebGLExtension.EXT_frag_depth): EXT_frag_depth?
    fun getExtension(extensionName: WebGLExtension.EXT_sRGB): EXT_sRGB?
    fun getExtension(extensionName: WebGLExtension.EXT_shader_texture_lod): EXT_shader_texture_lod?
    fun getExtension(extensionName: WebGLExtension.EXT_texture_compression_bptc): EXT_texture_compression_bptc?
    fun getExtension(extensionName: WebGLExtension.EXT_texture_compression_rgtc): EXT_texture_compression_rgtc?
    fun getExtension(extensionName: WebGLExtension.EXT_texture_filter_anisotropic): EXT_texture_filter_anisotropic?
    fun getExtension(extensionName: WebGLExtension.KHR_parallel_shader_compile): KHR_parallel_shader_compile?
    fun getExtension(extensionName: WebGLExtension.OES_element_index_uint): OES_element_index_uint?
    fun getExtension(extensionName: WebGLExtension.OES_fbo_render_mipmap): OES_fbo_render_mipmap?
    fun getExtension(extensionName: WebGLExtension.OES_standard_derivatives): OES_standard_derivatives?
    fun getExtension(extensionName: WebGLExtension.OES_texture_float): OES_texture_float?
    fun getExtension(extensionName: WebGLExtension.OES_texture_float_linear): OES_texture_float_linear?
    fun getExtension(extensionName: WebGLExtension.OES_texture_half_float): OES_texture_half_float?
    fun getExtension(extensionName: WebGLExtension.OES_texture_half_float_linear): OES_texture_half_float_linear?
    fun getExtension(extensionName: WebGLExtension.OES_vertex_array_object): OES_vertex_array_object?
    fun getExtension(extensionName: WebGLExtension.OVR_multiview2): OVR_multiview2?
    fun getExtension(extensionName: WebGLExtension.WEBGL_color_buffer_float): WEBGL_color_buffer_float?
    fun getExtension(extensionName: WebGLExtension.WEBGL_compressed_texture_astc): WEBGL_compressed_texture_astc?
    fun getExtension(extensionName: WebGLExtension.WEBGL_compressed_texture_etc): WEBGL_compressed_texture_etc?
    fun getExtension(extensionName: WebGLExtension.WEBGL_compressed_texture_etc1): WEBGL_compressed_texture_etc1?
    fun getExtension(extensionName: WebGLExtension.WEBGL_compressed_texture_pvrtc): WEBGL_compressed_texture_pvrtc?
    fun getExtension(extensionName: WebGLExtension.WEBGL_compressed_texture_s3tc): WEBGL_compressed_texture_s3tc?
    fun getExtension(extensionName: WebGLExtension.WEBGL_compressed_texture_s3tc_srgb): WEBGL_compressed_texture_s3tc_srgb?
    fun getExtension(extensionName: WebGLExtension.WEBGL_debug_renderer_info): WEBGL_debug_renderer_info?
    fun getExtension(extensionName: WebGLExtension.WEBGL_debug_shaders): WEBGL_debug_shaders?
    fun getExtension(extensionName: WebGLExtension.WEBGL_depth_texture): WEBGL_depth_texture?
    fun getExtension(extensionName: WebGLExtension.WEBGL_draw_buffers): WEBGL_draw_buffers?
    fun getExtension(extensionName: WebGLExtension.WEBGL_lose_context): WEBGL_lose_context?
    fun getExtension(extensionName: WebGLExtension.WEBGL_multi_draw): WEBGL_multi_draw?
    fun getExtension(name: String): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getFramebufferAttachmentParameter) */
    fun getFramebufferAttachmentParameter(
        target: GLenum,
        attachment: GLenum,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getParameter) */
    fun getParameter(pname: GLenum): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getProgramInfoLog) */
    fun getProgramInfoLog(program: WebGLProgram): String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getProgramParameter) */
    fun getProgramParameter(
        program: WebGLProgram,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getRenderbufferParameter) */
    fun getRenderbufferParameter(
        target: GLenum,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderInfoLog) */
    fun getShaderInfoLog(shader: WebGLShader): String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderParameter) */
    fun getShaderParameter(
        shader: WebGLShader,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderPrecisionFormat) */
    fun getShaderPrecisionFormat(
        shadertype: GLenum,
        precisiontype: GLenum,
    ): WebGLShaderPrecisionFormat?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getShaderSource) */
    fun getShaderSource(shader: WebGLShader): String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getSupportedExtensions) */
    fun getSupportedExtensions(): ReadonlyArray<String>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getTexParameter) */
    fun getTexParameter(
        target: GLenum,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getUniform) */
    fun getUniform(
        program: WebGLProgram,
        location: WebGLUniformLocation,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getUniformLocation) */
    fun getUniformLocation(
        program: WebGLProgram,
        name: String,
    ): WebGLUniformLocation?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getVertexAttrib) */
    fun getVertexAttrib(
        index: GLuint,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/getVertexAttribOffset) */
    fun getVertexAttribOffset(
        index: GLuint,
        pname: GLenum,
    ): GLintptr

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/hint) */
    fun hint(
        target: GLenum,
        mode: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isBuffer) */
    fun isBuffer(buffer: WebGLBuffer?): GLboolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isContextLost) */
    fun isContextLost(): Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isEnabled) */
    fun isEnabled(cap: GLenum): GLboolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isFramebuffer) */
    fun isFramebuffer(framebuffer: WebGLFramebuffer?): GLboolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isProgram) */
    fun isProgram(program: WebGLProgram?): GLboolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isRenderbuffer) */
    fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): GLboolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isShader) */
    fun isShader(shader: WebGLShader?): GLboolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/isTexture) */
    fun isTexture(texture: WebGLTexture?): GLboolean
    fun lineWidth(width: GLfloat)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/linkProgram) */
    fun linkProgram(program: WebGLProgram)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/pixelStorei) */
    fun pixelStorei(
        pname: GLenum,
        param: GLint, /* | GLboolean */
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/polygonOffset) */
    fun polygonOffset(
        factor: GLfloat,
        units: GLfloat,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/renderbufferStorage) */
    fun renderbufferStorage(
        target: GLenum,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/sampleCoverage) */
    fun sampleCoverage(
        value: GLclampf,
        invert: GLboolean,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/scissor) */
    fun scissor(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/shaderSource) */
    fun shaderSource(
        shader: WebGLShader,
        source: String,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilFunc) */
    fun stencilFunc(
        func: GLenum,
        ref: GLint,
        mask: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilFuncSeparate) */
    fun stencilFuncSeparate(
        face: GLenum,
        func: GLenum,
        ref: GLint,
        mask: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilMask) */
    fun stencilMask(mask: GLuint)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilMaskSeparate) */
    fun stencilMaskSeparate(
        face: GLenum,
        mask: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilOp) */
    fun stencilOp(
        fail: GLenum,
        zfail: GLenum,
        zpass: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/stencilOpSeparate) */
    fun stencilOpSeparate(
        face: GLenum,
        fail: GLenum,
        zfail: GLenum,
        zpass: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texParameter) */
    fun texParameterf(
        target: GLenum,
        pname: GLenum,
        param: GLfloat,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texParameter) */
    fun texParameteri(
        target: GLenum,
        pname: GLenum,
        param: GLint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform1f(
        location: WebGLUniformLocation?,
        x: GLfloat,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform1i(
        location: WebGLUniformLocation?,
        x: GLint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform2f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform2i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform3f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform3i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
        z: GLint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform4f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
        w: GLfloat,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform) */
    fun uniform4i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
        z: GLint,
        w: GLint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/useProgram) */
    fun useProgram(program: WebGLProgram?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/validateProgram) */
    fun validateProgram(program: WebGLProgram)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib) */
    fun vertexAttrib1f(
        index: GLuint,
        x: GLfloat,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib) */
    fun vertexAttrib1fv(
        index: GLuint,
        values: Float32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib) */
    fun vertexAttrib2f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib) */
    fun vertexAttrib2fv(
        index: GLuint,
        values: Float32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib) */
    fun vertexAttrib3f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib) */
    fun vertexAttrib3fv(
        index: GLuint,
        values: Float32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib) */
    fun vertexAttrib4f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
        w: GLfloat,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttrib) */
    fun vertexAttrib4fv(
        index: GLuint,
        values: Float32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/vertexAttribPointer) */
    fun vertexAttribPointer(
        index: GLuint,
        size: GLint,
        type: GLenum,
        normalized: GLboolean,
        stride: GLsizei,
        offset: GLintptr,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/viewport) */
    fun viewport(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    val DEPTH_BUFFER_BIT: GLenum
    val STENCIL_BUFFER_BIT: GLenum
    val COLOR_BUFFER_BIT: GLenum
    val POINTS: GLenum
    val LINES: GLenum
    val LINE_LOOP: GLenum
    val LINE_STRIP: GLenum
    val TRIANGLES: GLenum
    val TRIANGLE_STRIP: GLenum
    val TRIANGLE_FAN: GLenum
    val ZERO: GLenum
    val ONE: GLenum
    val SRC_COLOR: GLenum
    val ONE_MINUS_SRC_COLOR: GLenum
    val SRC_ALPHA: GLenum
    val ONE_MINUS_SRC_ALPHA: GLenum
    val DST_ALPHA: GLenum
    val ONE_MINUS_DST_ALPHA: GLenum
    val DST_COLOR: GLenum
    val ONE_MINUS_DST_COLOR: GLenum
    val SRC_ALPHA_SATURATE: GLenum
    val FUNC_ADD: GLenum
    val BLEND_EQUATION: GLenum
    val BLEND_EQUATION_RGB: GLenum
    val BLEND_EQUATION_ALPHA: GLenum
    val FUNC_SUBTRACT: GLenum
    val FUNC_REVERSE_SUBTRACT: GLenum
    val BLEND_DST_RGB: GLenum
    val BLEND_SRC_RGB: GLenum
    val BLEND_DST_ALPHA: GLenum
    val BLEND_SRC_ALPHA: GLenum
    val CONSTANT_COLOR: GLenum
    val ONE_MINUS_CONSTANT_COLOR: GLenum
    val CONSTANT_ALPHA: GLenum
    val ONE_MINUS_CONSTANT_ALPHA: GLenum
    val BLEND_COLOR: GLenum
    val ARRAY_BUFFER: GLenum
    val ELEMENT_ARRAY_BUFFER: GLenum
    val ARRAY_BUFFER_BINDING: GLenum
    val ELEMENT_ARRAY_BUFFER_BINDING: GLenum
    val STREAM_DRAW: GLenum
    val STATIC_DRAW: GLenum
    val DYNAMIC_DRAW: GLenum
    val BUFFER_SIZE: GLenum
    val BUFFER_USAGE: GLenum
    val CURRENT_VERTEX_ATTRIB: GLenum
    val FRONT: GLenum
    val BACK: GLenum
    val FRONT_AND_BACK: GLenum
    val CULL_FACE: GLenum
    val BLEND: GLenum
    val DITHER: GLenum
    val STENCIL_TEST: GLenum
    val DEPTH_TEST: GLenum
    val SCISSOR_TEST: GLenum
    val POLYGON_OFFSET_FILL: GLenum
    val SAMPLE_ALPHA_TO_COVERAGE: GLenum
    val SAMPLE_COVERAGE: GLenum
    val NO_ERROR: GLenum
    val INVALID_ENUM: GLenum
    val INVALID_VALUE: GLenum
    val INVALID_OPERATION: GLenum
    val OUT_OF_MEMORY: GLenum
    val CW: GLenum
    val CCW: GLenum
    val LINE_WIDTH: GLenum
    val ALIASED_POINT_SIZE_RANGE: GLenum
    val ALIASED_LINE_WIDTH_RANGE: GLenum
    val CULL_FACE_MODE: GLenum
    val FRONT_FACE: GLenum
    val DEPTH_RANGE: GLenum
    val DEPTH_WRITEMASK: GLenum
    val DEPTH_CLEAR_VALUE: GLenum
    val DEPTH_FUNC: GLenum
    val STENCIL_CLEAR_VALUE: GLenum
    val STENCIL_FUNC: GLenum
    val STENCIL_FAIL: GLenum
    val STENCIL_PASS_DEPTH_FAIL: GLenum
    val STENCIL_PASS_DEPTH_PASS: GLenum
    val STENCIL_REF: GLenum
    val STENCIL_VALUE_MASK: GLenum
    val STENCIL_WRITEMASK: GLenum
    val STENCIL_BACK_FUNC: GLenum
    val STENCIL_BACK_FAIL: GLenum
    val STENCIL_BACK_PASS_DEPTH_FAIL: GLenum
    val STENCIL_BACK_PASS_DEPTH_PASS: GLenum
    val STENCIL_BACK_REF: GLenum
    val STENCIL_BACK_VALUE_MASK: GLenum
    val STENCIL_BACK_WRITEMASK: GLenum
    val VIEWPORT: GLenum
    val SCISSOR_BOX: GLenum
    val COLOR_CLEAR_VALUE: GLenum
    val COLOR_WRITEMASK: GLenum
    val UNPACK_ALIGNMENT: GLenum
    val PACK_ALIGNMENT: GLenum
    val MAX_TEXTURE_SIZE: GLenum
    val MAX_VIEWPORT_DIMS: GLenum
    val SUBPIXEL_BITS: GLenum
    val RED_BITS: GLenum
    val GREEN_BITS: GLenum
    val BLUE_BITS: GLenum
    val ALPHA_BITS: GLenum
    val DEPTH_BITS: GLenum
    val STENCIL_BITS: GLenum
    val POLYGON_OFFSET_UNITS: GLenum
    val POLYGON_OFFSET_FACTOR: GLenum
    val TEXTURE_BINDING_2D: GLenum
    val SAMPLE_BUFFERS: GLenum
    val SAMPLES: GLenum
    val SAMPLE_COVERAGE_VALUE: GLenum
    val SAMPLE_COVERAGE_INVERT: GLenum
    val COMPRESSED_TEXTURE_FORMATS: GLenum
    val DONT_CARE: GLenum
    val FASTEST: GLenum
    val NICEST: GLenum
    val GENERATE_MIPMAP_HINT: GLenum
    val BYTE: GLenum
    val UNSIGNED_BYTE: GLenum
    val SHORT: GLenum
    val UNSIGNED_SHORT: GLenum
    val INT: GLenum
    val UNSIGNED_INT: GLenum
    val FLOAT: GLenum
    val DEPTH_COMPONENT: GLenum
    val ALPHA: GLenum
    val RGB: GLenum
    val RGBA: GLenum
    val LUMINANCE: GLenum
    val LUMINANCE_ALPHA: GLenum
    val UNSIGNED_SHORT_4_4_4_4: GLenum
    val UNSIGNED_SHORT_5_5_5_1: GLenum
    val UNSIGNED_SHORT_5_6_5: GLenum
    val FRAGMENT_SHADER: GLenum
    val VERTEX_SHADER: GLenum
    val MAX_VERTEX_ATTRIBS: GLenum
    val MAX_VERTEX_UNIFORM_VECTORS: GLenum
    val MAX_VARYING_VECTORS: GLenum
    val MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum
    val MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum
    val MAX_TEXTURE_IMAGE_UNITS: GLenum
    val MAX_FRAGMENT_UNIFORM_VECTORS: GLenum
    val SHADER_TYPE: GLenum
    val DELETE_STATUS: GLenum
    val LINK_STATUS: GLenum
    val VALIDATE_STATUS: GLenum
    val ATTACHED_SHADERS: GLenum
    val ACTIVE_UNIFORMS: GLenum
    val ACTIVE_ATTRIBUTES: GLenum
    val SHADING_LANGUAGE_VERSION: GLenum
    val CURRENT_PROGRAM: GLenum
    val NEVER: GLenum
    val LESS: GLenum
    val EQUAL: GLenum
    val LEQUAL: GLenum
    val GREATER: GLenum
    val NOTEQUAL: GLenum
    val GEQUAL: GLenum
    val ALWAYS: GLenum
    val KEEP: GLenum
    val REPLACE: GLenum
    val INCR: GLenum
    val DECR: GLenum
    val INVERT: GLenum
    val INCR_WRAP: GLenum
    val DECR_WRAP: GLenum
    val VENDOR: GLenum
    val RENDERER: GLenum
    val VERSION: GLenum
    val NEAREST: GLenum
    val LINEAR: GLenum
    val NEAREST_MIPMAP_NEAREST: GLenum
    val LINEAR_MIPMAP_NEAREST: GLenum
    val NEAREST_MIPMAP_LINEAR: GLenum
    val LINEAR_MIPMAP_LINEAR: GLenum
    val TEXTURE_MAG_FILTER: GLenum
    val TEXTURE_MIN_FILTER: GLenum
    val TEXTURE_WRAP_S: GLenum
    val TEXTURE_WRAP_T: GLenum
    val TEXTURE_2D: GLenum
    val TEXTURE: GLenum
    val TEXTURE_CUBE_MAP: GLenum
    val TEXTURE_BINDING_CUBE_MAP: GLenum
    val TEXTURE_CUBE_MAP_POSITIVE_X: GLenum
    val TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum
    val TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum
    val TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum
    val TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum
    val TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum
    val MAX_CUBE_MAP_TEXTURE_SIZE: GLenum
    val TEXTURE0: GLenum
    val TEXTURE1: GLenum
    val TEXTURE2: GLenum
    val TEXTURE3: GLenum
    val TEXTURE4: GLenum
    val TEXTURE5: GLenum
    val TEXTURE6: GLenum
    val TEXTURE7: GLenum
    val TEXTURE8: GLenum
    val TEXTURE9: GLenum
    val TEXTURE10: GLenum
    val TEXTURE11: GLenum
    val TEXTURE12: GLenum
    val TEXTURE13: GLenum
    val TEXTURE14: GLenum
    val TEXTURE15: GLenum
    val TEXTURE16: GLenum
    val TEXTURE17: GLenum
    val TEXTURE18: GLenum
    val TEXTURE19: GLenum
    val TEXTURE20: GLenum
    val TEXTURE21: GLenum
    val TEXTURE22: GLenum
    val TEXTURE23: GLenum
    val TEXTURE24: GLenum
    val TEXTURE25: GLenum
    val TEXTURE26: GLenum
    val TEXTURE27: GLenum
    val TEXTURE28: GLenum
    val TEXTURE29: GLenum
    val TEXTURE30: GLenum
    val TEXTURE31: GLenum
    val ACTIVE_TEXTURE: GLenum
    val REPEAT: GLenum
    val CLAMP_TO_EDGE: GLenum
    val MIRRORED_REPEAT: GLenum
    val FLOAT_VEC2: GLenum
    val FLOAT_VEC3: GLenum
    val FLOAT_VEC4: GLenum
    val INT_VEC2: GLenum
    val INT_VEC3: GLenum
    val INT_VEC4: GLenum
    val BOOL: GLenum
    val BOOL_VEC2: GLenum
    val BOOL_VEC3: GLenum
    val BOOL_VEC4: GLenum
    val FLOAT_MAT2: GLenum
    val FLOAT_MAT3: GLenum
    val FLOAT_MAT4: GLenum
    val SAMPLER_2D: GLenum
    val SAMPLER_CUBE: GLenum
    val VERTEX_ATTRIB_ARRAY_ENABLED: GLenum
    val VERTEX_ATTRIB_ARRAY_SIZE: GLenum
    val VERTEX_ATTRIB_ARRAY_STRIDE: GLenum
    val VERTEX_ATTRIB_ARRAY_TYPE: GLenum
    val VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum
    val VERTEX_ATTRIB_ARRAY_POINTER: GLenum
    val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum
    val IMPLEMENTATION_COLOR_READ_TYPE: GLenum
    val IMPLEMENTATION_COLOR_READ_FORMAT: GLenum
    val COMPILE_STATUS: GLenum
    val LOW_FLOAT: GLenum
    val MEDIUM_FLOAT: GLenum
    val HIGH_FLOAT: GLenum
    val LOW_INT: GLenum
    val MEDIUM_INT: GLenum
    val HIGH_INT: GLenum
    val FRAMEBUFFER: GLenum
    val RENDERBUFFER: GLenum
    val RGBA4: GLenum
    val RGB5_A1: GLenum
    val RGB565: GLenum
    val DEPTH_COMPONENT16: GLenum
    val STENCIL_INDEX8: GLenum
    val DEPTH_STENCIL: GLenum
    val RENDERBUFFER_WIDTH: GLenum
    val RENDERBUFFER_HEIGHT: GLenum
    val RENDERBUFFER_INTERNAL_FORMAT: GLenum
    val RENDERBUFFER_RED_SIZE: GLenum
    val RENDERBUFFER_GREEN_SIZE: GLenum
    val RENDERBUFFER_BLUE_SIZE: GLenum
    val RENDERBUFFER_ALPHA_SIZE: GLenum
    val RENDERBUFFER_DEPTH_SIZE: GLenum
    val RENDERBUFFER_STENCIL_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum
    val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum
    val COLOR_ATTACHMENT0: GLenum
    val DEPTH_ATTACHMENT: GLenum
    val STENCIL_ATTACHMENT: GLenum
    val DEPTH_STENCIL_ATTACHMENT: GLenum
    val NONE: GLenum
    val FRAMEBUFFER_COMPLETE: GLenum
    val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum
    val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum
    val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum
    val FRAMEBUFFER_UNSUPPORTED: GLenum
    val FRAMEBUFFER_BINDING: GLenum
    val RENDERBUFFER_BINDING: GLenum
    val MAX_RENDERBUFFER_SIZE: GLenum
    val INVALID_FRAMEBUFFER_OPERATION: GLenum
    val UNPACK_FLIP_Y_WEBGL: GLenum
    val UNPACK_PREMULTIPLY_ALPHA_WEBGL: GLenum
    val CONTEXT_LOST_WEBGL: GLenum
    val UNPACK_COLORSPACE_CONVERSION_WEBGL: GLenum
    val BROWSER_DEFAULT_WEBGL: GLenum
}
