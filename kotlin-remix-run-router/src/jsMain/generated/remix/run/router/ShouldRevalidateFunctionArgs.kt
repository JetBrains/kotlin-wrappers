package remix.run.router

import web.url.URL


sealed external interface ShouldRevalidateFunctionArgs {
    var currentUrl: URL
    var currentParams: Params
    var nextUrl: URL
    var nextParams: Params
    var formMethod: (FormMethod)?
    var formAction: (String)?
    var formEncType: (FormEncType)?
    var text: String?
    var formData: Any?
    var json: JsonValue?
    var actionResult: DataResult?
    var defaultShouldRevalidate: Boolean
}
