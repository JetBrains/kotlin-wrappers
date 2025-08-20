package node.karakum.inheritanceModifiers

import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import node.karakum.util.nullable
import typescript.Node
import typescript.SyntaxKind
import typescript.asArray
import typescript.isClassDeclaration
import typescript.isFunctionTypeNode
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodDeclaration
import typescript.isMethodSignature
import typescript.isTypeReferenceNode
import typescript.isUnionTypeNode

private fun isEventEmitterMethodName(name: String) =
    name == "on"
            || name == "once"
            || name == "emit"
            || name == "addListener"
            || name == "removeListener"
            || name == "prependListener"
            || name == "prependOnceListener"

private fun isGenericEventEmitterSignature(
    context: InheritanceModifierContext,
    symbolSignature: Boolean = true,
) = nullable {
    val firstParameterType = ensureNotNull(context.signature?.firstOrNull()?.parameter?.type)

    nullable {
        ensure(firstParameterType.kind == SyntaxKind.StringKeyword)
    } ?: nullable {
        ensure(isUnionTypeNode(firstParameterType))

        val firstParameterTypeTypesFirstType = ensureNotNull(firstParameterType.types.asArray().firstOrNull())
        ensure(firstParameterTypeTypesFirstType.kind == SyntaxKind.StringKeyword)

        val firstSignatureType = ensureNotNull(context.signature?.firstOrNull()?.type)
        ensure(symbolSignature || firstSignatureType.kind != SyntaxKind.SymbolKeyword)
    }
} != null

