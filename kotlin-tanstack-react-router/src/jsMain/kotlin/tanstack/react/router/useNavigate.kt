@file:JsModule("@tanstack/react-router")

package tanstack.react.router

import js.objects.JsPlainObject
import tanstack.router.core.RoutePath
import tanstack.router.core.UseNavigateResult

@JsPlainObject
external interface UseNavigateOptions {
    val from: RoutePath
}

/**
 * Imperative navigation hook.
 *
 * Returns a stable `navigate(options)` function to change the current location
 * programmatically. Prefer the `Link` component for user-initiated navigation,
 * and use this hook from effects, callbacks, or handlers where imperative
 * navigation is required.
 *
 * Options:
 * - `from`: Optional route base used to resolve relative `to` paths.
 *
 * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/useNavigateHook)
 *
 * @return A function that accepts `NavigateOptions`.
 */
external fun useNavigate(
    options: UseNavigateOptions = definedExternally,
): UseNavigateResult
