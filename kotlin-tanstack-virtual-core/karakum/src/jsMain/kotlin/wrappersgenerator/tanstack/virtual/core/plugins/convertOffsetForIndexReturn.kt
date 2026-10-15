package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

// `readonly [number, "auto"] | readonly [number, "start" | "center" | "end"] | undefined`
val convertOffsetForIndexReturn = createPlugin { node, _, _ ->
    nullable {
        ensure(isUnionTypeNode(node))

        val (tuples, others) = node.types.asArray().partition { type ->
            isTypeOperatorNode(type) && isTupleTypeNode(type.type)
        }

        ensure(tuples.size == 2)
        ensure(others.size <= 1)
        ensure(others.all { it.kind == SyntaxKind.UndefinedKeyword })

        "js.array.Tuple2<Double, ScrollAlignment>${if (others.isNotEmpty()) "?" else ""}"
    }
}
