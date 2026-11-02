// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

open external class LanguageModelUtility {
// Docs: https://electronjs.org/docs/api/language-model-utility
    /**
     * LanguageModelUtility
     */
    constructor (initialState: InitialState)

    /**
     * Append a message without prompting for a response.
     *
     * @experimental
     */
    fun append(
        input: js.array.ReadonlyArray<LanguageModelMessage>,
        options: LanguageModelAppendOptions,
    ): js.promise.Promise<Nothing?>

    /**
     * Clones the `LanguageModelUtility` such that the context and initial prompt
     * should be preserved.
     *
     * @experimental
     */
    fun clone(options: LanguageModelCloneOptions): js.promise.Promise<LanguageModelUtility>

    /**
     * Destroys the model, and any ongoing executions are aborted.
     *
     * @experimental
     */
    fun destroy()

    /**
     * Measure how many tokens the input would use.
     *
     * @experimental
     */
    fun measureContextUsage(
        input: js.array.ReadonlyArray<LanguageModelMessage>,
        options: LanguageModelPromptOptions,
    ): js.promise.Promise<Double>

    /**
     * Prompt the model for a response.
     *
     * @experimental
     */
    fun prompt(
        input: js.array.ReadonlyArray<LanguageModelMessage>,
        options: LanguageModelPromptOptions,
    ): Any /* (Promise<string>) | (Promise<import('stream/web').ReadableStream<string>>) */

    /**
     * A `number` representing how many tokens are currently in the context window.
     *
     * @experimental
     */
    var contextUsage: Double

    /**
     * A `number` representing the size of the context window, in tokens.
     *
     * @experimental
     */
    var contextWindow: Double

    companion object {
        /**
         * Determines the availability of the language model and returns one of the
         * following strings:
         *
         * * `available`
         * * `downloadable`
         * * `downloading`
         * * `unavailable`
         *
         * @experimental
         */
        fun availability(options: LanguageModelCreateCoreOptions = definedExternally): js.promise.Promise<String>

        /**
         * Creates a new `LanguageModelUtility` with the provided `options`.
         *
         * @experimental
         */
        fun create(options: LanguageModelCreateOptions): js.promise.Promise<LanguageModelUtility>
    }
}
