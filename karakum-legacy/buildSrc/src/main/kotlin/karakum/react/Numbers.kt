package karakum.react

private val INT_NAMES = setOf(
    "span",
    "colSpan",
    "rowSpan",

    "maxLength",
    "minLength",
    "size",

    "rows",
    "cols",

    "twist",
    "charCode",
    "keyCode",
    "detail",
    "pointerId",

    "tabIndex",
    "start",

    "border",
    "frameBorder",

    // Enums
    "eventPhase",
    "location",
    "which",
    "button",
    "buttons",
    "deltaMode",

    // ARIA
    "aria-colcount",
    "aria-colindex",
    "aria-colspan",
    "aria-level",
    "aria-posinset",
    "aria-rowcount",
    "aria-rowindex",
    "aria-rowspan",
    "aria-setsize",

    // SVG
    "numOctaves",
    "order",
    "renderingIntent",
    "seed",
)

private val DOUBLE_NAMES = setOf(
    "width",
    "height",

    "min",
    "max",
    "low",
    "high",
    "optimum",
    "step",

    "elapsedTime",

    "pressure",
    "tangentialPressure",

    "cx", "cy",
    "dx", "dy",
    "fx", "fy",
    "rx", "ry",

    "x", "x1", "x2",
    "y", "y1", "y2",
    "z",

    "r", "radius",

    // ARIA
    "aria-valuemax",
    "aria-valuemin",
    "aria-valuenow",

    // SVG
    "alphabetic",
    "amplitude",
    "ascent",
    "azimuth",
    "baseFrequency",
    "bias",
    "by",
    "descent",
    "diffuseConstant",
    "divisor",
    "elevation",
    "exponent",
    "filterRes",
    "fontSize",
    "hanging",
    "ideographic",
    "intercept",

    "k",
    "k1",
    "k2",
    "k3",
    "k4",

    "limitingConeAngle",
    "mathematical",
    "opacity",
    "pathLength",
    "repeatCount",
    "scale",
    "slope",
    "specularConstant",
    "specularExponent",
    "stemh",
    "stemv",
    "stopOpacity",
    "strokeMiterlimit",
    "surfaceScale",
    "unitsPerEm",
    "vAlphabetic",
    "vHanging",
    "vIdeographic",
    "vMathematical",
)

private val STRING_NAMES = setOf(
    "cellPadding",
    "cellSpacing",
    "results",

    // SVG
    "baselineShift",
    "baseProfile",
    "bbox",
    "begin",
    "clip",
    "clipRule",
    "colorInterpolation",
    "colorProfile",
    "colorRendering",
    "contentScriptType",
    "contentStyleType",
    "cursor",
    "decelerate",
    "direction",
    "display",
    "dominantBaseline",
    "dur",
    "enableBackground",
    "end",
    "fillOpacity",
    "floodOpacity",
    "fontSizeAdjust",
    "fontStretch",
    "fontStyle",
    "fontVariant",
    "fontWeight",
    "format",
    "fr",
    "from",
    "g1",
    "g2",
    "glyphName",
    "glyphOrientationHorizontal",
    "glyphOrientationVertical",
    "glyphRef",
    "imageRendering",
    "in2",
    "kernelMatrix",
    "kernelUnitLength",
    "kerning",
    "keyPoints",
    "keySplines",
    "keyTimes",
    "lengthAdjust",
    "letterSpacing",
    "local",
    "mode",
    "offset",
    "operator",
    "orient",
    "orientation",
    "origin",
    "overflow",
    "paintOrder",
    "panose1",
    "patternTransform",
    "pointerEvents",
    "repeatDur",
    "requiredExtensions",
    "requiredFeatures",
    "restart",
    "rotate",
    "shapeRendering",
    "spacing",
    "speed",
    "startOffset",
    "stdDeviation",
    "stitchTiles",
    "string",
    "strokeOpacity",
    "systemLanguage",
    "tableValues",
    "textDecoration",
    "textLength",
    "textRendering",
    "to",
    "u1",
    "u2",
    "unicode",
    "unicodeBidi",
    "unicodeRange",
    "vectorEffect",
    "viewTarget",
    "visibility",
    "widths",
    "wordSpacing",
)

internal fun numberType(
    name: String,
): String =
    when {
        name == "timeStamp" -> "DOMHighResTimeStamp"

        name in INT_NAMES -> INT
        name in DOUBLE_NAMES -> DOUBLE
        name in STRING_NAMES -> STRING

        name.endsWith("X") -> DOUBLE
        name.endsWith("Y") -> DOUBLE
        name.endsWith("Z") -> DOUBLE
        name.endsWith("Width") -> DOUBLE
        name.endsWith("Height") -> DOUBLE

        name.endsWith("Position") -> DOUBLE
        name.endsWith("Thickness") -> DOUBLE

        name.endsWith("Color") -> STRING
        name.endsWith("Mode") -> STRING
        name.endsWith("Units") -> STRING

        else -> TODO("Support numberability for `$name`")
    }
