@file:JsModule("react-router")

package react.router

import remix.run.router.To

/**
 * Returns the full href for the given "to" value. This is useful for building
 * custom links that are also accessible and preserve right-click behavior.
 *
 * @see https://reactrouter.com/hooks/use-href
 */
external fun useHref(to: To, options: UseHrefOptions = definedExternally): String
