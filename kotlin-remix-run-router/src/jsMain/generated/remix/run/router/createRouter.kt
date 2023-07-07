@file:JsModule("@remix-run/router")

package remix.run.router

/**
 * Create a router and listen to history POP navigations
 */
external fun createRouter(init: RouterInit): Router
