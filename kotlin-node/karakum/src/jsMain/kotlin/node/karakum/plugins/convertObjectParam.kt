package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isMethodDeclaration
import typescript.isParameter
import typescript.isTypePredicateNode

val convertObjectParam = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))
        ensure(node.text == "object")

        val parameter = ensureNotNull(node.getParentOrNull())
        ensure(isParameter(parameter))

        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isMethodDeclaration(method))

        val classNode = ensureNotNull(method.getParentOrNull())
        ensure(isClassDeclaration(classNode))
        ensure(classNode.name?.text == "MockTracker")

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
