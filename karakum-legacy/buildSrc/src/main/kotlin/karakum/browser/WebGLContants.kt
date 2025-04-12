package karakum.browser

import karakum.common.loadContent
import java.net.URI
import kotlin.math.ceil
import kotlin.math.log

private val MDN_URI =
    URI("https://raw.githubusercontent.com/mdn/content/refs/heads/main/files/en-us/web/api/webgl_api/constants/index.md")

private data class ConstantGroup(
    val name: String,
    val constants: List<Constant>,
) {
    val isFlag: Boolean by lazy {
        constants.all { it.looksLikeFlag }
    }
}

private data class Constant(
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

internal fun webglConstantDeclarations(): List<ConversionResult> {
    loadContent(MDN_URI)
        .substringAfter("\n## Standard WebGL 1 constants\n", "")
        .substringBefore("\n## ", "")
        .splitToSequence("\n### ")
        .drop(1)
        .map(::parseConstantGroup)
        .forEach {
            // println("-----------")
            println(it.name)
            println("Flag: ${it.isFlag}")
            // println(it.constants.joinToString("\n") { (name, value, description) -> "$name[$value] - $description" })
            // println("-----------")
        }

    return emptyList()
}

private fun parseConstantGroup(
    source: String,
): ConstantGroup {
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
                        Constant(
                            name = nameBase + index,
                            value = "0x" + (valueBase + index).toString(16),
                            description = description,
                        )
                    }
            } else {
                sequenceOf(
                    Constant(
                        name = name,
                        value = value,
                        description = description,
                    )
                )
            }
        }
        .toList()

    return ConstantGroup(
        name = groupName,
        constants = constants,
    )
}
