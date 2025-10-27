package node.karakum.annotations

import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import arrow.core.raise.nullable
import typescript.Node
import typescript.isClassDeclaration
import typescript.isStringLiteral

private val conflictingEntities = mapOf(
    "inspector" to setOf(
        "Session",
    ),
    "readline" to setOf(
        "Interface",
    ),
)

private fun checkNameByNamespace(node: Node, context: Context) = nullable {
    ensure(isClassDeclaration(node))

    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
    val namespace = ensureNotNull(typeScriptService.findClosestNamespace(node))

    val namespaceName = namespace.name
    ensure(isStringLiteral(namespaceName))

    val namespaceConflictingEntities = ensureNotNull(conflictingEntities[namespaceName.text])
    ensure(node.name?.text in namespaceConflictingEntities)
} != null

private fun checkNameByFileName(node: Node) = nullable {
    ensure(isClassDeclaration(node))

    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
    val (_, fileNameConflictingEntities) = conflictingEntities.entries
        .find { (fileName) -> sourceFileName.endsWith(fileName) }
        .let { ensureNotNull(it) }
    ensure(node.name?.text in fileNameConflictingEntities)
} != null

fun annotateConflictingEntityNames(node: Node, context: AnnotationContext) = nullable {
    ensure(isClassDeclaration(node))
    ensure(
        checkNameByNamespace(node, context)
                || checkNameByFileName(node)
    )

    val name = ensureNotNull(node.name)

    "@JsName(\"${name.text}\")"
}
