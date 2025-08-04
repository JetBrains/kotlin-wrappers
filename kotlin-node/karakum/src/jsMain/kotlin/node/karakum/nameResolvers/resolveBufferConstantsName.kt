package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import node.karakum.util.nullable
import typescript.Node
import typescript.isIdentifier
import typescript.isVariableDeclaration

fun resolveBufferConstantsName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
    ensure(sourceFileName.endsWith("buffer.d.ts"))

    val variable = ensureNotNull(typeScriptService.getParent(node))
    ensure(isVariableDeclaration(variable))

    val variableName = variable.name
    ensure(isIdentifier(variableName))
    ensure(variableName.text == "constants")

    "BufferConstants"
}
