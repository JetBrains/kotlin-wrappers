// Automatically generated - do not modify!

package tanstack.query.core

external interface MutationFailedAction<TError> {
    var type: Type /* 'failed' */
    var failureCount: Int
    var error: TError?
}
