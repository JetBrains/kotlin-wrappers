package testing.library.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isIdentifier
import typescript.isIntersectionTypeNode
import typescript.isTypeReferenceNode
import typescript.isVariableDeclaration

val convertFireEvent = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "fireEvent")

        val variable = ensureNotNull(node.getParentOrNull())
        ensure(isVariableDeclaration(variable))

        "fireEventRaw"
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val name = node.typeName
        ensure(isIdentifier(name))
        ensure(name.text == "FireObject")

        val intersection = ensureNotNull(node.getParentOrNull())
        ensure(isIntersectionTypeNode(intersection))

        val variable = ensureNotNull(intersection.getParentOrNull())
        ensure(isVariableDeclaration(variable))

        val variableName = variable.name
        ensure(isIdentifier(variableName))
        ensure(variableName.text == "fireEvent")

        ""
    }
}
