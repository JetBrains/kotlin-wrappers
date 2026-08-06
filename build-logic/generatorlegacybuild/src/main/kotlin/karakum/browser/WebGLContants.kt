package karakum.browser

import kotlin.math.ceil
import kotlin.math.log

internal data class GLConstantGroup(
    val name: String,
    val constants: List<GLConstant>,
) {
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
    mdnContent("api/webgl_api/constants/index.md")
        .substringAfter("\n## Standard WebGL 1 constants\n", "")
        .substringBefore("\n## ", "")
        .splitToSequence("\n### ")
        .drop(1)
        .map(::parseConstantGroup)
        .toList()

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
            val (name, value, description) = line
                .removeSurrounding("|")
                .splitToSequence("|")
                .map { it.trim() }
                .map { it.removeSurrounding("`") }
                .toList()

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
