package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.asArray
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature

val convertProcessConflictingOverloads = createPlugin { node, _, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("process.d.ts"))

        ensure(isMethodSignature(node))
        ensure(node.parameters.asArray().size < 4)

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "send")

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "Process")

        ""
    }
}
