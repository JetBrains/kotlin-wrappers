@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

/**
 * Create a router and listen to history POP navigations
 */
external fun createRouter(init: RouterInit): Router
