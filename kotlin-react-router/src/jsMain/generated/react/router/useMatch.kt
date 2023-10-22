@file:JsModule("react-router")

package react.router

import remix.run.router.PathMatch
import remix.run.router.PathPattern

/**
 * Returns a PathMatch object if the given pattern matches the current URL.
 * This is useful for components that need to know "active" state, e.g.
 * `<NavLink>`.
 *
 * @see https://reactrouter.com/hooks/use-match
 */
external fun useMatch(pattern: PathPattern): PathMatch?

external fun useMatch(pattern: String): PathMatch?
