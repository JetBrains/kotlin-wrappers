package karakum.browser

import karakum.common.loadContent
import java.net.URI

private val WEB_GPU_URI =
    URI("https://raw.githubusercontent.com/microsoft/TypeScript-DOM-lib-generator/2d91b29eb0ebddd40f310c5fa0fc56696bb0b034/baselines/dom.generated.d.ts")

private val WEB_GPU_ITERABLE_URI =
    URI("https://raw.githubusercontent.com/microsoft/TypeScript-DOM-lib-generator/2d91b29eb0ebddd40f310c5fa0fc56696bb0b034/baselines/dom.iterable.generated.d.ts")

internal val WEB_GPU_CONTENT by lazy {
    getWebGPUContent(loadContent(WEB_GPU_URI))
}

internal val WEB_GPU_ITERABLE_CONTENT by lazy {
    getWebGPUContent(loadContent(WEB_GPU_ITERABLE_URI))
}

private fun getWebGPUContent(
    content: String,
): String =
    sequenceOf<String>()
        .plus(getItems(content, "\ninterface GPU", "\n}\n"))
        .plus(getItems(content, "\ninterface WGSLLanguageFeatures", "\n}\n"))
        .plus(getItems(content, "\ndeclare var GPU", "\n};\n"))
        .plus(getItems(content, "\ndeclare var WGSLLanguageFeatures", "\n};\n"))
        .plus(getItems(content, "\ntype GPU", "\n"))
        .filter { "\ninterface GPUError" !in it }
        .filter { "interface GPUPipelineError" !in it }
        .filter { "type GPUPipelineError" !in it }
        .joinToString("\n\n")

private fun getItems(
    content: String,
    delimiter: String,
    endMarker: String,
): Sequence<String> =
    content
        .splitToSequence(delimiter)
        .drop(1)
        .map { it.substringBefore(endMarker) }
        .map { delimiter + it + endMarker }
        .map { declaration ->
            val prefix = content.substringBefore(declaration)
            val comment = if (prefix.endsWith(" */")) {
                "/**\n" + prefix.substringAfterLast("\n/**\n")
            } else ""

            comment + declaration
        }
        .map { it.trim() }
