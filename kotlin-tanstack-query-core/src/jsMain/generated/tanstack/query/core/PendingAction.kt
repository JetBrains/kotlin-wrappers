// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface PendingAction<TVariables, TContext> {
    val type: Type /* 'pending' */
    val isPaused: Boolean
    val variables: TVariables?
    val context: TContext?
}
