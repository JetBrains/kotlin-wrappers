package karakum.cesium

private val STYLE_REGEX = Regex("""\n<style .+?\n</style>""", RegexOption.DOT_MATCHES_ALL)
private val DIV_REGEX = Regex("""\n<div .+?\n</div>""", RegexOption.DOT_MATCHES_ALL)
private val TABLE_REGEX = Regex("""\n\s*<table>.+?</table>""", RegexOption.DOT_MATCHES_ALL)
private val SPAN_1_REGEX = Regex("""\n<span .+?</span>""", RegexOption.DOT_MATCHES_ALL)
private val SPAN_2_REGEX = Regex("""<span .+?</span>\n""", RegexOption.DOT_MATCHES_ALL)
private val P_REGEX = Regex("""<p> ?(.+?)</p>""", RegexOption.DOT_MATCHES_ALL)
private val IMG_REGEX = Regex("""<img .+? />\n""")

private val PRE_CODE_REGEX = Regex("""<pre><code>(.+?)</code></pre>""", RegexOption.DOT_MATCHES_ALL)
private val PRE_REGEX = Regex("""<pre>(.+?)</pre>""", RegexOption.DOT_MATCHES_ALL)
private val CODE_REGEX = Regex("""<code>(.+?)</code>""")
private val CODE_MULTILINE_REGEX = Regex("""<code>(.+?)</code>""", RegexOption.DOT_MATCHES_ALL)

private val UL_REGEX = Regex(""" *<ul>(.+?)</ul>""", RegexOption.DOT_MATCHES_ALL)
private val LI_REGEX = Regex("""<li>(.+?)</li>""", RegexOption.DOT_MATCHES_ALL)

private val LINK_TYPE_REGEX = Regex("""\{@link ([\w\d]+)}""")
private val LINK_MEMBER_REGEX = Regex("""\{@link ([\w\d]+)[#.]([\w\d]+)}""")
private val LINK_HTTP_NAMED_1_REGEX = Regex("""\{@link (http.+?)\|\n?(.+?)}""")
private val LINK_HTTP_NAMED_2_REGEX = Regex("""\[(.+?)]\{@link (http.+?)}""")
private val LINK_HTTP_REGEX = Regex("""\{@link (http.+?)}""")

private val KDOC_KEYWORDS = setOf("@example", "@param", "@returns", "@property")
private const val DELIMITER = "--DEL--"

private val CONSTANTS = setOf(
    "true",
    "false",

    "{}",
    "[]",

    "PI",
    "2*PI"
)

private val TYPE_REGEX = Regex("""[A-Z]\w+""")
private val CONSTANT_REGEX = Regex("""[A-Z][\w\d]+\.[A-Z\d_]+""")
private val MEMBER_REGEX = Regex("""[A-Z]\w+\.\w+""")

internal fun kdocBody(
    doc: String,
    hideParams: Boolean,
    hideOptions: Boolean,
): String {
    if (doc.isEmpty())
        return ""

    return doc.removePrefix("/**\n")
        .substringBeforeLast("\n")
        .trimMargin("*")
        .splitToSequence("\n")
        .map { it.removePrefix(" ") }
        .joinToString("\n")
        .replace(STYLE_REGEX, "")
        .replace(DIV_REGEX, "")
        .replace("  The bit values are as follows:", "")
        .replace(TABLE_REGEX, "")
        .replace(SPAN_1_REGEX, "")
        .replace(SPAN_2_REGEX, "")
        .replace("\n<p>\n</p>", "")
        .replace("<br /><br />", "")
        .replace("<br />", "")
        .replace("<br>", "")
        .replace(P_REGEX, "$1")
        .replace(IMG_REGEX, "")
        .replace(PRE_CODE_REGEX, "```$1```")
        .replace(PRE_REGEX, "```$1```")
        .replace(CODE_REGEX, ::inlineCode)
        .replace(CODE_MULTILINE_REGEX, "```$1```")
        .replace("<p>\n", "")
        .replace(UL_REGEX) { listItems(it.groupValues[1]) }
        .replace("\n\n\n", "\n\n")
        .replace(LINK_TYPE_REGEX, "[$1]")
        .replace(LINK_MEMBER_REGEX, "[$1.$2]")
        .replace(LINK_HTTP_NAMED_1_REGEX, "[$2]($1)")
        .replace(LINK_HTTP_NAMED_2_REGEX, "[$1]($2)")
        .replace(LINK_HTTP_REGEX, "[$1]")
        .trim()
        .let { formatBlocks(it, hideParams, hideOptions) }
}

internal fun kdoc(
    body: String,
    link: DocLink?,
): String {
    if (body.isEmpty())
        return ""

    var source = body

    val seeLink = link?.let { seeDoc(it) }
    if (link?.typeMode == true && "\n@param " in source) {
        checkNotNull(seeLink)
        source = source.replaceFirst("\n@param ", "\n$seeLink\n\n@constructor\n@param ")
    }

    val seeLinks = sequenceOf(seeLink)
        .filterNotNull()

    return source
        .splitToSequence("\n")
        .plus(seeLinks)
        .map { " * $it" }
        .joinToString(
            prefix = "/**\n",
            separator = "\n",
            postfix = "\n */"
        )
}

