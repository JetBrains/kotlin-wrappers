package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature

val convertImportMetaConflictingOverloads = createPlugin { node, _, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("lib.dom.d.ts"))

        ensure(isMethodSignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "resolve")

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "ImportMeta")

        ""
    }
}
