package karakum.csstype

import karakum.common.ConversionResult

internal const val ANGULAR_COLOR_STOP = "AngularColorStop"
internal const val LINEAR_COLOR_STOP = "LinearColorStop"

private val COLOR_PARAMETER = "color" to COLOR

internal fun AngularColorStop(): ConversionResult {
    val declarations = listOf(
        "sealed external interface $ANGULAR_COLOR_STOP",
        factory(
            name = "stop",
            returnType = ANGULAR_COLOR_STOP,
            parameters = arrayOf(
                COLOR_PARAMETER,
                "value" to ANGLE,
            )
        ),
        factory(
            name = "stop",
            returnType = ANGULAR_COLOR_STOP,
            parameters = arrayOf(
                COLOR_PARAMETER,
                "from" to ANGLE,
                "to" to ANGLE,
            )
        )
    )

    return ConversionResult(
        name = ANGULAR_COLOR_STOP,
        body = declarations.joinToString("\n\n"),
    )
}

internal fun LinearColorStop(): ConversionResult {
    val declarations = listOf(
        "sealed external interface $LINEAR_COLOR_STOP",
        factory(
            name = "stop",
            returnType = LINEAR_COLOR_STOP,
            parameters = arrayOf(
                COLOR_PARAMETER,
                "value" to LENGTH,
            )
        ),
        factory(
            name = "stop",
            returnType = LINEAR_COLOR_STOP,
            parameters = arrayOf(
                COLOR_PARAMETER,
                "from" to LENGTH,
                "to" to LENGTH,
            )
        )
    )

    return ConversionResult(
        name = LINEAR_COLOR_STOP,
        body = declarations.joinToString("\n\n"),
    )
}
