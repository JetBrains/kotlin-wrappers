package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isClassDeclaration
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isMethodDeclaration
import typescript.ast.`is`.isUnionTypeNode

val convertCallTrackerConflictingOverloads = createPlugin { node, _, _ ->
    nullable {
        ensure(isMethodDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text == "calls")

        ensureNotNull(node.typeParameters)

        val returnType = ensureNotNull(node.type)
        ensure(isUnionTypeNode(returnType))

        val classNode = ensureNotNull(node.parent)
        ensure(isClassDeclaration(classNode))
        ensure(classNode.name?.text == "CallTracker")

        ""
    }
}
