package karakum.browser

import karakum.common.CommonUnionConverter.sealedUnionBody

internal data class UnionData(
    val name: String,
    val values: List<String>,
    private val pkg: String,
) {
    fun toConversionResult(): ConversionResult =
        ConversionResult(
            name = name,
            body = sealedUnionBody(
                name = name,
                values = values,
            ),
            pkg = pkg,
        )
}
