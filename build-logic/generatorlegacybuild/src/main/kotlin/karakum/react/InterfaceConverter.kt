package karakum.react

private val TYPE_CONTAINER_IMPORTS = """
import web.components.HTMLSlotElement
import web.components.HTMLTemplateElement
import web.html.*
import web.svg.*
import react.IntrinsicType
""".trimIndent()

private const val ORIGINAL_DANGEROUSLY_SET_INNER_HTML_BODY = """{
        // Should be InnerHTML['innerHTML'].
        // But unfortunately we're mixing renderer-specific type declarations.
        __html: string | TrustedHTML;
    }"""

internal fun convertInterface(
    name: String,
    source: String,
): Sequence<ConversionResult> {
    val typeConverter = SimpleTypeConverter(name)
    val result = when {
        name == "AllHTMLAttributes" -> null
        name == "ParamHTMLAttributes" -> null

        name.endsWith("Event") && name != "FormEvent" -> convertEventInterface(name, source, typeConverter)
        name.endsWith("Attributes") -> convertAttributesInterface(name, source, typeConverter)

        name == "ReactHTML" -> convertIntrinsicTypes(name, source, ::convertHtmlType)
        name == "ReactSVG" -> convertIntrinsicTypes(name, source, ::convertSvgType)

        name == "DangerouslySetInnerHTML" -> convertInterface(name, source, typeConverter)

        else -> null
    }

    result ?: return emptySequence()

    return sequenceOf(result) + typeConverter.unions
}

private fun convertInterface(
    name: String,
    source: String,
    typeConverter: TypeConverter,
): ConversionResult {
    val members = convertMembers(source, !name.endsWith("HTML"), typeConverter)
    val modifiers = when (name) {
        "DangerouslySetInnerHTML" -> "sealed external"
        else -> "external"
    }

    val body = "$modifiers interface $name {\n$members\n}"
    return ConversionResult(name, body)
}

private fun convertAttributesInterface(
    name: String,
    source: String,
    typeConverter: TypeConverter,
): ConversionResult? {
    when (name) {
        "Attributes",
        "RefAttributes",
        "ClassAttributes",
            -> return null
    }

    var declaration = source.substringBefore(" {")
        .replace("<T> extends HTMLAttributes<T>", "<T : Element> : HTMLAttributes<T>")
        .replace("<T> extends MediaHTMLAttributes<T>", "<T : Element> : MediaHTMLAttributes<T>")
        .replace(" extends ", " : ")

    when (name) {
        "DOMAttributes",
        "HTMLAttributes",
        "SVGAttributes",
            -> declaration = declaration.replaceFirst("<T>", "<T: Element>")
    }

    when (name) {
        "DOMAttributes",
            -> declaration += ":\n" +
                "react.PropsWithRef<T>,\n" +
                "react.PropsWithChildren,\n" +
                "react.PropsWithClassName"

        "HTMLAttributes",
        "SVGAttributes",
            -> declaration = declaration
            .replaceFirst("> : ", ">:\n")
            .replaceFirst(",", ",\n") +
                ",\nreact.PropsWithStyle"
    }

    val content = when (name) {
        "HTMLAttributes" -> source
            .replaceFirst("\n    color?: string | undefined;", "")
            .replaceFirst(
                "\n    popover?: \"\" | \"auto\" | \"manual\" | undefined;",
                "\n    popover?: String /* \"\" | \"auto\" | \"manual\" */;"
            )
            .replaceFirst(
                "\n    popoverTargetAction?: \"toggle\" | \"show\" | \"hide\" | undefined;",
                "\n    popoverTargetAction?: String /* \"toggle\" | \"show\" | \"hide\" */;"
            )

        "DOMAttributes" -> source
            .replaceFirst("children?: ReactNode | undefined;\n", "")
            .replaceFirst(ORIGINAL_DANGEROUSLY_SET_INNER_HTML_BODY, "DangerouslySetInnerHTML")

        "FormHTMLAttributes" -> source
            .replaceFirst("    method?: string | undefined;", "    method?: FormMethod | undefined;")

        "InputHTMLAttributes" -> source
            .replaceFirst("min?: number | string | undefined;\n", "min?: number | Date | undefined;\n")
            .replaceFirst("max?: number | string | undefined;\n", "max?: number | Date | undefined;\n")
            .replaceFirst(
                """capture?: boolean | "user" | "environment" | undefined;""",
                """capture?: "false" | "true" | "user" | "environment" | undefined;"""
            )

        else -> source
    }

    var members = convertMembers(content, false, typeConverter)

    when (name) {
        "HTMLAttributes",
        "SVGAttributes",
            -> members = members.replaceFirst("var style: ", "override var style: ")
    }

    when (name) {
        "MetaHTMLAttributes",
            -> members = members.replaceFirst("var content: ", "override var content: ")

        "VideoHTMLAttributes",
            -> members = members.replaceFirst("var playsInline: ", "override var playsInline: ")
    }

    val body = if (name == "AriaAttributes") {
        "external interface $declaration {\n" +
                members +
                "\n}\n"
    } else {
        var result = "import web.dom.Element\n" +
                "import web.form.FormMethod\n" +
                "import web.html.*\n" +
                "import web.http.CrossOrigin\n" +
                "import web.http.FetchPriority\n" +
                "import react.dom.events.*\n\n" +
                "external interface $declaration {\n" +
                members +
                "\n}\n"

        if (name == "DOMAttributes")
            result = result.replaceFirst("var onChange:", "    // var onChange:") +
                    // language=kotlin
                    """
                    inline var <T : Element> DOMAttributes<T>.onChange: ChangeEventHandler<T, *>?
                        get() = asDynamic().onChange
                        set(value) {
                            asDynamic().onChange = value
                        }
                    """.trimEnd()

        result
    }

    return ConversionResult(name, body)
}

private fun convertIntrinsicTypes(
    name: String,
    source: String,
    convert: (String) -> String,
): ConversionResult {
    val content = source.substringAfter("{\n")
        .substringBefore("\n}")
        .trimIndent()
        .splitToSequence("\n")
        .filter { it.isNotEmpty() }
        .map { it.substringBefore(";") }
        .map(convert)
        .joinToString(
            separator = "\n\n",
            prefix = "object $name {\n",
            postfix = "\n}\n"
        )

    val body = sequenceOf(TYPE_CONTAINER_IMPORTS)
        .plus(content)
        .joinToString("\n\n")

    return ConversionResult(name, body)
}

private fun convertHtmlType(
    source: String,
): String {
    val name = source.substringBefore(": ")
        .removeSurrounding("\"")

    val propsType = source.substringAfter(": React.DetailedHTMLProps<")
        .substringBefore(",")
        .replaceFirst("<", "<")
        .removePrefix("React.")
    val type = "IntrinsicType<$propsType>"

    val id = when (name) {
        "object", "var" -> "`$name`"
        else -> name
    }

    return """
        inline val $id: $type
            get() = IntrinsicType("$name")
    """.trimIndent()
}

private fun convertSvgType(
    source: String,
): String {
    val name = source.substringBefore(": ")

    val elementType = source
        .substringAfter(": React.SVGLineElementAttributes<")
        .substringAfter(": React.SVGTextElementAttributes<")
        .substringAfter(": React.SVGProps<")
        .substringBefore(">")

    val type = "IntrinsicType<SVGAttributes<$elementType>>"

    return """
        inline val $name: $type
            get() = IntrinsicType("$name")
    """.trimIndent()
}
