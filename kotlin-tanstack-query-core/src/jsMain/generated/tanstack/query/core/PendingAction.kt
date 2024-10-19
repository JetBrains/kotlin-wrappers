// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface PendingAction<TVariables, TContext> {
    var type: Type /* 'pending' */
    var isPaused: Boolean
    var variables: TVariables?
    var context: TContext?
}
