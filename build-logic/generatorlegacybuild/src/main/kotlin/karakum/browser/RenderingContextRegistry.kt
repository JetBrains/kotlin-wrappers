package karakum.browser

internal val GET_CONTEXT_WITH_OPTIONS_REGEX =
    Regex("""\n    getContext\(contextId: "(\w+)", options\?: (\w+)\): (\w+) \| null;""")
internal val GET_CONTEXT_REGEX = Regex("""\n    getContext\(contextId: "(\w+)"\): (\w+) \| null;""")

internal object RenderingContextRegistry {
    private lateinit var map: Map<String, RenderingContextData>

    fun fill(
        content: String,
    ) {
        val dataList = GET_CONTEXT_WITH_OPTIONS_REGEX
            .findAll(content)
            .map { result ->
                RenderingContextData(
                    id = result.groupValues[1],
                    options = result.groupValues[2],
                    type = result.groupValues[3],
                )
            }.plus(
                GET_CONTEXT_REGEX
                    .findAll(content)
                    .map { result ->
                        RenderingContextData(
                            id = result.groupValues[1],
                            options = "Void",
                            type = result.groupValues[2],
                        )
                    },
            )

        map = dataList.sortedBy { it.options.length }
            .associateBy { it.type }
            .mapValues { (_, data) ->
                if (data.options == "any") {
                    data.copy(options = data.type.removePrefix("Offscreen") + "Settings")
                } else data
            }
    }

    fun getIdDeclaration(name: String): String? {
        val data = map[name]
            ?: return null

        return """
        inline val $name.Companion.ID: $RENDERING_CONTEXT_ID<${data.type}, ${data.options}>
            get() = unsafeCast("${data.id}")
        """.trimIndent()
    }
}

private data class RenderingContextData(
    val id: String,
    val options: String,
    val type: String,
)
