package tanstack.router.core

import js.errors.JsErrorLike
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import web.abort.AbortController
import web.time.EpochTimeStamp

@JsPlainObject
external interface RouteMatch {
    val id: String
    val routeId: RouteId
    val fullPath: RoutePath
    val index: Int
    val pathname: String
    val params: Params
    val status: String /* 'pending' | 'success' | 'error' | 'redirected' | 'notFound' */
    val isFetching: Any /* false | 'beforeLoad' | 'loader' */
    val error: JsErrorLike?
    val paramsError: JsErrorLike?
    val searchError: JsErrorLike?
    val updatedAt: EpochTimeStamp
    val loaderData: LoaderData?
    val context: Context?
    val search: Search
    val fetchCount: Int
    val abortController: AbortController
    val cause: Cause
    val loaderDeps: LoaderDeps
    val preload: Boolean
    val invalid: Boolean
    val headers: ReadonlyRecord<String, String>?
    val globalNotFound: Boolean?
    val staticData: Any /* StaticDataRouteOption */

    /** This attribute is not reactive */
    val ssr: SSROption?
}
