@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Given an existing StaticHandlerContext and an error thrown at render time,
 * provide an updated StaticHandlerContext suitable for a second SSR render
 */
external fun getStaticContextFromError(routes: js.core.ReadonlyArray<AgnosticDataRouteObject>, context: StaticHandlerContext, error: Any?): StaticHandlerContext
