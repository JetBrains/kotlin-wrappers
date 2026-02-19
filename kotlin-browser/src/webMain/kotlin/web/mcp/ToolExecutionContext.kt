package web.mcp

import web.experimental.ExperimentalWebApi

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
    // TODO: support
    // fun elicitInput(params: ElicitationParams): Promise<ElicitationResult>
}
