package node.karakum.inheritanceModifiers

import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import node.karakum.util.nullable
import typescript.Node
import typescript.isInterfaceDeclaration
import typescript.isIntersectionTypeNode
import typescript.isTypeAliasDeclaration
import typescript.isTypeLiteralNode

fun modifyInterfaceInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

        ensure(isInterfaceDeclaration(node))

        nullable {
            ensure(sourceFileName.endsWith("fs.d.ts"))
            ensure(node.name.text == "ObjectEncodingOptions")

            ""
        } ?: nullable {
            ensure(sourceFileName.endsWith("net.d.ts"))
            ensure(
                node.name.text == "ServerOpts"
                        || node.name.text == "TcpSocketConnectOpts"
            )

            ""
        } ?: nullable {
            ensure(sourceFileName.endsWith("globals.d.ts"))
            ensure(
                node.name.text == "ErrnoException"
                        || node.name.text == "ReadableStream"
                        || node.name.text == "ReadWriteStream"
                        || node.name.text == "WritableStream"
                        || node.name.text == "RefCounted"
                        || node.name.text == "Module"
            )

            ""
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))
            ensure(node.name.text == "TransformOptions")

            ""
        } ?: nullable {
            ensure(sourceFileName.endsWith("async_hooks.d.ts"))
            ensure(node.name.text == "AsyncResourceOptions")

            ""
        } ?: nullable {
            ensure(sourceFileName.endsWith("tls.d.ts"))
            ensure(
                node.name.text == "ConnectionOptions"
                        || node.name.text == "SecureContextOptions"
                        || node.name.text == "TlsOptions"
            )

            ""
        } ?: nullable {
            ensure(sourceFileName.endsWith("http.d.ts"))
            ensure(
                node.name.text == "IncomingHttpHeaders"
                        || node.name.text == "AgentOptions"
                        || node.name.text == "RequestOptions"
                        || node.name.text == "ServerOptions"
            )

            ""
        } ?: nullable {
            ensure(sourceFileName.endsWith("tls.d.ts"))
            ensure(
                node.name.text == "ConnectionOptions"
                        || node.name.text == "SecureContextOptions"
                        || node.name.text == "TlsOptions"
            )

            ""
        }
    } ?: nullable {
        ensure(
            isInterfaceDeclaration(node)
                    || isTypeAliasDeclaration(node)
                    || isTypeLiteralNode(node)
                    || isIntersectionTypeNode(node)
        )

        "sealed"
    }
}
