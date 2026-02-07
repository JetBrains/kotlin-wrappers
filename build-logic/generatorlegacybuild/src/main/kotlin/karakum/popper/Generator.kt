package karakum.popper

import karakum.common.GENERATOR_COMMENT
import karakum.common.Suppress.NESTED_CLASS_IN_EXTERNAL_INTERFACE
import karakum.common.fileSuppress
import karakum.common.writeCode
import java.io.File
import java.io.FileFilter

private val DEFAULT_IMPORTS = listOf(
    "js.promise.Promise",

    "js.array.ReadonlyArray",
    "kotlin.js.JsAny",
    "kotlin.js.JsString",
    "kotlinx.js.JsPlainObject",
    "js.core.Void",
    "js.objects.Record",
    "js.objects.ReadonlyRecord",
    "js.reflect.JsExternalInheritorsOnly",

    "seskar.js.JsRawValue",
    "seskar.js.JsValue",
).map { it.substringAfterLast(".") to it }

fun generateKotlinDeclarations(
    definitionsDir: File,
    sourceDir: File,
) {
    generateCoreDeclarations(
        definitionsDir = definitionsDir,
        sourceDir = sourceDir,
    )

    generateModifiersDeclarations(
        definitionsDir = definitionsDir,
        sourceDir = sourceDir,
    )
}

private fun generateCoreDeclarations(
    definitionsDir: File,
    sourceDir: File,
) {
    val targetDir = sourceDir
        .resolve(Package.CORE.path)
        .also { it.mkdirs() }

    val types = convertDefinitions(definitionsDir.resolve("types.d.ts").readText())
        .plus(nameTypes())
        .plus(enums())

    for ((name, body) in types) {
        val suppresses = buildSet {
            if ("companion object" in body && "sealed external interface" in body)
                add(NESTED_CLASS_IN_EXTERNAL_INTERFACE)
        }.toTypedArray()

        val annotations = if (suppresses.isNotEmpty()) {
            fileSuppress(suppresses = suppresses)
        } else ""

        targetDir.resolve("$name.kt")
            .writeCode(fileContent(Package.CORE, annotations, body))
    }
}

private fun generateModifiersDeclarations(
    definitionsDir: File,
    sourceDir: File,
) {
    val targetDir = sourceDir
        .resolve(Package.MODIFIERS.path)
        .also { it.mkdirs() }

    val modifierFiles = definitionsDir
        .resolve("modifiers")
        .listFiles(FileFilter { it.name.endsWith(".d.ts") && it.name != "index.d.ts" })
        ?: return

    val modifiers = modifierFiles
        .map { convertModifier(it.readText()) }

    for ((name, body) in modifiers) {
        targetDir.resolve("$name.kt")
            .writeCode(fileContent(Package.MODIFIERS, "", body))
    }
}

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
