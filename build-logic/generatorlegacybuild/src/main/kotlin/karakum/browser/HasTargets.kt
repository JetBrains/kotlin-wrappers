package karakum.browser

internal const val HAS_TARGETS = "HasTargets"

// language=kotlin
private val HAS_TARGETS_BODY: String = """
external interface HasTargets<out C : EventTargetLike, out T: EventTargetLike> {
    val currentTarget: C
    val target: T
}
""".trimIndent()

internal fun HasTargets(): ConversionResult =
    ConversionResult(
        name = HAS_TARGETS,
        body = HAS_TARGETS_BODY,
        pkg = "web.events",
    )
