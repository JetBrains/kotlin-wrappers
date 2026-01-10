package karakum.browser

internal const val Ed25519: String = "Ed25519"
internal const val X25519: String = "X25519"

private fun algorithmBody(name: String): String = """
sealed external interface ${name}Algorithm

inline val ${name}: ${name}Algorithm
    get() = unsafeCast("$name")
""".trimIndent()

internal fun cryptoAlgorithms(): Sequence<ConversionResult> =
    sequenceOf(Ed25519, X25519)
        .map { name ->
            ConversionResult(
                name = name,
                body = algorithmBody(name),
                pkg = "web.crypto",
            )
        }
