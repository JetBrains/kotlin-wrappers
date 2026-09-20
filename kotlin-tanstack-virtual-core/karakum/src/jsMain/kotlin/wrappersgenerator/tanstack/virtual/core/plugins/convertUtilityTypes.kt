package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.asArray
import typescript.isIdentifier
import typescript.isTypeReferenceNode

// `Required<T>`
val convertUtilityTypes = createPlugin { node, _, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Required")

        val typeArgument = ensureNotNull(node.typeArguments?.asArray()?.singleOrNull())

        render(typeArgument)
    }
}
