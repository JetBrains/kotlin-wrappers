package karakum.common

import karakum.browser.AsyncMember
import karakum.browser.AsyncRegistry

private val ASYNC_FUNCTION_REGEX = Regex(
    """^((operator)?\s*)(fun.*[ >])([a-zA-Z\d]+)(\(.*\)): Promise<(.+)>(\?)?( = definedExternally)?$""",
    RegexOption.DOT_MATCHES_ALL
)

private const val DELIMITER = "<!----!>"

internal fun withSuspendAdapter(
    name: String?,
    source: String,
    comment: String? = null,
): Sequence<String> =
    source.replace(
        ASYNC_FUNCTION_REGEX,
        transform = { mr ->
            val p3 = mr.groupValues[3]
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

            // If there is no `name` provided, a suspend member will be generated right away.
            // Also, externally defined parameters are not supported yet.
            val suspendFun = if (name == null || "= definedExternally" in parameters) {
                sequenceOf(
                    "@JsAsync" + if (optionality.isNotEmpty()) "(optional = true)" else "",
                    "suspend $p3$suspendName$parameters$ret$de"
                )
            } else {
                val member = AsyncMember(
                    name = suspendName,
                    funSignature = p3,
                    parameters = parameters,
                    returnType = ret,
                    optional = optionality.isNotEmpty(),
                    docs = comment
                )
                AsyncRegistry.registerAsyncMember(name, member)

                emptySequence()
            }

            (suspendFun + sequenceOf(
                DELIMITER,
                jsName,
                "$p3$asyncName$parameters: Promise<$payload>$optionality$de",
            )).joinToString("\n")
        }
    ).splitToSequence(DELIMITER)
        .map { it.trim() }
