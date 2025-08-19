package node.karakum.inheritanceModifiers

import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import node.karakum.util.nullable
import typescript.Node
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertyDeclaration
import typescript.isPropertySignature
import typescript.isTypeAliasDeclaration

fun modifyPropertyInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

    nullable {
        ensure(isPropertyDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))

        nullable { // open
            ensure(sourceFileName.endsWith("child_process.d.ts"))

            ensure(
                name.text == "stdin"
                        || name.text == "stdout"
                        || name.text == "stderr"
                        || name.text == "stdio"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "ChildProcess")

            "open"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(
                name.text == "closed"
                        || name.text == "errored"
                        || name.text == "destroyed"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Readable")

            "open"
        } ?: nullable {
            ensure(sourceFileName.endsWith("stream.d.ts"))

            ensure(
                name.text == "writableEnded"
                        || name.text == "writableFinished"
                        || name.text == "writableHighWaterMark"
                        || name.text == "writableLength"
                        || name.text == "writableObjectMode"
                        || name.text == "writableCorked"
                        || name.text == "writableNeedDrain"
                        || name.text == "closed"
                        || name.text == "errored"
                        || name.text == "destroyed"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "Writable")

            "open"
        } ?: nullable {
            ensure(sourceFileName.endsWith("perf_hooks.d.ts"))

            ensure(
                name.text == "duration"
                        || name.text == "entryType"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "PerformanceEntry")

            "open"
        } ?: nullable { // override
            ensure(sourceFileName.endsWith("diagnostics_channel.d.ts"))

            ensure(
                name.text == "start"
                        || name.text == "end"
                        || name.text == "asyncStart"
                        || name.text == "asyncEnd"
                        || name.text == "error"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "TracingChannel")

            "override"
        }
    } ?: nullable {
        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))

        nullable {
            ensure(sourceFileName.endsWith("child_process.d.ts"))

            ensure(name.text == "code")

            val typeAlias = node
                .getParentOrNull() // TypeLiteral
                ?.getParentOrNull() // IntersectionType
                ?.getParentOrNull() // TypeAliasDeclaration
                .let { ensureNotNull(it) }
            ensure(isTypeAliasDeclaration(typeAlias))
            ensure(typeAlias.name.text == "ExecFileException")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("https.d.ts"))

            ensure(name.text == "rejectUnauthorized")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "AgentOptions")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("test.d.ts"))

            ensure(name.text == "cause")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "TestError")

            "override"
        } ?: nullable {
            ensure(sourceFileName.endsWith("readline/promises.d.ts"))

            ensure(name.text == "completer")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ReadLineOptions")

            "override"
        }
    }
}
