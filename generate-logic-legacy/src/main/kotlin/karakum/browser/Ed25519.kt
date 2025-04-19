package karakum.browser

internal const val ED25519 = "Ed25519"

private val ED25519_BODY: String = """
@JsValue("$ED25519")
external object $ED25519
""".trimIndent()

internal fun Ed25519(): ConversionResult =
    ConversionResult(
        name = ED25519,
        body = ED25519_BODY,
        pkg = "web.crypto",
    )
