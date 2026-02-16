package tanstack.router.core

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AssetFnContextOptions {
    val ssr: SSROptions?
    val matches: ReadonlyArray<RouteMatch>
    val match: RouteMatch
    val params: Params
    val loaderData: LoaderData?
}
