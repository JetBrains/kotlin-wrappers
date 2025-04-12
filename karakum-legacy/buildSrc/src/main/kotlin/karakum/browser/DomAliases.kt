package karakum.browser

internal fun domAliases(): List<ConversionResult> =
    listOf(
        ConversionResult(
            name = "NodeListOf",
            body = "typealias NodeListOf<T> = NodeList<T>",
            pkg = "web.dom",
        )
    )
