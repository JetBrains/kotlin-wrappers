package karakum.browser

import karakum.common.sealedUnionBody
import karakum.common.withDefaultLineBreaks
import java.io.File

private const val SUPPORTED_LOCALES_OPTIONS = "SupportedLocalesOptions"

private val REDUNDANT_NUMBER_FORMAT_COPY = """
interface NumberFormat {
    formatToParts(number?: number | bigint): NumberFormatPart[];
}
""".trimIndent()

internal fun intlDeclarations(
    definitionsDir: File,
): Sequence<ConversionResult> {
    val rawContent = intlContent(definitionsDir)
    val (content, unions) = extractUnions(rawContent)

    val types = convertTypes(
        content = content,
        getPkg = { "js.intl" },
    )

    val interfaces = Regex("""interface .+? \{[\s\S]+?\n}""")
        .findAll(content)
        .map { it.value }
        .filter { "Constructor {\n" !in it }
        .groupBy { it.substringBefore(" {\n") }
        .map { (declaration, sourceParts) ->
            sourceParts.singleOrNull() ?: run {
                val body = sourceParts
                    .asSequence()
                    .map {
                        it.replace(": any\n", ": any;\n")
                            .substringAfter(" {\n")
                            .substringBefore("\n}")
                            .trimIndent()
                    }
                    .joinToString("\n")
                    .splitToSequence("\n")
                    .distinct()
                    .joinToString("\n")
                    .prependIndent("    ")

                "$declaration {\n$body\n}"
            }
        }
        .mapNotNull {
            convertInterface(
                source = it,
                getStaticSource = { getStaticSource(it, content) },
                predefinedPkg = "js.intl",
            )
        }
        .filter { it.name != "SegmentIterator" }
        .filter { !it.name.endsWith("Registry") }

    return unions.asSequence()
        .plus(types)
        .distinct()
        .plus(interfaces)
        .plus(Localizable())
        .plus(
            ConversionResult(
                SUPPORTED_LOCALES_OPTIONS,
                """
                @JsPlainObject
                external interface $SUPPORTED_LOCALES_OPTIONS {
                    var localeMatcher: LocaleMatcher?
                }
                """.trimIndent(),
                "js.intl",
            )
        )
}

private fun intlContent(
    definitionsDir: File,
): String =
    definitionsDir.listFiles()!!
        .filter { it.name.endsWith(".intl.d.ts") || it.name == "lib.es5.d.ts" }
        .sortedBy { file ->
            file.name
                .removePrefix("lib.es")
                .substringBefore(".")
                .toIntOrNull()
                ?: 3000
        }
        .joinToString("\n") {
            it.readText()
                .withDefaultLineBreaks()
                .substringAfter("\ndeclare namespace Intl {\n")
                .substringBefore("\n}")
                .trimIndent()
                .replace("\n\n", "\n")
        }
        .replace(REDUNDANT_NUMBER_FORMAT_COPY, "")
        .replace(Regex("""interface .+?Registry \{}\n"""), "")
        .replace("readonly string[]", "string[]")
        .splitUnion("string | string[]")
        .splitUnion("number | bigint | StringNumericLiteral")
        .splitUnion("number | bigint")
        .splitUnion("Date | number | bigint")
        .splitUnion("Date | number")
        .splitTypealias("LocalesArgument")
        .replace("(\n        ", "(")
        .replace(",\n        ", ", ")
        .replace(",\n    )", ")")
        .splitUnion(
            "UnicodeBCP47LocaleIdentifier | Locale | readonly (UnicodeBCP47LocaleIdentifier | Locale)[] | undefined",
            "UnicodeBCP47LocaleIdentifier | Locale | UnicodeBCP47LocaleIdentifier[] | Locale[]",
        )
        .splitUnion("UnicodeBCP47LocaleIdentifier | Locale")
        .replace(Regex("""\s{4}\(.+\n"""), "\n")
        .replace("new (", "new(")
        .replace("=\n    | ", "= ")
        .replace("\n    | ", " | ")

        // static
        .replace("Pick<ListFormatOptions, \"localeMatcher\">", "ListFormatOptions")
        .replace("Pick<SegmenterOptions, \"localeMatcher\">", "SegmenterOptions")
        .replace("""{ localeMatcher?: "lookup" | "best fit"; }""", SUPPORTED_LOCALES_OPTIONS)
        .replace("""{ localeMatcher?: RelativeTimeFormatLocaleMatcher; }""", SUPPORTED_LOCALES_OPTIONS)
        // TODO: strict align
        .replace("type RelativeTimeFormatLocaleMatcher = ", "type LocaleMatcher = ")
        .replace(": RelativeTimeFormatLocaleMatcher;", ": LocaleMatcher;")
        .replace("type LocaleCollationCaseFirst = ", "type CaseFirst = ")
        .replace(": LocaleCollationCaseFirst;", ": CaseFirst;")
        .replace("type LocaleHourCycleKey = ", "type HourCycle = ")
        .replace(": LocaleHourCycleKey;", ": HourCycle;")

        .replace("NumberFormatPartTypes", "NumberFormatPartType")
        .replace(""""basic" | "best fit" | "best fit"""", """"best fit" | "basic"""")
        .replace(""": "best fit" | "lookup" | undefined;""", """: "lookup" | "best fit" | undefined;""")
        .replace(""" = "h12" | "h23" | "h11" | "h24";""", """ = "h11" | "h12" | "h23" | "h24";""")

private val FORMAT_PROPERTIES = setOf(
    "weekday",
    "era",
    "year",
    "month",
    "day",
    "hour",
    "minute",
    "second",
    "timeZoneName",
)

private val PROPERTIES = setOf(
    "source",
    "usage",

    "caseFirst",
    "collation",
    "sensitivity",

    "formatMatcher",
    "dateStyle",
    "timeStyle",
    "hourCycle",
    "dayPeriod",

    "compactDisplay",
    "notation",
    "unitDisplay",

    "granularity",
    "localeMatcher",

    "currencySign",
    "roundingPriority",
    "roundingMode",
    "trailingZeroDisplay",
)

private fun extractUnions(
    content: String,
): Pair<String, List<ConversionResult>> {
    val unionRawMap = Regex("""(\w+)\??: (".+?);""")
        .findAll(content)
        .distinct()
        .associate { it.groupValues[1] to it.groupValues[2].removeSuffix(" | undefined") }

    val unionMap = (FORMAT_PROPERTIES + PROPERTIES).associate { propertyName ->
        val values = unionRawMap.getValue(propertyName)
            .split(" | ")
            .map { it.removeSurrounding("\"") }

        var name = propertyName.replaceFirstChar(Char::uppercase)
        name = when (propertyName) {
            "source" -> "PartSource"
            "usage" -> "CollatorUsage"
            in FORMAT_PROPERTIES -> "${name}Format"
            else -> name
        }

        val union = ConversionResult(
            name = name,
            body = sealedUnionBody(name, values),
            pkg = "js.intl",
        )

        propertyName to union
    }

    val newContent = unionMap.entries.fold(content) { acc, (propertyName, result) ->
        val rawValue = unionRawMap.getValue(propertyName)
        acc.replace("$propertyName: $rawValue;", "$propertyName: ${result.name};")
            .replace("$propertyName?: $rawValue;", "$propertyName?: ${result.name};")
            .replace("$propertyName?: $rawValue | undefined;", "$propertyName?: ${result.name} | undefined;")
    }

    return newContent to unionMap.values.toList()
}
