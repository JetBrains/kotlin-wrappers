package remix.run.router

import web.http.FormData


sealed external interface FetcherStatesLoading<TData> {
    var state: String /* "loading" */
    var formMethod: (Any /* Submission["formMethod"] | undefined */)?
    var formAction: (String)?
    var formEncType: (FormEncType)?
    var text: String?
    var formData: FormData?
    var json: JsonValue?
    var data: TData?
    /* " _hasFetcherDoneAnything "?: boolean; */
}
