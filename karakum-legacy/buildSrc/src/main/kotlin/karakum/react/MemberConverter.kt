package karakum.react

import karakum.common.removeQuoteSurrounding

internal fun convertMembers(
    source: String,
    final: Boolean,
    typeConverter: TypeConverter,
): String {
    val content = source
        .substringAfter("{\n", "")
        .trimIndent()
        .replace("\n\n", "\n")

    if (content.isEmpty())
        return ""

    return content.removeSuffix(";")
        .splitToSequence(";\n")
        // exclude className because it is inherited
        .filter { "className?:" !in it }
        .joinToString("\n") {
            convertMember(it, final, typeConverter)
        }
}

private fun convertMember(
    source: String,
    final: Boolean,
    typeConverter: TypeConverter,
): String {
    if ("; // " in source) {
        if ("\n// " in source) {
            return source.splitToSequence("\n// ")
                .mapIndexed { index, item -> if (index == 0) item else "// " + item }
                .map { convertMember(it, final, typeConverter) }
                .joinToString("\n")
        } else if (!source.startsWith("// ") && source.count { it == '\n' } == 1) {
            return source.splitToSequence("\n")
                .map { convertMember(it, final, typeConverter) }
                .joinToString("\n")
        }
    }

    if ("\n" in source) {
        if (!source.startsWith("/*") && !source.startsWith("//"))
            return convertMember(source.replace("\n", ""), final, typeConverter)

        val comment = source.substringBeforeLast("\n")
        return comment + "\n" + convertMember(source.substringAfterLast("\n"), final, typeConverter)
    }

    return if ("(" in source) {
        convertMethod(source, typeConverter)
    } else {
        convertProperty(source, final, typeConverter)
    }
}

private val RESERVED_NAMES = setOf(
    "is", "as", "typeof", "in",
)

private fun convertProperty(
    source: String,
    final: Boolean,
    typeConverter: TypeConverter,
): String {
    val name = source.substringBefore(": ")
        .removeSuffix("?")
        .removeQuoteSurrounding()

    val id = when {
        name in RESERVED_NAMES -> "`$name`"
        name.startsWith("aria-") -> name.ariaPropertyName()
        else -> name
    }

    val optional = source.startsWith("$name?: ")
            || source.startsWith("\"$name\"?: ")

    val sourceType = source.substringAfter(": ")
        .replace("EventTarget & T", "T")
    val type = typeConverter.convert(sourceType, name)
        .let {
            when {
                !optional -> it
                " // " in it -> it.replace(" // ", "? // ")
                " /* " in it -> it.replace(" /* ", "? /* ")
                else -> "$it?"
            }
        }

    val keyword = if (final) "val" else "var"
    val declaration = "$keyword $id: $type"
    if (!name.startsWith("aria-"))
        return declaration

    return "@JsName(\"$name\")\n$declaration"
}

private fun convertMethod(
    source: String,
    typeConverter: TypeConverter,
): String {
    val name = source.substringBefore("(")

    val params = source.substringAfter("(")
        .substringBefore("): ")
    val parameters = if (params.isNotEmpty()) {
        params.splitToSequence(", ")
            .joinToString(", ") {
                val (pname, ptype) = it.split(": ")
                "$pname: ${kotlinType(ptype, pname)}"
            }
    } else ""

    val returnType = typeConverter.convert(source.substringAfter("): "), name)
    val returns = if (returnType != UNIT) ": $returnType" else ""

    return "fun $name($parameters)$returns"
}
