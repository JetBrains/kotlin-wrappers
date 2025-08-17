package karakum.browser

import java.io.File

private val WEB_AUDIO_TYPES = listOf(
    "AudioWorkletGlobalScope",
    "AudioWorkletProcessor",
    "AudioWorkletProcessorConstructor",
    // legacy
    // "AudioWorkletProcessorImpl",
)

private val WORKLETS_TYPES = listOf(
    "WorkletGlobalScope",
)

internal fun audioWorkletDeclarations(
    definitionsFile: File,
): Sequence<ConversionResult> {
    val content = definitionsFile.readText()
        .mergeAudioWorkletProcessorTypes()
        .patchInterface("AudioWorkletGlobalScope") {
            it.replace(
                "  registerProcessor(name: string, ",
                "  registerProcessor(name: AudioWorkletProcessorName, ",
            )
        }

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

            var result = convertInterface(
                source = source,
                getStaticSource = { getStaticSource(it, content) },
                predefinedPkg = predefinedPkg,
            ) ?: return@mapNotNull null

            if (name == "AudioWorkletProcessor") {
                result = result.copy(
                    body = result.body
                        .replace("open external ", "abstract external ")
                        .replace("\nprivate constructor()", "")
                        .replace("fun process(", "abstract fun process("),
                )
            }

            result.withComment(fullSource = content, source = source)
        }
}

private fun String.mergeAudioWorkletProcessorTypes(): String {
    val additionalMembers = substringAfter("\ninterface AudioWorkletProcessorImpl")
        .substringAfter(" {\n")
        .substringBefore("\n}")
        .replace(
            "parameters: Record<string, Float32Array>",
            "parameters: Record<AudioParamName, Float32Array>",
        )

    return patchInterface("AudioWorkletProcessor") {
        it + "\n" + additionalMembers
    }.replace(": AudioWorkletProcessorImpl;", ": AudioWorkletProcessor;")
}
