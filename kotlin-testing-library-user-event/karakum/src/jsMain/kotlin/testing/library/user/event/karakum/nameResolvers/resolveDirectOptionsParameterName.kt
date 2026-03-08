package testing.library.user.event.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.Node
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isParameter

fun resolveDirectOptionsParameterName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    val parameter = ensureNotNull(typeScriptService.getParent(node))
    ensure(isParameter(parameter))

    val parameterNameNode = parameter.name
    ensure(isIdentifier(parameterNameNode))
    val parameterName = parameterNameNode.text

    val function = ensureNotNull(typeScriptService.getParent(parameter))
    ensure(isFunctionDeclaration(function))

    val functionNameNode = ensureNotNull(function.name)
    val functionName = functionNameNode.text

    val sourceFileName = ensureNotNull(function.getSourceFileOrNull()).fileName
    ensure(sourceFileName.endsWith("directApi.d.ts"))

    "Direct${functionName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}"
}
