package testing.library.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

val convertQueriesGenerics = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeParameterDeclaration(node))
        ensure(node.name.text == "Q")

        val constraint = ensureNotNull(node.constraint)
        ensure(isTypeReferenceNode(constraint))

        val constraintTypeName = constraint.typeName
        ensure(isIdentifier(constraintTypeName))
        ensure(constraintTypeName.text == "Queries")

        // skip
        ""
    }
}
