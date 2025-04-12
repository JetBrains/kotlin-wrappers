package karakum.browser

internal const val EVENT_PHASE = "EventPhase"
internal const val NODE_TYPE = "NodeType"
internal const val DELTA_MODE = "DeltaMode"
internal const val KEY_LOCATION = "KeyLocation"

private val CORRECTION_MAP = listOf(
    StateCorrection("CSSRule", null),
    StateCorrection("Range", "compareMethod", parameterName = "how"),

    StateCorrection("FileReader", "readyState"),
    StateCorrection("HTMLTrackElement", "readyState"),
    StateCorrection("HTMLMediaElement", "networkState", constantPrefix = "NETWORK_"),
    StateCorrection("HTMLMediaElement", "readyState", constantPrefix = "HAVE_"),
    StateCorrection("WebSocket", "readyState"),
    StateCorrection("EventSource", "readyState"),
    StateCorrection("XMLHttpRequest", "readyState"),

    StateCorrection("GeolocationPositionError", "code"),
    StateCorrection("MediaError", "code"),

    StateCorrection("XPathResult", "resultType"),

    StateCorrection("Event", "eventPhase", existedAliasName = EVENT_PHASE),
    StateCorrection("Node", "nodeType", existedAliasName = NODE_TYPE),
    StateCorrection("KeyboardEvent", "location", existedAliasName = KEY_LOCATION),
    StateCorrection("WheelEvent", "deltaMode", existedAliasName = DELTA_MODE),

    StateCorrection("SVGAngle", "unitType", "unitType"),
    StateCorrection("SVGLength", "unitType", "unitType"),
    StateCorrection("SVGTransform", "type"),

    StateCorrection("SVGPreserveAspectRatio", "align", constantPrefix = "SVG_PRESERVEASPECTRATIO_"),
    StateCorrection("SVGPreserveAspectRatio", "meetOrSlice", constantPrefix = "SVG_MEETORSLICE_"),

    StateCorrection("SVGComponentTransferFunctionElement", "type"),
    StateCorrection("SVGFEBlendElement", "mode"),
    StateCorrection("SVGFEColorMatrixElement", "type"),
    StateCorrection("SVGFECompositeElement", "operator"),
    StateCorrection("SVGFEConvolveMatrixElement", "edgeMode"),
    StateCorrection("SVGFEDisplacementMapElement", "xChannelSelector"),
    StateCorrection("SVGFEDisplacementMapElement", "yChannelSelector"),
    StateCorrection("SVGFEMorphologyElement", "operator"),

    StateCorrection("SVGFETurbulenceElement", "stitchTiles", constantPrefix = "SVG_STITCHTYPE_"),
    StateCorrection("SVGFETurbulenceElement", "type", constantPrefix = "SVG_TURBULENCE_TYPE_"),
    StateCorrection("SVGGradientElement", "spreadMethod"),
    StateCorrection("SVGMarkerElement", "markerUnits", constantPrefix = "SVG_MARKERUNITS_"),
    StateCorrection("SVGMarkerElement", "orientType", constantPrefix = "SVG_MARKER_ORIENT_"),
    StateCorrection("SVGTextContentElement", "lengthAdjust"),

    StateCorrection("SVGTextPathElement", "method", constantPrefix = "TEXTPATH_METHODTYPE_"),
    StateCorrection("SVGTextPathElement", "spacing", constantPrefix = "TEXTPATH_SPACINGTYPE_"),

    StateCorrection("SVGUnitTypes", "type"),
)

private val ALIAS_NAME_MAP = CORRECTION_MAP.asSequence()
    .mapNotNull { correction ->
        val (_, propertyName, _, existedAliasName) = correction
        if (propertyName != null && existedAliasName == null) {
            val aliasName = if (propertyName.endsWith("ChannelSelector")) {
                "ChannelSelector"
            } else propertyName.replaceFirstChar(Char::uppercase)

            correction to aliasName
        } else null
    }
    .toMap()

private val ALIASES_MAP = ALIAS_NAME_MAP.entries.groupBy(
    keySelector = { it.key.className },
    valueTransform = { it.value },
)

internal fun getAdditionalAliasNames(
    name: String,
): List<String>? =
    ALIASES_MAP[name]?.distinct()

private data class StateCorrection(
    val className: String,
    val propertyName: String?,
    val parameterName: String? = null,
    val existedAliasName: String? = null,
    val constantPrefix: String = "",
)

internal fun String.applyReadyStatePatches(): String =
    CORRECTION_MAP.fold(this) { acc, correction ->
        val className = correction.className

        sequenceOf("\ninterface $className ")
            .plus("\ndeclare var $className: ")
            .plus(if (className.endsWith("Event")) sequenceOf("\ninterface ${className}Init ") else emptySequence())
            .map { prefix -> prefix + acc.substringAfter(prefix).substringBefore("\n}\n").substringBefore("\n};\n") }
            .fold(acc) { localAcc, before ->
                localAcc.replace(before, applyCorrection(before, correction))
            }
    }
        .replace("Units: SVGAnimatedEnumeration;\n", "Units: SVGAnimatedEnumeration<SVGUnitTypes.Type>;\n")

private fun constantRegex(
    prefix: String = "",
): Regex =
    Regex("""(\n\s+readonly $prefix[A-Z_]+: )[\dx]+(;)""")

private fun applyCorrection(
    source: String,
    correction: StateCorrection,
): String {
    val propertyName = correction.propertyName
    return if (propertyName != null) {
        val aliasName = correction.existedAliasName
            ?: ALIAS_NAME_MAP.getValue(correction)

        var result = source
            .replace("readonly $propertyName: number;", "readonly $propertyName: $aliasName;")
            .replace(
                "readonly $propertyName: SVGAnimatedEnumeration;",
                "readonly $propertyName: SVGAnimatedEnumeration<$aliasName>;"
            )
            .replace("    $propertyName: number;", "    $propertyName: $aliasName;")
            .replace("    $propertyName?: number;", "    $propertyName?: $aliasName;")
            .replace(constantRegex(correction.constantPrefix), "$1$aliasName$2")

        val parameterName = correction.parameterName
        if (parameterName != null) {
            result = result.replace("($parameterName: number", "($parameterName: $aliasName")
        }

        result
    } else {
        source.replace(constantRegex(), "")
    }
}
