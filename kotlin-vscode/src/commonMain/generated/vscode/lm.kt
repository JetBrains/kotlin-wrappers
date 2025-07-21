// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Namespace for language model related functionality.
*/
export namespace lm {

/**
 * An event that is fired when the set of available chat models changes.
*/
export const onDidChangeChatModels: Event<void>;

/**
 * Select chat models by a {@link LanguageModelChatSelector selector}. This can yield multiple or no chat models and
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
 * {@link onDidChangeChatModels}-event is fired the list of chat models might have changed and extensions should re-query.
 *
 * @param selector A chat model selector. When omitted all chat models are returned.
 * @returns An array of chat models, can be empty!
*/
export function selectChatModels(selector?: LanguageModelChatSelector): Thenable<LanguageModelChat[]>;

/**
 * Register a LanguageModelTool. The tool must also be registered in the package.json `languageModelTools` contribution
 * point. A registered tool is available in the {@link lm.tools} list for any extension to see. But in order for it to
 * be seen by a language model, it must be passed in the list of available tools in {@link LanguageModelChatRequestOptions.tools}.
 * @returns A {@link Disposable} that unregisters the tool when disposed.
*/
export function registerTool<T>(name: string, tool: LanguageModelTool<T>): Disposable;

/**
 * A list of all available tools that were registered by all extensions using {@link lm.registerTool}. They can be called
 * with {@link lm.invokeTool} with input that match their declared `inputSchema`.
*/
export const tools: readonly LanguageModelToolInformation[];

/**
 * Invoke a tool listed in {@link lm.tools} by name with the given input. The input will be validated against
 * the schema declared by the tool
 *
 * A tool can be invoked by a chat participant, in the context of handling a chat request, or globally by any extension in
 * any custom flow.
 *
 * In the former case, the caller shall pass the
 * {@link LanguageModelToolInvocationOptions.toolInvocationToken toolInvocationToken}, which comes with the a
 * {@link ChatRequest.toolInvocationToken chat request}. This makes sure the chat UI shows the tool invocation for the
 * correct conversation.
 *
 * A tool {@link LanguageModelToolResult result} is an array of {@link LanguageModelTextPart text-} and
 * {@link LanguageModelPromptTsxPart prompt-tsx}-parts. If the tool caller is using `@vscode/prompt-tsx`, it can
 * incorporate the response parts into its prompt using a `ToolResult`. If not, the parts can be passed along to the
 * {@link LanguageModelChat} via a user message with a {@link LanguageModelToolResultPart}.
 *
 * If a chat participant wants to preserve tool results for requests across multiple turns, it can store tool results in
 * the {@link ChatResult.metadata} returned from the handler and retrieve them on the next turn from
 * {@link ChatResponseTurn.result}.
 *
 * @param name The name of the tool to call.
 * @param options The options to use when invoking the tool.
 * @param token A cancellation token. See {@link CancellationTokenSource} for how to create one.
 * @returns The result of the tool invocation.
*/
export function invokeTool(name: string, options: LanguageModelToolInvocationOptions<object>, token?: CancellationToken): Thenable<LanguageModelToolResult>;

/**
 * Registers a provider that publishes Model Context Protocol servers for the editor to
 * consume. This allows MCP servers to be dynamically provided to the editor in
 * addition to those the user creates in their configuration files.
 *
 * Before calling this method, extensions must register the `contributes.mcpServerDefinitionProviders`
 * extension point with the corresponding {@link id}, for example:
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
*/
export function registerMcpServerDefinitionProvider(id: string, provider: McpServerDefinitionProvider): Disposable;
}

// ORIGINAL SOURCE
 **/
