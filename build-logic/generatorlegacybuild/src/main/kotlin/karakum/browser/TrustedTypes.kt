package karakum.browser

import karakum.common.loadContent
import java.net.URI

private val TRUSTED_TYPES_URI =
    URI("https://raw.githubusercontent.com/microsoft/TypeScript-DOM-lib-generator/83c077a54689b057a4403a7e65966865447baab1/baselines/dom.generated.d.ts")

private val TRUSTED_TYPES_CONTENT by lazy {
    val ranges = listOf(
        2325..2329,
        32934..33096,
        38580..38590,
        39757..39758,
    )

    val lines = loadContent(TRUSTED_TYPES_URI)
        .lines()

    ranges.asSequence()
        .map { range -> lines.subList(range.first - 1, range.last) }
        .joinToString("\n\n") { it.joinToString("\n") }
}

internal fun String.withTrustedTypes(): String =
    this + "\n\n" + TRUSTED_TYPES_CONTENT
