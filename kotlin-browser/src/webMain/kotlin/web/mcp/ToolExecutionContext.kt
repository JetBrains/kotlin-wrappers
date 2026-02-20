package web.mcp

import js.promise.Promise
import js.promise.await
import web.experimental.ExperimentalWebApi
import kotlin.js.JsName

/**
 * Per-call execution context provided to tool handlers.
 */
@ExperimentalWebApi
external interface ToolExecutionContext {
    /**
     * Requests user input for the current tool call.
     *
     * This function is bound to the active tool call and should only be used
     * during execution of that call.
     */
    @JsName("elicitInput")
    fun elicitInputAsync(params: ElicitationParams): Promise<ElicitationResult>
}

@ExperimentalWebApi
suspend fun ToolExecutionContext.elicitInput(
    params: ElicitationParams,
): ElicitationResult =
    elicitInputAsync(params = params).await()
