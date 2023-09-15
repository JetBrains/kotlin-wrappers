@file:JsModule("@remix-run/router")

package remix.run.router


external fun convertRouteMatchToUiMatch(match: AgnosticDataRouteMatch, loaderData: RouteData): UIMatch<*, *>
