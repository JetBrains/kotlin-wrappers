package wrappersgenerator.node.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

fun resolveMIMETypeInputName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    val parameter = ensureNotNull(
        typeScriptService.getParent(node)
            ?.let {
                if (isUnionTypeNode(it)) {
                    typeScriptService.getParent(it)
                } else it
            }
    )
    ensure(isParameter(parameter))

    val parameterNameNode = parameter.name
    ensure(isIdentifier(parameterNameNode))
    val parameterName = parameterNameNode.text
    ensure(parameterName == "input")

    val constructor = ensureNotNull(typeScriptService.getParent(parameter))
    ensure(isConstructorDeclaration(constructor))

    val classNode = ensureNotNull(typeScriptService.getParent(constructor))
    ensure(isClassDeclaration(classNode))
    val parentName = ensureNotNull(classNode.name).text
    ensure(parentName == "MIMEType")

    "${parentName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}"
}
