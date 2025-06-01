package karakum.browser

// language=kotlin
private val ELEMENT_ID_BODY = """
sealed external interface ElementId {
    @JsAlias(THIS)
    fun asString(): String
}

inline fun ElementId(
    value: String,
): ElementId =
    unsafeCast(value)
""".trimIndent()


internal fun domAliases(): List<ConversionResult> =
    listOf(
        ConversionResult(
            name = "ElementId",
            body = ELEMENT_ID_BODY,
            pkg = "web.dom",
        )
    )
