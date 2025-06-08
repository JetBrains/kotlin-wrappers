package karakum.browser

import karakum.common.withDefaultLineBreaks
import java.io.File

private const val DATE = "Date"

internal fun dateDeclarations(
    definitionsDir: File,
): Sequence<ConversionResult> {
    val members = dateMembers(dateRawContent(definitionsDir, DATE))
    val staticMembers = dateMembers(dateRawContent(definitionsDir, "DateConstructor"), static = true)
    val constructors = staticMembers.filter { "constructor(" in it }

    val body = """
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Date)
     */
    external class $DATE():
        $LOCALIZABLE<DateTimeFormatOptions>,
        $SERIALIZABLE {
        ${constructors.joinToString("\n")}
        ${members.joinToString("\n")}

        companion object {
            ${(staticMembers - constructors).joinToString("\n")}
        }
    }
    """.trimIndent()

    return sequenceOf(
        ConversionResult(
            name = DATE,
            body = body,
            pkg = "js.date",
        )
    )
}

private fun dateMembers(
    content: String,
    static: Boolean = false,
): List<String> =
    content.splitToSequence(";\n")
        .map { it.trim() }
        .filter { it.isNotEmpty() }
        .mapNotNull { dateMember(it, static = static) }
        .toList()

private fun dateMember(
    content: String,
    static: Boolean,
): String? {
    if ("\n" in content) {
        val member = dateMember(content.substringAfterLast("\n"), static = static)
            ?: return null
        val comment = dateComment(
            comment = content.substringBeforeLast("\n"),
            functionName = member.substringBefore("(").removePrefix("fun "),
        )

        return comment + "\n" + member
    }

    if (static) {
        return dateMember(content.replace("): number", "): Int53"), static = false)
    }

    if (content.startsWith("toString()"))
        return null

    if (content.startsWith("toLocaleString("))
        return null

    if (content.startsWith("new (")) {
        return content
            .replace("new (", "constructor(")
            .replace("): $DATE", ")")
            .replace("(value: number)", "(value: Int53)")
            .replace("?: number", ": Int = definedExternally")
            .replace(": number", ": Int")
            .replace(": string", ": String")
            .replace(", ", ", \n")
    }

    return "fun " + content
        .replace("valueOf(): number", "valueOf(): Int53")
        .replace("getTime(): number", "getTime(): Int53")
        .replace("setTime(time: number): number", "setTime(time: Int53): Int53")
        .replace("?: UnicodeBCP47LocaleIdentifier", ": UnicodeBCP47LocaleIdentifier = definedExternally")
        .replace("?: Intl.DateTimeFormatOptions", ": DateTimeFormatOptions = definedExternally")
        .replace(": Temporal.Instant", ": Instant")
        .replace("?: any", ": JsAny? = definedExternally")
        .replace("?: number", ": Int = definedExternally")
        .replace(": number", ": Int")
        .replace(": string", ": String")
        .replace(", ", ", \n")
}

private fun dateComment(
    comment: String,
    functionName: String,
): String {
    val newComment = if (comment.startsWith("/** ")) {
        comment
            .replaceFirst("/** ", "/**\n * ")
            .replaceFirst(" */", "\n */")
    } else {
        comment
    }

    val id = if (functionName == "constructor") DATE else functionName
    val link = "[MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Date/$id)"
    return newComment.replaceFirst("\n */", "\n *\n * $link\n */")
}

private val PARAMETER_ALIASES = sequenceOf(
    "min" to "minutes",
    "sec" to "seconds",
    "ms" to "milliseconds",
)

private fun dateRawContent(
    definitionsDir: File,
    interfaceName: String,
): String {
    return definitionsDir.listFiles()!!
        .filter { it.name.endsWith(".date.d.ts") || it.name.endsWith(".core.d.ts") || it.name == "lib.es5.d.ts" }
        .filter { it.name != "lib.es2017.date.d.ts" }
        .sortedBy { file ->
            file.name
                .removePrefix("lib.es")
                .substringBefore(".")
                .toIntOrNull()
                ?: 3000
        }
        .map { it.readText() }
        .plus(DENO_UNSTABLE_CONTENT)
        .map {
            it.withDefaultLineBreaks()
                .substringAfter("\ninterface $interfaceName {\n", "")
                .substringBefore("\n}")
                .trimIndent()
                .replace("\n\n", "\n")
        }
        .filter { it.isNotEmpty() }
        .joinToString("\n")
        .replace("new (): Date;\n", "")
        .replace("\nnew (value: number | string | Date): Date;", "")
        .replace("new (value: number | string): Date;\n", "new (value: number | string | Date): Date;\n")
        .replace("\n(): string;\n", "\n")
        .replace("readonly prototype: Date;\n", "")
        .splitUnion("number | string | Date")
        .splitUnion(
            "Intl.LocalesArgument",
            "UnicodeBCP47LocaleIdentifier | Locale | ReadonlyArray<UnicodeBCP47LocaleIdentifier> | ReadonlyArray<Locale>",
        )
        .let { content ->
            PARAMETER_ALIASES.fold(content) { acc, (shortName, name) ->
                acc.replace("($shortName: ", "($name: ")
                    .replace("($shortName?: ", "($name?: ")
                    .replace(" $shortName: ", " $name: ")
                    .replace(" $shortName?: ", " $name?: ")
                    .replace("@param $shortName ", "@param $name ")
            }
        }
}
