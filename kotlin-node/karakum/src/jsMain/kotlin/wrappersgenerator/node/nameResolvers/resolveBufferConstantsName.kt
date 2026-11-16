package wrappersgenerator.node.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isVariableDeclaration

suspend fun resolveBufferConstantsName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
    ensure(sourceFileName.endsWith("buffer.d.ts"))

    val variable = ensureNotNull(typeScriptService.getParent(node))
    ensure(isVariableDeclaration(variable))

    val variableName = variable.name
    ensure(isIdentifier(variableName))
    ensure(variableName.text == "constants")

    "BufferConstants"
}
