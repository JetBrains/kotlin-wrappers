package karakum.popper

internal fun convertParameter(
    source: String,
): String {
    if ("\n" in source)
        return source.substringBeforeLast("\n") + "\n" +
                convertParameter(source.substringAfterLast("\n"))

    val name = source
        .substringBefore("?: ")
        .substringBefore(": ")
        .removePrefix("readonly ")

    var type = kotlinType(source.substringAfter(": "), name)
    if ("?: " in source && !type.endsWith("?")) {
        if (type.startsWith("(")) {
            type = "($type)?"
        } else {
            type += "?"
        }
    }

    if (name == "phase" && type == "ModifierPhases") {
        type += "?"
    }

    return "val $name: $type"
}
