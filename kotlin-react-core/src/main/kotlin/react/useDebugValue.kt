@file:JsModule("react")
@file:JsNonModule

package react

/**
 * Available from 16.8
 *
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
external fun <T : Any> useDebugValue(
    value: T,
    format: (value: T) -> Any = definedExternally,
)
