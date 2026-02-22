@file:JsModule("@tanstack/router-core")

package tanstack.router.core.raw

import tanstack.router.core.NotFoundError

/**
 * Create a not-found error object recognized by TanStack Router.
 *
 * Throw this from loaders/actions to trigger the nearest `notFoundComponent`.
 * Use `routeId` to target a specific route's not-found boundary. If `throw`
 * is true, the error is thrown instead of returned.
 *
 * [API Docs](https://tanstack.com/router/latest/docs/router/framework/react/api/router/notFoundFunction)
 *
 * @param options Optional settings including `routeId`, `headers`, and `throw`.
 * @return A not-found error object that can be thrown or returned.
 */
@JsName("notFound")
internal external fun <T : NotFoundError> notFoundRaw(
    options: NotFoundError = definedExternally,
): T
