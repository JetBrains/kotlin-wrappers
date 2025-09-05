package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import arrow.core.raise.impure
import arrow.core.raise.nullable
import typescript.Node
import typescript.SyntaxKind
import typescript.asArray
import typescript.isCallSignatureDeclaration
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isIntersectionTypeNode
import typescript.isLiteralTypeNode
import typescript.isMethodSignature
import typescript.isParameter
import typescript.isParenthesizedTypeNode
import typescript.isPropertySignature
import typescript.isStringLiteral
import typescript.isTypeLiteralNode
import typescript.isTypeReferenceNode
import typescript.isUnionTypeNode

fun resolveFsOptionsName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
    ensure(
        sourceFileName.endsWith("fs.d.ts")
                || sourceFileName.endsWith("fs/promises.d.ts")
    )

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

    val postfix = if (
        parameterName == "options"
        && sourceFileName.endsWith("fs/promises.d.ts")
    ) {
        "Async"
    } else {
        ""
    }

    nullable {
        ensure(
            parentName == "readdir"
                    || parentName == "readdirSync"
                    || parentName == "watch"
        )

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

            nullable {
                ensure(node.members.asArray().any { member ->
                    nullable {
                        ensure(isPropertySignature(member))

                        val propertyName = member.name
                        ensure(isIdentifier(propertyName))
                        ensure(propertyName.text == "withFileTypes")

                        val propertyType = ensureNotNull(member.type)
                        ensure(isLiteralTypeNode(propertyType))
                        ensure(propertyType.literal.kind == SyntaxKind.TrueKeyword)
                    } != null
                })

                "${parentName.replaceFirstChar { it.titlecase() }}BufferWithFileTypes${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
            } ?: run {
                "${parentName.replaceFirstChar { it.titlecase() }}Buffer${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
            }
        } ?: nullable {
            ensure(isIntersectionTypeNode(node))

            val secondType = ensureNotNull(node.types.asArray().getOrNull( 1))
            ensure(isTypeLiteralNode(secondType))
            ensure(secondType.members.asArray().any { member ->
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

            "${parentName.replaceFirstChar { it.titlecase() }}Buffer${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: nullable {
            ensure(isIntersectionTypeNode(node))

            val firstType = ensureNotNull(node.types.asArray().first())
            ensure(isTypeReferenceNode(firstType))

            val typeName = firstType.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "ObjectEncodingOptions")

            nullable {
                val secondType = ensureNotNull(node.types.asArray().getOrNull( 1))
                ensure(isTypeLiteralNode(secondType))
                ensure(secondType.members.asArray().any { member ->
                    nullable {
                        ensure(isPropertySignature(member))

                        val propertyName = member.name
                        ensure(isIdentifier(propertyName))
                        ensure(propertyName.text == "withFileTypes")

                        val propertyType = ensureNotNull(member.type)
                        ensure(isLiteralTypeNode(propertyType))
                        ensure(propertyType.literal.kind == SyntaxKind.TrueKeyword)
                    } != null
                })

                "${parentName.replaceFirstChar { it.titlecase() }}WithFileTypes${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
            } ?: run {
                "${parentName.replaceFirstChar { it.titlecase() }}${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
            }
        } ?: run {
            "${parentName.replaceFirstChar { it.titlecase() }}String${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
        }
    } ?: nullable {
        ensure(
            parentName == "readFile"
                    || parentName == "readFileSync"
                    || parentName == "FileHandleReadFile"
        )

        nullable {
            ensure(isTypeLiteralNode(node))
            ensure(node.members.asArray().any { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    val propertyName = member.name
                    ensure(isIdentifier(propertyName))
                    ensure(propertyName.text == "encoding")

                    val propertyType = ensureNotNull(member.type)
                    ensure(isTypeReferenceNode(propertyType))

                    val typeName = propertyType.typeName
                    ensure(isIdentifier(typeName))
                    ensure(typeName.text == "BufferEncoding")
                } != null
            })

            "${parentName.replaceFirstChar { it.titlecase() }}String${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: nullable {
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
                    ensure(isTypeReferenceNode(propertyType))

                    val typeName = propertyType.typeName
                    ensure(isIdentifier(typeName))
                    ensure(typeName.text == "BufferEncoding")
                } != null
            })

            "${parentName.replaceFirstChar { it.titlecase() }}String${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: nullable {
            ensure(isIntersectionTypeNode(node))

            val firstType = ensureNotNull(node.types.asArray().first())
            ensure(isTypeReferenceNode(firstType))

            val typeName = firstType.typeName
            ensure(isIdentifier(typeName))
            ensure(typeName.text == "ObjectEncodingOptions")

            "${parentName.replaceFirstChar { it.titlecase() }}${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: run {
            "${parentName.replaceFirstChar { it.titlecase() }}Buffer${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
        }
    } ?: nullable {
        ensure(
            parentName == "stat"
                    || parentName == "statSync"
                    || parentName == "statfs"
                    || parentName == "statfsSync"
                    || parentName == "fstat"
                    || parentName == "fstatSync"
                    || parentName == "lstat"
                    || parentName == "watchFile"
                    || parentName == "FileHandleStat"
        )

        nullable {
            ensure(isIntersectionTypeNode(node))

            val secondType = ensureNotNull(node.types.asArray().getOrNull( 1))
            ensure(isTypeLiteralNode(secondType))
            ensure(secondType.members.asArray().any { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    val propertyName = member.name
                    ensure(isIdentifier(propertyName))
                    ensure(propertyName.text == "bigint")

                    val propertyType = ensureNotNull(member.type)
                    ensure(isLiteralTypeNode(propertyType))
                    ensure(propertyType.literal.kind == SyntaxKind.TrueKeyword)
                } != null
            })

            "${parentName.replaceFirstChar { it.titlecase() }}BigInt${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: nullable {
            ensure(parentName == "stat" || parentName == "watchFile")

            "${parentName.replaceFirstChar { it.titlecase() }}Simple${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: run {
            "${parentName.replaceFirstChar { it.titlecase() }}${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
        }
    } ?: nullable {
        ensure(
            parentName == "mkdir"
                    || parentName == "mkdirSync"
        )

        nullable {
            ensure(isIntersectionTypeNode(node))

            val secondType = ensureNotNull(node.types.asArray().getOrNull( 1))
            ensure(isTypeLiteralNode(secondType))
            ensure(secondType.members.asArray().any { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    val propertyName = member.name
                    ensure(isIdentifier(propertyName))
                    ensure(propertyName.text == "recursive")

                    val propertyType = ensureNotNull(member.type)
                    ensure(isLiteralTypeNode(propertyType))
                    ensure(propertyType.literal.kind == SyntaxKind.TrueKeyword)
                } != null
            })

            "${parentName.replaceFirstChar { it.titlecase() }}Recursive${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
        } ?: run {
            "${parentName.replaceFirstChar { it.titlecase() }}${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
        }
    } ?: nullable {
        ensure(parentName == "StatSyncFn")

        var primaryInfix = "Simple"
        var secondaryInfix = "ThrowIfNoEntry"

        impure {
            ensure(isIntersectionTypeNode(node))

            val secondType = ensureNotNull(node.types.asArray().getOrNull( 1))
            ensure(isTypeLiteralNode(secondType))
            ensure(secondType.members.asArray().any { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    val propertyName = member.name
                    ensure(isIdentifier(propertyName))
                    ensure(propertyName.text == "bigint")

                    val propertyType = ensureNotNull(member.type)
                    ensure(isLiteralTypeNode(propertyType))
                    ensure(propertyType.literal.kind == SyntaxKind.TrueKeyword)
                } != null
            })

            primaryInfix = "BigInt"
        }

        impure {
            ensure(isIntersectionTypeNode(node))

            val secondType = ensureNotNull(node.types.asArray().getOrNull( 1))
            ensure(isTypeLiteralNode(secondType))
            ensure(secondType.members.asArray().any { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    val propertyName = member.name
                    ensure(isIdentifier(propertyName))
                    ensure(propertyName.text == "throwIfNoEntry")

                    val propertyType = ensureNotNull(member.type)
                    ensure(isLiteralTypeNode(propertyType))
                    ensure(propertyType.literal.kind == SyntaxKind.FalseKeyword)
                } != null
            })

            secondaryInfix = ""
        }

        impure {
            ensure(isIntersectionTypeNode(node))

            val secondType = ensureNotNull(node.types.asArray().getOrNull( 1))
            ensure(isTypeLiteralNode(secondType))
            ensure(secondType.members.asArray().any { member ->
                nullable {
                    ensure(isPropertySignature(member))

                    val propertyName = member.name
                    ensure(isIdentifier(propertyName))
                    ensure(propertyName.text == "throwIfNoEntry")

                    val propertyType = ensureNotNull(member.type)
                    ensure(isUnionTypeNode(propertyType))

                    val firstPropertyType = ensureNotNull(propertyType.types.asArray().first())
                    ensure(isLiteralTypeNode(firstPropertyType))
                    ensure(firstPropertyType.literal.kind == SyntaxKind.FalseKeyword)
                } != null
            })

            // it is not `throwIfNoEntry` options and they are not simple
            primaryInfix = ""
            secondaryInfix = ""
        }

        "${parentName.replaceFirstChar { it.titlecase() }}${primaryInfix}${secondaryInfix}${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
    } ?: run {
        "${parentName.replaceFirstChar { it.titlecase() }}${postfix}${parameterName.replaceFirstChar { it.titlecase() }}"
    }
}