private fun seeDoc(link: DocLink): String =
    """@see <a href="${link.href}">Online Documentation</a>"""

private fun inlineCode(result: MatchResult): String {
    val code = result.groupValues[1]
        .replace(" Cesium.", " ")

    return "`$code`"
}

private fun cleanupCode(code: String): String =
    code.removePrefix("Cesium.")
        .replace("\nCesium.", "\n")
        .replace(" Cesium.", " ")
        .replace("(Cesium.", "(")

private fun listItems(source: String): String =
    LI_REGEX.findAll(source)
        .map { it.groupValues[1] }
        .map { it.trim() }
        .map { "- $it" }
        .map { it.multiline() }
        .joinToString("\n")

private fun formatBlocks(
    source: String,
    hideParams: Boolean,
    hideOptions: Boolean,
): String =
    KDOC_KEYWORDS
        .fold(source) { acc, keyword ->
            acc.replace("$keyword ", "$DELIMITER$keyword ")
                .replace("$keyword\n", "$DELIMITER$keyword\n")
        }
        .splitToSequence(DELIMITER)
        .map { it.trim() }
        .filter { it.isNotEmpty() }
        .mapNotNull { formatBlock(it, hideParams, hideOptions) }
        .joinToString("\n")

private fun formatBlock(
    source: String,
    hideParams: Boolean,
    hideOptions: Boolean,
): String? =
    when {
        source.startsWith("@example") -> source.removePrefix("@example\n").let { "```\n${cleanupCode(it)}\n```" }
        source.startsWith("@param ") -> when {
            hideParams -> null
            hideOptions && source.startsWith("@param options.") -> null
            hideOptions && source.startsWith("@param [options.") -> null
            source.endsWith("Object with the following properties:") -> null
            source.endsWith("An object with the following properties:") -> null
            source.endsWith("An object with the following properties.") -> null
            source.endsWith("Object describing initialization options") -> null
            else -> formatParam(source, "@param ")
        }

        source.startsWith("@property ") -> formatParam(source, "@property ")
        source.startsWith("@returns") -> source.replace("@returns", "@return").multiline()
        else -> source
    }

private fun formatParam(
    source: String,
    prefix: String,
): String {
    val body = source.removePrefix(prefix)

    val name: String
    val default: String?
    val description: String

    if (body.startsWith("[")) {
        val data = body.removePrefix("[")
            .substringBefore("] ")
            .split(" = ")
        name = data.first()
        default = data.getOrNull(1)
        description = body.substringAfter("] ")
    } else {
        name = body.substringBefore(" ")
        default = null
        description = body.substringAfter(" ")
    }

    val defaultLines = default?.let { arrayOf("Default value - ${formatDefaultValue(it)}") }
        ?: emptyArray()

    val desc = description.removePrefix("- ")
        .multiline(*defaultLines)

    return "$prefix[$name] $desc"
}

private fun formatDefaultValue(source: String): String {
    if (source.startsWith("Cesium."))
        return "`${source.removePrefix("Cesium.")}`"

    val literal = when {
        source in CONSTANTS -> true
        source.toDoubleOrNull() != null -> true
        source.startsWith("'") && source.endsWith("'") -> true
        source.startsWith("{") && source.endsWith("}") -> true

        source == "document" -> true
        source.startsWith("document.") -> true

        source.startsWith("options.") -> true
        source.startsWith("!options.") -> true
        source.startsWith("entities.") -> true

        else -> false
    }

    if (literal)
        return "`$source`"

    val call = when {
        source.startsWith("new ") -> true
        source.startsWith("Cartesian2(") -> true
        source.startsWith("Cartesian3(") -> true
        else -> source == "createWorldImagery()" || source == "createGuid()"
    }

    if (call) {
        val label = source.removePrefix("new ")
        val type = label.substringBefore("(")
        return "[$label][$type]"
    }

    val link = when {
        TYPE_REGEX.matches(source) -> true
        CONSTANT_REGEX.matches(source) -> true
        MEMBER_REGEX.matches(source) -> true

        source == "relativeEpsilon" -> true
        source.startsWith("scene.") -> true
        source.startsWith("viewer.") -> true
        source.startsWith("imageryProvider.") -> true

        else -> false
    }

    if (link)
        return "[$source]"

    if (source == "packedArray.length")
        return "[packedArray.size]"

    return "`$source`"
}

private fun String.multiline(
    vararg additionalLines: String,
): String =
    splitToSequence("\n")
        .plus(additionalLines)
        .map { it.trim() }
        .mapIndexed { index, line -> if (index == 0) line else "  $line" }
        .joinToString("\n")
