package karakum.popper

import karakum.common.ConversionResult

private val EXCLUDED_NAMES = setOf(
    "Obj",
    "Window",
)

internal fun convertInterface(
    declaration: String,
    source: String,
): ConversionResult? {
    val name = declaration.substringBefore("<")
    if (name in EXCLUDED_NAMES)
        return null

    if (source == "[key in Placement]?: Offsets")
        return ConversionResult(
            name = name,
            body = "typealias $name = Record<Placement, Offsets>",
        )

    var members = source
        .splitToSequence(";\n")
        .map(::convertParameter)
        .joinToString("\n")

    members = when (name) {
        "State" -> source
            .splitToSequence("\n")
            .map { line ->
                when {
                    line.startsWith("    ") -> line

                    ": {" in line -> "val " + line.replace(": {", ": ReadonlyRecord<JsString, JsAny> /* {")
                    line.startsWith("};") -> line + " */"

                    else -> {
                        val (propName, propType) = line.removeSuffix(";").split(": ")
                        val type = when (propType) {
                            "boolean" -> "Boolean"
                            "Array<Modifier<any, any>>" -> "ReadonlyArray<Modifier<*>>"
                            else -> propType.replace("any", "*")
                        }

                        "val $propName: $type"
                    }
                }
            }.joinToString("\n")
            .prependIndent("    ")

        "SideObject" -> members
            .replace(": Double", ": Double?")

        else -> members
    }

    val typeParameters = if ("<" in declaration) {
        val parameters = declaration
            .substringAfter("<")
            .substringBefore(">")
            .replace(" extends Obj", "")
            .removePrefix("Name, ")

        "<$parameters : JsAny?>"
    } else ""

    val inherited = when (name) {
        "SideObject" -> ":\nPadding"
        else -> ""
    }

    val body = "@JsPlainObject\nexternal interface $name$typeParameters$inherited {\n$members\n}"

    return ConversionResult(name, body)
}
