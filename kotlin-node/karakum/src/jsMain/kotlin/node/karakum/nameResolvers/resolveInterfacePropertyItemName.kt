package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import node.karakum.util.nullable
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature
import typescript.isTypeReferenceNode

fun resolveInterfacePropertyItemName(node: Node, context: Context) = nullable {
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
    ensure(isPropertySignature(property))

    val propertyNameNode = property.name
    ensure(isIdentifier(propertyNameNode))
    val propertyName = propertyNameNode.text

    val interfaceNode = ensureNotNull(typeScriptService.getParent(property))
    ensure(isInterfaceDeclaration(interfaceNode))
    val parentName = interfaceNode.name.text

    "${parentName.replaceFirstChar { it.titlecase() }}${propertyName.replaceFirstChar { it.titlecase() }}Item"
}
