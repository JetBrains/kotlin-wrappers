package remix.run.router

import web.url.URL


external interface ShouldRevalidateFunctionArgs {
    var currentUrl: URL
    var currentParams: Any /* AgnosticDataRouteMatch["params"] */
    var nextUrl: URL
    var nextParams: Any /* AgnosticDataRouteMatch["params"] */
    var formMethod: Any /* Submission["formMethod"] */?
    var formAction: Any /* Submission["formAction"] */?
    var formEncType: Any /* Submission["formEncType"] */?
    var formData: Any /* Submission["formData"] */?
    var actionResult: DataResult?
    var defaultShouldRevalidate: Boolean
}

