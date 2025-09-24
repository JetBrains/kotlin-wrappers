package semver.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.isIdentifier
import typescript.isQualifiedName
import typescript.isTypeReferenceNode

val convertIdentifierBasePackage = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isQualifiedName(typeName))

        val left = typeName.left
        ensure(isIdentifier(left))
        ensure(left.text == "inc")

        ensure(typeName.right.text == "IdentifierBase")

        "IdentifierBase"
    }
}
