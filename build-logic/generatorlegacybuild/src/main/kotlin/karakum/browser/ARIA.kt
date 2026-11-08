package karakum.browser

import karakum.common.CommonUnionConverter

internal fun ariaUnions(): Sequence<ConversionResult> {
    return sequenceOf(ariaRole())
}

private fun ariaRole(): ConversionResult {
    val values = MDN.root
        .resolve("accessibility/aria/reference/roles")
        .listFiles { file -> file.isDirectory }
        .asSequence()
        .map { it.name }
        .mapNotNull { name -> name.removeSuffix("_role").takeIf { it != name } }
        .sorted()
        .toList()

    return ConversionResult(
        name = "AriaRole",
        body = CommonUnionConverter.sealedUnionBody("AriaRole", values),
        pkg = "web.aria",
    )
}

