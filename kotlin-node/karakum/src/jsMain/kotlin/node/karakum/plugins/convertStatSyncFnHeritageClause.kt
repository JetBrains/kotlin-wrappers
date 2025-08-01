package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isHeritageClause
import typescript.isInterfaceDeclaration

val convertStatSyncFnHeritageClause = createPlugin { node, _, _ ->
    nullable {
        ensure(isHeritageClause(node))

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "StatSyncFn")

        ""
    }
}
