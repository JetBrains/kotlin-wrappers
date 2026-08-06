package karakum.browser

import kotlin.math.ceil
import kotlin.math.log

internal data class GLConstantGroup(
    val name: String,
    val constants: List<GLConstant>,
) {
    val type: String? by lazy {
        when (name) {
            "Clearing buffers" -> null
            "Rendering primitives" -> null
            "Blending modes" -> null
            "Blending equations" -> null
            "Getting GL parameter information" -> null
            "Buffers" -> null
            "Vertex attributes" -> null
            "Culling" -> null
            "Enabling and disabling" -> null
            "Errors" -> null
            "Front face directions" -> null
            "Hints" -> null
            "Data types" -> null
            "Pixel formats" -> null
            "Pixel types" -> null
            "Shaders" -> null
            "Depth or stencil tests" -> null
            "Stencil actions" -> null
            "Textures" -> null
            "Uniform types" -> null
            "Shader precision-specified types" -> null
            "Framebuffers and renderbuffers" -> null
            "Pixel storage modes" -> null
            "Getting GL parameter information" -> null
            "Textures" -> null
            "Pixel types" -> null
            "Queries" -> null
            "Draw buffers" -> null
            "Samplers" -> null
            "Buffers" -> null
            "Data types" -> null
            "Vertex attributes" -> null
            "Transform feedback" -> null
            "Framebuffers and renderbuffers" -> null
            "Uniforms" -> null
            "Sync objects" -> null
            "Miscellaneous constants" -> null
            else -> TODO("Unknown group name: '$name'")
        }
    }

    val isFlag: Boolean by lazy {
        constants.all { it.looksLikeFlag }
    }
}

internal data class GLConstant(
    val name: String,
    val value: String,
    val description: String,
) {
    val looksLikeFlag: Boolean by lazy {
        val v = value.removePrefix("0x").toInt(16)
        val degree = log(v.toDouble(), 2.0)
        degree == ceil(degree)
    }
}

internal fun webglConstantsData(): List<GLConstantGroup> =
    constantGroups("Standard WebGL 1 constants")
        .plus(constantGroups("Additional constants defined WebGL 2"))
        .map(::parseConstantGroup)
        .toList()

private fun constantGroups(
    label: String,
): Sequence<String> =
    mdnContent("api/webgl_api/constants/index.md")
        .substringAfter("\n## $label\n", "")
        .substringBefore("\n## ", "")
        .splitToSequence("\n### ")
        .drop(1)

private fun parseConstantGroup(
    source: String,
): GLConstantGroup {
    val groupName = source.substringBefore("\n")
    val constants = source
        .substringAfter("\n\n| Constant name", "")
        .substringAfter("--- |\n", "")
        .splitToSequence("\n")
        .takeWhile { it.startsWith("|") }
        .map { it.removeSurrounding("|") }
        .flatMap { line ->
            val (name, value, rawDescription) = line
                .removeSurrounding("|")
                .splitToSequence("|")
                .map { it.trim() }
                .map { it.removeSurrounding("`") }
                .toList()

            val description = rawDescription
                .replace(
                    """{{jsxref("Int32Array")}}""",
                    "[Int32Array](js.typedarrays.Int32Array)`",
                )
                .replace(
                    """{{domxref("WebGLRenderingContext.generateMipmap()")}}""",
                    "[WebGLRenderingContext.generateMipmap]",
                )

            if (name == "TEXTURE0 - 31") {
                val nameBase = name.substringBefore("0")
                val valueBase = value
                    .removePrefix("0x")
                    .substringBefore(" - ")
                    .toInt(16)

                (0..31)
                    .asSequence()
                    .map { index ->
                        GLConstant(
                            name = nameBase + index,
                            value = "0x" + (valueBase + index).toString(16),
                            description = description,
                        )
                    }
            } else {
                sequenceOf(
                    GLConstant(
                        name = name,
                        value = value,
                        description = description,
                    ),
                )
            }
        }
        .toList()

    return GLConstantGroup(
        name = groupName,
        constants = constants,
    )
}
