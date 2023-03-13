package remix.run.router

import web.http.FormData


sealed external interface FetcherStatesLoading<TData> {
    var state: String
    var formMethod: FormMethod?
    var formAction: String?
    var formEncType: FormEncType?
    var formData: FormData?
    var data: TData?
    var String: Boolean?
}
