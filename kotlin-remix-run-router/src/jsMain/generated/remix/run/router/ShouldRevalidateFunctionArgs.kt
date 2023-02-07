package remix.run.router

import web.http.FormData
import web.url.URL


external interface ShouldRevalidateFunctionArgs {
    var currentUrl: URL
    var currentParams: Params
    var nextUrl: URL
    var nextParams: Params
    var formMethod: FormMethod?
    var formAction: String?
    var formEncType: FormEncType?
    var formData: FormData?
    var actionResult: DataResult?
    var defaultShouldRevalidate: Boolean
}

