package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature

val optionalParent = createPlugin { node, _, render ->
    nullable {
        ensure(isPropertySignature(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "parent")

        // TODO: check hierarchy (extends `Node`)
        val parent = ensureNotNull(node.parent)
        val hasNodeParent = if (isInterfaceDeclaration(parent)) {
            parent.name.text != "SelectionRange"
        } else true

        ensure(hasNodeParent)

        "${render(node)}?"
    }
}
