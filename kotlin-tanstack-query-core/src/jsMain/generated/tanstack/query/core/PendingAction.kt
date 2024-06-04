// Automatically generated - do not modify!

package tanstack.query.core

external interface PendingAction<TVariables, TContext> {
    var type: Type /* 'pending' */
    var isPaused: Boolean
    var variables: TVariables
    var context: TContext
}
