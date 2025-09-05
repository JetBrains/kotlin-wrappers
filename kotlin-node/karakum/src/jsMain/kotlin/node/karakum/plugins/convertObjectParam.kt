package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature
import typescript.isParameter
import typescript.isTypePredicateNode

val convertObjectParam = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "object")

        val parameter = ensureNotNull(node.getParentOrNull())
        ensure(isParameter(parameter))

        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isMethodSignature(method))

        val classNode = ensureNotNull(method.getParentOrNull())
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
            val parameter = ensureNotNull(node.getParentOrNull())
            ensure(isParameter(parameter))

            "value"
        } ?: nullable {
            val typePredicate = ensureNotNull(node.getParentOrNull())
            ensure(isTypePredicateNode(typePredicate))
            ensure(typePredicate.parameterName === node)

            "value"
        }
    }
}
