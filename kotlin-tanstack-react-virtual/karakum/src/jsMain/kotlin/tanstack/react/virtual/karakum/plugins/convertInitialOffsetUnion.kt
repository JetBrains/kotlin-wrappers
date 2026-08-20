package tanstack.react.virtual.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

// `number | (() => number)`
val convertInitialOffsetUnion = createPlugin { node, _, _ ->
    nullable {
        ensure(isUnionTypeNode(node))

        val types = node.types.asArray()
        ensure(types.size == 2)
        ensure(types.first().kind == SyntaxKind.NumberKeyword)

        var functionType = types.last()
        if (isParenthesizedTypeNode(functionType)) {
            functionType = functionType.type
        }
        ensure(isFunctionTypeNode(functionType))
        ensure(functionType.parameters.asArray().isEmpty())
        ensure(functionType.type.kind == SyntaxKind.NumberKeyword)

        "Double"
    }
}
