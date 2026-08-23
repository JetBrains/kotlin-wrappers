package karakum.browser

import karakum.browser.LinkData.Mode

internal fun formatComment(
    comment: String,
): String {
    val formatted = if ("\n" !in comment) {
        comment
            .replaceFirst("/** ", "/**\n * ")
            .removeSuffix(" */") + "\n */"
    } else comment

    return formatted.replace(Typography.nbsp.toString(), " ")
}

internal fun String.withComment(
    fullSource: String,
    source: String,
): String {
    val commentSource = fullSource.substringBefore("\n$source", "")
        .takeIf { it.endsWith(" */") }
        ?: return this

    val comment = formatComment("/**" + commentSource.substringAfterLast("\n/**"))
    return "$comment\n${this}"
}

internal fun ConversionResult.withComment(
    fullSource: String,
    source: String,
): ConversionResult? {
    val newBody = body.withComment(
        fullSource = fullSource,
        source = source,
    )

    if ("@deprecated" in newBody)
        return null

    if (body != newBody)
        return copy(body = newBody)

    // TEMP
    if ("/**" in body)
        return this

    if ("[MDN Reference]" in body)
        return this

    val linkData = getLinkData(fullSource = fullSource, typeName = name)
        ?: return this

    val bodyWithComments = linkData.toComment()
        .plus("\n")
        .plus(
            body
                .splitToSequence("\n")
                .reduce { acc, line ->
                    sequence {
                        yield(acc)

                        val memberName = line.trim()
                            .removePrefix("override ")
                            .trim()
                            .takeIf { it.startsWith("val ") || it.startsWith("var ") }
                            ?.substringAfter(" ", "")
                            ?.substringBefore(":")
                            ?.takeIf { !acc.endsWith("*/") }

                        if (memberName != null) {
                            yield(linkData.copy(sectionName = memberName).toComment())
                        }

                        yield(line)
                    }.joinToString("\n")
                },
        )

    return copy(
        body = bodyWithComments,
    )
}

private fun getLinkData(
    fullSource: String,
    typeName: String,
): LinkData? {
    if (!IDLRegistry.isPlainObjectInterface(typeName))
        return null

    if (hasMdnPage(typeName))
        return LinkData(
            baseUrl = "https://developer.mozilla.org/docs/Web/API/$typeName",
            mode = if (hasMdnSubpages(typeName)) Mode.SUB_PAGE else Mode.HASH,
        )

    return fullSource
        .split(": $typeName)")
        .dropLast(1)
        .firstNotNullOfOrNull {
            val commentSource = it
                .substringBeforeLast("\n", "")
                .takeIf { it.endsWith(" */") }
                ?.substringAfterLast("/**", "")
                ?: return@firstNotNullOfOrNull null

            val baseUrl = commentSource
                .substringAfter(" * [MDN Reference]", "")
                .substringBefore("\n", "")
                .removeSurrounding("(", ")")
                .ifEmpty { return@firstNotNullOfOrNull null }

            val parameterName = it
                .substringAfterLast("\n", "")
                .ifEmpty { return@firstNotNullOfOrNull null }
                .substringAfterLast(", ")
                .substringAfterLast("(")
                .removeSuffix("?")

            LinkData(
                baseUrl = baseUrl,
                mode = Mode.HASH,
                sectionName = parameterName,
            )
        }
}

private data class LinkData(
    private val baseUrl: String,
    private val mode: Mode,
    private val sectionName: String? = null,
) {
    enum class Mode {
        SUB_PAGE,
        HASH,

        ;
    }

    fun toComment(): String {
        val url = when {
            sectionName == null -> baseUrl
            mode == Mode.SUB_PAGE -> "$baseUrl/$sectionName"
            mode == Mode.HASH -> "$baseUrl#${sectionName.lowercase()}"
            else -> error("")
        }

        return """
        /**
         * [MDN Reference]($url)
         */
        """.trimIndent()
    }
}
