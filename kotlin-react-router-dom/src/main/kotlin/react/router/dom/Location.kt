@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

external interface Location {
    var hash: String
    var pathname: String
    var search: String
}
