// Automatically generated - do not modify!

package webgl

import js.buffer.ArrayBufferView
import js.core.ReadonlyArray

sealed external interface WebGL2RenderingContextBase {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/beginQuery) */
    fun beginQuery(
        target: GLenum,
        query: WebGLQuery,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/beginTransformFeedback) */
    fun beginTransformFeedback(primitiveMode: GLenum)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindBufferBase) */
    fun bindBufferBase(
        target: GLenum,
        index: GLuint,
        buffer: WebGLBuffer?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindBufferRange) */
    fun bindBufferRange(
        target: GLenum,
        index: GLuint,
        buffer: WebGLBuffer?,
        offset: GLintptr,
        size: GLsizeiptr,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindSampler) */
    fun bindSampler(
        unit: GLuint,
        sampler: WebGLSampler?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindTransformFeedback) */
    fun bindTransformFeedback(
        target: GLenum,
        tf: WebGLTransformFeedback?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/bindVertexArray) */
    fun bindVertexArray(array: WebGLVertexArrayObject?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/blitFramebuffer) */
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

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer) */
    fun clearBufferfi(
        buffer: GLenum,
        drawbuffer: GLint,
        depth: GLfloat,
        stencil: GLint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer) */
    fun clearBufferfv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Float32List,
        srcOffset: Int /* GLuint */?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer) */
    fun clearBufferiv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Int32List,
        srcOffset: Int /* GLuint */?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clearBuffer) */
    fun clearBufferuiv(
        buffer: GLenum,
        drawbuffer: GLint,
        values: Uint32List,
        srcOffset: Int /* GLuint */?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/clientWaitSync) */
    fun clientWaitSync(
        sync: WebGLSync,
        flags: GLbitfield,
        timeout: GLuint64,
    ): GLenum

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/compressedTexImage3D) */
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
        srcOffset: Int /* GLuint */?,
        srcLengthOverride: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D) */
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
        srcOffset: Int /* GLuint */?,
        srcLengthOverride: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/copyBufferSubData) */
    fun copyBufferSubData(
        readTarget: GLenum,
        writeTarget: GLenum,
        readOffset: GLintptr,
        writeOffset: GLintptr,
        size: GLsizeiptr,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/copyTexSubImage3D) */
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

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createQuery) */
    fun createQuery(): WebGLQuery?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createSampler) */
    fun createSampler(): WebGLSampler?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createTransformFeedback) */
    fun createTransformFeedback(): WebGLTransformFeedback?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/createVertexArray) */
    fun createVertexArray(): WebGLVertexArrayObject?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteQuery) */
    fun deleteQuery(query: WebGLQuery?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteSampler) */
    fun deleteSampler(sampler: WebGLSampler?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteSync) */
    fun deleteSync(sync: WebGLSync?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteTransformFeedback) */
    fun deleteTransformFeedback(tf: WebGLTransformFeedback?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/deleteVertexArray) */
    fun deleteVertexArray(vertexArray: WebGLVertexArrayObject?)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawArraysInstanced) */
    fun drawArraysInstanced(
        mode: GLenum,
        first: GLint,
        count: GLsizei,
        instanceCount: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawBuffers) */
    fun drawBuffers(buffers: ReadonlyArray<GLenum>)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawElementsInstanced) */
    fun drawElementsInstanced(
        mode: GLenum,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
        instanceCount: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/drawRangeElements) */
    fun drawRangeElements(
        mode: GLenum,
        start: GLuint,
        end: GLuint,
        count: GLsizei,
        type: GLenum,
        offset: GLintptr,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/endQuery) */
    fun endQuery(target: GLenum)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/endTransformFeedback) */
    fun endTransformFeedback()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/fenceSync) */
    fun fenceSync(
        condition: GLenum,
        flags: GLbitfield,
    ): WebGLSync?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/framebufferTextureLayer) */
    fun framebufferTextureLayer(
        target: GLenum,
        attachment: GLenum,
        texture: WebGLTexture?,
        level: GLint,
        layer: GLint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getActiveUniformBlockName) */
    fun getActiveUniformBlockName(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
    ): String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getActiveUniformBlockParameter) */
    fun getActiveUniformBlockParameter(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getActiveUniforms) */
    fun getActiveUniforms(
        program: WebGLProgram,
        uniformIndices: ReadonlyArray<GLuint>,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getBufferSubData) */
    fun getBufferSubData(
        target: GLenum,
        srcByteOffset: GLintptr,
        dstBuffer: ArrayBufferView,
        dstOffset: Int /* GLuint */?,
        length: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getFragDataLocation) */
    fun getFragDataLocation(
        program: WebGLProgram,
        name: String,
    ): GLint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getIndexedParameter) */
    fun getIndexedParameter(
        target: GLenum,
        index: GLuint,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getInternalformatParameter) */
    fun getInternalformatParameter(
        target: GLenum,
        internalformat: GLenum,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getQuery) */
    fun getQuery(
        target: GLenum,
        pname: GLenum,
    ): WebGLQuery?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getQueryParameter) */
    fun getQueryParameter(
        query: WebGLQuery,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getSamplerParameter) */
    fun getSamplerParameter(
        sampler: WebGLSampler,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getSyncParameter) */
    fun getSyncParameter(
        sync: WebGLSync,
        pname: GLenum,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getTransformFeedbackVarying) */
    fun getTransformFeedbackVarying(
        program: WebGLProgram,
        index: GLuint,
    ): WebGLActiveInfo?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getUniformBlockIndex) */
    fun getUniformBlockIndex(
        program: WebGLProgram,
        uniformBlockName: String,
    ): GLuint

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/getUniformIndices) */
    fun getUniformIndices(
        program: WebGLProgram,
        uniformNames: ReadonlyArray<String>,
    ): ReadonlyArray<GLuint>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/invalidateFramebuffer) */
    fun invalidateFramebuffer(
        target: GLenum,
        attachments: ReadonlyArray<GLenum>,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/invalidateSubFramebuffer) */
    fun invalidateSubFramebuffer(
        target: GLenum,
        attachments: ReadonlyArray<GLenum>,
        x: GLint,
        y: GLint,
        width: GLsizei,
        height: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isQuery) */
    fun isQuery(query: WebGLQuery?): GLboolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isSampler) */
    fun isSampler(sampler: WebGLSampler?): GLboolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isSync) */
    fun isSync(sync: WebGLSync?): GLboolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isTransformFeedback) */
    fun isTransformFeedback(tf: WebGLTransformFeedback?): GLboolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/isVertexArray) */
    fun isVertexArray(vertexArray: WebGLVertexArrayObject?): GLboolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/pauseTransformFeedback) */
    fun pauseTransformFeedback()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/readBuffer) */
    fun readBuffer(src: GLenum)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/renderbufferStorageMultisample) */
    fun renderbufferStorageMultisample(
        target: GLenum,
        samples: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/resumeTransformFeedback) */
    fun resumeTransformFeedback()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/samplerParameter) */
    fun samplerParameterf(
        sampler: WebGLSampler,
        pname: GLenum,
        param: GLfloat,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/samplerParameter) */
    fun samplerParameteri(
        sampler: WebGLSampler,
        pname: GLenum,
        param: GLint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/texImage3D) */
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
        srcOffset: Int, /* GLuint */
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/texStorage2D) */
    fun texStorage2D(
        target: GLenum,
        levels: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/texStorage3D) */
    fun texStorage3D(
        target: GLenum,
        levels: GLsizei,
        internalformat: GLenum,
        width: GLsizei,
        height: GLsizei,
        depth: GLsizei,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/texSubImage3D) */
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
        srcOffset: Int /* GLuint */?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings) */
    fun transformFeedbackVaryings(
        program: WebGLProgram,
        varyings: ReadonlyArray<String>,
        bufferMode: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform) */
    fun uniform1ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform) */
    fun uniform1uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: Int /* GLuint */?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform) */
    fun uniform2ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform) */
    fun uniform2uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: Int /* GLuint */?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform) */
    fun uniform3ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
        v2: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform) */
    fun uniform3uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: Int /* GLuint */?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform) */
    fun uniform4ui(
        location: WebGLUniformLocation?,
        v0: GLuint,
        v1: GLuint,
        v2: GLuint,
        v3: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniform) */
    fun uniform4uiv(
        location: WebGLUniformLocation?,
        data: Uint32List,
        srcOffset: Int /* GLuint */?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformBlockBinding) */
    fun uniformBlockBinding(
        program: WebGLProgram,
        uniformBlockIndex: GLuint,
        uniformBlockBinding: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix) */
    fun uniformMatrix2x3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: Int /* GLuint */?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix) */
    fun uniformMatrix2x4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: Int /* GLuint */?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix) */
    fun uniformMatrix3x2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: Int /* GLuint */?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix) */
    fun uniformMatrix3x4fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: Int /* GLuint */?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix) */
    fun uniformMatrix4x2fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: Int /* GLuint */?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/uniformMatrix) */
    fun uniformMatrix4x3fv(
        location: WebGLUniformLocation?,
        transpose: GLboolean,
        data: Float32List,
        srcOffset: Int /* GLuint */?,
        srcLength: GLuint?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribDivisor) */
    fun vertexAttribDivisor(
        index: GLuint,
        divisor: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI) */
    fun vertexAttribI4i(
        index: GLuint,
        x: GLint,
        y: GLint,
        z: GLint,
        w: GLint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI) */
    fun vertexAttribI4iv(
        index: GLuint,
        values: Int32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI) */
    fun vertexAttribI4ui(
        index: GLuint,
        x: GLuint,
        y: GLuint,
        z: GLuint,
        w: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribI) */
    fun vertexAttribI4uiv(
        index: GLuint,
        values: Uint32List,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/vertexAttribIPointer) */
    fun vertexAttribIPointer(
        index: GLuint,
        size: GLint,
        type: GLenum,
        stride: GLsizei,
        offset: GLintptr,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGL2RenderingContext/waitSync) */
    fun waitSync(
        sync: WebGLSync,
        flags: GLbitfield,
        timeout: GLint64,
    )

    val READ_BUFFER: GLenum
    val UNPACK_ROW_LENGTH: GLenum
    val UNPACK_SKIP_ROWS: GLenum
    val UNPACK_SKIP_PIXELS: GLenum
    val PACK_ROW_LENGTH: GLenum
    val PACK_SKIP_ROWS: GLenum
    val PACK_SKIP_PIXELS: GLenum
    val COLOR: GLenum
    val DEPTH: GLenum
    val STENCIL: GLenum
    val RED: GLenum
    val RGB8: GLenum
    val RGBA8: GLenum
    val RGB10_A2: GLenum
    val TEXTURE_BINDING_3D: GLenum
    val UNPACK_SKIP_IMAGES: GLenum
    val UNPACK_IMAGE_HEIGHT: GLenum
    val TEXTURE_3D: GLenum
    val TEXTURE_WRAP_R: GLenum
    val MAX_3D_TEXTURE_SIZE: GLenum
    val UNSIGNED_INT_2_10_10_10_REV: GLenum
    val MAX_ELEMENTS_VERTICES: GLenum
    val MAX_ELEMENTS_INDICES: GLenum
    val TEXTURE_MIN_LOD: GLenum
    val TEXTURE_MAX_LOD: GLenum
    val TEXTURE_BASE_LEVEL: GLenum
    val TEXTURE_MAX_LEVEL: GLenum
    val MIN: GLenum
    val MAX: GLenum
    val DEPTH_COMPONENT24: GLenum
    val MAX_TEXTURE_LOD_BIAS: GLenum
    val TEXTURE_COMPARE_MODE: GLenum
    val TEXTURE_COMPARE_FUNC: GLenum
    val CURRENT_QUERY: GLenum
    val QUERY_RESULT: GLenum
    val QUERY_RESULT_AVAILABLE: GLenum
    val STREAM_READ: GLenum
    val STREAM_COPY: GLenum
    val STATIC_READ: GLenum
    val STATIC_COPY: GLenum
    val DYNAMIC_READ: GLenum
    val DYNAMIC_COPY: GLenum
    val MAX_DRAW_BUFFERS: GLenum
    val DRAW_BUFFER0: GLenum
    val DRAW_BUFFER1: GLenum
    val DRAW_BUFFER2: GLenum
    val DRAW_BUFFER3: GLenum
    val DRAW_BUFFER4: GLenum
    val DRAW_BUFFER5: GLenum
    val DRAW_BUFFER6: GLenum
    val DRAW_BUFFER7: GLenum
    val DRAW_BUFFER8: GLenum
    val DRAW_BUFFER9: GLenum
    val DRAW_BUFFER10: GLenum
    val DRAW_BUFFER11: GLenum
    val DRAW_BUFFER12: GLenum
    val DRAW_BUFFER13: GLenum
    val DRAW_BUFFER14: GLenum
    val DRAW_BUFFER15: GLenum
    val MAX_FRAGMENT_UNIFORM_COMPONENTS: GLenum
    val MAX_VERTEX_UNIFORM_COMPONENTS: GLenum
    val SAMPLER_3D: GLenum
    val SAMPLER_2D_SHADOW: GLenum
    val FRAGMENT_SHADER_DERIVATIVE_HINT: GLenum
    val PIXEL_PACK_BUFFER: GLenum
    val PIXEL_UNPACK_BUFFER: GLenum
    val PIXEL_PACK_BUFFER_BINDING: GLenum
    val PIXEL_UNPACK_BUFFER_BINDING: GLenum
    val FLOAT_MAT2x3: GLenum
    val FLOAT_MAT2x4: GLenum
    val FLOAT_MAT3x2: GLenum
    val FLOAT_MAT3x4: GLenum
    val FLOAT_MAT4x2: GLenum
    val FLOAT_MAT4x3: GLenum
    val SRGB: GLenum
    val SRGB8: GLenum
    val SRGB8_ALPHA8: GLenum
    val COMPARE_REF_TO_TEXTURE: GLenum
    val RGBA32F: GLenum
    val RGB32F: GLenum
    val RGBA16F: GLenum
    val RGB16F: GLenum
    val VERTEX_ATTRIB_ARRAY_INTEGER: GLenum
    val MAX_ARRAY_TEXTURE_LAYERS: GLenum
    val MIN_PROGRAM_TEXEL_OFFSET: GLenum
    val MAX_PROGRAM_TEXEL_OFFSET: GLenum
    val MAX_VARYING_COMPONENTS: GLenum
    val TEXTURE_2D_ARRAY: GLenum
    val TEXTURE_BINDING_2D_ARRAY: GLenum
    val R11F_G11F_B10F: GLenum
    val UNSIGNED_INT_10F_11F_11F_REV: GLenum
    val RGB9_E5: GLenum
    val UNSIGNED_INT_5_9_9_9_REV: GLenum
    val TRANSFORM_FEEDBACK_BUFFER_MODE: GLenum
    val MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: GLenum
    val TRANSFORM_FEEDBACK_VARYINGS: GLenum
    val TRANSFORM_FEEDBACK_BUFFER_START: GLenum
    val TRANSFORM_FEEDBACK_BUFFER_SIZE: GLenum
    val TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: GLenum
    val RASTERIZER_DISCARD: GLenum
    val MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: GLenum
    val MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: GLenum
    val INTERLEAVED_ATTRIBS: GLenum
    val SEPARATE_ATTRIBS: GLenum
    val TRANSFORM_FEEDBACK_BUFFER: GLenum
    val TRANSFORM_FEEDBACK_BUFFER_BINDING: GLenum
    val RGBA32UI: GLenum
    val RGB32UI: GLenum
    val RGBA16UI: GLenum
    val RGB16UI: GLenum
    val RGBA8UI: GLenum
    val RGB8UI: GLenum
    val RGBA32I: GLenum
    val RGB32I: GLenum
    val RGBA16I: GLenum
    val RGB16I: GLenum
    val RGBA8I: GLenum
    val RGB8I: GLenum
    val RED_INTEGER: GLenum
    val RGB_INTEGER: GLenum
    val RGBA_INTEGER: GLenum
    val SAMPLER_2D_ARRAY: GLenum
    val SAMPLER_2D_ARRAY_SHADOW: GLenum
    val SAMPLER_CUBE_SHADOW: GLenum
    val UNSIGNED_INT_VEC2: GLenum
    val UNSIGNED_INT_VEC3: GLenum
    val UNSIGNED_INT_VEC4: GLenum
    val INT_SAMPLER_2D: GLenum
    val INT_SAMPLER_3D: GLenum
    val INT_SAMPLER_CUBE: GLenum
    val INT_SAMPLER_2D_ARRAY: GLenum
    val UNSIGNED_INT_SAMPLER_2D: GLenum
    val UNSIGNED_INT_SAMPLER_3D: GLenum
    val UNSIGNED_INT_SAMPLER_CUBE: GLenum
    val UNSIGNED_INT_SAMPLER_2D_ARRAY: GLenum
    val DEPTH_COMPONENT32F: GLenum
    val DEPTH32F_STENCIL8: GLenum
    val FLOAT_32_UNSIGNED_INT_24_8_REV: GLenum
    val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: GLenum
    val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: GLenum
    val FRAMEBUFFER_ATTACHMENT_RED_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: GLenum
    val FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: GLenum
    val FRAMEBUFFER_DEFAULT: GLenum
    val UNSIGNED_INT_24_8: GLenum
    val DEPTH24_STENCIL8: GLenum
    val UNSIGNED_NORMALIZED: GLenum
    val DRAW_FRAMEBUFFER_BINDING: GLenum
    val READ_FRAMEBUFFER: GLenum
    val DRAW_FRAMEBUFFER: GLenum
    val READ_FRAMEBUFFER_BINDING: GLenum
    val RENDERBUFFER_SAMPLES: GLenum
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: GLenum
    val MAX_COLOR_ATTACHMENTS: GLenum
    val COLOR_ATTACHMENT1: GLenum
    val COLOR_ATTACHMENT2: GLenum
    val COLOR_ATTACHMENT3: GLenum
    val COLOR_ATTACHMENT4: GLenum
    val COLOR_ATTACHMENT5: GLenum
    val COLOR_ATTACHMENT6: GLenum
    val COLOR_ATTACHMENT7: GLenum
    val COLOR_ATTACHMENT8: GLenum
    val COLOR_ATTACHMENT9: GLenum
    val COLOR_ATTACHMENT10: GLenum
    val COLOR_ATTACHMENT11: GLenum
    val COLOR_ATTACHMENT12: GLenum
    val COLOR_ATTACHMENT13: GLenum
    val COLOR_ATTACHMENT14: GLenum
    val COLOR_ATTACHMENT15: GLenum
    val FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: GLenum
    val MAX_SAMPLES: GLenum
    val HALF_FLOAT: GLenum
    val RG: GLenum
    val RG_INTEGER: GLenum
    val R8: GLenum
    val RG8: GLenum
    val R16F: GLenum
    val R32F: GLenum
    val RG16F: GLenum
    val RG32F: GLenum
    val R8I: GLenum
    val R8UI: GLenum
    val R16I: GLenum
    val R16UI: GLenum
    val R32I: GLenum
    val R32UI: GLenum
    val RG8I: GLenum
    val RG8UI: GLenum
    val RG16I: GLenum
    val RG16UI: GLenum
    val RG32I: GLenum
    val RG32UI: GLenum
    val VERTEX_ARRAY_BINDING: GLenum
    val R8_SNORM: GLenum
    val RG8_SNORM: GLenum
    val RGB8_SNORM: GLenum
    val RGBA8_SNORM: GLenum
    val SIGNED_NORMALIZED: GLenum
    val COPY_READ_BUFFER: GLenum
    val COPY_WRITE_BUFFER: GLenum
    val COPY_READ_BUFFER_BINDING: GLenum
    val COPY_WRITE_BUFFER_BINDING: GLenum
    val UNIFORM_BUFFER: GLenum
    val UNIFORM_BUFFER_BINDING: GLenum
    val UNIFORM_BUFFER_START: GLenum
    val UNIFORM_BUFFER_SIZE: GLenum
    val MAX_VERTEX_UNIFORM_BLOCKS: GLenum
    val MAX_FRAGMENT_UNIFORM_BLOCKS: GLenum
    val MAX_COMBINED_UNIFORM_BLOCKS: GLenum
    val MAX_UNIFORM_BUFFER_BINDINGS: GLenum
    val MAX_UNIFORM_BLOCK_SIZE: GLenum
    val MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: GLenum
    val MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: GLenum
    val UNIFORM_BUFFER_OFFSET_ALIGNMENT: GLenum
    val ACTIVE_UNIFORM_BLOCKS: GLenum
    val UNIFORM_TYPE: GLenum
    val UNIFORM_SIZE: GLenum
    val UNIFORM_BLOCK_INDEX: GLenum
    val UNIFORM_OFFSET: GLenum
    val UNIFORM_ARRAY_STRIDE: GLenum
    val UNIFORM_MATRIX_STRIDE: GLenum
    val UNIFORM_IS_ROW_MAJOR: GLenum
    val UNIFORM_BLOCK_BINDING: GLenum
    val UNIFORM_BLOCK_DATA_SIZE: GLenum
    val UNIFORM_BLOCK_ACTIVE_UNIFORMS: GLenum
    val UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: GLenum
    val UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: GLenum
    val UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: GLenum
    val INVALID_INDEX: GLenum
    val MAX_VERTEX_OUTPUT_COMPONENTS: GLenum
    val MAX_FRAGMENT_INPUT_COMPONENTS: GLenum
    val MAX_SERVER_WAIT_TIMEOUT: GLenum
    val OBJECT_TYPE: GLenum
    val SYNC_CONDITION: GLenum
    val SYNC_STATUS: GLenum
    val SYNC_FLAGS: GLenum
    val SYNC_FENCE: GLenum
    val SYNC_GPU_COMMANDS_COMPLETE: GLenum
    val UNSIGNALED: GLenum
    val SIGNALED: GLenum
    val ALREADY_SIGNALED: GLenum
    val TIMEOUT_EXPIRED: GLenum
    val CONDITION_SATISFIED: GLenum
    val WAIT_FAILED: GLenum
    val SYNC_FLUSH_COMMANDS_BIT: GLenum
    val VERTEX_ATTRIB_ARRAY_DIVISOR: GLenum
    val ANY_SAMPLES_PASSED: GLenum
    val ANY_SAMPLES_PASSED_CONSERVATIVE: GLenum
    val SAMPLER_BINDING: GLenum
    val RGB10_A2UI: GLenum
    val INT_2_10_10_10_REV: GLenum
    val TRANSFORM_FEEDBACK: GLenum
    val TRANSFORM_FEEDBACK_PAUSED: GLenum
    val TRANSFORM_FEEDBACK_ACTIVE: GLenum
    val TRANSFORM_FEEDBACK_BINDING: GLenum
    val TEXTURE_IMMUTABLE_FORMAT: GLenum
    val MAX_ELEMENT_INDEX: GLenum
    val TEXTURE_IMMUTABLE_LEVELS: GLenum
    val TIMEOUT_IGNORED: GLenum
    val MAX_CLIENT_WAIT_TIMEOUT_WEBGL: GLenum
}
