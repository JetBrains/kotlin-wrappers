@file:JsModule("@tanstack/react-router")

package tanstack.react.router

import js.objects.JsPlainObject
import tanstack.router.core.ParsedLocation

@JsPlainObject
external interface UseLocationOptions<T> {
    val select: (location: ParsedLocation) -> T
    val structuralSharing: Boolean?
}

/**
 * Read the current location from the router state with optional selection.
 * Useful for subscribing to just the pieces of location you care about.
 *
 * Options:
 * - `select`: Project the `location` object to a derived value
 * - `structuralSharing`: Enable structural sharing for stable references
 *
 * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/useLocationHook)
 *
 * @return The current location (or selected value).
 */
external fun useLocation(): ParsedLocation

external fun <T> useLocation(
    options: UseLocationOptions<T>,
): T
