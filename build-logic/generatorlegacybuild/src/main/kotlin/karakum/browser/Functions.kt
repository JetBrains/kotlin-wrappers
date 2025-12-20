package karakum.browser

import karakum.common.withSuspendExtensions

private val TIMERS = setOf(
    "setTimeout",
    "clearTimeout",
    "setInterval",
    "clearInterval",
)

private val RAF = setOf(
    "requestAnimationFrame",
    "cancelAnimationFrame",
)

private val IDLE = setOf(
    "requestIdleCallback",
    "cancelIdleCallback",
)

private val HANDLERS = TIMERS + RAF + IDLE

internal fun browserFunctions(
    content: String,
): Sequence<ConversionResult> =
    convertFunctions(
        content = content.replace(
            "\ndeclare function ",
            "\nfunction ",
        ),
        getPkg = ::getBrowserPkg,
    )
        .plus(
            HANDLERS
                .map { getIdType(it) to getBrowserPkg(it) }
                .distinct()
                .map { (name, pkg) ->
                    ConversionResult(
                        name = name,
                        body = "sealed external interface $name",
                        pkg = pkg,
                    )
                }
        )

internal fun workerFunctions(
    content: String,
): Sequence<ConversionResult> =
    convertFunctions(
        content = content.replace(
            "\ndeclare function ",
            "\nfunction ",
        ),
        getPkg = ::getWorkerPkg,
    )

private fun getBrowserPkg(
    name: String,
): String? =
    when (name) {
        "structuredClone",
            -> "web.serialization"

        "atob",
        "btoa",
            -> "web.encoding"

        "fetch",
            -> "web.http"

        "createImageBitmap",
            -> "web.images"

        "matchMedia",
            -> "web.cssom"

        "getComputedStyle",
            -> "web.dom"

        "reportError",
            -> "web.errors"

        in TIMERS,
            -> "web.timers"

        in RAF,
            -> "web.animations"

        in IDLE,
            -> "web.scheduling"

        "queueMicrotask",
            -> "web.scheduling"

        "alert",
        "confirm",
        "prompt",
            -> "web.prompts"

        else -> null
    }

private fun getWorkerPkg(
    name: String,
): String? =
    when (name) {
        "importScripts",
            -> "web.workers"

        else -> null
    }

internal fun convertFunctions(
    content: String,
    getPkg: (name: String) -> String?,
): Sequence<ConversionResult> =
    Regex("""\nfunction (.+);""")
        .findAll(content)
        .map { it.groupValues[1] }
        .mapNotNull { source ->
            val result = convertFunctionResult(source, getPkg)
            result?.copy(body = result.body.withComment(content, "function $source;"))
        }
        .groupBy { it.name }
        .values
        .asSequence()
        .map { items ->
            items.singleOrNull()
                ?: run {
                    val first = items.first()
                    ConversionResult(
                        name = first.name,
                        body = items.joinToString("\n\n") { it.body },
                        pkg = first.pkg,
                    )
                }
        }

private fun getIdType(
    name: String,
): String =
    when (name) {
        in RAF -> "FrameRequestId"
        in IDLE -> "IdleRequestId"
        else -> {
            require(name in TIMERS)
            name
                .removePrefix("set")
                .removePrefix("clear")
        }
    }

private fun convertFunctionResult(
    source: String,
    getPkg: (name: String) -> String?,
): ConversionResult? {
    val name = source.substringBefore("(")
        .substringBefore("<")

    val pkg = getPkg(name) ?: return null

    var bodySource = source
        .substringAfter("(")
        .let { "($it" }

    if (name in HANDLERS) {
        val idType = getIdType(name)

        bodySource = bodySource
            .replace("timeout?: number, ...arguments: any[]", "timeout: Int = definedExternally")
            .replace("id: number | undefined", "id: $idType?")
            .replace("handle: number", "id: $idType")
            .replace("): number", "): $idType")
    }

    bodySource = bodySource
        // reportError
        .replace("(e: any", "(error: JsError")
        // alert
        .replace("message?: any", "message: String")
        .replace("message?: any", "message: String")
        .replace("message?: ", "message: ")
        .replace("_default?: ", "default?: ")
        .replace("?: Imports", ": Imports = definedExternally")
        .replace("elt: Element", "element: Element")
        .replace("pseudoElt?: ", "pseudoElement?: ")

        .replace(": boolean", ": Boolean")
        .replace("?: string | null", "?: string")
        // TEMP for getComputedStyle
        .replace("pseudoElement?: string", "pseudoElement: String? = definedExternally")
        .replace("init?: RequestInit", "init: RequestInit? = definedExternally")
        .replace("options?: ImageBitmapOptions", "options: ImageBitmapOptions? = definedExternally")
        .replace("options?: StructuredSerializeOptions", "options: StructuredSerializeOptions? = definedExternally")
        .replace("options?: IdleRequestOptions", "options: IdleRequestOptions? = definedExternally")
        .replace("options?: WebAssemblyCompileOptions", "options: WebAssemblyCompileOptions? = definedExternally")
        .replace("...urls: string[]", "vararg urls: String")
        .replace("...urls: URL[]", "vararg urls: URL")
        .replace("?: string", ": String = definedExternally")
        .replace(": string", ": String")
        .replace(": number", ": Int")
        .replace("): void", ")")
        .replace(" | null", "?")
        .replace(", ", ",\n")
        .replace("(", "(\n")
        .replace(")", "\n)")

    if (name == "matchMedia")
        bodySource = bodySource.applyMediaQueryFunctionPatch()

    val finalName = when (name) {
        "fetch" -> "${name}Async"
        else -> name
    }

    val typeParameters = source.substringBefore("(")
        .removePrefix(name)
        .replace(" = any", "")
        .replace("<T>", "<T : JsAny?>")

    val jsName = if (finalName != name) {
        """@JsName("$name")"""
    } else null

    val declaration = "fun $typeParameters $finalName$bodySource"

    val suspendFunctionsCollector = BrowserSuspendExtensionsCollector.forGlobal()
    var body = if (jsName != null) {
        "$jsName\nexternal $declaration"
    } else {
        withSuspendExtensions(declaration, null, suspendFunctionsCollector)
            .map { it.replaceFirst("fun ", "external fun ") }
            .joinToString("\n\n") + suspendFunctionsCollector.getResult()
    }

    if (name in TIMERS && name.startsWith("set")) {
        val idType = name.removePrefix("set")

        body += "\n\n"

        // language=kotlin
        body += """
        fun $name(
            timeout: Duration,
            handler: TimerHandler,
        ): $idType =
            $name(
                handler = handler,
                timeout = timeout.toInt(MILLISECONDS)
            )
        """.trimIndent()
    }

    return ConversionResult(
        name = finalName,
        body = body,
        pkg = pkg
    )
}
