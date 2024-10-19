// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface SetStateAction<TData, TError> {
    val type: Type /* 'setState' */
    val state: QueryState<TData, TError> /* Partial */
    val setStateOptions: SetStateOptions?
}
