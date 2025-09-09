package typescript.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature
import typescript.isUnionTypeNode

fun resolveInterfaceMethodReturnTypeNullableUnionName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val union = ensureNotNull(typeScriptService.getParent(node))
    ensure(isUnionTypeNode(union))
    ensure(union.types.asArray().size > 1)

    val unionSecondType = union.types.asArray()[1]
    ensure(unionSecondType.kind == SyntaxKind.UndefinedKeyword)

    val method = ensureNotNull(typeScriptService.getParent(union))
    ensure(isMethodSignature(method))

    val methodNameNode = method.name
    ensure(isIdentifier(methodNameNode))
    val methodName = methodNameNode.text

    val interfaceNode = ensureNotNull(typeScriptService.getParent(method))
    ensure(isInterfaceDeclaration(interfaceNode))
    val parentName = interfaceNode.name.text

    "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}Result"
}
