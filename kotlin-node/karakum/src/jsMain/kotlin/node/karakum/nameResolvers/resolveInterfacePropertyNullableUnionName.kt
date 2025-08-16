package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import node.karakum.util.nullable
import typescript.Node
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isParenthesizedTypeNode
import typescript.isPropertySignature
import typescript.isUnionTypeNode

fun resolveInterfacePropertyNullableUnionName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val union = ensureNotNull(
        typeScriptService.getParent(node)
            ?.let {
                if (isParenthesizedTypeNode(it)) {
                    typeScriptService.getParent(it)
                } else it
            }
    )
    ensure(isUnionTypeNode(union))
    ensure(union.types.asArray().size == 2)
    ensure(union.types.asArray()[1].kind == SyntaxKind.UndefinedKeyword)

    val property = ensureNotNull(typeScriptService.getParent(union))
    ensure(isPropertySignature(property))

    val propertyNameNode = property.name
    ensure(isIdentifier(propertyNameNode))
    val propertyName = propertyNameNode.text

    val interfaceNode = ensureNotNull(typeScriptService.getParent(property))
    ensure(isInterfaceDeclaration(interfaceNode))
    val parentName = interfaceNode.name.text

    "${parentName.replaceFirstChar { it.titlecase() }}${propertyName.replaceFirstChar { it.titlecase() }}"
}
