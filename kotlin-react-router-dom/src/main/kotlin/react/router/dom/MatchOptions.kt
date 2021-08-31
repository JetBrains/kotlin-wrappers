package react.router.dom

import kotlinext.js.ReadonlyArray

external interface ExtraMatchOptions {
    var exact: Boolean
    var strict: Boolean
    var sensitive: Boolean
}

external interface MatchOptions : ExtraMatchOptions {
    var path: ReadonlyArray<String>
}
