package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import node.karakum.util.nullable
import typescript.Node
import typescript.asArray
import typescript.isCallSignatureDeclaration
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isLiteralTypeNode
import typescript.isMethodSignature
import typescript.isParameter
import typescript.isParenthesizedTypeNode
import typescript.isPropertySignature
import typescript.isStringLiteral
import typescript.isTypeLiteralNode
import typescript.isUnionTypeNode

fun resolveV8OptionsName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
    ensure(sourceFileName.endsWith("v8.d.ts"))

    // exclude literal types
    ensure(!isLiteralTypeNode(node))

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
    val parentName = ensureNotNull(
        nullable {
            ensure(isFunctionDeclaration(signatureDeclaration))
            signatureDeclaration.name?.text
        } ?: nullable {
            ensure(isCallSignatureDeclaration(signatureDeclaration))

            val interfaceNode = ensureNotNull(typeScriptService.getParent(signatureDeclaration))
            ensure(isInterfaceDeclaration((interfaceNode)))

            interfaceNode.name.text
        } ?: nullable {
            ensure(isMethodSignature(signatureDeclaration))

            val methodNameNode = signatureDeclaration.name
            ensure(isIdentifier(methodNameNode))

            val interfaceNode = ensureNotNull(typeScriptService.getParent(signatureDeclaration))
            ensure(isInterfaceDeclaration((interfaceNode)))

            "${interfaceNode.name.text.replaceFirstChar { it.titlecase() }}${methodNameNode.text.replaceFirstChar { it.titlecase() }}"
        }
    )

    nullable {
        ensure(parentName == "queryObjects")

        nullable {
            ensure(isTypeLiteralNode(node))
            ensure(node.members.asArray().any { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    val propertyName = member.name
                    ensure(isIdentifier(propertyName))
                    ensure(propertyName.text == "format")

                    val propertyType = ensureNotNull(member.type)
                    ensure(isLiteralTypeNode(propertyType))

                    val propertyTypeLiteral = propertyType.literal
                    ensure(isStringLiteral(propertyTypeLiteral))
                    ensure(propertyTypeLiteral.text == "count")
                } != null
            })

            "${parentName.replaceFirstChar { it.titlecase() }}Count${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: nullable {
            ensure(isTypeLiteralNode(node))
            ensure(node.members.asArray().any { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    val propertyName = member.name
                    ensure(isIdentifier(propertyName))
                    ensure(propertyName.text == "format")

                    val propertyType = ensureNotNull(member.type)
                    ensure(isLiteralTypeNode(propertyType))

                    val propertyTypeLiteral = propertyType.literal
                    ensure(isStringLiteral(propertyTypeLiteral))
                    ensure(propertyTypeLiteral.text == "summary")
                } != null
            })

            "${parentName.replaceFirstChar { it.titlecase() }}Summary${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: run {
            "${parentName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}"
        }
    } ?: run {
        "${parentName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}"
    }
}
