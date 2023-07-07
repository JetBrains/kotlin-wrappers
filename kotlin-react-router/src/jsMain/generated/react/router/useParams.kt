@file:JsModule("react-router")

package react.router

import remix.run.router.Params

/**
 * Returns an object of key/value pairs of the dynamic params from the current
 * URL that were matched by the route path.
 *
 * @see https://reactrouter.com/hooks/use-params
 */
external fun useParams(): Params
