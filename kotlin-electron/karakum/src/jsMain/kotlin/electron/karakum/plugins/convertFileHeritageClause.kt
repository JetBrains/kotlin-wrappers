package electron.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isHeritageClause
import typescript.isInterfaceDeclaration

val convertFileHeritageClause = createPlugin { node, _, _ ->
    nullable {
        ensure(isHeritageClause(node))

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "File")

        ""
    }
}
