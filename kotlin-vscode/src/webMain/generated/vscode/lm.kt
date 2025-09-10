// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.Void
import js.promise.PromiseLike
import vscode.lm.onDidChangeChatModels
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * Namespace for language model related functionality.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#lm)
 */
external object lm {
    /**
     * An event that is fired when the set of available chat models changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#lm.onDidChangeChatModels)
     */
    val onDidChangeChatModels: Event<Void>

    /**
     * Select chat models by a [selector][LanguageModelChatSelector]. This can yield multiple or no chat models and
     * extensions must handle these cases, esp. when no chat model exists, gracefully.
     *
     * ```ts
     * const models = await vscode.lm.selectChatModels({ family: 'gpt-3.5-turbo' });
     * if (models.length > 0) {
     * 	const [first] = models;
     * 	const response = await first.sendRequest(...)
     * 	// ...
     * } else {
     * 	// NO chat models available
     * }
     * ```
     *
     * A selector can be written to broadly match all models of a given vendor or family, or it can narrowly select one model by ID.
     * Keep in mind that the available set of models will change over time, but also that prompts may perform differently in
     * different models.
     *
     * *Note* that extensions can hold on to the results returned by this function and use them later. However, when the
     * [onDidChangeChatModels]-event is fired the list of chat models might have changed and extensions should re-query.
     *
     * @param selector A chat model selector. When omitted all chat models are returned.
     * @returns An array of chat models, can be empty!
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#lm.selectChatModels)
     */
    @JsName("selectChatModels")
    fun selectChatModelsAsync(selector: LanguageModelChatSelector = definedExternally): PromiseLike<ReadonlyArray<LanguageModelChat>>

    /**
     * Register a LanguageModelTool. The tool must also be registered in the package.json `languageModelTools` contribution
     * point. A registered tool is available in the [lm.tools] list for any extension to see. But in order for it to
     * be seen by a language model, it must be passed in the list of available tools in [LanguageModelChatRequestOptions.tools].
     * @returns A [Disposable] that unregisters the tool when disposed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#lm.registerTool)
     */
    fun <T : JsAny?> registerTool(
        name: String,
        tool: LanguageModelTool<T>,
    ): Disposable

    /**
     * A list of all available tools that were registered by all extensions using [lm.registerTool]. They can be called
     * with [lm.invokeTool] with input that match their declared `inputSchema`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#lm.tools)
     */
    val tools: ReadonlyArray<LanguageModelToolInformation>

    /**
     * Invoke a tool listed in [lm.tools] by name with the given input. The input will be validated against
     * the schema declared by the tool
     *
     * A tool can be invoked by a chat participant, in the context of handling a chat request, or globally by any extension in
     * any custom flow.
     *
     * In the former case, the caller shall pass the
     * [toolInvocationToken][LanguageModelToolInvocationOptions.toolInvocationToken], which comes from a
     * [chat request][ChatRequest.toolInvocationToken]. This makes sure the chat UI shows the tool invocation for the
     * correct conversation.
     *
     * A tool [result} is an array of {@link LanguageModelTextPart text-][LanguageModelToolResult] and
     * [prompt-tsx][LanguageModelPromptTsxPart]-parts. If the tool caller is using `@vscode/prompt-tsx`, it can
     * incorporate the response parts into its prompt using a `ToolResult`. If not, the parts can be passed along to the
     * [LanguageModelChat] via a user message with a [LanguageModelToolResultPart].
     *
     * If a chat participant wants to preserve tool results for requests across multiple turns, it can store tool results in
     * the [ChatResult.metadata] returned from the handler and retrieve them on the next turn from
     * [ChatResponseTurn.result].
     *
     * @param name The name of the tool to call.
     * @param options The options to use when invoking the tool.
     * @param token A cancellation token. See [CancellationTokenSource] for how to create one.
     * @returns The result of the tool invocation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#lm.invokeTool)
     */
    @JsName("invokeTool")
    fun invokeToolAsync(
        name: String,
        options: LanguageModelToolInvocationOptions<* /* object */>,
        token: CancellationToken = definedExternally,
    ): PromiseLike<LanguageModelToolResult>

    /**
     * Registers a provider that publishes Model Context Protocol servers for the editor to
     * consume. This allows MCP servers to be dynamically provided to the editor in
     * addition to those the user creates in their configuration files.
     *
     * Before calling this method, extensions must register the `contributes.mcpServerDefinitionProviders`
     * extension point with the corresponding [id], for example:
     *
     * ```js
     * 	"contributes": {
     * 		"mcpServerDefinitionProviders": [
     * 			{
     * 				"id": "cool-cloud-registry.mcp-servers",
     * 				"label": "Cool Cloud Registry",
     * 			}
     * 		]
     * 	}
     * ```
     *
     * When a new McpServerDefinitionProvider is available, the editor will present a 'refresh'
     * action to the user to discover new servers. To enable this flow, extensions should
     * call `registerMcpServerDefinitionProvider` during activation.
     * @param id The ID of the provider, which is unique to the extension.
     * @param provider The provider to register
     * @returns A disposable that unregisters the provider when disposed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#lm.registerMcpServerDefinitionProvider)
     */
    fun registerMcpServerDefinitionProvider(
        id: String,
        provider: McpServerDefinitionProvider<*>,
    ): Disposable
}