fun modifyMethodInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

    nullable {
        ensure(isMethodDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))

        nullable { // open
            ensure(sourceFileName.endsWith("net.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Server")

            ensure(isGenericEventEmitterSignature(context))

            "open"
        } ?: nullable {
            ensure(sourceFileName.endsWith("http.d.ts"))

            ensure(name.text == "setTimeout")

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "OutgoingMessage")

            "open"
        } ?: nullable {
            ensure(sourceFileName.endsWith("http.d.ts"))

            ensure(
                name.text == "closeAllConnections"
                        || name.text == "closeIdleConnections"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Server")

            "open"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(
                name.text == "_destroy"
                        || name.text == "_construct"
                        || name.text == "destroy"
                        || name.text == "read"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Readable")

            "open"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(
                name.text == "_write"
                        || name.text == "_writev"
                        || name.text == "_destroy"
                        || name.text == "_final"
                        || name.text == "write"
                        || name.text == "setDefaultEncoding"
                        || (name.text == "end" && node.parameters.asArray().size > 1)
                        || name.text == "cork"
                        || name.text == "uncork"
                        || name.text == "_construct"
                        || name.text == "destroy"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Writable")

            "open"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(
                classNode.name?.text == "Readable"
                        || classNode.name?.text == "Writable"
            )

            ensure(isGenericEventEmitterSignature(context))

            "open"
        } ?: nullable {
            ensure(sourceFileName.endsWith("readline.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Interface")

            ensure(isGenericEventEmitterSignature(context))

            "open"
        }  ?: nullable {
            ensure(sourceFileName.endsWith("perf_hooks.d.ts"))

            ensure(name.text == "toJSON")

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "PerformanceEntry")

            "open"
        } ?: nullable { // override
            ensure(sourceFileName.endsWith("tls.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(
                classNode.name?.text == "Server"
                        || classNode.name?.text == "TLSSocket"
            )

            ensure(isGenericEventEmitterSignature(context))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("fs.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(
                classNode.name?.text == "ReadStream"
                        || classNode.name?.text == "WriteStream"
            )

            ensure(isGenericEventEmitterSignature(context))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("https.d.ts"))

            ensure(
                name.text == "closeAllConnections"
                        || name.text == "closeIdleConnections"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Server")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("http.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(
                classNode.name?.text == "Server"
                        || classNode.name?.text == "ClientRequest"
            )

            ensure(isGenericEventEmitterSignature(context))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("http.d.ts"))

            ensure(name.text == "setTimeout")

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "ClientRequest")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("http.d.ts"))

            ensure(name.text == "destroy")

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "IncomingMessage")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("net.d.ts"))

            ensureNotNull(
                nullable {
                    ensure(
                        name.text == "write"
                                || name.text == "end"
                    )

                    ensure(
                        nullable {
                            ensure(context.signature?.size == 3)

                            val firstParameterType = ensureNotNull(context.signature?.firstOrNull()?.type)
                            ensure(isTypeReferenceNode(firstParameterType))

                            val typeName = firstParameterType.typeName
                            ensure(isIdentifier(typeName))
                            ensure(typeName.text == "Uint8Array")
                        } == null
                    )
                } ?: nullable {
                    ensure(
                        name.text == "setEncoding"
                                || name.text == "pause"
                                || name.text == "resume"
                    )
                }
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Socket")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("net.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Socket")

            ensure(isGenericEventEmitterSignature(context))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(
                name.text == "setEncoding"
                        || name.text == "pause"
                        || name.text == "resume"
                        || name.text == "isPaused"
                        || name.text == "unpipe"
                        || name.text == "wrap"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Readable")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(name.text == "end")
            ensure(context.signature?.size == 1)

            val firstParameterType = ensureNotNull(context.signature?.firstOrNull()?.type)
            ensure(isFunctionTypeNode(firstParameterType))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Writable")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(
                name.text == "_write"
                        || name.text == "_writev"
                        || name.text == "_destroy"
                        || name.text == "_final"
                        || name.text == "write"
                        || name.text == "setDefaultEncoding"
                        || name.text == "end"
                        || name.text == "cork"
                        || name.text == "uncork"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Duplex")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Duplex")

            ensure(isGenericEventEmitterSignature(context))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("tty.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "WriteStream")

            ensure(isGenericEventEmitterSignature(context))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("util.d.ts"))

            ensure(name.text == "toString")

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "MIMEType")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("test.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "TestsStream")

            ensure(isGenericEventEmitterSignature(context))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("crypto.d.ts"))

            ensure(name.text == "toString")

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "X509Certificate")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("http2.d.ts"))

            ensure(name.text == "end")

            ensure(
                nullable {
                    ensure(context.signature?.size == 3)

                    val firstParameterType = ensureNotNull(context.signature?.firstOrNull()?.type)
                    ensure(isTypeReferenceNode(firstParameterType))

                    val typeName = firstParameterType.typeName
                    ensure(isIdentifier(typeName))
                    ensure(typeName.text == "Uint8Array")
                } == null
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Http2ServerResponse")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("http2.d.ts"))

            ensure(name.text == "read")

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Http2ServerRequest")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("http2.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(
                classNode.name?.text == "Http2ServerRequest"
                        || classNode.name?.text == "Http2ServerResponse"
            )

            ensure(isGenericEventEmitterSignature(context))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("https.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Server")

            ensure(isGenericEventEmitterSignature(context))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("repl.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "REPLServer")

            ensure(isGenericEventEmitterSignature(context))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("perf_hooks.d.ts"))

            ensure(name.text == "toJSON")

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "PerformanceResourceTiming")

            "override"
        }
    } ?: nullable {
        ensure(isMethodSignature(node))

        val name = node.name
        ensure(isIdentifier(name))

        nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(
                name.text == "construct"
                        || name.text == "read"
                        || name.text == "write"
                        || name.text == "writev"
                        || name.text == "final"
                        || name.text == "destroy"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(
                interfaceNode.name.text == "DuplexOptions"
                        || interfaceNode.name.text == "TransformOptions"
            )

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("globals.d.ts"))

            ensure(name.text == "toString")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "CallSite")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("http2.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(
                interfaceNode.name.text == "ClientHttp2Session"
                        || interfaceNode.name.text == "ClientHttp2Stream"
                        || interfaceNode.name.text == "Http2Stream"
                        || interfaceNode.name.text == "ServerHttp2Session"
            )

            ensure(isGenericEventEmitterSignature(context))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("http2.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(
                interfaceNode.name.text == "Http2SecureServer"
                        || interfaceNode.name.text == "Http2Server"
            )

            ensure(isGenericEventEmitterSignature(context, symbolSignature = name.text == "emit"))

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("test.d.ts"))

            ensure(isEventEmitterMethodName(name.text))

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "TestsStream")

            ensure(isGenericEventEmitterSignature(context))

            "override"
        }
    }
}
