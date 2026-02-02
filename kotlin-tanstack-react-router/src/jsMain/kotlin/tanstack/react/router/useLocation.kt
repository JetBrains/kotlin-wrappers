@file:JsModule("@tanstack/react-router")

package tanstack.react.router

import tanstack.router.core.ParsedLocation

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
