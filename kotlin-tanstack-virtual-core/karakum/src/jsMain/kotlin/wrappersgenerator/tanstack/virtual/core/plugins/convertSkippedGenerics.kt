package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.SyntaxKind
import typescript.asArray
import typescript.isTypeReferenceNode

// `Virtualizer<T, any>` / `Virtualizer<any, T>`
val convertSkippedGenerics = createPlugin { node, _, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeArguments = ensureNotNull(node.typeArguments?.asArray())
        ensure(typeArguments.any { it.kind == SyntaxKind.AnyKeyword })

        val arguments = typeArguments.map { argument ->
            if (argument.kind == SyntaxKind.AnyKeyword) "*" else render(argument)
        }

        "${render(node.typeName)}<${arguments.joinToString(", ")}>"
    }
}
