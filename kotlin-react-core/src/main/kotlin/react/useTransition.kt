@file:JsModule("react")
@file:JsNonModule

package react

// Transitions (18.0+)
external fun startTransition(
    scope: TransitionFunction,
)

/**
 * Available since 18.0
 *
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
external fun useTransition(): TransitionInstance
