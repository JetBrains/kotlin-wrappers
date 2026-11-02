// Automatically generated - do not modify!

package electron.core

external interface LocalAIHandler {
// Docs: https://electronjs.org/docs/api/local-ai-handler
    /**
     * Sets the handler for new Prompt API binding requests from the renderer process.
     * This happens once per pair of `webContentsId` and `securityOrigin`. Returning
     * `null` from the handler will reject the creation of a new Prompt API session in
     * the renderer. If you want to invalidate existing Prompt API sessions, clear the
     * local AI handler for the session using `ses.registerLocalAIHandler(null)`.
     *
     * > [!NOTE] If a renderer calls the Prompt API before `setPromptAPIHandler()` has
     * been called, the request is queued. Once the handler is set, all queued requests
     * are flushed. If too many requests are queued, the oldest pending request is
     * dropped and pending promises in the renderer will be rejected. To avoid this, be
     * sure to call `setPromptAPIHandler()` as early as possible.
     *
     * @experimental
     */
    fun setPromptAPIHandler(
        promptAPIHandler: (details: PromptAPIHandlerDetails) -> (Any /* typeof LanguageModelUtility */)?,
    )
}
