package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import arrow.core.raise.nullable
import typescript.Node
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isPropertyDeclaration
import typescript.isTypeReferenceNode

fun resolveClassPropertyItemName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val typeReference = ensureNotNull(typeScriptService.getParent(node))
    ensure(isTypeReferenceNode(typeReference))

    val typeName = typeReference.typeName
    ensure(isIdentifier(typeName))
    ensure(
        typeName.text == "Array"
                || typeName.text == "ReadonlyArray"
    )

    val property = ensureNotNull(typeScriptService.getParent(typeReference))
    ensure(isPropertyDeclaration(property))

    val propertyNameNode = property.name
    ensure(isIdentifier(propertyNameNode))
    val propertyName = propertyNameNode.text

    val classNode = ensureNotNull(typeScriptService.getParent(property))
    ensure(isClassDeclaration(classNode))
    val parentName = ensureNotNull(classNode.name).text

    "${parentName.replaceFirstChar { it.titlecase() }}${propertyName.replaceFirstChar { it.titlecase() }}Item"
}
