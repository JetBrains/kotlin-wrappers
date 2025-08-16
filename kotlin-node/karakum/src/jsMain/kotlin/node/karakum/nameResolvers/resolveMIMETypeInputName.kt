package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import node.karakum.util.nullable
import typescript.Node
import typescript.isClassDeclaration
import typescript.isConstructorDeclaration
import typescript.isIdentifier
import typescript.isParameter
import typescript.isUnionTypeNode

fun resolveMIMETypeInputName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

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
