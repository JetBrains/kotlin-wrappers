package karakum.csstype

import karakum.common.ConversionResult
import java.io.File

internal fun convertDefinitions(
    definitionsFile: File,
): Sequence<ConversionResult> {
    val contentMap = contentMap(definitionsFile)

    var types = contentMap
        .asSequence()
        .flatMap { (name, content) ->
            when {
                name == "PropertyValue" -> emptySequence()
                name.startsWith("Svg") -> emptySequence()
                name.startsWith("Obsolete") -> emptySequence()
                name.startsWith("Vendor") -> emptySequence()
                name.contains("Hyphen") -> emptySequence()
                name.contains("Fallback") -> emptySequence()
                name == "Pseudos" -> sequenceOf(convertMetaPseudos(name, content))
                name == "SimplePseudos" || name == "AdvancedPseudos" -> sequenceOf(convertPseudos(name, content))
                content.startsWith("namespace AtRule ") ->
                    convertNamespace(content)
                        // Conflict with `Page` property
                        .filter { it.name != "Page" } +
                            convertNamespaceTypes(content, AT_RULE_TYPES)

                content.startsWith("namespace DataType ") -> convertNamespaceTypes(content)
                content.startsWith("namespace ") -> convertNamespace(content)
                else -> convertDefinition(name, content)
            }
        }
        .plus(Auto())
        .plus(None())
        .plus(ContainerQuery())
        .plus(MediaQuery())
        .plus(SizeQuery())
        .toList()

    val globalsContext = ParentContext("Globals")
    val integerContext = ParentContext(INTEGER)
    val numberContext = ParentContext(NUMBER)
    val autoContext = ParentContext(AUTO)
    val noneContext = ParentContext(NONE)
    val lengthContext = ParentContext(LENGTH_PROPERTY)
    val timeContext = ParentContext(TIME_PROPERTY)
    val geometryPositionContext = ParentContext(GEOMETRY_POSITION)

    types = sequenceOf(
        LengthTypeConsumer(),
        PropertyConsumer(),
        globalsContext,
        integerContext,
        numberContext,
        autoContext,
        noneContext,
        lengthContext,
        timeContext,
        geometryPositionContext,
        ColorConsumer(),
    ).fold(types) { t, context ->
        context.apply(t)
    }

    val globalsParentTypes = globalsContext.parentTypes
        .asSequence()
        .plus(LENGTH_PROPERTY)
        .plus(GRID_LENGTH_PROPERTY)
        .plus(TIME_PROPERTY)
        .plus(COLOR_PROPERTY)
        .plus(GRID_LINE_PROPERTY)
        .plus(LINE_STYLE_PROPERTY)
        .plus(LINE_WIDTH_PROPERTY)
        .plus(BLEND_MODE_PROPERTY)
        .sorted()
        .joinToString(",\n")

    val globalsType = ConversionResult(
        "GlobalsType",
        "sealed external interface GlobalsType:\n$globalsParentTypes",
    )

    val propertyTypes = listOf(
        IntegerType(integerContext),
        NumberType(numberContext),
        StringType(),
        IdentType(),
        AutoType(autoContext),
        NoneType(noneContext),
        GeometryPosition(geometryPositionContext),

        Angle(),
        Length(),
        LengthProperty(lengthContext),
        AutoLength(),
        AutoLengthProperty(),
        Percentage(),
        GridLength(),
        GridLengthProperty(),
        Time(),
        TimeProperty(timeContext),
        Gradient(),
        Image(),
        Url(),
        GridLineProperty(),
        LineStyleProperty(),
        LineWidthProperty(),
        BlendModeProperty(),

        TransformFunction(),
        mathFunctions(),
        lengthOperators(),
        FilterFunction(),
        colorFunctions(),
        referenceFunctions(),
        AutoRepeat(),
        gridFunctions(),

        ColorType(),
        AngularColorStop(),
        LinearColorStop(),

        BasicShape(),
        ShapeRadius(),
        GeometryBox(),
        Round(),
        shapeFunctions(),

        PropertyName(contentMap)
    )

    val builderTypes = listOf(
        ClassName(),
        CssDsl(),
        RuleBuilder(),
        Rules(),
        Selector(),
        CustomPropertyName(),
        CustomProperties(),
    )

    return types.asSequence()
        .plus(propertyTypes)
        .plus(globalsType)
        .plus(builderTypes)
}

