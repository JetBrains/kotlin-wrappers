package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

val convertObjectParam = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "object")

        val parameter = ensureNotNull(node.parent)
        ensure(isParameter(parameter))

        val method = ensureNotNull(parameter.parent)
        ensure(isMethodSignature(method))

        val classNode = ensureNotNull(method.parent)
        ensure(isInterfaceDeclaration(classNode))
        ensure(classNode.name.text == "MockTracker")

        "target"
    } ?: nullable {
        ensure(isIdentifier(node))
        ensure(
            node.text == "object"
                    || node.text == "val"
        )

        nullable {
            val parameter = ensureNotNull(node.parent)
            ensure(isParameter(parameter))

            "value"
        } ?: nullable {
            val typePredicate = ensureNotNull(node.parent)
            ensure(isTypePredicateNode(typePredicate))
            ensure(typePredicate.parameterName === node)

            "value"
        }
    }
}
