// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Enum containing WebGL Constant values by name.
 * for use without an active WebGL context, or in cases where certain constants are unavailable using the WebGL context
 * (For example, in [Safari 9](https://github.com/CesiumGS/cesium/issues/2989)).
 *
 * These match the constants from the [WebGL 1.0](https://www.khronos.org/registry/webgl/specs/latest/1.0/)
 * and [WebGL 2.0](https://www.khronos.org/registry/webgl/specs/latest/2.0/)
 * specifications.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#WebGLConstants">Online Documentation</a>
 */

sealed external interface WebGLConstants {
    companion object {

        val DEPTH_BUFFER_BIT: WebGLConstants

        val STENCIL_BUFFER_BIT: WebGLConstants

        val COLOR_BUFFER_BIT: WebGLConstants

        val POINTS: WebGLConstants

        val LINES: WebGLConstants

        val LINE_LOOP: WebGLConstants

        val LINE_STRIP: WebGLConstants

        val TRIANGLES: WebGLConstants

        val TRIANGLE_STRIP: WebGLConstants

        val TRIANGLE_FAN: WebGLConstants

        val ZERO: WebGLConstants

        val ONE: WebGLConstants

        val SRC_COLOR: WebGLConstants

        val ONE_MINUS_SRC_COLOR: WebGLConstants

        val SRC_ALPHA: WebGLConstants

        val ONE_MINUS_SRC_ALPHA: WebGLConstants

        val DST_ALPHA: WebGLConstants

        val ONE_MINUS_DST_ALPHA: WebGLConstants

        val DST_COLOR: WebGLConstants

        val ONE_MINUS_DST_COLOR: WebGLConstants

        val SRC_ALPHA_SATURATE: WebGLConstants

        val FUNC_ADD: WebGLConstants

        val BLEND_EQUATION: WebGLConstants

        val BLEND_EQUATION_RGB: WebGLConstants

        val BLEND_EQUATION_ALPHA: WebGLConstants

        val FUNC_SUBTRACT: WebGLConstants

        val FUNC_REVERSE_SUBTRACT: WebGLConstants

        val BLEND_DST_RGB: WebGLConstants

        val BLEND_SRC_RGB: WebGLConstants

        val BLEND_DST_ALPHA: WebGLConstants

        val BLEND_SRC_ALPHA: WebGLConstants

        val CONSTANT_COLOR: WebGLConstants

        val ONE_MINUS_CONSTANT_COLOR: WebGLConstants

        val CONSTANT_ALPHA: WebGLConstants

        val ONE_MINUS_CONSTANT_ALPHA: WebGLConstants

        val BLEND_COLOR: WebGLConstants

        val ARRAY_BUFFER: WebGLConstants

        val ELEMENT_ARRAY_BUFFER: WebGLConstants

        val ARRAY_BUFFER_BINDING: WebGLConstants

        val ELEMENT_ARRAY_BUFFER_BINDING: WebGLConstants

        val STREAM_DRAW: WebGLConstants

        val STATIC_DRAW: WebGLConstants

        val DYNAMIC_DRAW: WebGLConstants

        val BUFFER_SIZE: WebGLConstants

        val BUFFER_USAGE: WebGLConstants

        val CURRENT_VERTEX_ATTRIB: WebGLConstants

        val FRONT: WebGLConstants

        val BACK: WebGLConstants

        val FRONT_AND_BACK: WebGLConstants

        val CULL_FACE: WebGLConstants

        val BLEND: WebGLConstants

        val DITHER: WebGLConstants

        val STENCIL_TEST: WebGLConstants

        val DEPTH_TEST: WebGLConstants

        val SCISSOR_TEST: WebGLConstants

        val POLYGON_OFFSET_FILL: WebGLConstants

        val SAMPLE_ALPHA_TO_COVERAGE: WebGLConstants

        val SAMPLE_COVERAGE: WebGLConstants

        val NO_ERROR: WebGLConstants

        val INVALID_ENUM: WebGLConstants

        val INVALID_VALUE: WebGLConstants

        val INVALID_OPERATION: WebGLConstants

        val OUT_OF_MEMORY: WebGLConstants

        val CW: WebGLConstants

        val CCW: WebGLConstants

        val LINE_WIDTH: WebGLConstants

        val ALIASED_POINT_SIZE_RANGE: WebGLConstants

        val ALIASED_LINE_WIDTH_RANGE: WebGLConstants

        val CULL_FACE_MODE: WebGLConstants

        val FRONT_FACE: WebGLConstants

        val DEPTH_RANGE: WebGLConstants

        val DEPTH_WRITEMASK: WebGLConstants

        val DEPTH_CLEAR_VALUE: WebGLConstants

        val DEPTH_FUNC: WebGLConstants

        val STENCIL_CLEAR_VALUE: WebGLConstants

        val STENCIL_FUNC: WebGLConstants

        val STENCIL_FAIL: WebGLConstants

        val STENCIL_PASS_DEPTH_FAIL: WebGLConstants

        val STENCIL_PASS_DEPTH_PASS: WebGLConstants

        val STENCIL_REF: WebGLConstants

        val STENCIL_VALUE_MASK: WebGLConstants

        val STENCIL_WRITEMASK: WebGLConstants

        val STENCIL_BACK_FUNC: WebGLConstants

        val STENCIL_BACK_FAIL: WebGLConstants

        val STENCIL_BACK_PASS_DEPTH_FAIL: WebGLConstants

        val STENCIL_BACK_PASS_DEPTH_PASS: WebGLConstants

        val STENCIL_BACK_REF: WebGLConstants

        val STENCIL_BACK_VALUE_MASK: WebGLConstants

        val STENCIL_BACK_WRITEMASK: WebGLConstants

        val VIEWPORT: WebGLConstants

        val SCISSOR_BOX: WebGLConstants

        val COLOR_CLEAR_VALUE: WebGLConstants

        val COLOR_WRITEMASK: WebGLConstants

        val UNPACK_ALIGNMENT: WebGLConstants

        val PACK_ALIGNMENT: WebGLConstants

        val MAX_TEXTURE_SIZE: WebGLConstants

        val MAX_VIEWPORT_DIMS: WebGLConstants

        val SUBPIXEL_BITS: WebGLConstants

        val RED_BITS: WebGLConstants

        val GREEN_BITS: WebGLConstants

        val BLUE_BITS: WebGLConstants

        val ALPHA_BITS: WebGLConstants

        val DEPTH_BITS: WebGLConstants

        val STENCIL_BITS: WebGLConstants

        val POLYGON_OFFSET_UNITS: WebGLConstants

        val POLYGON_OFFSET_FACTOR: WebGLConstants

        val TEXTURE_BINDING_2D: WebGLConstants

        val SAMPLE_BUFFERS: WebGLConstants

        val SAMPLES: WebGLConstants

        val SAMPLE_COVERAGE_VALUE: WebGLConstants

        val SAMPLE_COVERAGE_INVERT: WebGLConstants

        val COMPRESSED_TEXTURE_FORMATS: WebGLConstants

        val DONT_CARE: WebGLConstants

        val FASTEST: WebGLConstants

        val NICEST: WebGLConstants

        val GENERATE_MIPMAP_HINT: WebGLConstants

        val BYTE: WebGLConstants

        val UNSIGNED_BYTE: WebGLConstants

        val SHORT: WebGLConstants

        val UNSIGNED_SHORT: WebGLConstants

        val INT: WebGLConstants

        val UNSIGNED_INT: WebGLConstants

        val FLOAT: WebGLConstants

        val DEPTH_COMPONENT: WebGLConstants

        val ALPHA: WebGLConstants

        val RGB: WebGLConstants

        val RGBA: WebGLConstants

        val LUMINANCE: WebGLConstants

        val LUMINANCE_ALPHA: WebGLConstants

        val UNSIGNED_SHORT_4_4_4_4: WebGLConstants

        val UNSIGNED_SHORT_5_5_5_1: WebGLConstants

        val UNSIGNED_SHORT_5_6_5: WebGLConstants

        val FRAGMENT_SHADER: WebGLConstants

        val VERTEX_SHADER: WebGLConstants

        val MAX_VERTEX_ATTRIBS: WebGLConstants

        val MAX_VERTEX_UNIFORM_VECTORS: WebGLConstants

        val MAX_VARYING_VECTORS: WebGLConstants

        val MAX_COMBINED_TEXTURE_IMAGE_UNITS: WebGLConstants

        val MAX_VERTEX_TEXTURE_IMAGE_UNITS: WebGLConstants

        val MAX_TEXTURE_IMAGE_UNITS: WebGLConstants

        val MAX_FRAGMENT_UNIFORM_VECTORS: WebGLConstants

        val SHADER_TYPE: WebGLConstants

        val DELETE_STATUS: WebGLConstants

        val LINK_STATUS: WebGLConstants

        val VALIDATE_STATUS: WebGLConstants

        val ATTACHED_SHADERS: WebGLConstants

        val ACTIVE_UNIFORMS: WebGLConstants

        val ACTIVE_ATTRIBUTES: WebGLConstants

        val SHADING_LANGUAGE_VERSION: WebGLConstants

        val CURRENT_PROGRAM: WebGLConstants

        val NEVER: WebGLConstants

        val LESS: WebGLConstants

        val EQUAL: WebGLConstants

        val LEQUAL: WebGLConstants

        val GREATER: WebGLConstants

        val NOTEQUAL: WebGLConstants

        val GEQUAL: WebGLConstants

        val ALWAYS: WebGLConstants

        val KEEP: WebGLConstants

        val REPLACE: WebGLConstants

        val INCR: WebGLConstants

        val DECR: WebGLConstants

        val INVERT: WebGLConstants

        val INCR_WRAP: WebGLConstants

        val DECR_WRAP: WebGLConstants

        val VENDOR: WebGLConstants

        val RENDERER: WebGLConstants

        val VERSION: WebGLConstants

        val NEAREST: WebGLConstants

        val LINEAR: WebGLConstants

        val NEAREST_MIPMAP_NEAREST: WebGLConstants

        val LINEAR_MIPMAP_NEAREST: WebGLConstants

        val NEAREST_MIPMAP_LINEAR: WebGLConstants

        val LINEAR_MIPMAP_LINEAR: WebGLConstants

        val TEXTURE_MAG_FILTER: WebGLConstants

        val TEXTURE_MIN_FILTER: WebGLConstants

        val TEXTURE_WRAP_S: WebGLConstants

        val TEXTURE_WRAP_T: WebGLConstants

        val TEXTURE_2D: WebGLConstants

        val TEXTURE: WebGLConstants

        val TEXTURE_CUBE_MAP: WebGLConstants

        val TEXTURE_BINDING_CUBE_MAP: WebGLConstants

        val TEXTURE_CUBE_MAP_POSITIVE_X: WebGLConstants

        val TEXTURE_CUBE_MAP_NEGATIVE_X: WebGLConstants

        val TEXTURE_CUBE_MAP_POSITIVE_Y: WebGLConstants

        val TEXTURE_CUBE_MAP_NEGATIVE_Y: WebGLConstants

        val TEXTURE_CUBE_MAP_POSITIVE_Z: WebGLConstants

        val TEXTURE_CUBE_MAP_NEGATIVE_Z: WebGLConstants

        val MAX_CUBE_MAP_TEXTURE_SIZE: WebGLConstants

        val TEXTURE0: WebGLConstants

        val TEXTURE1: WebGLConstants

        val TEXTURE2: WebGLConstants

        val TEXTURE3: WebGLConstants

        val TEXTURE4: WebGLConstants

        val TEXTURE5: WebGLConstants

        val TEXTURE6: WebGLConstants

        val TEXTURE7: WebGLConstants

        val TEXTURE8: WebGLConstants

        val TEXTURE9: WebGLConstants

        val TEXTURE10: WebGLConstants

        val TEXTURE11: WebGLConstants

        val TEXTURE12: WebGLConstants

        val TEXTURE13: WebGLConstants

        val TEXTURE14: WebGLConstants

        val TEXTURE15: WebGLConstants

        val TEXTURE16: WebGLConstants

        val TEXTURE17: WebGLConstants

        val TEXTURE18: WebGLConstants

        val TEXTURE19: WebGLConstants

        val TEXTURE20: WebGLConstants

        val TEXTURE21: WebGLConstants

        val TEXTURE22: WebGLConstants

        val TEXTURE23: WebGLConstants

        val TEXTURE24: WebGLConstants

        val TEXTURE25: WebGLConstants

        val TEXTURE26: WebGLConstants

        val TEXTURE27: WebGLConstants

        val TEXTURE28: WebGLConstants

        val TEXTURE29: WebGLConstants

        val TEXTURE30: WebGLConstants

        val TEXTURE31: WebGLConstants

        val ACTIVE_TEXTURE: WebGLConstants

        val REPEAT: WebGLConstants

        val CLAMP_TO_EDGE: WebGLConstants

        val MIRRORED_REPEAT: WebGLConstants

        val FLOAT_VEC2: WebGLConstants

        val FLOAT_VEC3: WebGLConstants

        val FLOAT_VEC4: WebGLConstants

        val INT_VEC2: WebGLConstants

        val INT_VEC3: WebGLConstants

        val INT_VEC4: WebGLConstants

        val BOOL: WebGLConstants

        val BOOL_VEC2: WebGLConstants

        val BOOL_VEC3: WebGLConstants

        val BOOL_VEC4: WebGLConstants

        val FLOAT_MAT2: WebGLConstants

        val FLOAT_MAT3: WebGLConstants

        val FLOAT_MAT4: WebGLConstants

        val SAMPLER_2D: WebGLConstants

        val SAMPLER_CUBE: WebGLConstants

        val VERTEX_ATTRIB_ARRAY_ENABLED: WebGLConstants

        val VERTEX_ATTRIB_ARRAY_SIZE: WebGLConstants

        val VERTEX_ATTRIB_ARRAY_STRIDE: WebGLConstants

        val VERTEX_ATTRIB_ARRAY_TYPE: WebGLConstants

        val VERTEX_ATTRIB_ARRAY_NORMALIZED: WebGLConstants

        val VERTEX_ATTRIB_ARRAY_POINTER: WebGLConstants

        val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: WebGLConstants

        val IMPLEMENTATION_COLOR_READ_TYPE: WebGLConstants

        val IMPLEMENTATION_COLOR_READ_FORMAT: WebGLConstants

        val COMPILE_STATUS: WebGLConstants

        val LOW_FLOAT: WebGLConstants

        val MEDIUM_FLOAT: WebGLConstants

        val HIGH_FLOAT: WebGLConstants

        val LOW_INT: WebGLConstants

        val MEDIUM_INT: WebGLConstants

        val HIGH_INT: WebGLConstants

        val FRAMEBUFFER: WebGLConstants

        val RENDERBUFFER: WebGLConstants

        val RGBA4: WebGLConstants

        val RGB5_A1: WebGLConstants

        val RGB565: WebGLConstants

        val DEPTH_COMPONENT16: WebGLConstants

        val STENCIL_INDEX: WebGLConstants

        val STENCIL_INDEX8: WebGLConstants

        val DEPTH_STENCIL: WebGLConstants

        val RENDERBUFFER_WIDTH: WebGLConstants

        val RENDERBUFFER_HEIGHT: WebGLConstants

        val RENDERBUFFER_INTERNAL_FORMAT: WebGLConstants

        val RENDERBUFFER_RED_SIZE: WebGLConstants

        val RENDERBUFFER_GREEN_SIZE: WebGLConstants

        val RENDERBUFFER_BLUE_SIZE: WebGLConstants

        val RENDERBUFFER_ALPHA_SIZE: WebGLConstants

        val RENDERBUFFER_DEPTH_SIZE: WebGLConstants

        val RENDERBUFFER_STENCIL_SIZE: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: WebGLConstants

        val COLOR_ATTACHMENT0: WebGLConstants

        val DEPTH_ATTACHMENT: WebGLConstants

        val STENCIL_ATTACHMENT: WebGLConstants

        val DEPTH_STENCIL_ATTACHMENT: WebGLConstants

        val NONE: WebGLConstants

        val FRAMEBUFFER_COMPLETE: WebGLConstants

        val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: WebGLConstants

        val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: WebGLConstants

        val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: WebGLConstants

        val FRAMEBUFFER_UNSUPPORTED: WebGLConstants

        val FRAMEBUFFER_BINDING: WebGLConstants

        val RENDERBUFFER_BINDING: WebGLConstants

        val MAX_RENDERBUFFER_SIZE: WebGLConstants

        val INVALID_FRAMEBUFFER_OPERATION: WebGLConstants

        val UNPACK_FLIP_Y_WEBGL: WebGLConstants

        val UNPACK_PREMULTIPLY_ALPHA_WEBGL: WebGLConstants

        val CONTEXT_LOST_WEBGL: WebGLConstants

        val UNPACK_COLORSPACE_CONVERSION_WEBGL: WebGLConstants

        val BROWSER_DEFAULT_WEBGL: WebGLConstants

        val COMPRESSED_RGB_S3TC_DXT1_EXT: WebGLConstants

        val COMPRESSED_RGBA_S3TC_DXT1_EXT: WebGLConstants

        val COMPRESSED_RGBA_S3TC_DXT3_EXT: WebGLConstants

        val COMPRESSED_RGBA_S3TC_DXT5_EXT: WebGLConstants

        val COMPRESSED_RGB_PVRTC_4BPPV1_IMG: WebGLConstants

        val COMPRESSED_RGB_PVRTC_2BPPV1_IMG: WebGLConstants

        val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: WebGLConstants

        val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: WebGLConstants

        val COMPRESSED_RGBA_ASTC_4x4_WEBGL: WebGLConstants

        val COMPRESSED_RGB_ETC1_WEBGL: WebGLConstants

        val COMPRESSED_RGBA_BPTC_UNORM: WebGLConstants

        val HALF_FLOAT_OES: WebGLConstants

        val DOUBLE: WebGLConstants

        val READ_BUFFER: WebGLConstants

        val UNPACK_ROW_LENGTH: WebGLConstants

        val UNPACK_SKIP_ROWS: WebGLConstants

        val UNPACK_SKIP_PIXELS: WebGLConstants

        val PACK_ROW_LENGTH: WebGLConstants

        val PACK_SKIP_ROWS: WebGLConstants

        val PACK_SKIP_PIXELS: WebGLConstants

        val COLOR: WebGLConstants

        val DEPTH: WebGLConstants

        val STENCIL: WebGLConstants

        val RED: WebGLConstants

        val RGB8: WebGLConstants

        val RGBA8: WebGLConstants

        val RGB10_A2: WebGLConstants

        val TEXTURE_BINDING_3D: WebGLConstants

        val UNPACK_SKIP_IMAGES: WebGLConstants

        val UNPACK_IMAGE_HEIGHT: WebGLConstants

        val TEXTURE_3D: WebGLConstants

        val TEXTURE_WRAP_R: WebGLConstants

        val MAX_3D_TEXTURE_SIZE: WebGLConstants

        val UNSIGNED_INT_2_10_10_10_REV: WebGLConstants

        val MAX_ELEMENTS_VERTICES: WebGLConstants

        val MAX_ELEMENTS_INDICES: WebGLConstants

        val TEXTURE_MIN_LOD: WebGLConstants

        val TEXTURE_MAX_LOD: WebGLConstants

        val TEXTURE_BASE_LEVEL: WebGLConstants

        val TEXTURE_MAX_LEVEL: WebGLConstants

        val MIN: WebGLConstants

        val MAX: WebGLConstants

        val DEPTH_COMPONENT24: WebGLConstants

        val MAX_TEXTURE_LOD_BIAS: WebGLConstants

        val TEXTURE_COMPARE_MODE: WebGLConstants

        val TEXTURE_COMPARE_FUNC: WebGLConstants

        val CURRENT_QUERY: WebGLConstants

        val QUERY_RESULT: WebGLConstants

        val QUERY_RESULT_AVAILABLE: WebGLConstants

        val STREAM_READ: WebGLConstants

        val STREAM_COPY: WebGLConstants

        val STATIC_READ: WebGLConstants

        val STATIC_COPY: WebGLConstants

        val DYNAMIC_READ: WebGLConstants

        val DYNAMIC_COPY: WebGLConstants

        val MAX_DRAW_BUFFERS: WebGLConstants

        val DRAW_BUFFER0: WebGLConstants

        val DRAW_BUFFER1: WebGLConstants

        val DRAW_BUFFER2: WebGLConstants

        val DRAW_BUFFER3: WebGLConstants

        val DRAW_BUFFER4: WebGLConstants

        val DRAW_BUFFER5: WebGLConstants

        val DRAW_BUFFER6: WebGLConstants

        val DRAW_BUFFER7: WebGLConstants

        val DRAW_BUFFER8: WebGLConstants

        val DRAW_BUFFER9: WebGLConstants

        val DRAW_BUFFER10: WebGLConstants

        val DRAW_BUFFER11: WebGLConstants

        val DRAW_BUFFER12: WebGLConstants

        val DRAW_BUFFER13: WebGLConstants

        val DRAW_BUFFER14: WebGLConstants

        val DRAW_BUFFER15: WebGLConstants

        val MAX_FRAGMENT_UNIFORM_COMPONENTS: WebGLConstants

        val MAX_VERTEX_UNIFORM_COMPONENTS: WebGLConstants

        val SAMPLER_3D: WebGLConstants

        val SAMPLER_2D_SHADOW: WebGLConstants

        val FRAGMENT_SHADER_DERIVATIVE_HINT: WebGLConstants

        val PIXEL_PACK_BUFFER: WebGLConstants

        val PIXEL_UNPACK_BUFFER: WebGLConstants

        val PIXEL_PACK_BUFFER_BINDING: WebGLConstants

        val PIXEL_UNPACK_BUFFER_BINDING: WebGLConstants

        val FLOAT_MAT2x3: WebGLConstants

        val FLOAT_MAT2x4: WebGLConstants

        val FLOAT_MAT3x2: WebGLConstants

        val FLOAT_MAT3x4: WebGLConstants

        val FLOAT_MAT4x2: WebGLConstants

        val FLOAT_MAT4x3: WebGLConstants

        val SRGB: WebGLConstants

        val SRGB8: WebGLConstants

        val SRGB8_ALPHA8: WebGLConstants

        val COMPARE_REF_TO_TEXTURE: WebGLConstants

        val RGBA32F: WebGLConstants

        val RGB32F: WebGLConstants

        val RGBA16F: WebGLConstants

        val RGB16F: WebGLConstants

        val VERTEX_ATTRIB_ARRAY_INTEGER: WebGLConstants

        val MAX_ARRAY_TEXTURE_LAYERS: WebGLConstants

        val MIN_PROGRAM_TEXEL_OFFSET: WebGLConstants

        val MAX_PROGRAM_TEXEL_OFFSET: WebGLConstants

        val MAX_VARYING_COMPONENTS: WebGLConstants

        val TEXTURE_2D_ARRAY: WebGLConstants

        val TEXTURE_BINDING_2D_ARRAY: WebGLConstants

        val R11F_G11F_B10F: WebGLConstants

        val UNSIGNED_INT_10F_11F_11F_REV: WebGLConstants

        val RGB9_E5: WebGLConstants

        val UNSIGNED_INT_5_9_9_9_REV: WebGLConstants

        val TRANSFORM_FEEDBACK_BUFFER_MODE: WebGLConstants

        val MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: WebGLConstants

        val TRANSFORM_FEEDBACK_VARYINGS: WebGLConstants

        val TRANSFORM_FEEDBACK_BUFFER_START: WebGLConstants

        val TRANSFORM_FEEDBACK_BUFFER_SIZE: WebGLConstants

        val TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: WebGLConstants

        val RASTERIZER_DISCARD: WebGLConstants

        val MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: WebGLConstants

        val MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: WebGLConstants

        val INTERLEAVED_ATTRIBS: WebGLConstants

        val SEPARATE_ATTRIBS: WebGLConstants

        val TRANSFORM_FEEDBACK_BUFFER: WebGLConstants

        val TRANSFORM_FEEDBACK_BUFFER_BINDING: WebGLConstants

        val RGBA32UI: WebGLConstants

        val RGB32UI: WebGLConstants

        val RGBA16UI: WebGLConstants

        val RGB16UI: WebGLConstants

        val RGBA8UI: WebGLConstants

        val RGB8UI: WebGLConstants

        val RGBA32I: WebGLConstants

        val RGB32I: WebGLConstants

        val RGBA16I: WebGLConstants

        val RGB16I: WebGLConstants

        val RGBA8I: WebGLConstants

        val RGB8I: WebGLConstants

        val RED_INTEGER: WebGLConstants

        val RGB_INTEGER: WebGLConstants

        val RGBA_INTEGER: WebGLConstants

        val SAMPLER_2D_ARRAY: WebGLConstants

        val SAMPLER_2D_ARRAY_SHADOW: WebGLConstants

        val SAMPLER_CUBE_SHADOW: WebGLConstants

        val UNSIGNED_INT_VEC2: WebGLConstants

        val UNSIGNED_INT_VEC3: WebGLConstants

        val UNSIGNED_INT_VEC4: WebGLConstants

        val INT_SAMPLER_2D: WebGLConstants

        val INT_SAMPLER_3D: WebGLConstants

        val INT_SAMPLER_CUBE: WebGLConstants

        val INT_SAMPLER_2D_ARRAY: WebGLConstants

        val UNSIGNED_INT_SAMPLER_2D: WebGLConstants

        val UNSIGNED_INT_SAMPLER_3D: WebGLConstants

        val UNSIGNED_INT_SAMPLER_CUBE: WebGLConstants

        val UNSIGNED_INT_SAMPLER_2D_ARRAY: WebGLConstants

        val DEPTH_COMPONENT32F: WebGLConstants

        val DEPTH32F_STENCIL8: WebGLConstants

        val FLOAT_32_UNSIGNED_INT_24_8_REV: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_RED_SIZE: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: WebGLConstants

        val FRAMEBUFFER_DEFAULT: WebGLConstants

        val UNSIGNED_INT_24_8: WebGLConstants

        val DEPTH24_STENCIL8: WebGLConstants

        val UNSIGNED_NORMALIZED: WebGLConstants

        val DRAW_FRAMEBUFFER_BINDING: WebGLConstants

        val READ_FRAMEBUFFER: WebGLConstants

        val DRAW_FRAMEBUFFER: WebGLConstants

        val READ_FRAMEBUFFER_BINDING: WebGLConstants

        val RENDERBUFFER_SAMPLES: WebGLConstants

        val FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: WebGLConstants

        val MAX_COLOR_ATTACHMENTS: WebGLConstants

        val COLOR_ATTACHMENT1: WebGLConstants

        val COLOR_ATTACHMENT2: WebGLConstants

        val COLOR_ATTACHMENT3: WebGLConstants

        val COLOR_ATTACHMENT4: WebGLConstants

        val COLOR_ATTACHMENT5: WebGLConstants

        val COLOR_ATTACHMENT6: WebGLConstants

        val COLOR_ATTACHMENT7: WebGLConstants

        val COLOR_ATTACHMENT8: WebGLConstants

        val COLOR_ATTACHMENT9: WebGLConstants

        val COLOR_ATTACHMENT10: WebGLConstants

        val COLOR_ATTACHMENT11: WebGLConstants

        val COLOR_ATTACHMENT12: WebGLConstants

        val COLOR_ATTACHMENT13: WebGLConstants

        val COLOR_ATTACHMENT14: WebGLConstants

        val COLOR_ATTACHMENT15: WebGLConstants

        val FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: WebGLConstants

        val MAX_SAMPLES: WebGLConstants

        val HALF_FLOAT: WebGLConstants

        val RG: WebGLConstants

        val RG_INTEGER: WebGLConstants

        val R8: WebGLConstants

        val RG8: WebGLConstants

        val R16F: WebGLConstants

        val R32F: WebGLConstants

        val RG16F: WebGLConstants

        val RG32F: WebGLConstants

        val R8I: WebGLConstants

        val R8UI: WebGLConstants

        val R16I: WebGLConstants

        val R16UI: WebGLConstants

        val R32I: WebGLConstants

        val R32UI: WebGLConstants

        val RG8I: WebGLConstants

        val RG8UI: WebGLConstants

        val RG16I: WebGLConstants

        val RG16UI: WebGLConstants

        val RG32I: WebGLConstants

        val RG32UI: WebGLConstants

        val VERTEX_ARRAY_BINDING: WebGLConstants

        val R8_SNORM: WebGLConstants

        val RG8_SNORM: WebGLConstants

        val RGB8_SNORM: WebGLConstants

        val RGBA8_SNORM: WebGLConstants

        val SIGNED_NORMALIZED: WebGLConstants

        val COPY_READ_BUFFER: WebGLConstants

        val COPY_WRITE_BUFFER: WebGLConstants

        val COPY_READ_BUFFER_BINDING: WebGLConstants

        val COPY_WRITE_BUFFER_BINDING: WebGLConstants

        val UNIFORM_BUFFER: WebGLConstants

        val UNIFORM_BUFFER_BINDING: WebGLConstants

        val UNIFORM_BUFFER_START: WebGLConstants

        val UNIFORM_BUFFER_SIZE: WebGLConstants

        val MAX_VERTEX_UNIFORM_BLOCKS: WebGLConstants

        val MAX_FRAGMENT_UNIFORM_BLOCKS: WebGLConstants

        val MAX_COMBINED_UNIFORM_BLOCKS: WebGLConstants

        val MAX_UNIFORM_BUFFER_BINDINGS: WebGLConstants

        val MAX_UNIFORM_BLOCK_SIZE: WebGLConstants

        val MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: WebGLConstants

        val MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: WebGLConstants

        val UNIFORM_BUFFER_OFFSET_ALIGNMENT: WebGLConstants

        val ACTIVE_UNIFORM_BLOCKS: WebGLConstants

        val UNIFORM_TYPE: WebGLConstants

        val UNIFORM_SIZE: WebGLConstants

        val UNIFORM_BLOCK_INDEX: WebGLConstants

        val UNIFORM_OFFSET: WebGLConstants

        val UNIFORM_ARRAY_STRIDE: WebGLConstants

        val UNIFORM_MATRIX_STRIDE: WebGLConstants

        val UNIFORM_IS_ROW_MAJOR: WebGLConstants

        val UNIFORM_BLOCK_BINDING: WebGLConstants

        val UNIFORM_BLOCK_DATA_SIZE: WebGLConstants

        val UNIFORM_BLOCK_ACTIVE_UNIFORMS: WebGLConstants

        val UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: WebGLConstants

        val UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: WebGLConstants

        val UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: WebGLConstants

        val INVALID_INDEX: WebGLConstants

        val MAX_VERTEX_OUTPUT_COMPONENTS: WebGLConstants

        val MAX_FRAGMENT_INPUT_COMPONENTS: WebGLConstants

        val MAX_SERVER_WAIT_TIMEOUT: WebGLConstants

        val OBJECT_TYPE: WebGLConstants

        val SYNC_CONDITION: WebGLConstants

        val SYNC_STATUS: WebGLConstants

        val SYNC_FLAGS: WebGLConstants

        val SYNC_FENCE: WebGLConstants

        val SYNC_GPU_COMMANDS_COMPLETE: WebGLConstants

        val UNSIGNALED: WebGLConstants

        val SIGNALED: WebGLConstants

        val ALREADY_SIGNALED: WebGLConstants

        val TIMEOUT_EXPIRED: WebGLConstants

        val CONDITION_SATISFIED: WebGLConstants

        val WAIT_FAILED: WebGLConstants

        val SYNC_FLUSH_COMMANDS_BIT: WebGLConstants

        val VERTEX_ATTRIB_ARRAY_DIVISOR: WebGLConstants

        val ANY_SAMPLES_PASSED: WebGLConstants

        val ANY_SAMPLES_PASSED_CONSERVATIVE: WebGLConstants

        val SAMPLER_BINDING: WebGLConstants

        val RGB10_A2UI: WebGLConstants

        val INT_2_10_10_10_REV: WebGLConstants

        val TRANSFORM_FEEDBACK: WebGLConstants

        val TRANSFORM_FEEDBACK_PAUSED: WebGLConstants

        val TRANSFORM_FEEDBACK_ACTIVE: WebGLConstants

        val TRANSFORM_FEEDBACK_BINDING: WebGLConstants

        val COMPRESSED_R11_EAC: WebGLConstants

        val COMPRESSED_SIGNED_R11_EAC: WebGLConstants

        val COMPRESSED_RG11_EAC: WebGLConstants

        val COMPRESSED_SIGNED_RG11_EAC: WebGLConstants

        val COMPRESSED_RGB8_ETC2: WebGLConstants

        val COMPRESSED_SRGB8_ETC2: WebGLConstants

        val COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2: WebGLConstants

        val COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2: WebGLConstants

        val COMPRESSED_RGBA8_ETC2_EAC: WebGLConstants

        val COMPRESSED_SRGB8_ALPHA8_ETC2_EAC: WebGLConstants

        val TEXTURE_IMMUTABLE_FORMAT: WebGLConstants

        val MAX_ELEMENT_INDEX: WebGLConstants

        val TEXTURE_IMMUTABLE_LEVELS: WebGLConstants

        val MAX_TEXTURE_MAX_ANISOTROPY_EXT: WebGLConstants
    }
}
