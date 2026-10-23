package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.*

// `readonly [number, "auto"] | readonly [number, "start" | "center" | "end"] | undefined`
val convertOffsetForIndexReturn = createPlugin { node, _, _ ->
    nullable {
        ensure(isUnionTypeNode(node))

        val (tuples, others) = node.types.asArray().partition(::isOffsetTuple)

        ensure(tuples.size == 2)
        ensure(others.size <= 1)
        ensure(others.all { it.kind == SyntaxKind.UndefinedKeyword })

        "js.array.Tuple2<Double, ScrollAlignment>${if (others.isNotEmpty()) "?" else ""}"
    }
}

// `readonly [number, "auto"]`
private fun isOffsetTuple(type: TypeNode): Boolean {
    if (!isTypeOperatorNode(type)) return false

    val tuple = type.type
    if (!isTupleTypeNode(tuple)) return false

    val elements = tuple.elements.asArray()
    return elements.size == 2 && elements[0].kind == SyntaxKind.NumberKeyword
}
