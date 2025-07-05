package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.Node
import typescript.TypeReferenceNode
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isExpressionWithTypeArguments
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isIntersectionTypeNode
import typescript.isQualifiedName
import typescript.isTypeAliasDeclaration
import typescript.isTypeParameterDeclaration
import typescript.isTypeReferenceNode
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@OptIn(ExperimentalContracts::class)
@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE", "ERROR_IN_CONTRACT_DESCRIPTION")
private fun isInstanceType(node: Node): Boolean {
    contract {
        returns(true) implies (node is TypeReferenceNode)
    }

    return nullable {
        ensure(isTypeReferenceNode(node))

        val name = node.typeName
        ensure(isIdentifier(name))
        ensure(name.text == "InstanceType")
    } != null
}

private fun isTypeArgumentOfTypeWithTypeofBound(node: Node) = nullable {
    nullable {
        val typeReference = ensureNotNull(node.getParentOrNull())
        ensure(isTypeReferenceNode(typeReference))

        nullable {
            val typeName = typeReference.typeName
            ensure(isIdentifier(typeName))
            ensure(
                typeName.text == "InstanceType"

                        || typeName.text == "Server"
                        || typeName.text == "ServerOptions"
                        || typeName.text == "SecureServerOptions"
                        || typeName.text == "RequestListener"

                        || typeName.text == "Http2Server"
                        || typeName.text == "Http2SecureServer"
                        || typeName.text == "ServerHttp2Session"
            )
        } ?: nullable {
            val typeName = typeReference.typeName
            ensure(isQualifiedName(typeName))
            ensure(
                typeName.right.text == "ServerOptions"
                        || typeName.right.text == "RequestListener"
            )
        }
    } ?: nullable {
        val expressionWithTypeArguments = ensureNotNull(node.getParentOrNull())
        ensure(isExpressionWithTypeArguments(expressionWithTypeArguments))

        val expression = expressionWithTypeArguments.expression
        ensure(isIdentifier(expression))
        ensure(
            expression.text == "ServerSessionOptions"
                    || expression.text == "SecureServerSessionOptions"
        )
    }
} != null

val convertHttpTypeParameter = createPlugin { node, context, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

        ensure(
            sourceFileName.endsWith("http.d.ts")
                    || sourceFileName.endsWith("https.d.ts")
                    || sourceFileName.endsWith("http2.d.ts")
        )

        nullable {
            ensure(isTypeParameterDeclaration(node))

            ensureNotNull(
                nullable {
                    val classNode = ensureNotNull(node.getParentOrNull())
                    ensure(isClassDeclaration(classNode))
                    ensure(classNode.name?.text == "Server")
                } ?: nullable {
                    val interfaceNode = ensureNotNull(node.getParentOrNull())
                    ensure(isInterfaceDeclaration(interfaceNode))
                    ensure(
                        interfaceNode.name.text == "Server"
                                || interfaceNode.name.text == "ServerOptions"
                                || interfaceNode.name.text == "SecureServerOptions"
                                || interfaceNode.name.text == "Http2Server"
                                || interfaceNode.name.text == "Http2SecureServer"
                                || interfaceNode.name.text == "ServerHttp2Session"
                                || interfaceNode.name.text == "ServerSessionOptions"
                                || interfaceNode.name.text == "SecureServerSessionOptions"
                    )
                } ?: nullable {
                    val typeAlias = ensureNotNull(node.getParentOrNull())
                    ensure(isTypeAliasDeclaration(typeAlias))
                    ensure(typeAlias.name.text == "ServerOptions")
                } ?: nullable {
                    val function = ensureNotNull(node.getParentOrNull())
                    ensure(isFunctionDeclaration(function))
                    ensure(
                        function.name?.text == "createServer"
                                || function.name?.text == "createSecureServer"
                                || function.name?.text == "performServerHandshake"
                    )
                }
            )

            when {
                node.name.text == "Request" -> "Request : IncomingMessage"
                node.name.text == "Http1Request" -> "Http1Request : IncomingMessage"
                node.name.text == "Http2Request" -> "Http2Request : Http2ServerRequest"
                node.name.text == "Response" -> "Response : ServerResponse<*>"
                node.name.text == "Http1Response" -> "Http1Response : ServerResponse<*>"
                node.name.text == "Http2Response" -> "Http2Response : Http2ServerResponse<*>"
                else -> null
            }
        } ?: nullable {
            ensure(isTypeParameterDeclaration(node))

            val typeAlias = ensureNotNull(node.getParentOrNull())
            ensure(isTypeAliasDeclaration(typeAlias))
            ensure(typeAlias.name.text == "RequestListener")

            when {
                node.name.text == "Request" -> "Request /* : IncomingMessage */"
                node.name.text == "Response" -> "Response /* : ServerResponse<*> */"
                else -> null
            }
        } ?: nullable {
            ensure(isInstanceType(node))

            val firstTypeArgument = ensureNotNull(node.typeArguments?.asArray()?.getOrNull(0))

            render(firstTypeArgument)
        } ?: nullable {
            ensure(isIntersectionTypeNode(node))

            val firstType = ensureNotNull(node.types.asArray().getOrNull(0))
            ensure(isInstanceType(firstType))

            val firstTypeArgument = ensureNotNull(firstType.typeArguments?.asArray()?.getOrNull(0))

            render(firstTypeArgument)
        } ?: nullable {
            ensure(isTypeReferenceNode(node))

            val name = node.typeName
            ensure(isIdentifier(name))
            ensure(
                name.text == "Request"
                        || name.text == "Http1Request"
                        || name.text == "Http2Request"

                        || name.text == "Response"
                        || name.text == "Http1Response"
                        || name.text == "Http2Response"
            )

            ensure(!isTypeArgumentOfTypeWithTypeofBound(node))

            nullable {
                val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))
                val typeChecker = typeScriptService.program.getTypeChecker()

                val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(name))

                val typeParameterDeclarations = ensureNotNull(symbol.declarations)
                val typeParameterDeclaration = ensureNotNull(typeParameterDeclarations.find { isTypeParameterDeclaration(it) })

                ensureNotNull(
                    nullable {
                        val classNode = ensureNotNull(typeParameterDeclaration.getParentOrNull())
                        ensure(isClassDeclaration(classNode))
                        ensure(classNode.name?.text == "Server")
                    } ?: nullable {
                        val interfaceNode = ensureNotNull(typeParameterDeclaration.getParentOrNull())
                        ensure(isInterfaceDeclaration(interfaceNode))
                        ensure(
                            interfaceNode.name.text == "ServerOptions"
                                    || interfaceNode.name.text == "SecureServerOptions"
                                    || interfaceNode.name.text == "Http2Server"
                                    || interfaceNode.name.text == "Http2SecureServer"
                                    || interfaceNode.name.text == "ServerHttp2Session"
                                    || interfaceNode.name.text == "ServerSessionOptions"
                                    || interfaceNode.name.text == "SecureServerSessionOptions"
                        )
                    } ?: nullable {
                        val typeAlias = ensureNotNull(typeParameterDeclaration.getParentOrNull())
                        ensure(isTypeAliasDeclaration(typeAlias))
                        ensure(
                            typeAlias.name.text == "ServerOptions"
                                || typeAlias.name.text == "RequestListener"
                        )
                    } ?: nullable {
                        val function = ensureNotNull(typeParameterDeclaration.getParentOrNull())
                        ensure(isFunctionDeclaration(function))
                        ensure(
                            function.name?.text == "createServer"
                                    || function.name?.text == "createSecureServer"
                        )
                    }
                )

                "JsClass<${render(node)}>"
            }
        }
    }
}
