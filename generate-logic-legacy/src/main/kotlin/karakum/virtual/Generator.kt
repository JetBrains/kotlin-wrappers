package karakum.virtual

import karakum.common.GENERATOR_COMMENT
import karakum.common.writeCode
import java.io.File

private val DEFAULT_IMPORTS = listOf(
    "js.promise.Promise",

    "js.array.ReadonlyArray",
    "js.objects.JsPlainObject",
    "js.collections.ReadonlyMap",
    "js.array.JsTuple2",
    "js.array.JsTuple4",
    "js.array.JsTuple5",
    "js.core.Void",

    "web.dom.Element",
    "web.window.Window",
    "web.events.EventTarget",
    "web.scroll.ScrollBehavior",
    "web.resize.ResizeObserverEntry",

    "seskar.js.JsRawValue",
    "seskar.js.JsValue",
    "seskar.js.JsNativeInvoke",
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
