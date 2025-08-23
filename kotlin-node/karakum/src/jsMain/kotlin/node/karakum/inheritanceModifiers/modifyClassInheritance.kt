package node.karakum.inheritanceModifiers

import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import node.karakum.util.nullable
import typescript.Node
import typescript.isClassDeclaration

fun modifyClassInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

    ensure(isClassDeclaration(node))

    nullable {
        ensure(sourceFileName.endsWith("crypto.d.ts"))
        ensure(
            node.name?.text == "Cipheriv"
                    || node.name?.text == "Decipheriv"
        )

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("readline.d.ts"))
        ensure(node.name?.text == "Interface")

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("child_process.d.ts"))
        ensure(node.name?.text == "ChildProcess")

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("http.d.ts"))
        ensure(
            node.name?.text == "IncomingMessage"
                    || node.name?.text == "OutgoingMessage"
                    || node.name?.text == "ServerResponse"
                    || node.name?.text == "Agent"
                    || node.name?.text == "Server"
        )

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("http2.d.ts"))
        ensure(
            node.name?.text == "Http2ServerRequest"
                    || node.name?.text == "Http2ServerResponse"
        )

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("net.d.ts"))
        ensure(
            node.name?.text == "Server"
                    || node.name?.text == "Socket"
        )

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("stream.d.ts"))
        ensure(
            node.name?.text == "Stream"
                    || node.name?.text == "Readable"
                    || node.name?.text == "Writable"
                    || node.name?.text == "Duplex"
                    || node.name?.text == "Transform"
        )

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("tty.d.ts"))
        ensure(
            node.name?.text == "ReadStream"
                    || node.name?.text == "WriteStream"
        )

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("async_hooks.d.ts"))
        ensure(node.name?.text == "AsyncResource")

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("perf_hooks.d.ts"))
        ensure(node.name?.text == "PerformanceEntry")

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("vm.d.ts"))
        ensure(node.name?.text == "Module")

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("tls.d.ts"))
        ensure(node.name?.text == "Server")

        "open"
    } ?: nullable {
        ensure(sourceFileName.endsWith("v8.d.ts"))
        ensure(
            node.name?.text == "Serializer"
                    || node.name?.text == "Deserializer"
        )

        "open"
    }
}
