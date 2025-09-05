package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import arrow.core.raise.nullable
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isMethodDeclaration
import typescript.isUnionTypeNode

val convertCallTrackerConflictingOverloads = createPlugin { node, _, _ ->
    nullable {
        ensure(isMethodDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "calls")

        ensureNotNull(node.typeParameters)

        val returnType = ensureNotNull(node.type)
        ensure(isUnionTypeNode(returnType))

        val classNode = ensureNotNull(node.getParentOrNull())
        ensure(isClassDeclaration(classNode))
        ensure(classNode.name?.text == "CallTracker")

        ""
    }
}
