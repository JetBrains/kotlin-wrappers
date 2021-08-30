@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

external interface Match {
    var isExact: Boolean
    var url: String
    var path: String
    var params: Params
}
