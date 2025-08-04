package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import node.karakum.util.nullable
import typescript.Node
import typescript.asArray
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isIntersectionTypeNode
import typescript.isLiteralTypeNode
import typescript.isParameter
import typescript.isParenthesizedTypeNode
import typescript.isPropertySignature
import typescript.isStringLiteral
import typescript.isTypeLiteralNode
import typescript.isTypeReferenceNode
import typescript.isUnionTypeNode

fun resolveChildProcessOptionsName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
    ensure(sourceFileName.endsWith("child_process.d.ts"))

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
        ensure(parentName == "exec")

        nullable {
            ensure(isIntersectionTypeNode(node))

            val firstType = ensureNotNull(node.types.asArray().first())
            ensure(isTypeLiteralNode(firstType))
            ensure(firstType.members.asArray().any { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    val propertyName = member.name
                    ensure(isIdentifier(propertyName))
                    ensure(propertyName.text == "encoding")

                    val propertyType = ensureNotNull(member.type)
                    ensure(isUnionTypeNode(propertyType))

                    val firstPropertyType = ensureNotNull(propertyType.types.asArray().first())
                    ensure(isLiteralTypeNode(firstPropertyType))

                    val firstPropertyTypeLiteral = firstPropertyType.literal
                    ensure(isStringLiteral(firstPropertyTypeLiteral))
                    ensure(firstPropertyTypeLiteral.text == "buffer")
                } != null
            })

            "${parentName.replaceFirstChar { it.titlecase() }}Buffer${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: nullable {
            ensure(isIntersectionTypeNode(node))

            val firstType = ensureNotNull(node.types.asArray().first())
            ensure(isTypeReferenceNode(firstType))

            val typeName = firstType.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "ObjectEncodingOptions")

            "${parentName.replaceFirstChar { it.titlecase() }}ObjectEncoding${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: run {
            "${parentName.replaceFirstChar { it.titlecase() }}String${parameterName.replaceFirstChar { it.titlecase() }}"
        }
    } ?: nullable {
        ensure(parentName == "execFile")

        ensure(isIntersectionTypeNode(node))

        val firstType = ensureNotNull(node.types.asArray().first())
        ensure(isTypeReferenceNode(firstType))

        val typeName = firstType.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "ObjectEncodingOptions")

        "${parentName.replaceFirstChar { it.titlecase() }}ObjectEncoding${parameterName.replaceFirstChar { it.titlecase() }}"
    } ?: run {
        "${parentName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}"
    }
}
