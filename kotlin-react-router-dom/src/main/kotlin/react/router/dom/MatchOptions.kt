@file:JsModule("react-router-dom")
@file:JsNonModule

package react.router.dom

import kotlinext.js.ReadonlyArray

external interface MatchOptions {
    var path: ReadonlyArray<String>
    var exact: Boolean
    var strict: Boolean
    var sensitive: Boolean
}
