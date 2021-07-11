@file:JsModule("react")
@file:JsNonModule

package react

// Transitions (18.0+)
external fun startTransition(
    scope: TransitionFunction,
)

external fun useTransition(
    config: SuspenseConfig = definedExternally,
): TransitionInstance
