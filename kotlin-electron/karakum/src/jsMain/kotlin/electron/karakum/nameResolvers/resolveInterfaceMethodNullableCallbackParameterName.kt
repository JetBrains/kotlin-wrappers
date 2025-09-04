package electron.karakum.nameResolvers

import electron.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.SyntaxKind
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isFunctionTypeNode
import typescript.isIdentifier
import typescript.isLiteralTypeNode
import typescript.isMethodDeclaration
import typescript.isParameter
import typescript.isParenthesizedTypeNode
import typescript.isUnionTypeNode

fun resolveInterfaceMethodNullableCallbackParameterName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val callbackParameter = ensureNotNull(typeScriptService.getParent(node))
    ensure(isParameter(callbackParameter))

    val callbackParameterNameNode = callbackParameter.name
    ensure(isIdentifier(callbackParameterNameNode))
    val callbackParameterName = callbackParameterNameNode.text

    val functionType = ensureNotNull(typeScriptService.getParent(callbackParameter))
    ensure(isFunctionTypeNode(functionType))

    val union = ensureNotNull(
        typeScriptService.getParent(functionType)
            ?.let {
                if (isParenthesizedTypeNode(it)) {
                    typeScriptService.getParent(it)
                } else it
            }
    )
    ensure(isUnionTypeNode(union))
    ensure(union.types.asArray().size >= 2)

    val nullKeyword = union.types.asArray()[1].let {
        if (isParenthesizedTypeNode(it)) {
            it.type
        } else it
    }
    ensure(isLiteralTypeNode(nullKeyword))
    ensure(nullKeyword.literal.kind == SyntaxKind.NullKeyword)

    val parameter = ensureNotNull(typeScriptService.getParent(union))
    ensure(isParameter(parameter))

    val parameterNameNode = parameter.name
    ensure(isIdentifier(parameterNameNode))
    val parameterName = parameterNameNode.text

    val method = ensureNotNull(typeScriptService.getParent(parameter))
    ensure(isMethodDeclaration(method))

    val methodNameNode = method.name
    ensure(isIdentifier(methodNameNode))
    val methodName = methodNameNode.text

    val classNode = ensureNotNull(typeScriptService.getParent(method))
    ensure(isClassDeclaration(classNode))
    val parentName = ensureNotNull(classNode.name).text

    "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}${callbackParameterName.replaceFirstChar { it.titlecase() }}"
}
