package karakum.browser

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

    if (!IDLRegistry.isPlainObjectInterface(name))
        return this

    if ("/**" in body)
        return this

    data class LinkData(
        private val baseUrl: String,
        private val hash: String,
    ) {
        fun toComment(): String = """
        /**
         * [MDN Reference]($baseUrl#$hash)
         */
        """.trimIndent()
    }

    val linkData = fullSource
        .split(": $name)")
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
                hash = parameterName.lowercase(),
            )
        }
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
                            yield(linkData.copy(hash = memberName).toComment())
                        }

                        yield(line)
                    }.joinToString("\n")
                },
        )

    return copy(
        body = bodyWithComments,
    )
}
