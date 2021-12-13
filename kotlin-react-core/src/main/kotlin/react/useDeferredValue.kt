@file:JsModule("react")
@file:JsNonModule

package react

/**
 * Available since 18.0
 *
 * @see <a href="https://reactjs.org/docs/concurrent-mode-reference.html#usedeferredvalue">Online Documentation</a>
 */
external fun <T> useDeferredValue(
    value: T,
): T
