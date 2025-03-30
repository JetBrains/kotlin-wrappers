// Automatically generated - do not modify!

@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
)

package csstype

interface ExperimentalPseudosRuleBuilder<T : Any> : RuleBuilder<T> {
    inline fun viewTransitionGroup(
        block: T.() -> Unit,
    ) {
        "::view-transition-group"(block)
    }

    inline fun viewTransitionImagePair(
        block: T.() -> Unit,
    ) {
        "::view-transition-image-pair"(block)
    }

    inline fun viewTransitionNew(
        block: T.() -> Unit,
    ) {
        "::view-transition-new"(block)
    }

    inline fun viewTransitionOld(
        block: T.() -> Unit,
    ) {
        "::view-transition-old"(block)
    }
}
