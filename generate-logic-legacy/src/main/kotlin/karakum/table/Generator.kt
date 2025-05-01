package karakum.table

import karakum.common.GENERATOR_COMMENT
import karakum.common.writeCode
import java.io.File

private val DEFAULT_IMPORTS = listOf(
    "js.promise.Promise",
    "js.regexp.RegExp",

    "js.array.Tuple2",
    "js.array.ReadonlyArray",
    "js.collections.JsMap",
    "js.core.Void",
    "js.objects.JsPlainObject",
    "js.objects.PropertyKey",
    "js.objects.ReadonlyRecord",
    "js.reflect.unsafeCast",
    "js.reflect.unsafeSpecialCast",
    "js.symbol.Symbol",

    "seskar.js.JsRawValue",
    "seskar.js.JsValue",

    "tanstack.table.core.VisibilityColumn as ColumnVisibilityColumn",

    "web.dom.Document",
    "web.events.Event",
).map {
    val name = it
        .substringAfterLast(" ")
        .substringAfterLast(".")

    name to it
}

fun generateKotlinDeclarations(
    coreDefinitionsDir: File,
    sourceDir: File,
) {
    val content = readContent(coreDefinitionsDir)
        .applyPatches()

    val targetDir = sourceDir.resolve("tanstack/table/core")
        .also { it.mkdirs() }

    for ((name, body) in convertDefinitions(content)) {
        val annotations = when {
            "external val " in body || "external object " in body || "external fun " in body
                -> "@file:JsModule(\"${Package.TABLE_CORE.moduleName}\")"

            else -> ""
        }

        val fileName = if (name.endsWith("Fns") && "interface" in body) {
            "$name.type"
        } else name

        val finalBody = if (
            name.endsWith("TableState")
            || name.endsWith("ColumnDef")
            || name.endsWith("ColumnDefBase")
            || name.endsWith("ColumnDefExtensions")
            || name.endsWith("ColumnDefResolved")
            || name.endsWith("ColumnIdentifiers")
            || name.endsWith("IdIdentifier")
        ) {
            body.replace("@JsPlainObject\n", "")
        } else if ("@JsPlainObject" in body) {
            body.replace("\nvar ", "\nval ")
                .replace("\noverride var ", "\noverride val ")
        } else body

        targetDir.resolve("$fileName.kt")
            .writeCode(fileContent(Package.TABLE_CORE, annotations, finalBody))
    }
}

private fun readContent(
    definitionsDir: File,
): String =
    definitionsDir.walk()
        .maxDepth(2)
        .filter { it.isFile }
        .filter { it.name.endsWith(".d.ts") }
        .map { file ->
            file.readLines()
                .filter { !it.startsWith("import ") }
                .filter { !it.startsWith("export * from ") }
                .joinToString("\n")
                .substringBefore("\nexport {")
                .trim()
        }
        .filter { it.isNotEmpty() }
        .joinToString("\n\n", "\n\n")

private fun fileContent(
    pkg: Package,
    annotations: String,
    body: String,
): String {
    val defaultImports = DEFAULT_IMPORTS
        .asSequence()
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
