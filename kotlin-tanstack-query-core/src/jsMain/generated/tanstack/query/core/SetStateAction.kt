// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface SetStateAction<TData, TError> {
    var type: Type /* 'setState' */
    var state: QueryState<TData, TError> /* Partial */
    var setStateOptions: SetStateOptions?
}
