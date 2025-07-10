package karakum.common

internal fun withSuspendExtensions(
    source: String,
    comment: String?,
    collector: ExtensionsCollector,
): Sequence<String> {
    val match = ASYNC_FUNCTION_REGEX.find(source) ?: return sequenceOf(source)

    val functionSignature = match.groupValues[3]
    val originalFunctionName = match.groupValues[4]
    val parameters = match.groupValues[5]
    val returnType = match.groupValues[6]
    val optionality = match.groupValues[7]
    val definedExternally = match.groupValues[8]

    val suspendReturnType = when (returnType) {
        "*" -> ": Any?"
        "Void" -> ""
        else -> ": $returnType$optionality"
    }

    val suspendName = originalFunctionName.removeSuffix("Async")
    val asyncName = suspendName + "Async"
    val jsName = if (asyncName != originalFunctionName) """@JsName("$originalFunctionName")""" else ""

    collector.add(
        functionName = suspendName,
        functionSignature = functionSignature,
        parameters = parameters,
        returnType = suspendReturnType,
        optionalPromise = optionality.isNotEmpty(),
        docs = comment
    )

    return sequenceOf(
        "$jsName\n$functionSignature$asyncName$parameters: Promise<$returnType>$optionality$definedExternally".trim(),
    )
}
