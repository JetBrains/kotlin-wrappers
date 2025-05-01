package karakum.actions

private const val JSO = "ReadonlyRecord<String, Any>"

private val STANDARD_TYPE_MAP = mapOf(
    "any" to "Any?",
    "boolean" to "Boolean",
    "string" to "String",
    "number" to "Number",
    "bigint" to "BigInt",
    "undefined" to "Void",

    "Error" to "JsError",

    "Buffer" to "Buffer<*>",

    "string[]" to "ReadonlyArray<String>",
    "Record<string, string>" to "Record<String, String>",

    "typeof fetch" to "Any /* typeof fetch */",
    "typeof http | typeof https" to "Any /* typeof http | typeof https */",

    "NodeJS.Platform" to "node.process.Platform",
    "NodeJS.ReadableStream" to "node.ReadableStream",

    "Promise<void>" to "Promise<Void>",

    "AsyncGenerator<string, void>" to "AsyncGenerator<String, *, *>",
    "ProxyAgent" to "Any /* ProxyAgent */",

    "Map<number_string>" to "ReadonlyMap<Int, String>",

    "string | Buffer" to "Any /* String | Buffer */",
    "string | node.ReadableStream" to "Any /* string | node.ReadableStream */",

    "ReturnType<typeof setTimeout>" to "web.timers.Timeout",

    "Timestamp" to "$JSO /* Timestamp */",
    "OctokitPlugin" to "Function<Any> /* OctokitPlugin */",
    "OctokitOptions" to "$JSO /* OctokitOptions */",
    "BlobUploadCommonResponse" to "$JSO /* BlobUploadCommonResponse */",
    "InstanceType<typeof GitHub>" to "dynamic /* InstanceType<typeof GitHub> */",
    "[RetryOptions, RequestRequestOptions | undefined]" to "Tuple2<RetryOptions, $JSO? /* RequestRequestOptions? */>",
)

internal fun kotlinType(
    type: String,
): String {
    STANDARD_TYPE_MAP[type]?.also {
        return it
    }

    if (type.endsWith(" | null"))
        return kotlinType(type.removeSuffix(" | null")) + "?"

    if (type.endsWith(" | undefined"))
        return kotlinType(type.removeSuffix(" | undefined")) + "?"

    if (type.endsWith(" & FindOptions"))
        return type.removeSuffix(" & FindOptions") + " /* & FindOptions */"

    if (type.startsWith("Promise<") && type.endsWith(">")) {
        val resultType = kotlinType(type.removeSurrounding("Promise<", ">"))
        return "Promise<$resultType>"
    }

    if ("." in type)
        return "node.$type"

    if (type.endsWith("[]"))
        return "ReadonlyArray<${kotlinType(type.removeSuffix("[]"))}>"

    return type
        .replace(": string)", ": String)")
        .replace(": Error)", ": JsError)")
        .replace(": Buffer)", ": Buffer<*>)")
        .replace(") => void", ") -> Unit")
        .replace(") => number", ") -> Number")
        .replace(") => boolean", ") -> Boolean")
        .replace(") => ", ") -> ")
        .replace(" | undefined", "?")
        .replace(" | null", "?")

}