private fun contentMap(
    definitionsFile: File,
): Map<String, String> =
    definitionsFile.readText()
        .removePrefix("export {};\n")
        .inlineTypes()
        .replace("SystemColor | DeprecatedSystemColor | ", "")
        // for `PointerEvents`
        .replace(Regex("""( = Globals \| .+) \| "inherit""""), "$1")
        .splitToSequence("\nexport ", "\ndeclare ")
        .drop(1)
        .associate { content ->
            val name = content.substringAfter(" ")
                .substringBefore(" ")
                .substringBefore("<")

            name to content
        }


private fun convertNamespace(
    source: String,
): Sequence<ConversionResult> {
    return source
        .substringAfter("{\n")
        .substringBefore("\n}")
        .trimIndent()
        .let { "\n" + it }
        .splitToSequence("\nexport ")
        .drop(1)
        .flatMap { content ->
            val name = content.substringAfter(" ")
                .substringBefore(" ")
                .substringBefore("<")

            when {
                name.startsWith("Moz") -> emptySequence()
                name.startsWith("Ms") -> emptySequence()
                name.startsWith("Webkit") -> emptySequence()
                name.contains("Hyphen")
                        && name != "Hyphens"
                        && name != "HyphenateCharacter"
                        && name != "HyphenateLimitChars"
                    -> emptySequence()

                name.contains("Fallback") -> emptySequence()
                name in DEPRECATED_TYPES -> emptySequence()
                else -> convertDefinition(name, content)
            }
        }
}

private val AT_RULE_TYPES = setOf(
    "BasePalette",
    "FontDisplay",
    "Size",
    "Inherits",
    "AlignContent",
    "Hyphens",
    "Range",
    "System",

    "AscentOverride",
    "DescentOverride",
    "LineGapOverride",
    "Bleed",
    "Marks",

    "Navigation",
    "Types",
)

private val EXCLUDED_DATA_TYPES = setOf(
    "Paint",
    "OutlineLineStyle",

    "Dasharray",
    "ViewportLength",

    "DeprecatedSystemColor",
    "SystemColor",
)

private fun convertNamespaceTypes(
    source: String,
    enabledTypes: Set<String>? = null,
): Sequence<ConversionResult> {
    val typeEnabled: (String) -> Boolean = when {
        enabledTypes != null
            -> enabledTypes::contains

        else -> { type: String -> type !in EXCLUDED_DATA_TYPES }
    }

    return source
        .substringAfter("{\n")
        .substringBefore("\n}")
        .trimIndent()
        .let { "\n" + it }
        .splitToSequence("\ntype ")
        .drop(1)
        .map { it.replace("<TLength>", "") }
        .map { it.replace("<TTime>", "") }
        .mapNotNull { content ->
            val name = content
                .substringBefore(" ")
                .substringBefore("<")

            if (typeEnabled(name)) {
                convertUnion(name, content, true)
            } else null
        }
}

private fun convertDefinition(
    name: String,
    source: String,
): Sequence<ConversionResult> {
    if (OVERFLOW_ALIAS_MAP.containsKey(name))
        return emptySequence()

    val content = source
        .replace("TLength = (string & {}) | 0", "TLength")
        .replace("TTime = string & {}", "TTime")
        .replace("<TLength, TTime>", "")
        .replace("<TLength>", "")
        .replace("<TTime>", "")

    when (name) {
        "GridAutoColumns",
        "GridTemplateColumns",
            -> {
            val tracksName = name.replace("Columns", "Tracks")
            return convertDefinition(tracksName, content.replace(name, tracksName))
                .plus(ConversionResult(name, "typealias $name = $tracksName"))
        }

        "GridAutoRows",
        "GridTemplateRows",
            -> return sequenceOf(
            ConversionResult(name, "typealias $name = ${name.replace("Rows", "Tracks")}")
        )
    }

    return when {
        content.startsWith("type ") -> sequenceOf(convertUnion(name, content))
        else -> sequenceOf(convertInterface(name, content))
    }
}

private val ENUMS = setOf(
    "Globals",
    "Marks",
    "SpeakAs",
    "System",

    "AtRules",
    "HtmlAttributes",
    "AdvancedPseudos",
    "SimplePseudos",
)

private val ENUM_TAIL = " | (string & {})"

private fun convertUnion(
    name: String,
    source: String,
    enumMode: Boolean = false,
): ConversionResult {
    if (source.startsWith("type Color ="))
        return convertUnion(
            name = COLOR_PROPERTY,
            source = source.replaceFirst("Color", COLOR_PROPERTY)
        )

    if (name == BACKGROUND && "| Color " in source)
        return convertUnion(
            name = name,
            source = source.replaceFirst("| Color ", "")
        )

    if (name in ENUMS && (!enumMode || ENUM_TAIL in source))
        return convertUnion(
            name = name,
            source = source.replaceFirst(ENUM_TAIL, ""),
            enumMode = true,
        )

    var declaration = source.removePrefix("type ")
        .substringBefore(" =")

    if (declaration == "GridAutoTracks")
        declaration += ":\nGridTemplateTracks"

    val body = source.substringAfter(" =")
        .removePrefix("\n")
        .trimIndent()
        .removeSuffix(";")

    when (body) {
        "Globals | (number & {})",
        "Globals | (number & {}) | (string & {})",
        "Globals | \"auto\" | (number & {})",
        "Globals | \"auto\" | (number & {}) | (string & {})",
        "Globals | \"auto\" | (string & {}) | (number & {})",
        "Globals | \"auto-add\" | (string & {}) | (number & {})",
        "Globals | \"none\" | (number & {})",
        "Globals | \"none\" | (number & {}) | (string & {})",
        "Globals | \"infinite\" | (string & {}) | (number & {})",
        "\"auto\" | (string & {}) | (number & {})",
            -> return convertNumberType(name, source)
    }

    if ("(number & {})" in source) {
        when (name) {
            "FontWeight",
            "Opacity",
            "Scale",
            "Zoom",
                -> return convertNumberType(name, source.replace(" | (string & {})", ""))
        }
    }

    if (name == "FontWeight" && "(number & {})" in source)
        return convertNumberType(name, source)

    if (body == """"false" | "true"""")
        return ConversionResult(name, "typealias $name = Boolean")

    tryToUnion(name, body, enumMode)?.let {
        return when (name) {
            FONT -> it.copy(body = it.body + "\n\n" + fontFactories())
            FLEX -> it.copy(body = it.body + "\n\n" + flexFactories())
            BOX_SHADOW -> it.copy(body = it.body + "\n\n" + boxShadowFactories())
            TEXT_SHADOW -> it.copy(body = it.body + "\n\n" + textShadowFactories())
            TRANSFORM_ORIGIN -> it.copy(body = it.body + "\n\n" + transformOriginFactories())
            TRANSITION -> it.copy(body = it.body + "\n\n" + transitionFactories())
            else -> it
        }
    }

    when (name) {
        "ColumnGap",
        "RowGap",
            -> return ConversionResult(name, "typealias $name = Gap")

        OUTLINE,
            -> return tryToUnion(
            name = name,
            body = body.replace("DataType.LineWidth | DataType.OutlineLineStyle | DataType.Color | ", ""),
            enumMode = false,
        )!!.let { it.copy(body = it.body + "\n\n" + borderFactories(name)) }
    }

    val values = body
        .splitToSequence("\n", " | ")
        .map { it.removePrefix("| ") }
        .filter { !it.startsWith("\"-moz-") }
        .filter { !it.startsWith("\"-ms-") }
        .filter { !it.startsWith("\"-webkit-") }
        .joinToString(" | ")

    tryToAlias(name, values)?.let {
        return when (name) {
            in LAYOUT_CLASSES -> it.copy(body = it.body + "\n\n" + layoutFactories(name))
            else -> it
        }
    }

    return ConversionResult(name, "// $values\nsealed external interface $declaration").let {
        when (name) {
            ANIMATION -> it.copy(body = it.body + "\n\n" + animationFactories())
            else -> it
        }
    }
}

private val INT_TYPES = setOf(
    "Order",
    "Orphans",
    "Widows",

    GRID_LINE,
    "ColumnCount",
    "LineClamp",
    "MathDepth",
    "MaxLines",
    "ZIndex",

    "FontWeight",
    "HyphenateLimitChars",

    "GlyphOrientationVertical",
    "StrokeMiterlimit",
)

private val DOUBLE_TYPES = setOf(
    "AnimationIterationCount",
    "AspectRatio",
    "FlexGrow",
    "FlexShrink",

    "Opacity",
    "Scale",
    "Zoom",
)

private fun convertNumberType(
    name: String,
    source: String,
): ConversionResult {
    val comment = when (name) {
        in INT_TYPES -> INTEGER
        in DOUBLE_TYPES -> NUMBER
        else -> TODO("Support number type for `$name`")
    }

    val bodySource = source
        .replace(" | (number & {}) | (string & {})", "")
        .replace(" | (string & {}) | (number & {})", "")
        .replace(" | (number & {})", "")

    val body = "// $comment\n" + convertUnion(name, bodySource).body

    return ConversionResult(
        name = name,
        body = body,
    )
}

private val LINK_REGEX = Regex("( * @see )(.+)")

private val BOLD_1_REGEX = Regex("""(\|\s+)\*\*""")
private val BOLD_2_REGEX = Regex("""\*\*(\s+\|)""")
private val BOLD_3_REGEX = Regex("""\*\*( _\()""")

private val PRE_1_REGEX = Regex("""([\d.]+) _-x-_""")
private val PRE_2_REGEX = Regex("""([\d.]+)\*\* _-x-_""")

private fun convertInterface(
    name: String,
    source: String,
): ConversionResult {
    val declaration = source
        .removePrefix("interface ")
        .substringBefore("\n")
        .substringBefore(" {")

    val extends = source
        .substringBefore("{")
        .substringAfter(" extends ", "")

    if (extends.isNotEmpty()) {
        val annotations = when (name) {
            "Properties" -> "@$CSS_DSL\n"
            else -> ""
        }

        var parents = extends.replace("\n", "")
            .splitToSequence(",")
            .map { it.trim() }
            .filter { "Vendor" !in it && "Obsolete" !in it && "Svg" !in it }

        if (name == "Properties")
            parents += CustomProperties

        if (name == "PseudosRuleBuilder")
            parents += listOf(NON_STANDARD_PSEUDOS_RULE_BUILDER, EXPERIMENTAL_PSEUDOS_RULE_BUILDER)

        val parentTypes = parents.joinToString(", ")

        return ConversionResult(name, "$annotations external interface $declaration: $parentTypes")
    }

    val body = source.substringAfter("{\n")
        .substringBefore("\n}")
        .trimIndent()
        .replace("\n * | ", "\n *    | ")
        .replace(" ", " ")
        .replace(LINK_REGEX, """$1<a href="$2">MDN</a>""")
        .replace(BOLD_1_REGEX, "$1  ")
        .replace(BOLD_2_REGEX, "  $1")
        .replace(BOLD_3_REGEX, "  $1")
        .replace(PRE_1_REGEX, "   $1′  ")
        .replace(PRE_2_REGEX, "    $1′   ")
        .splitToSequence("\n")
        .map { line ->
            if ("?: " in line) {
                var (pname, ptype) = line.split("?: ")
                ptype = ptype
                    .replace(" | undefined;", ";")
                    .replace("Property.Color;", COLOR_PROPERTY)
                    .removePrefix("Property.")
                    .removeSuffix(";")

                OVERFLOW_ALIAS_MAP[ptype]?.let {
                    ptype = it
                }

                if (ptype == "string") ptype = "String"

                sequenceOf(pname)
                    .plus(getAdditionalPropertyNames(pname))
                    .joinToString("\n") {
                        "var $it: $ptype?"
                    }
            } else line
        }
        .joinToString("\n")
        .replaceIndent("    ")

    return ConversionResult(name, "external interface $declaration{\n$body\n}")
}

private fun getAdditionalPropertyNames(
    name: String,
): Sequence<String> =
    when (name) {
        "appearance",
            -> sequenceOf(
            "Webkit${name.replaceFirstChar(Char::uppercase)}",
            "Moz${name.replaceFirstChar(Char::uppercase)}",
        )

        "backdropFilter",
            -> sequenceOf(
            "Webkit${name.replaceFirstChar(Char::uppercase)}",
        )

        else -> emptySequence()
    }
