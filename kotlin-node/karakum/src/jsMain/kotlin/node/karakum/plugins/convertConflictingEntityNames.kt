package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import js.objects.Object
import js.objects.recordOf
import js.array.component1
import js.array.component2
import typescript.Declaration
import typescript.Identifier
import typescript.Node
import typescript.SymbolFlags
import typescript.isIdentifier
import typescript.isStringLiteral
import kotlin.collections.contains

private val conflictingEntities = recordOf(
    "inspector" to arrayOf(
        "Session",
    ),
    "readline" to arrayOf(
        "Interface",
        "ReadLineOptions",
        "Completer",
    ),
    "stream.d.ts" to arrayOf(
        "FinishedOptions",
    ),
    "fs.d.ts" to arrayOf(
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

    val (_, fileNameConflictingEntities) = ensureNotNull(
        Object.entries(conflictingEntities)
            .find { (fileName) -> sourceFileName.endsWith(fileName) }
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
