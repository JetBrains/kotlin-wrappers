package wrappersgenerator.typescript.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

fun resolveInterfaceMethodTypeParameterConstraintName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

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
