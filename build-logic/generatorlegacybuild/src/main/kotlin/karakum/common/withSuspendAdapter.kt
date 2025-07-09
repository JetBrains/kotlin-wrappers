package karakum.common

private const val DELIMITER = "<!----!>"

internal fun withSuspendAdapter(
    source: String,
): Sequence<String> =
    source.replace(
        ASYNC_FUNCTION_REGEX,
        transform = { mr ->
            val funSignature = mr.groupValues[3]
            val originalName = mr.groupValues[4]
            val parameters = mr.groupValues[5]
            val payload = mr.groupValues[6]
            val optionality = mr.groupValues[7]
            val de = mr.groupValues[8]

            val ret = when (payload) {
                "*" -> ": Any?"
                "Void" -> if (de.isNotEmpty()) ": Unit" else ""
                else -> ": $payload$optionality"
            }

            val suspendName = originalName.removeSuffix("Async")
            val asyncName = suspendName + "Async"
            val jsName = if (asyncName != originalName) """@JsName("$originalName")""" else ""

            sequenceOf(
                "@JsAsync" + if (optionality.isNotEmpty()) "(optional = true)" else "",
                "suspend $funSignature$suspendName$parameters$ret$de",
                DELIMITER,
                jsName,
                "$funSignature$asyncName$parameters: Promise<$payload>$optionality$de",
            ).joinToString("\n")
        }
    ).splitToSequence(DELIMITER)
        .map { it.trim() }
