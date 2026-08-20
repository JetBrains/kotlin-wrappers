package tanstack.virtual.core.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

// `readonly [number, "auto"] | readonly [number, "start" | "center" | "end"] | undefined`
val convertOffsetForIndexReturn = createPlugin { node, _, _ ->
    nullable {
        ensure(isUnionTypeNode(node))

        val types = node.types.asArray()

        val tuples = types.filter { type ->
            isTypeOperatorNode(type) && isTupleTypeNode(type.type)
        }
        ensure(tuples.size == 2)

        val hasUndefined = types.any { it.kind == SyntaxKind.UndefinedKeyword }
        ensure(types.size == tuples.size + (if (hasUndefined) 1 else 0))

        "js.array.Tuple2<Double, ScrollAlignment>" + (if (hasUndefined) "?" else "")
    }
}
