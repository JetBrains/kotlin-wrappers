package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import arrow.core.raise.nullable
import typescript.Node
import typescript.asArray
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isLiteralTypeNode
import typescript.isParameter
import typescript.isParenthesizedTypeNode
import typescript.isPropertySignature
import typescript.isStringLiteral
import typescript.isTypeLiteralNode
import typescript.isUnionTypeNode

fun resolveOsOptionsName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
    ensure(sourceFileName.endsWith("os.d.ts"))

    val parameter = ensureNotNull(
        typeScriptService.getParent(node)
            ?.let {
                if (isParenthesizedTypeNode(it)) {
                    typeScriptService.getParent(it)
                } else it
            }
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

    val signatureDeclaration = ensureNotNull(typeScriptService.getParent(parameter))
    ensure(isFunctionDeclaration(signatureDeclaration))

    val signatureName = ensureNotNull(signatureDeclaration.name)
    val parentName = signatureName.text

    nullable {
        ensure(parentName == "userInfo")

        nullable {
            ensure(isTypeLiteralNode(node))
            ensure(node.members.asArray().any { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    val propertyName = member.name
                    ensure(isIdentifier(propertyName))
                    ensure(propertyName.text == "encoding")

                    val propertyType = ensureNotNull(member.type)
                    ensure(isLiteralTypeNode(propertyType))

                    val propertyTypeLiteral = propertyType.literal
                    ensure(isStringLiteral(propertyTypeLiteral))
                    ensure(propertyTypeLiteral.text == "buffer")
                } != null
            })

            "${parentName.replaceFirstChar { it.titlecase() }}Buffer${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: run {
            "${parentName.replaceFirstChar { it.titlecase() }}String${parameterName.replaceFirstChar { it.titlecase() }}"
        }
    } ?: nullable {
        "${parentName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}"
    }
}
