package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.*

private val conflictingEntities = mapOf(
    "inspector" to listOf(
        "Session",
    ),
    "readline" to listOf(
        "Interface",
        "ReadLineOptions",
        "Completer",
    ),
    "stream.d.ts" to listOf(
        "FinishedOptions",
    ),
    "fs.d.ts" to listOf(
        "DisposableTempDir",
        "WatchOptions",
        "WatchOptionsWithBufferEncoding",
        "WatchOptionsWithStringEncoding",
    ),
)

private fun extractDeclaration(node: Node, context: Context): Declaration? {
    val typeScriptService = context.lookupService(typeScriptServiceKey)

    val typeChecker = typeScriptService?.program?.getTypeChecker()

    var symbol = typeChecker?.getSymbolAtLocation(node) ?: return null

    // TODO: provide bit mask for TypeFlags
    if ((symbol.flags.toString().toInt() and SymbolFlags.Alias.toString().toInt()) != 0) {
        symbol = typeChecker.getAliasedSymbol(symbol)
    }

    val declaration = symbol.declarations?.firstOrNull()

    return symbol.valueDeclaration ?: declaration
}

private fun convertNameByNamespace(node: Identifier, context: Context) = nullable {
    val declaration = ensureNotNull(extractDeclaration(node, context))

    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
    val namespace = ensureNotNull(typeScriptService.findClosestNamespace(declaration))
    val namespaceName = namespace.name
    ensure(isStringLiteral(namespaceName))

    val namespaceConflictingEntities = ensureNotNull(conflictingEntities[namespaceName.text])
    ensure(node.text in namespaceConflictingEntities)

    "_${node.text}"
}

private fun convertNameByFileName(node: Identifier, context: Context) = nullable {
    val declaration = ensureNotNull(extractDeclaration(node, context))

    val sourceFileName = ensureNotNull(declaration.getSourceFileOrNull()).fileName

    val fileNameConflictingEntities = ensureNotNull(
        conflictingEntities.entries
            .firstOrNull { (fileName) -> sourceFileName.endsWith(fileName) }
            ?.value
    )
    ensure(node.text in fileNameConflictingEntities)

    "_${node.text}"
}

val convertConflictingEntityNames = createPlugin { node, context, _ ->
    nullable {
        ensure(isIdentifier(node))

        convertNameByNamespace(node, context)
            ?: convertNameByFileName(node, context)
    }
}
