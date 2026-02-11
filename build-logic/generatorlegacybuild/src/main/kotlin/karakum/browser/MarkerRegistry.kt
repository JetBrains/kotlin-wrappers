package karakum.browser

private val JS_MARKER_DECLARATIONS = setOf(
    "Transferable",
)

private val WEB_MARKER_DECLARATIONS = setOf(
    "ReadableStreamController<T>",

    "MessageEventSource",

    "ImageBitmapSource",
    "CanvasImageSource",
    "TexImageSource",

    "GPUCopyExternalImageSource",
    "GPUBindingResource",
)

private val BROWSER_MARKER_DECLARATIONS = setOf(
    "HTMLOrSVGImageElement",
    "HTMLOrSVGScriptElement",

    "OffscreenRenderingContext",
    "RenderingContext",
)

internal val MARKER_DECLARATIONS =
    BROWSER_MARKER_DECLARATIONS +
            WEB_MARKER_DECLARATIONS +
            JS_MARKER_DECLARATIONS

private val BASE_TYPES = listOf(
    "Blob",
)

// TODO: read from definitions
private val ALIASES = mapOf(
    "WindowProxy" to "Window",
)

internal object MarkerRegistry {
    private lateinit var map: Map<String, List<String>>

    fun fill(
        content: String,
    ) {
        map = MARKER_DECLARATIONS.asSequence()
            .flatMap { name -> findParentTypes(content = content, interfaceDeclaration = name) }
            .groupBy(keySelector = { it.first }, valueTransform = { it.second })
    }

    fun additionalParents(
        type: String,
    ): List<String>? =
        map[type]

    fun nonProcessedChildTypes(
        type: String,
    ): List<String> {
        // TEMP
        if (type == "ImageBitmapSource")
            return emptyList()

        return BASE_TYPES.filter {
            val parentTypes = map[it]
            parentTypes != null && type in parentTypes
        }
    }
}

private fun findParentTypes(
    content: String,
    interfaceDeclaration: String,
): Sequence<Pair<String, String>> =
    content.substringAfter("type $interfaceDeclaration = ", "")
        .substringBefore(";\n")
        .splitToSequence(" | ")
        .map { it.substringBefore("<") }
        .map { ALIASES[it] ?: it }
        .map { type ->
            val parentType = when (type) {
                "ReadableByteStreamController" -> interfaceDeclaration.replace("<T>", "<Void>")
                "ReadableStreamDefaultController" -> interfaceDeclaration.replace("<T>", "<R>")
                else -> interfaceDeclaration
            }

            type to parentType
        }
