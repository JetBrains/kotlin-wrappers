package tanstack.virtual.core.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isTypeReferenceNode

val convertSkippedGenerics = createPlugin { node, _, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Virtualizer")
        ensure(node.typeArguments?.asArray()?.size == 2)

        val firstArgument = ensureNotNull(node.typeArguments?.asArray()?.first())
        val secondArgument = ensureNotNull(node.typeArguments?.asArray()?.last())
        ensure(secondArgument.kind == SyntaxKind.AnyKeyword)

        "${render(node.typeName)}<${render(firstArgument)}, *>"
    }
}
