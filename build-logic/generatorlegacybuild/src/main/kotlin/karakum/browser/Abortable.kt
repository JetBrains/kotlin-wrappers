package karakum.browser

internal const val ABORTABLE = "Abortable"

// language=kotlin
private val ABORTABLE_BODY: String = """
@JsPlainObject
external interface Abortable {
    /**
     * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
     */
    var signal: AbortSignal?
}
""".trimIndent()

internal fun Abortable(): ConversionResult =
    ConversionResult(
        name = ABORTABLE,
        body = ABORTABLE_BODY,
        pkg = "web.abort",
    )
