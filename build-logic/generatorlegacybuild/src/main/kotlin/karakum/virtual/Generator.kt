package karakum.virtual

import karakum.common.GENERATOR_COMMENT
import karakum.common.writeCode
import java.io.File

private val DEFAULT_IMPORTS = listOf(
    "kotlinx.js.JsPlainObject",

    "js.array.ReadonlyArray",
    "js.array.Tuple2",
    "js.array.Tuple4",
    "js.array.Tuple5",
    "js.collections.ReadonlyMap",
    "js.core.BigInt",
    "js.core.Void",
    "js.internal.InternalApi",
    "js.promise.Promise",
    "js.reflect.unsafeCast",

    "web.dom.Element",
    "web.window.Window",
    "web.events.EventTarget",
    "web.scroll.ScrollBehavior",
    "web.resize.ResizeObserverEntry",

    "seskar.js.JsRawValue",
    "seskar.js.JsValue",
).map { it.substringAfterLast(".") to it }

fun generateKotlinDeclarations(
    coreDefinitionsFile: File,
    sourceDir: File,
) {
    val coreTargetDir = sourceDir.resolve("tanstack/virtual/core")
        .also { it.mkdirs() }

    val reactTargetDir = sourceDir.resolve("tanstack/react/virtual")
        .also { it.mkdirs() }

    for ((name, body) in convertDefinitions(coreDefinitionsFile)) {
        val annotations = when {
            "external val " in body || "external object " in body || "external fun " in body || "external class " in body
                -> "@file:JsModule(\"${Package.VIRTUAL_CORE.moduleName}\")"

            else -> ""
        }

        coreTargetDir.resolve("${name}.kt")
            .writeCode(fileContent(Package.VIRTUAL_CORE, annotations, body))

        if (name == "VirtualizerOptions") {
            for (result in reactVirtualOptions(body)) {
                reactTargetDir.resolve("${result.name}.kt")
                    .writeCode(fileContent(Package.REACT_VIRTUAL, "", result.body))
            }
        }
    }
}

private fun fileContent(
    pkg: Package,
    annotations: String,
    body: String,
): String {
    val defaultImports = DEFAULT_IMPORTS
        .filter { it.first in body }
        .map { "import ${it.second}" }
        .joinToString("\n")

    return sequenceOf(
        "// $GENERATOR_COMMENT",
        annotations,
        pkg.pkg,
        defaultImports,
        body,
    ).filter { it.isNotEmpty() }
        .joinToString("\n\n")
}
