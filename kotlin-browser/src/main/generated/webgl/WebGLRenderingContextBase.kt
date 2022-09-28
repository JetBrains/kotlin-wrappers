// Automatically generated - do not modify!

package webgl

import dom.html.HTMLCanvasElement
import kotlinx.js.ReadonlyArray

sealed external interface WebGLRenderingContextBase {
    val canvas: HTMLCanvasElement
    val drawingBufferHeight: GLsizei
    val drawingBufferWidth: GLsizei
    fun activeTexture(texture: GLenum)
    fun attachShader(
        program: WebGLProgram,
        shader: WebGLShader,
    )

    fun bindAttribLocation(
        program: WebGLProgram,
        index: GLuint,
        name: String,
    )

    fun bindBuffer(
        target: GLenum,
        buffer: WebGLBuffer?,
    )

    fun bindFramebuffer(
        target: GLenum,
        framebuffer: WebGLFramebuffer?,
    )

    fun bindRenderbuffer(
        target: GLenum,
        renderbuffer: WebGLRenderbuffer?,
    )

    fun bindTexture(
        target: GLenum,
        texture: WebGLTexture?,
    )

    fun blendColor(
        red: GLclampf,
        green: GLclampf,
        blue: GLclampf,
        alpha: GLclampf,
    )

    fun blendEquation(mode: GLenum)
    fun blendEquationSeparate(
        modeRGB: GLenum,
        modeAlpha: GLenum,
    )

    fun blendFunc(
        sfactor: GLenum,
        dfactor: GLenum,
    )

    fun blendFuncSeparate(
        srcRGB: GLenum,
        dstRGB: GLenum,
        srcAlpha: GLenum,
        dstAlpha: GLenum,
    )

    fun checkFramebufferStatus(target: GLenum): GLenum
    fun clear(mask: GLbitfield)
    fun clearColor(
        red: GLclampf,
        green: GLclampf,
        blue: GLclampf,
        alpha: GLclampf,
    )

    fun clearDepth(depth: GLclampf)
    fun clearStencil(s: GLint)
    fun colorMask(
        red: GLboolean,
        green: GLboolean,
        blue: GLboolean,
        alpha: GLboolean,
    )

    fun compileShader(shader: WebGLShader)
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

    fun createBuffer(): WebGLBuffer?
    fun createFramebuffer(): WebGLFramebuffer?
    fun createProgram(): WebGLProgram?
    fun createRenderbuffer(): WebGLRenderbuffer?
    fun createShader(type: GLenum): WebGLShader?
    fun createTexture(): WebGLTexture?
    fun cullFace(mode: GLenum)
    fun deleteBuffer(buffer: WebGLBuffer?)
    fun deleteFramebuffer(framebuffer: WebGLFramebuffer?)
    fun deleteProgram(program: WebGLProgram?)
    fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?)
    fun deleteShader(shader: WebGLShader?)
    fun deleteTexture(texture: WebGLTexture?)
    fun depthFunc(func: GLenum)
    fun depthMask(flag: GLboolean)
    fun depthRange(
        zNear: GLclampf,
        zFar: GLclampf,
    )

    fun detachShader(
        program: WebGLProgram,
        shader: WebGLShader,
    )

    fun disable(cap: GLenum)
    fun disableVertexAttribArray(index: GLuint)
    fun drawArrays(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
    )

    fun drawElements(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
    )

    fun enable(cap: GLenum)
    fun enableVertexAttribArray(index: GLuint)
    fun finish()
    fun flush()
    fun framebufferRenderbuffer(
        target: GLenum,
        attachment: GLenum,
        renderbuffertarget: GLenum,
        renderbuffer: WebGLRenderbuffer?,
    )

    fun framebufferTexture2D(
        target: GLenum,
        attachment: GLenum,
        textarget: GLenum,
        texture: WebGLTexture?,
        level: GLint,
    )

    fun frontFace(mode: GLenum)
    fun generateMipmap(target: GLenum)
    fun getActiveAttrib(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    fun getActiveUniform(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    fun getAttachedShaders(program: WebGLProgram): ReadonlyArray<WebGLShader>?
    fun getAttribLocation(
        program: WebGLProgram,
        name: String,
    ): GLint

    fun getBufferParameter(
        target: GLenum,
        pname: GLenum,
    ): Any

    fun getContextAttributes(): WebGLContextAttributes?
    fun getError(): GLenum
    fun getExtension(extensionName: WebGLExtension.EXT_blend_minmax): EXT_blend_minmax?
    fun getExtension(extensionName: WebGLExtension.EXT_color_buffer_float): EXT_color_buffer_float?
    fun getExtension(extensionName: WebGLExtension.EXT_color_buffer_half_float): EXT_color_buffer_half_float?
    fun getExtension(extensionName: WebGLExtension.EXT_float_blend): EXT_float_blend?
    fun getExtension(extensionName: WebGLExtension.EXT_texture_filter_anisotropic): EXT_texture_filter_anisotropic?
    fun getExtension(extensionName: WebGLExtension.EXT_frag_depth): EXT_frag_depth?
    fun getExtension(extensionName: WebGLExtension.EXT_shader_texture_lod): EXT_shader_texture_lod?
    fun getExtension(extensionName: WebGLExtension.EXT_sRGB): EXT_sRGB?
    fun getExtension(extensionName: WebGLExtension.KHR_parallel_shader_compile): KHR_parallel_shader_compile?
    fun getExtension(extensionName: WebGLExtension.OES_vertex_array_object): OES_vertex_array_object?
    fun getExtension(extensionName: WebGLExtension.OVR_multiview2): OVR_multiview2?
    fun getExtension(extensionName: WebGLExtension.WEBGL_color_buffer_float): WEBGL_color_buffer_float?
    fun getExtension(extensionName: WebGLExtension.WEBGL_compressed_texture_astc): WEBGL_compressed_texture_astc?
    fun getExtension(extensionName: WebGLExtension.WEBGL_compressed_texture_etc): WEBGL_compressed_texture_etc?
    fun getExtension(extensionName: WebGLExtension.WEBGL_compressed_texture_etc1): WEBGL_compressed_texture_etc1?
    fun getExtension(extensionName: WebGLExtension.WEBGL_compressed_texture_s3tc_srgb): WEBGL_compressed_texture_s3tc_srgb?
    fun getExtension(extensionName: WebGLExtension.WEBGL_debug_shaders): WEBGL_debug_shaders?
    fun getExtension(extensionName: WebGLExtension.WEBGL_draw_buffers): WEBGL_draw_buffers?
    fun getExtension(extensionName: WebGLExtension.WEBGL_lose_context): WEBGL_lose_context?
    fun getExtension(extensionName: WebGLExtension.WEBGL_depth_texture): WEBGL_depth_texture?
    fun getExtension(extensionName: WebGLExtension.WEBGL_debug_renderer_info): WEBGL_debug_renderer_info?
    fun getExtension(extensionName: WebGLExtension.WEBGL_compressed_texture_s3tc): WEBGL_compressed_texture_s3tc?
    fun getExtension(extensionName: WebGLExtension.OES_texture_half_float_linear): OES_texture_half_float_linear?
    fun getExtension(extensionName: WebGLExtension.OES_texture_half_float): OES_texture_half_float?
    fun getExtension(extensionName: WebGLExtension.OES_texture_float_linear): OES_texture_float_linear?
    fun getExtension(extensionName: WebGLExtension.OES_texture_float): OES_texture_float?
    fun getExtension(extensionName: WebGLExtension.OES_standard_derivatives): OES_standard_derivatives?
    fun getExtension(extensionName: WebGLExtension.OES_element_index_uint): OES_element_index_uint?
    fun getExtension(extensionName: WebGLExtension.ANGLE_instanced_arrays): ANGLE_instanced_arrays?
    fun getExtension(name: String): Any
    fun getFramebufferAttachmentParameter(
        target: GLenum,
        attachment: GLenum,
        pname: GLenum,
    ): Any

    fun getParameter(pname: GLenum): Any
    fun getProgramInfoLog(program: WebGLProgram): String?
    fun getProgramParameter(
        program: WebGLProgram,
        pname: GLenum,
    ): Any

    fun getRenderbufferParameter(
        target: GLenum,
        pname: GLenum,
    ): Any

    fun getShaderInfoLog(shader: WebGLShader): String?
    fun getShaderParameter(
        shader: WebGLShader,
        pname: GLenum,
    ): Any

    fun getShaderPrecisionFormat(
        shadertype: GLenum,
        precisiontype: GLenum,
    ): WebGLShaderPrecisionFormat?

    fun getShaderSource(shader: WebGLShader): String?
    fun getSupportedExtensions(): ReadonlyArray<String>?
    fun getTexParameter(
        target: GLenum,
        pname: GLenum,
    ): Any

    fun getUniform(
        program: WebGLProgram,
        location: WebGLUniformLocation,
    ): Any

    fun getUniformLocation(
        program: WebGLProgram,
        name: String,
    ): WebGLUniformLocation?

    fun getVertexAttrib(
        index: GLuint,
        pname: GLenum,
    ): Any

    fun getVertexAttribOffset(
        index: GLuint,
        pname: GLenum,
    ): GLintptr

    fun hint(
        target: GLenum,
        mode: GLenum,
    )

    fun isBuffer(buffer: WebGLBuffer?): GLboolean
    fun isContextLost(): Boolean
    fun isEnabled(cap: GLenum): GLboolean
    fun isFramebuffer(framebuffer: WebGLFramebuffer?): GLboolean
    fun isProgram(program: WebGLProgram?): GLboolean
    fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): GLboolean
    fun isShader(shader: WebGLShader?): GLboolean
    fun isTexture(texture: WebGLTexture?): GLboolean
    fun lineWidth(width: GLfloat)
    fun linkProgram(program: WebGLProgram)
    fun pixelStorei(
        pname: GLenum,
        param: GLint, /* | GLboolean */
    )

    fun polygonOffset(
        factor: GLfloat,
        units: GLfloat,
    )

    fun renderbufferStorage(
        target: GLenum,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

    fun sampleCoverage(
        value: GLclampf,
        invert: GLboolean,
    )

    fun scissor(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    fun shaderSource(
        shader: WebGLShader,
        source: String,
    )

    fun stencilFunc(
        func: GLenum,
        ref: GLint,
        mask: GLuint,
    )

    fun stencilFuncSeparate(
        face: GLenum,
        func: GLenum,
        ref: GLint,
        mask: GLuint,
    )

    fun stencilMask(mask: GLuint)
    fun stencilMaskSeparate(
        face: GLenum,
        mask: GLuint,
    )

    fun stencilOp(
        fail: GLenum,
        zfail: GLenum,
        zpass: GLenum,
    )

    fun stencilOpSeparate(
        face: GLenum,
        fail: GLenum,
        zfail: GLenum,
        zpass: GLenum,
    )

    fun texParameterf(
        target: GLenum,
        pname: GLenum,
        param: GLfloat,
    )

    fun texParameteri(
        target: GLenum,
        pname: GLenum,
        param: GLint,
    )

    fun uniform1f(
        location: WebGLUniformLocation?,
        x: GLfloat,
    )

    fun uniform1i(
        location: WebGLUniformLocation?,
        x: GLint,
    )

    fun uniform2f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
    )

    fun uniform2i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
    )

    fun uniform3f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
    )

    fun uniform3i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
        z: GLint,
    )

    fun uniform4f(
        location: WebGLUniformLocation?,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
        w: GLfloat,
    )

    fun uniform4i(
        location: WebGLUniformLocation?,
        x: GLint,
        y: GLint,
        z: GLint,
        w: GLint,
    )

    fun useProgram(program: WebGLProgram?)
    fun validateProgram(program: WebGLProgram)
    fun vertexAttrib1f(
        index: GLuint,
        x: GLfloat,
    )

    fun vertexAttrib1fv(
        index: GLuint,
        values: Float32List,
    )

    fun vertexAttrib2f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
    )

    fun vertexAttrib2fv(
        index: GLuint,
        values: Float32List,
    )

    fun vertexAttrib3f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
    )

    fun vertexAttrib3fv(
        index: GLuint,
        values: Float32List,
    )

    fun vertexAttrib4f(
        index: GLuint,
        x: GLfloat,
        y: GLfloat,
        z: GLfloat,
        w: GLfloat,
    )

    fun vertexAttrib4fv(
        index: GLuint,
        values: Float32List,
    )

    fun vertexAttribPointer(
        index: GLuint,
        size: GLint,
        type: GLenum,
        normalized: GLboolean,
        stride: GLsizei,
        offset: GLintptr,
    )

    fun viewport(
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    val ACTIVE_ATTRIBUTES: GLenum
    val ACTIVE_TEXTURE: GLenum
    val ACTIVE_UNIFORMS: GLenum
    val ALIASED_LINE_WIDTH_RANGE: GLenum
    val ALIASED_POINT_SIZE_RANGE: GLenum
    val ALPHA: GLenum
    val ALPHA_BITS: GLenum
    val ALWAYS: GLenum
    val ARRAY_BUFFER: GLenum
    val ARRAY_BUFFER_BINDING: GLenum
    val ATTACHED_SHADERS: GLenum
    val BACK: GLenum
    val BLEND: GLenum
    val BLEND_COLOR: GLenum
    val BLEND_DST_ALPHA: GLenum
    val BLEND_DST_RGB: GLenum
    val BLEND_EQUATION: GLenum
    val BLEND_EQUATION_ALPHA: GLenum
    val BLEND_EQUATION_RGB: GLenum
    val BLEND_SRC_ALPHA: GLenum
    val BLEND_SRC_RGB: GLenum
    val BLUE_BITS: GLenum
    val BOOL: GLenum
    val BOOL_VEC2: GLenum
    val BOOL_VEC3: GLenum
    val BOOL_VEC4: GLenum
    val BROWSER_DEFAULT_WEBGL: GLenum
    val BUFFER_SIZE: GLenum
    val BUFFER_USAGE: GLenum
    val BYTE: GLenum
    val CCW: GLenum
    val CLAMP_TO_EDGE: GLenum
    val COLOR_ATTACHMENT0: GLenum
    val COLOR_BUFFER_BIT: GLenum
    val COLOR_CLEAR_VALUE: GLenum
    val COLOR_WRITEMASK: GLenum
    val COMPILE_STATUS: GLenum
    val COMPRESSED_TEXTURE_FORMATS: GLenum
    val CONSTANT_ALPHA: GLenum
    val CONSTANT_COLOR: GLenum
    val CONTEXT_LOST_WEBGL: GLenum
    val CULL_FACE: GLenum
    val CULL_FACE_MODE: GLenum
    val CURRENT_PROGRAM: GLenum
    val CURRENT_VERTEX_ATTRIB: GLenum
    val CW: GLenum
    val DECR: GLenum
    val DECR_WRAP: GLenum
    val DELETE_STATUS: GLenum
    val DEPTH_ATTACHMENT: GLenum
    val DEPTH_BITS: GLenum
    val DEPTH_BUFFER_BIT: GLenum
    val DEPTH_CLEAR_VALUE: GLenum
    val DEPTH_COMPONENT: GLenum
    val DEPTH_COMPONENT16: GLenum
    val DEPTH_FUNC: GLenum
    val DEPTH_RANGE: GLenum
    val DEPTH_STENCIL: GLenum
    val DEPTH_STENCIL_ATTACHMENT: GLenum
    val DEPTH_TEST: GLenum
    val DEPTH_WRITEMASK: GLenum
    val DITHER: GLenum
    val DONT_CARE: GLenum
    val DST_ALPHA: GLenum
    val DST_COLOR: GLenum
    val DYNAMIC_DRAW: GLenum
    val ELEMENT_ARRAY_BUFFER: GLenum
    val ELEMENT_ARRAY_BUFFER_BINDING: GLenum
    val EQUAL: GLenum
    val FASTEST: GLenum
    val FLOAT: GLenum
    val FLOAT_MAT2: GLenum
    val FLOAT_MAT3: GLenum
    val FLOAT_MAT4: GLenum
    val FLOAT_VEC2: GLenum
    val FLOAT_VEC3: GLenum
    val FLOAT_VEC4: GLenum
    val FRAGMENT_SHADER: GLenum
    val FRAMEBUFFER: GLenum
    val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: GLenum
    val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: GLenum
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: GLenum
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: GLenum
    val FRAMEBUFFER_BINDING: GLenum
    val FRAMEBUFFER_COMPLETE: GLenum
    val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: GLenum
    val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: GLenum
    val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: GLenum
    val FRAMEBUFFER_UNSUPPORTED: GLenum
    val FRONT: GLenum
    val FRONT_AND_BACK: GLenum
    val FRONT_FACE: GLenum
    val FUNC_ADD: GLenum
    val FUNC_REVERSE_SUBTRACT: GLenum
    val FUNC_SUBTRACT: GLenum
    val GENERATE_MIPMAP_HINT: GLenum
    val GEQUAL: GLenum
    val GREATER: GLenum
    val GREEN_BITS: GLenum
    val HIGH_FLOAT: GLenum
    val HIGH_INT: GLenum
    val IMPLEMENTATION_COLOR_READ_FORMAT: GLenum
    val IMPLEMENTATION_COLOR_READ_TYPE: GLenum
    val INCR: GLenum
    val INCR_WRAP: GLenum
    val INT: GLenum
    val INT_VEC2: GLenum
    val INT_VEC3: GLenum
    val INT_VEC4: GLenum
    val INVALID_ENUM: GLenum
    val INVALID_FRAMEBUFFER_OPERATION: GLenum
    val INVALID_OPERATION: GLenum
    val INVALID_VALUE: GLenum
    val INVERT: GLenum
    val KEEP: GLenum
    val LEQUAL: GLenum
    val LESS: GLenum
    val LINEAR: GLenum
    val LINEAR_MIPMAP_LINEAR: GLenum
    val LINEAR_MIPMAP_NEAREST: GLenum
    val LINES: GLenum
    val LINE_LOOP: GLenum
    val LINE_STRIP: GLenum
    val LINE_WIDTH: GLenum
    val LINK_STATUS: GLenum
    val LOW_FLOAT: GLenum
    val LOW_INT: GLenum
    val LUMINANCE: GLenum
    val LUMINANCE_ALPHA: GLenum
    val MAX_COMBINED_TEXTURE_IMAGE_UNITS: GLenum
    val MAX_CUBE_MAP_TEXTURE_SIZE: GLenum
    val MAX_FRAGMENT_UNIFORM_VECTORS: GLenum
    val MAX_RENDERBUFFER_SIZE: GLenum
    val MAX_TEXTURE_IMAGE_UNITS: GLenum
    val MAX_TEXTURE_SIZE: GLenum
    val MAX_VARYING_VECTORS: GLenum
    val MAX_VERTEX_ATTRIBS: GLenum
    val MAX_VERTEX_TEXTURE_IMAGE_UNITS: GLenum
    val MAX_VERTEX_UNIFORM_VECTORS: GLenum
    val MAX_VIEWPORT_DIMS: GLenum
    val MEDIUM_FLOAT: GLenum
    val MEDIUM_INT: GLenum
    val MIRRORED_REPEAT: GLenum
    val NEAREST: GLenum
    val NEAREST_MIPMAP_LINEAR: GLenum
    val NEAREST_MIPMAP_NEAREST: GLenum
    val NEVER: GLenum
    val NICEST: GLenum
    val NONE: GLenum
    val NOTEQUAL: GLenum
    val NO_ERROR: GLenum
    val ONE: GLenum
    val ONE_MINUS_CONSTANT_ALPHA: GLenum
    val ONE_MINUS_CONSTANT_COLOR: GLenum
    val ONE_MINUS_DST_ALPHA: GLenum
    val ONE_MINUS_DST_COLOR: GLenum
    val ONE_MINUS_SRC_ALPHA: GLenum
    val ONE_MINUS_SRC_COLOR: GLenum
    val OUT_OF_MEMORY: GLenum
    val PACK_ALIGNMENT: GLenum
    val POINTS: GLenum
    val POLYGON_OFFSET_FACTOR: GLenum
    val POLYGON_OFFSET_FILL: GLenum
    val POLYGON_OFFSET_UNITS: GLenum
    val RED_BITS: GLenum
    val RENDERBUFFER: GLenum
    val RENDERBUFFER_ALPHA_SIZE: GLenum
    val RENDERBUFFER_BINDING: GLenum
    val RENDERBUFFER_BLUE_SIZE: GLenum
    val RENDERBUFFER_DEPTH_SIZE: GLenum
    val RENDERBUFFER_GREEN_SIZE: GLenum
    val RENDERBUFFER_HEIGHT: GLenum
    val RENDERBUFFER_INTERNAL_FORMAT: GLenum
    val RENDERBUFFER_RED_SIZE: GLenum
    val RENDERBUFFER_STENCIL_SIZE: GLenum
    val RENDERBUFFER_WIDTH: GLenum
    val RENDERER: GLenum
    val REPEAT: GLenum
    val REPLACE: GLenum
    val RGB: GLenum
    val RGB565: GLenum
    val RGB5_A1: GLenum
    val RGBA: GLenum
    val RGBA4: GLenum
    val SAMPLER_2D: GLenum
    val SAMPLER_CUBE: GLenum
    val SAMPLES: GLenum
    val SAMPLE_ALPHA_TO_COVERAGE: GLenum
    val SAMPLE_BUFFERS: GLenum
    val SAMPLE_COVERAGE: GLenum
    val SAMPLE_COVERAGE_INVERT: GLenum
    val SAMPLE_COVERAGE_VALUE: GLenum
    val SCISSOR_BOX: GLenum
    val SCISSOR_TEST: GLenum
    val SHADER_TYPE: GLenum
    val SHADING_LANGUAGE_VERSION: GLenum
    val SHORT: GLenum
    val SRC_ALPHA: GLenum
    val SRC_ALPHA_SATURATE: GLenum
    val SRC_COLOR: GLenum
    val STATIC_DRAW: GLenum
    val STENCIL_ATTACHMENT: GLenum
    val STENCIL_BACK_FAIL: GLenum
    val STENCIL_BACK_FUNC: GLenum
    val STENCIL_BACK_PASS_DEPTH_FAIL: GLenum
    val STENCIL_BACK_PASS_DEPTH_PASS: GLenum
    val STENCIL_BACK_REF: GLenum
    val STENCIL_BACK_VALUE_MASK: GLenum
    val STENCIL_BACK_WRITEMASK: GLenum
    val STENCIL_BITS: GLenum
    val STENCIL_BUFFER_BIT: GLenum
    val STENCIL_CLEAR_VALUE: GLenum
    val STENCIL_FAIL: GLenum
    val STENCIL_FUNC: GLenum
    val STENCIL_INDEX8: GLenum
    val STENCIL_PASS_DEPTH_FAIL: GLenum
    val STENCIL_PASS_DEPTH_PASS: GLenum
    val STENCIL_REF: GLenum
    val STENCIL_TEST: GLenum
    val STENCIL_VALUE_MASK: GLenum
    val STENCIL_WRITEMASK: GLenum
    val STREAM_DRAW: GLenum
    val SUBPIXEL_BITS: GLenum
    val TEXTURE: GLenum
    val TEXTURE0: GLenum
    val TEXTURE1: GLenum
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
    val TEXTURE2: GLenum
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
    val TEXTURE3: GLenum
    val TEXTURE30: GLenum
    val TEXTURE31: GLenum
    val TEXTURE4: GLenum
    val TEXTURE5: GLenum
    val TEXTURE6: GLenum
    val TEXTURE7: GLenum
    val TEXTURE8: GLenum
    val TEXTURE9: GLenum
    val TEXTURE_2D: GLenum
    val TEXTURE_BINDING_2D: GLenum
    val TEXTURE_BINDING_CUBE_MAP: GLenum
    val TEXTURE_CUBE_MAP: GLenum
    val TEXTURE_CUBE_MAP_NEGATIVE_X: GLenum
    val TEXTURE_CUBE_MAP_NEGATIVE_Y: GLenum
    val TEXTURE_CUBE_MAP_NEGATIVE_Z: GLenum
    val TEXTURE_CUBE_MAP_POSITIVE_X: GLenum
    val TEXTURE_CUBE_MAP_POSITIVE_Y: GLenum
    val TEXTURE_CUBE_MAP_POSITIVE_Z: GLenum
    val TEXTURE_MAG_FILTER: GLenum
    val TEXTURE_MIN_FILTER: GLenum
    val TEXTURE_WRAP_S: GLenum
    val TEXTURE_WRAP_T: GLenum
    val TRIANGLES: GLenum
    val TRIANGLE_FAN: GLenum
    val TRIANGLE_STRIP: GLenum
    val UNPACK_ALIGNMENT: GLenum
    val UNPACK_COLORSPACE_CONVERSION_WEBGL: GLenum
    val UNPACK_FLIP_Y_WEBGL: GLenum
    val UNPACK_PREMULTIPLY_ALPHA_WEBGL: GLenum
    val UNSIGNED_BYTE: GLenum
    val UNSIGNED_INT: GLenum
    val UNSIGNED_SHORT: GLenum
    val UNSIGNED_SHORT_4_4_4_4: GLenum
    val UNSIGNED_SHORT_5_5_5_1: GLenum
    val UNSIGNED_SHORT_5_6_5: GLenum
    val VALIDATE_STATUS: GLenum
    val VENDOR: GLenum
    val VERSION: GLenum
    val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: GLenum
    val VERTEX_ATTRIB_ARRAY_ENABLED: GLenum
    val VERTEX_ATTRIB_ARRAY_NORMALIZED: GLenum
    val VERTEX_ATTRIB_ARRAY_POINTER: GLenum
    val VERTEX_ATTRIB_ARRAY_SIZE: GLenum
    val VERTEX_ATTRIB_ARRAY_STRIDE: GLenum
    val VERTEX_ATTRIB_ARRAY_TYPE: GLenum
    val VERTEX_SHADER: GLenum
    val VIEWPORT: GLenum
    val ZERO: GLenum
}
