package typescript.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.asArray
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertUtilityTypes = createPlugin { node, _, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "NonNullable")

        val firstTypeArgument = ensureNotNull(node.typeArguments?.asArray()?.firstOrNull())

        "${render(firstTypeArgument)} & Any"
    }
}
