package karakum.browser

internal const val EVENT_TYPE = "EventType"

private val EVENT_TYPE_BODY: String = """
sealed external interface $EVENT_TYPE<out E : Event>

inline fun <E : Event> $EVENT_TYPE(
    value: String,
): $EVENT_TYPE<E> =
    unsafeCast(value)
""".trimIndent()

internal fun EventType(): ConversionResult =
    ConversionResult(
        name = EVENT_TYPE,
        body = EVENT_TYPE_BODY,
        pkg = "web.events",
    )
