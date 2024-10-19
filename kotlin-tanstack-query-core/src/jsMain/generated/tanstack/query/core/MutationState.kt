// Automatically generated - do not modify!

package tanstack.query.core

import web.time.EpochTimeStamp

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
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
