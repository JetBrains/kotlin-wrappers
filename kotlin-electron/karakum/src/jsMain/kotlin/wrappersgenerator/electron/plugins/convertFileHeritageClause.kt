package wrappersgenerator.electron.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isHeritageClause
import typescript.isInterfaceDeclaration

val convertFileHeritageClause = createPlugin { node, _, _ ->
    nullable {
        ensure(isHeritageClause(node))

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "File")

        ""
    }
}
