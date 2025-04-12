package karakum.browser

import java.io.File

private val WEB_AUDIO_TYPES = listOf(
    "AudioWorkletGlobalScope",
    "AudioWorkletProcessor",
    "AudioWorkletProcessorConstructor",
    "AudioWorkletProcessorImpl",
)

private val WORKLETS_TYPES = listOf(
    "WorkletGlobalScope",
)

internal fun audioWorkletDeclarations(
    definitionsFile: File,
): Sequence<ConversionResult> {
    val content = definitionsFile.readText()

    return Regex("""interface .+? \{[\s\S]*?\n}""")
        .findAll(content)
        .map { it.value }
        .mapNotNull { source ->
            val name = source
                .substringAfter(" ")
                .substringBefore(" ")

            val predefinedPkg = when (name) {
                in WEB_AUDIO_TYPES -> "web.audio"
                in WORKLETS_TYPES -> "web.worklets"

                else -> return@mapNotNull null
            }

            convertInterface(
                source = source,
                getStaticSource = { getStaticSource(it, content) },
                predefinedPkg = predefinedPkg,
            )?.withComment(fullSource = content, source = source)
        }
}
