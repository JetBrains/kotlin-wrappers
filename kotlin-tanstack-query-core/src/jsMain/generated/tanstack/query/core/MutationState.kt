// Automatically generated - do not modify!

package tanstack.query.core

import js.core.EpochTimeStamp

external interface MutationState<TData, TError, TVariables, TContext> {
    val context: TContext?
    val data: TData?
    val error: TError?
    val failureCount: Int
    val failureReason: TError?
    val isPaused: Boolean
    val status: MutationStatus
    val variables: TVariables?
    val submittedAt: EpochTimeStamp
}
