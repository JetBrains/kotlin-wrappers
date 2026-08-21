package tanstack.virtual.core.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

// `void | (() => void)`
val convertVoidCleanupUnion = createPlugin { node, _, render ->
    nullable {
        ensure(isUnionTypeNode(node))

        val types = node.types.asArray()
        ensure(types.size == 2)
        ensure(types.first().kind == SyntaxKind.VoidKeyword)

        var functionType = types.last()
        if (isParenthesizedTypeNode(functionType)) {
            functionType = functionType.type
        }
        ensure(isFunctionTypeNode(functionType))

        "${render(functionType)}?"
    }
}
