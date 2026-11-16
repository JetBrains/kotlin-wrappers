package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isTypeReferenceNode

// `Required<T>`
val convertUtilityTypes = createPlugin { node, _, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Required")

        val typeArgument = ensureNotNull(node.typeArguments?.singleOrNull())

        render(typeArgument)
    }
}
