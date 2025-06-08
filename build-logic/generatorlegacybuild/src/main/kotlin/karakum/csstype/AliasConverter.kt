package karakum.csstype

import karakum.common.ConversionResult

internal fun tryToAlias(
    name: String,
    body: String,
): ConversionResult? =
    when (body) {
        "Globals | DataType.BlendMode",
        "Globals | DataType.BlendMode | (string & {})",
            -> ConversionResult(name, "typealias $name = $BLEND_MODE_PROPERTY")

        "Globals | DataType.LineWidth | DataType.LineStyle | DataType.Color | (string & {})",
            -> when (name) {
            BORDER -> ConversionResult(name, "sealed external interface $name")
                .let { it.copy(body = it.body + "\n\n" + borderFactories(name)) }

            else -> ConversionResult(name, "typealias $name = $BORDER")
        }

        "Globals | DataType.Color",
        "Globals | DataType.Color | (string & {})",
            -> if (name != COLOR_PROPERTY) {
            ConversionResult(name, "typealias $name = $COLOR_PROPERTY")
        } else null

        "Globals | TLength",
        "Globals | TLength | (string & {})",
            -> ConversionResult(name, "typealias $name = $LENGTH_PROPERTY")

        """Globals | TLength | "auto"""",
        """Globals | TLength | "auto" | (string & {})""",
            -> ConversionResult(name, "typealias $name = $AUTO_LENGTH_PROPERTY")

        "Globals | TTime | (string & {})",
            -> ConversionResult(name, "typealias $name = $TIME_PROPERTY")

        "Globals | DataType.GridLine",
        "Globals | DataType.GridLine | (string & {})",
            -> ConversionResult(name, "typealias $name = $GRID_LINE_PROPERTY")

        "Globals | DataType.LineStyle",
        "Globals | DataType.LineStyle | (string & {})",
            -> ConversionResult(name, "typealias $name = $LINE_STYLE_PROPERTY")

        "Globals | DataType.LineStyle | \"auto\" | (string & {})",
            -> {
            require(name == OUTLINE_STYLE)
            ConversionResult(name, "sealed external interface $name")
        }

        "Globals | DataType.LineWidth",
        "Globals | DataType.LineWidth | (string & {})",
            -> ConversionResult(name, "typealias $name = $LINE_WIDTH_PROPERTY")

        else -> null
    }
