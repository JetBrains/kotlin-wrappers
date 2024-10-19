// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
external interface FetchOptions<TData> {
    var cancelRefetch: Boolean
    var meta: FetchMeta
    var initialPromise: Promise<TData>
}
