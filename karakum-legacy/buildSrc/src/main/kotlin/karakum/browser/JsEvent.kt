package karakum.browser

internal const val JS_EVENT = "JsEvent"

// language=kotlin
private val JS_EVENT_BODY: String = """
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.BINARY)
annotation class JsEvent(
    val type: String,
)
""".trimIndent()

internal fun JsEvent(): ConversionResult =
    ConversionResult(
        name = JS_EVENT,
        body = JS_EVENT_BODY,
        pkg = "web.events",
    )
