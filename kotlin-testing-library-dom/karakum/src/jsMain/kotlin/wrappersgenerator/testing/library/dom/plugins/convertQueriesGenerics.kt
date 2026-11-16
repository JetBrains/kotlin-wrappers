package wrappersgenerator.testing.library.dom.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isTypeParameterDeclaration
import typescript.ast.`is`.isTypeReferenceNode

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
