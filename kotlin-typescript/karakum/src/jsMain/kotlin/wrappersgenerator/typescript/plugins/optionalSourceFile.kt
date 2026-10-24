package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature

val optionalSourceFile = createPlugin { node, _, render ->
    nullable {
        ensure(isMethodSignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "getSourceFile")

        val parent = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(parent))
        ensure(parent.name.text == "Node")

        "${render(node)}?"
    }
}
