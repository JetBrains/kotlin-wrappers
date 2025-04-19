package karakum.csstype

import karakum.common.ConversionResult

internal fun mathFunctions(): ConversionResult {
    val declarations = sequenceOf(
        function(
            name = "clamp",
            returnType = LENGTH,
            parameters = arrayOf(
                "min" to LENGTH,
                "value" to LENGTH,
                "max" to LENGTH,
            ),
        ),
        function(
            name = "max",
            returnType = LENGTH,
            parameters = arrayOf(
                "values" to LENGTH,
            ),
        ),
        function(
            name = "min",
            returnType = LENGTH,
            parameters = arrayOf(
                "values" to LENGTH,
            ),
        ),
    )

    return ConversionResult(
        name = "Math.functions",
        body = declarations.joinToString("\n\n"),
    )
}
