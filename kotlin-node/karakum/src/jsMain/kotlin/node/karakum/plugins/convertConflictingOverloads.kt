package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.Signature
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.function
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.*

private fun isNativeRealpathSync(node: FunctionDeclaration) = nullable {
    ensure(node.name?.text == "native")

    val moduleBlock = ensureNotNull(node.getParentOrNull())
    ensure(isModuleBlock(moduleBlock))

    val moduleDeclaration = ensureNotNull(moduleBlock.getParentOrNull())
    ensure(isModuleDeclaration(moduleDeclaration))

    val moduleName = moduleDeclaration.name
    ensure(isIdentifier(moduleName))
    ensure(moduleName.text == "realpathSync")
} != null

private fun hasConflictingOverloads(node: FunctionDeclaration) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

    nullable {
        // additional overloads with a union return type
        ensure(
            sourceFileName.endsWith("fs.d.ts")
                    || sourceFileName.endsWith("fs/promises.d.ts")
        )

        ensure(
            node.name?.text == "mkdirSync"
                    || node.name?.text == "mkdtempSync"
                    || node.name?.text == "readdirSync"
                    || node.name?.text == "readlinkSync"
                    || node.name?.text == "realpathSync"
                    // also callback overload that conflicts with the suspend one
                    || node.name?.text == "watch"
                    || isNativeRealpathSync(node)
        )
    } ?: nullable {
        // callback overloads that conflict with suspend ones
        ensure(sourceFileName.endsWith("stream.d.ts"))

        ensure(node.name?.text == "pipeline")

        val type = ensureNotNull(node.type)
        ensure(isTypeReferenceNode(type))
        ensure(isQualifiedName(type.typeName))
    } ?: nullable {
        // overloads by boolean literal
        ensure(sourceFileName.endsWith("url.d.ts"))

        ensure(node.name?.text == "parse")

        val type = ensureNotNull(node.type)
        ensure(isTypeReferenceNode(type))

        val typeName = type.typeName
        ensure(isIdentifier(typeName))
        ensure(
            typeName.text == "UrlWithStringQuery"
                    || typeName.text == "UrlWithParsedQuery"
        )
    } ?: nullable {
        // additional overloads with a union return type
        ensure(sourceFileName.endsWith("crypto.d.ts"))

        ensure(node.name?.text == "hash")

        val type = ensureNotNull(node.type)
        ensure(isUnionTypeNode(type))
    }
} != null

