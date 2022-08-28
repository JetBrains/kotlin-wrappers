// Automatically generated - do not modify!

package webgl

import kotlinx.js.ArrayBufferView
import kotlinx.js.ReadonlyArray

sealed external interface WebGL2RenderingContextBase {
    fun beginQuery(
        target: GLenum,
        query: WebGLQuery,
    )

    fun beginTransformFeedback(primitiveMode: GLenum)
    fun bindBufferBase(
        target: GLenum,
        index: GLuint,
        buffer: WebGLBuffer?,
    )

    fun bindBufferRange(
        target: GLenum,
        index: GLuint,
        buffer: WebGLBuffer?,
        offset: GLintptr,
        size: GLsizeiptr,
    )

    fun bindSampler(
        unit: GLuint,
        sampler: WebGLSampler?,
    )

    fun bindTransformFeedback(
        target: GLenum,
        tf: WebGLTransformFeedback?,
    )

    fun bindVertexArray(array: WebGLVertexArrayObject?)
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

    fun clearBufferfi(
        buffer: GLenum,
        drawbuffer: GLint,
        depth: GLfloat,
        stencil: GLint,
    )

    fun clearBufferfv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Float32List,
        srcOffset: GLuint?,
    )

    fun clearBufferiv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Int32List,
        srcOffset: GLuint?,
    )

    fun clearBufferuiv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Uint32List,
        srcOffset: GLuint?,
    )

    fun clientWaitSync(
        sync: WebGLSync,
        flags: GLbitfield,
        timeout: GLuint64,
    ): GLenum

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
        srcData: ArrayBufferView,
        srcOffset: GLuint?,
        srcLengthOverride: GLuint?,
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
        srcData: ArrayBufferView,
        srcOffset: GLuint?,
        srcLengthOverride: GLuint?,
    )

    fun copyBufferSubData(
        readTarget: GLenum,
        writeTarget: GLenum,
        readOffset: GLintptr,
        writeOffset: GLintptr,
        size: GLsizeiptr,
    )

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

    fun createQuery(): WebGLQuery?
    fun createSampler(): WebGLSampler?
    fun createTransformFeedback(): WebGLTransformFeedback?
    fun createVertexArray(): WebGLVertexArrayObject?
    fun deleteQuery(query: WebGLQuery?)
    fun deleteSampler(sampler: WebGLSampler?)
    fun deleteSync(sync: WebGLSync?)
    fun deleteTransformFeedback(tf: WebGLTransformFeedback?)
    fun deleteVertexArray(vertexArray: WebGLVertexArrayObject?)
    fun drawArraysInstanced(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
        instanceCount: GLsizei,
    )

    fun drawBuffers(buffers: ReadonlyArray<GLenum>)
    fun drawElementsInstanced(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
        instanceCount: GLsizei,
    )

    fun drawRangeElements(
        mode: GLenum,
        start: GLuint,
        end: GLuint,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
    )

    fun endQuery(target: GLenum)
    fun endTransformFeedback()
    fun fenceSync(
        condition: GLenum,
        flags: GLbitfield,
    ): WebGLSync?

    fun framebufferTextureLayer(
        target: GLenum,
        attachment: GLenum,
        texture: WebGLTexture?,
        level: GLint,
        layer: GLint,
    )

    fun getActiveUniformBlockName(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
    ): String?

    fun getActiveUniformBlockParameter(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
        pname: GLenum,
    ): Any

    fun getActiveUniforms(
        program: WebGLProgram,
        uniformIndices: ReadonlyArray<GLuint>,
        pname: GLenum,
    ): Any

    fun getBufferSubData(
        target: GLenum,
        srcByteOffset: GLintptr,
        dstBuffer: ArrayBufferView,
        dstOffset: GLuint?,
        length: GLuint?,
    )

    fun getFragDataLocation(
        program: WebGLProgram,
        name: String,
    ): GLint

    fun getIndexedParameter(
        target: GLenum,
        index: GLuint,
    ): Any

    fun getInternalformatParameter(
        target: GLenum,
        internalformat: GLenum,
        pname: GLenum,
    ): Any

    fun getQuery(
        target: GLenum,
        pname: GLenum,
    ): WebGLQuery?

    fun getQueryParameter(
        query: WebGLQuery,
        pname: GLenum,
    ): Any

    fun getSamplerParameter(
        sampler: WebGLSampler,
        pname: GLenum,
    ): Any

    fun getSyncParameter(
        sync: WebGLSync,
        pname: GLenum,
    ): Any

    fun getTransformFeedbackVarying(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    fun getUniformBlockIndex(
        program: WebGLProgram,
        uniformBlockName: String,
    ): GLuint

    fun getUniformIndices(
        program: WebGLProgram,
        uniformNames: ReadonlyArray<String>,
    ): ReadonlyArray<GLuint>?

    fun invalidateFramebuffer(
        target: GLenum,
        attachments: ReadonlyArray<GLenum>,
    )

    fun invalidateSubFramebuffer(
        target: GLenum,
        attachments: ReadonlyArray<GLenum>,
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    fun isQuery(query: WebGLQuery?): GLboolean
    fun isSampler(sampler: WebGLSampler?): GLboolean
    fun isSync(sync: WebGLSync?): GLboolean
    fun isTransformFeedback(tf: WebGLTransformFeedback?): GLboolean
    fun isVertexArray(vertexArray: WebGLVertexArrayObject?): GLboolean
    fun pauseTransformFeedback()
    fun readBuffer(src: GLenum)
    fun renderbufferStorageMultisample(
        target: GLenum,
        samples: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

    fun resumeTransformFeedback()
    fun samplerParameterf(
        sampler: WebGLSampler,
        pname: GLenum,
        param: GLfloat,
    )

    fun samplerParameteri(
        sampler: WebGLSampler,
        pname: GLenum,
        param: GLint,
    )

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
    )

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
    )

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
        srcData: ArrayBufferView?,
    )

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
        srcData: ArrayBufferView,
        srcOffset: GLuint,
    )

    fun texStorage2D(
        target: GLenum,
        levels: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

    fun texStorage3D(
        target: GLenum,
        levels: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
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
        srcData: ArrayBufferView?,
        srcOffset: GLuint?,
    )

    fun transformFeedbackVaryings(
        program: WebGLProgram,
        varyings: ReadonlyArray<String>,
        bufferMode: GLenum,
    )

    fun uniform1ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
    )

    fun uniform1uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniform2ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
    )

    fun uniform2uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniform3ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
        v2: GLuint,
    )

    fun uniform3uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniform4ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
        v2: GLuint,
        v3: GLuint,
    )

    fun uniform4uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniformBlockBinding(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
        uniformBlockBinding: GLuint,
    )

    fun uniformMatrix2x3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniformMatrix2x4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniformMatrix3x2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniformMatrix3x4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniformMatrix4x2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun uniformMatrix4x3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: GLuint?,
        srcLength: GLuint?,
    )

    fun vertexAttribDivisor(
        index: GLuint,
        divisor: GLuint,
    )

    fun vertexAttribI4i(
        index: GLuint,
        x: GLint,
        y: GLint,
        z: GLint,
        w: GLint,
    )

    fun vertexAttribI4iv(
        index: GLuint,
        values: Int32List,
    )

    fun vertexAttribI4ui(
        index: GLuint,
        x: GLuint,
        y: GLuint,
        z: GLuint,
        w: GLuint,
    )

    fun vertexAttribI4uiv(
        index: GLuint,
        values: Uint32List,
    )

    fun vertexAttribIPointer(
        index: GLuint,
        size: GLint,
        type: GLenum,
        stride: GLsizei,
        offset: GLintptr,
    )

    fun waitSync(
        sync: WebGLSync,
        flags: GLbitfield,
        timeout: GLint64,
    )

    val ACTIVE_UNIFORM_BLOCKS: GLenum
    val ALREADY_SIGNALED: GLenum
    val ANY_SAMPLES_PASSED: GLenum
    val ANY_SAMPLES_PASSED_CONSERVATIVE: GLenum
    val COLOR: GLenum
    val COLOR_ATTACHMENT1: GLenum
    val COLOR_ATTACHMENT10: GLenum
    val COLOR_ATTACHMENT11: GLenum
    val COLOR_ATTACHMENT12: GLenum
    val COLOR_ATTACHMENT13: GLenum
    val COLOR_ATTACHMENT14: GLenum
    val COLOR_ATTACHMENT15: GLenum
    val COLOR_ATTACHMENT2: GLenum
    val COLOR_ATTACHMENT3: GLenum
    val COLOR_ATTACHMENT4: GLenum
    val COLOR_ATTACHMENT5: GLenum
    val COLOR_ATTACHMENT6: GLenum
    val COLOR_ATTACHMENT7: GLenum
    val COLOR_ATTACHMENT8: GLenum
    val COLOR_ATTACHMENT9: GLenum
    val COMPARE_REF_TO_TEXTURE: GLenum
    val CONDITION_SATISFIED: GLenum
    val COPY_READ_BUFFER: GLenum
    val COPY_READ_BUFFER_BINDING: GLenum
    val COPY_WRITE_BUFFER: GLenum
    val COPY_WRITE_BUFFER_BINDING: GLenum
    val CURRENT_QUERY: GLenum
    val DEPTH: GLenum
    val DEPTH24_STENCIL8: GLenum
    val DEPTH32F_STENCIL8: GLenum
    val DEPTH_COMPONENT24: GLenum
    val DEPTH_COMPONENT32F: GLenum
    val DRAW_BUFFER0: GLenum
    val DRAW_BUFFER1: GLenum
    val DRAW_BUFFER10: GLenum
    val DRAW_BUFFER11: GLenum
    val DRAW_BUFFER12: GLenum
    val DRAW_BUFFER13: GLenum
    val DRAW_BUFFER14: GLenum
    val DRAW_BUFFER15: GLenum
    val DRAW_BUFFER2: GLenum
    val DRAW_BUFFER3: GLenum
    val DRAW_BUFFER4: GLenum
    val DRAW_BUFFER5: GLenum
    val DRAW_BUFFER6: GLenum
    val DRAW_BUFFER7: GLenum
    val DRAW_BUFFER8: GLenum
    val DRAW_BUFFER9: GLenum
    val DRAW_FRAMEBUFFER: GLenum
    val DRAW_FRAMEBUFFER_BINDING: GLenum
    val DYNAMIC_COPY: GLenum
    val DYNAMIC_READ: GLenum
    val FLOAT_32_UNSIGNED_INT_24_8_REV: GLenum
    val FLOAT_MAT2x3: GLenum
    val FLOAT_MAT2x4: GLenum
    val FLOAT_MAT3x2: GLenum
    val FLOAT_MAT3x4: GLenum
    val FLOAT_MAT4x2: GLenum
    val FLOAT_MAT4x3: GLenum
    val FRAGMENT_SHADER_DERIVATIVE_HINT: GLenum
    val FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: GLenum
    val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: GLenum
    val FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_RED_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: GLenum
    val FRAMEBUFFER_DEFAULT: GLenum
    val FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: GLenum
    val HALF_FLOAT: GLenum
    val INTERLEAVED_ATTRIBS: GLenum
    val INT_2_10_10_10_REV: GLenum
    val INT_SAMPLER_2D: GLenum
    val INT_SAMPLER_2D_ARRAY: GLenum
    val INT_SAMPLER_3D: GLenum
    val INT_SAMPLER_CUBE: GLenum
    val INVALID_INDEX: GLenum
    val MAX: GLenum
    val MAX_3D_TEXTURE_SIZE: GLenum
    val MAX_ARRAY_TEXTURE_LAYERS: GLenum
    val MAX_CLIENT_WAIT_TIMEOUT_WEBGL: GLenum
    val MAX_COLOR_ATTACHMENTS: GLenum
    val MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: GLenum
    val MAX_COMBINED_UNIFORM_BLOCKS: GLenum
    val MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: GLenum
    val MAX_DRAW_BUFFERS: GLenum
    val MAX_ELEMENTS_INDICES: GLenum
    val MAX_ELEMENTS_VERTICES: GLenum
    val MAX_ELEMENT_INDEX: GLenum
    val MAX_FRAGMENT_INPUT_COMPONENTS: GLenum
    val MAX_FRAGMENT_UNIFORM_BLOCKS: GLenum
    val MAX_FRAGMENT_UNIFORM_COMPONENTS: GLenum
    val MAX_PROGRAM_TEXEL_OFFSET: GLenum
    val MAX_SAMPLES: GLenum
    val MAX_SERVER_WAIT_TIMEOUT: GLenum
    val MAX_TEXTURE_LOD_BIAS: GLenum
    val MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: GLenum
    val MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: GLenum
    val MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: GLenum
    val MAX_UNIFORM_BLOCK_SIZE: GLenum
    val MAX_UNIFORM_BUFFER_BINDINGS: GLenum
    val MAX_VARYING_COMPONENTS: GLenum
    val MAX_VERTEX_OUTPUT_COMPONENTS: GLenum
    val MAX_VERTEX_UNIFORM_BLOCKS: GLenum
    val MAX_VERTEX_UNIFORM_COMPONENTS: GLenum
    val MIN: GLenum
    val MIN_PROGRAM_TEXEL_OFFSET: GLenum
    val OBJECT_TYPE: GLenum
    val PACK_ROW_LENGTH: GLenum
    val PACK_SKIP_PIXELS: GLenum
    val PACK_SKIP_ROWS: GLenum
    val PIXEL_PACK_BUFFER: GLenum
    val PIXEL_PACK_BUFFER_BINDING: GLenum
    val PIXEL_UNPACK_BUFFER: GLenum
    val PIXEL_UNPACK_BUFFER_BINDING: GLenum
    val QUERY_RESULT: GLenum
    val QUERY_RESULT_AVAILABLE: GLenum
    val R11F_G11F_B10F: GLenum
    val R16F: GLenum
    val R16I: GLenum
    val R16UI: GLenum
    val R32F: GLenum
    val R32I: GLenum
    val R32UI: GLenum
    val R8: GLenum
    val R8I: GLenum
    val R8UI: GLenum
    val R8_SNORM: GLenum
    val RASTERIZER_DISCARD: GLenum
    val READ_BUFFER: GLenum
    val READ_FRAMEBUFFER: GLenum
    val READ_FRAMEBUFFER_BINDING: GLenum
    val RED: GLenum
    val RED_INTEGER: GLenum
    val RENDERBUFFER_SAMPLES: GLenum
    val RG: GLenum
    val RG16F: GLenum
    val RG16I: GLenum
    val RG16UI: GLenum
    val RG32F: GLenum
    val RG32I: GLenum
    val RG32UI: GLenum
    val RG8: GLenum
    val RG8I: GLenum
    val RG8UI: GLenum
    val RG8_SNORM: GLenum
    val RGB10_A2: GLenum
    val RGB10_A2UI: GLenum
    val RGB16F: GLenum
    val RGB16I: GLenum
    val RGB16UI: GLenum
    val RGB32F: GLenum
    val RGB32I: GLenum
    val RGB32UI: GLenum
    val RGB8: GLenum
    val RGB8I: GLenum
    val RGB8UI: GLenum
    val RGB8_SNORM: GLenum
    val RGB9_E5: GLenum
    val RGBA16F: GLenum
    val RGBA16I: GLenum
    val RGBA16UI: GLenum
    val RGBA32F: GLenum
    val RGBA32I: GLenum
    val RGBA32UI: GLenum
    val RGBA8: GLenum
    val RGBA8I: GLenum
    val RGBA8UI: GLenum
    val RGBA8_SNORM: GLenum
    val RGBA_INTEGER: GLenum
    val RGB_INTEGER: GLenum
    val RG_INTEGER: GLenum
    val SAMPLER_2D_ARRAY: GLenum
    val SAMPLER_2D_ARRAY_SHADOW: GLenum
    val SAMPLER_2D_SHADOW: GLenum
    val SAMPLER_3D: GLenum
    val SAMPLER_BINDING: GLenum
    val SAMPLER_CUBE_SHADOW: GLenum
    val SEPARATE_ATTRIBS: GLenum
    val SIGNALED: GLenum
    val SIGNED_NORMALIZED: GLenum
    val SRGB: GLenum
    val SRGB8: GLenum
    val SRGB8_ALPHA8: GLenum
    val STATIC_COPY: GLenum
    val STATIC_READ: GLenum
    val STENCIL: GLenum
    val STREAM_COPY: GLenum
    val STREAM_READ: GLenum
    val SYNC_CONDITION: GLenum
    val SYNC_FENCE: GLenum
    val SYNC_FLAGS: GLenum
    val SYNC_FLUSH_COMMANDS_BIT: GLenum
    val SYNC_GPU_COMMANDS_COMPLETE: GLenum
    val SYNC_STATUS: GLenum
    val TEXTURE_2D_ARRAY: GLenum
    val TEXTURE_3D: GLenum
    val TEXTURE_BASE_LEVEL: GLenum
    val TEXTURE_BINDING_2D_ARRAY: GLenum
    val TEXTURE_BINDING_3D: GLenum
    val TEXTURE_COMPARE_FUNC: GLenum
    val TEXTURE_COMPARE_MODE: GLenum
    val TEXTURE_IMMUTABLE_FORMAT: GLenum
    val TEXTURE_IMMUTABLE_LEVELS: GLenum
    val TEXTURE_MAX_LEVEL: GLenum
    val TEXTURE_MAX_LOD: GLenum
    val TEXTURE_MIN_LOD: GLenum
    val TEXTURE_WRAP_R: GLenum
    val TIMEOUT_EXPIRED: GLenum
    val TIMEOUT_IGNORED: GLint64
    val TRANSFORM_FEEDBACK: GLenum
    val TRANSFORM_FEEDBACK_ACTIVE: GLenum
    val TRANSFORM_FEEDBACK_BINDING: GLenum
    val TRANSFORM_FEEDBACK_BUFFER: GLenum
    val TRANSFORM_FEEDBACK_BUFFER_BINDING: GLenum
    val TRANSFORM_FEEDBACK_BUFFER_MODE: GLenum
    val TRANSFORM_FEEDBACK_BUFFER_SIZE: GLenum
    val TRANSFORM_FEEDBACK_BUFFER_START: GLenum
    val TRANSFORM_FEEDBACK_PAUSED: GLenum
    val TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: GLenum
    val TRANSFORM_FEEDBACK_VARYINGS: GLenum
    val UNIFORM_ARRAY_STRIDE: GLenum
    val UNIFORM_BLOCK_ACTIVE_UNIFORMS: GLenum
    val UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: GLenum
    val UNIFORM_BLOCK_BINDING: GLenum
    val UNIFORM_BLOCK_DATA_SIZE: GLenum
    val UNIFORM_BLOCK_INDEX: GLenum
    val UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: GLenum
    val UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: GLenum
    val UNIFORM_BUFFER: GLenum
    val UNIFORM_BUFFER_BINDING: GLenum
    val UNIFORM_BUFFER_OFFSET_ALIGNMENT: GLenum
    val UNIFORM_BUFFER_SIZE: GLenum
    val UNIFORM_BUFFER_START: GLenum
    val UNIFORM_IS_ROW_MAJOR: GLenum
    val UNIFORM_MATRIX_STRIDE: GLenum
    val UNIFORM_OFFSET: GLenum
    val UNIFORM_SIZE: GLenum
    val UNIFORM_TYPE: GLenum
    val UNPACK_IMAGE_HEIGHT: GLenum
    val UNPACK_ROW_LENGTH: GLenum
    val UNPACK_SKIP_IMAGES: GLenum
    val UNPACK_SKIP_PIXELS: GLenum
    val UNPACK_SKIP_ROWS: GLenum
    val UNSIGNALED: GLenum
    val UNSIGNED_INT_10F_11F_11F_REV: GLenum
    val UNSIGNED_INT_24_8: GLenum
    val UNSIGNED_INT_2_10_10_10_REV: GLenum
    val UNSIGNED_INT_5_9_9_9_REV: GLenum
    val UNSIGNED_INT_SAMPLER_2D: GLenum
    val UNSIGNED_INT_SAMPLER_2D_ARRAY: GLenum
    val UNSIGNED_INT_SAMPLER_3D: GLenum
    val UNSIGNED_INT_SAMPLER_CUBE: GLenum
    val UNSIGNED_INT_VEC2: GLenum
    val UNSIGNED_INT_VEC3: GLenum
    val UNSIGNED_INT_VEC4: GLenum
    val UNSIGNED_NORMALIZED: GLenum
    val VERTEX_ARRAY_BINDING: GLenum
    val VERTEX_ATTRIB_ARRAY_DIVISOR: GLenum
    val VERTEX_ATTRIB_ARRAY_INTEGER: GLenum
    val WAIT_FAILED: GLenum
}
