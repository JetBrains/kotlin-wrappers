package typescript.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature
import typescript.isTypeParameterDeclaration

fun resolveInterfaceMethodTypeParameterConstraintName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val typeParameter = ensureNotNull(typeScriptService.getParent(node))
    ensure(isTypeParameterDeclaration(typeParameter))
    ensure(typeParameter.constraint === node)
    val typeParameterName = typeParameter.name.text

    val method = ensureNotNull(typeScriptService.getParent(typeParameter))
    ensure(isMethodSignature(method))

    val methodNameNode = method.name
    ensure(isIdentifier(methodNameNode))
    val methodName = methodNameNode.text

    val interfaceNode = ensureNotNull(typeScriptService.getParent(method))
    ensure(isInterfaceDeclaration(interfaceNode))
    val parentName = interfaceNode.name.text

    "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}${typeParameterName.replaceFirstChar { it.titlecase() }}Constraint"
}