private fun isConflictingOverload(node: FunctionDeclaration, signature: Signature) = nullable {
    nullable {
        ensure(node.name?.text == "mkdirSync")

        ensureNotNull(
            nullable {
                ensure(signature.size == 1)
            } ?: nullable {
                val parameter = ensureNotNull(signature[1])
                val parameterType = ensureNotNull(parameter.type)
                ensure(isTypeReferenceNode(parameterType))
                val parameterTypeName = parameterType.typeName
                ensure(isIdentifier(parameterTypeName))
                ensure(parameterTypeName.text == "Mode")
            }
        )

        val type = ensureNotNull(node.type)
        ensure(isUnionTypeNode(type))
    } ?: nullable {
        ensure(
            node.name?.text == "mkdtempSync"
                    || node.name?.text == "readlinkSync"
                    || node.name?.text == "realpathSync"
                    || isNativeRealpathSync(node)
        )

        val parameter = ensureNotNull(signature[1])
        val parameterType = ensureNotNull(parameter.type)
        ensure(isTypeReferenceNode(parameterType))
        val parameterTypeName = parameterType.typeName
        ensure(isIdentifier(parameterTypeName))
        ensure(parameterTypeName.text == "EncodingOption")

        val type = ensureNotNull(node.type)
        ensure(isUnionTypeNode(type))
    } ?: nullable {
        ensure(node.name?.text == "readdirSync")

        ensureNotNull(
            nullable {
                ensure(signature.size == 1)
            } ?: nullable {
                val parameter = ensureNotNull(signature[1])
                val parameterType = ensureNotNull(parameter.type)
                ensure(isTypeReferenceNode(parameterType))
                val parameterTypeName = parameterType.typeName
                ensure(isIdentifier(parameterTypeName))
                ensure(parameterTypeName.text == "BufferEncoding")
            }
        )

        val type = ensureNotNull(node.type)
        ensure(isUnionTypeNode(type))
    } ?: nullable {
        ensure(node.name?.text == "watch")

        ensureNotNull(
            nullable {
                ensure(signature.size == 1)

                val type = ensureNotNull(node.type)
                ensure(isTypeReferenceNode(type))
                val typeName = type.typeName
                ensure(isIdentifier(typeName))
                ensure(typeName.text == "FSWatcher")
            } ?: nullable {
                val parameter = ensureNotNull(signature[1])
                val parameterType = ensureNotNull(parameter.type)

                ensureNotNull(
                    nullable {
                        ensure(isLiteralTypeNode(parameterType))
                        val parameterTypeLiteral = parameterType.literal
                        ensure(isStringLiteral(parameterTypeLiteral))
                        ensure(parameterTypeLiteral.text == "buffer")
                    } ?: nullable {
                        ensure(isTypeReferenceNode(parameterType))
                        val parameterTypeName = parameterType.typeName
                        ensure(isIdentifier(parameterTypeName))
                        ensure(parameterTypeName.text == "BufferEncoding")
                    }
                )

                val type = ensureNotNull(node.type)
                ensure(isTypeReferenceNode(type))
                val typeName = type.typeName
                ensure(isQualifiedName(typeName))
                ensure(typeName.right.text == "AsyncIterator")
                val typeArguments = ensureNotNull(type.typeArguments)
                val firstTypeArgument = ensureNotNull(typeArguments.asArray().first())
                ensure(isTypeReferenceNode(firstTypeArgument))
                val firstTypeArgumentTypeArguments = ensureNotNull(firstTypeArgument.typeArguments)
                val firstTypeArgumentFirstTypeArgument = ensureNotNull(firstTypeArgumentTypeArguments.asArray().first())
                ensure(isUnionTypeNode(firstTypeArgumentFirstTypeArgument))
            }
        )
    } ?: nullable {
        ensure(node.name?.text == "pipeline")

        val parameter = ensureNotNull(signature[2])
        ensureNotNull(parameter.parameter.dotDotDotToken)

        val type = ensureNotNull(node.type)
        ensure(isTypeReferenceNode(type))
        ensure(isQualifiedName(type.typeName))
    } ?: nullable {
        ensure(node.name?.text == "parse")

        val parameter = ensureNotNull(signature[1])
        val parameterType = ensureNotNull(parameter.type)
        ensure(isLiteralTypeNode(parameterType))
        val parameterTypeLiteral = parameterType.literal

        ensureNotNull(
            nullable {
                ensure(parameterTypeLiteral.kind == SyntaxKind.TrueKeyword)

                val type = ensureNotNull(node.type)
                ensure(isTypeReferenceNode(type))
                val typeName = type.typeName
                ensure(isIdentifier(typeName))
                ensure(typeName.text == "UrlWithParsedQuery")
            } ?: nullable {
                ensure(parameterTypeLiteral.kind == SyntaxKind.FalseKeyword)

                val type = ensureNotNull(node.type)
                ensure(isTypeReferenceNode(type))
                val typeName = type.typeName
                ensure(isIdentifier(typeName))
                ensure(typeName.text == "UrlWithStringQuery")
            }
        )
    } ?: nullable {
        ensure(node.name?.text == "hash")

        val parameter = ensureNotNull(signature[2])
        val parameterType = ensureNotNull(parameter.type)

        ensureNotNull(
            nullable {
                ensure(isTypeReferenceNode(parameterType))
                val parameterTypeName = parameterType.typeName
                ensure(isIdentifier(parameterTypeName))
                ensure(parameterTypeName.text == "BinaryToTextEncoding")
            } ?: nullable {
                ensure(isLiteralTypeNode(parameterType))
                val parameterTypeLiteral = parameterType.literal
                ensure(isStringLiteral(parameterTypeLiteral))
                ensure(parameterTypeLiteral.text == "buffer")
            }
        )

        val type = ensureNotNull(node.type)
        ensure(isUnionTypeNode(type))
    }
} != null

val convertConflictingOverloads = createPlugin { node, context, render ->
    nullable {
        ensure(isFunctionDeclaration(node))
        ensure(hasConflictingOverloads(node))

        val name = node.name?.let { render(it) } ?: "Anonymous"

        val typeParameters = node.typeParameters?.asArray()
            ?.joinToString(", ") { render(it) }

        val returnType = node.type?.let { render(it) }

        convertParameterDeclarations(node, context, render, ParameterDeclarationsConfiguration(
            strategy = ParameterDeclarationStrategy.function,
            template = template@{ parameters, signature ->
                if (isConflictingOverload(node, signature)) return@template ""

                "external fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnType) { ": $it"}}"
            }
        ))
    }
}
