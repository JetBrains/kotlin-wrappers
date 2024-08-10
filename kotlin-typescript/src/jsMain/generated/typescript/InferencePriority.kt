// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

sealed external interface InferencePriority {
    companion object {
        val None: InferencePriority
        val NakedTypeVariable: InferencePriority
        val SpeculativeTuple: InferencePriority
        val SubstituteSource: InferencePriority
        val HomomorphicMappedType: InferencePriority
        val PartialHomomorphicMappedType: InferencePriority
        val MappedTypeConstraint: InferencePriority
        val ContravariantConditional: InferencePriority
        val ReturnType: InferencePriority
        val LiteralKeyof: InferencePriority
        val NoConstraints: InferencePriority
        val AlwaysStrict: InferencePriority
        val MaxValue: InferencePriority
        val PriorityImpliesCombination: InferencePriority
        val Circularity: InferencePriority
    }
}
