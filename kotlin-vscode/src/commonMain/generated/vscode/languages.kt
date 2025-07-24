// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.JsString
import js.promise.PromiseLike

/**
 * Namespace for participating in language-specific editor [features](https://code.visualstudio.com/docs/editor/editingevolved),
 * like IntelliSense, code actions, diagnostics etc.
 *
 * Many programming languages exist and there is huge variety in syntaxes, semantics, and paradigms. Despite that, features
 * like automatic word-completion, code navigation, or code checking have become popular across different tools for different
 * programming languages.
 *
 * The editor provides an API that makes it simple to provide such common features by having all UI and actions already in place and
 * by allowing you to participate by providing data only. For instance, to contribute a hover all you have to do is provide a function
 * that can be called with a {@link TextDocument} and a {@link Position} returning hover info. The rest, like tracking the
 * mouse, positioning the hover, keeping the hover stable etc. is taken care of by the editor.
 *
 * ```javascript
 * languages.registerHoverProvider('javascript', {
 * 	provideHover(document, position, token) {
 * 		return new Hover('I am a hover!');
 * 	}
 * });
 * ```
 *
 * Registration is done using a {@link DocumentSelector document selector} which is either a language id, like `javascript` or
 * a more complex {@link DocumentFilter filter} like `{ language: 'typescript', scheme: 'file' }`. Matching a document against such
 * a selector will result in a {@link languages.match score} that is used to determine if and how a provider shall be used. When
 * scores are equal the provider that came last wins. For features that allow full arity, like {@link languages.registerHoverProvider hover},
 * the score is only checked to be `>0`, for other features, like {@link languages.registerCompletionItemProvider IntelliSense} the
 * score is used for determining the order in which providers are asked to participate.
 */
external object languages {
    /**
     * Return the identifiers of all known languages.
     * @returns Promise resolving to an array of identifier strings.
     */
    fun getLanguages(): PromiseLike<ReadonlyArray<JsString>>

    /**
     * Set (and change) the {@link TextDocument.languageId language} that is associated
     * with the given document.
     *
     * *Note* that calling this function will trigger the {@linkcode workspace.onDidCloseTextDocument onDidCloseTextDocument} event
     * followed by the {@linkcode workspace.onDidOpenTextDocument onDidOpenTextDocument} event.
     *
     * @param document The document which language is to be changed
     * @param languageId The new language identifier.
     * @returns A thenable that resolves with the updated document.
     */
    fun setTextDocumentLanguage(
        document: TextDocument,
        languageId: String,
    ): PromiseLike<TextDocument>

    /**
     * Compute the match between a document {@link DocumentSelector selector} and a document. Values
     * greater than zero mean the selector matches the document.
     *
     * A match is computed according to these rules:
     * 1. When {@linkcode DocumentSelector} is an array, compute the match for each contained `DocumentFilter` or language identifier and take the maximum value.
     * 2. A string will be desugared to become the `language`-part of a {@linkcode DocumentFilter}, so `"fooLang"` is like `{ language: "fooLang" }`.
     * 3. A {@linkcode DocumentFilter} will be matched against the document by comparing its parts with the document. The following rules apply:
     *    1. When the `DocumentFilter` is empty (`{}`) the result is `0`
     *    2. When `scheme`, `language`, `pattern`, or `notebook` are defined but one doesn't match, the result is `0`
     *    3. Matching against `*` gives a score of `5`, matching via equality or via a glob-pattern gives a score of `10`
     *    4. The result is the maximum value of each match
     *
     * Samples:
     * ```js
     * // default document from disk (file-scheme)
     * doc.uri; //'file:///my/file.js'
     * doc.languageId; // 'javascript'
     * match('javascript', doc); // 10;
     * match({ language: 'javascript' }, doc); // 10;
     * match({ language: 'javascript', scheme: 'file' }, doc); // 10;
     * match('*', doc); // 5
     * match('fooLang', doc); // 0
     * match(['fooLang', '*'], doc); // 5
     *
     * // virtual document, e.g. from git-index
     * doc.uri; // 'git:/my/file.js'
     * doc.languageId; // 'javascript'
     * match('javascript', doc); // 10;
     * match({ language: 'javascript', scheme: 'git' }, doc); // 10;
     * match('*', doc); // 5
     *
     * // notebook cell document
     * doc.uri; // `vscode-notebook-cell:///my/notebook.ipynb#gl65s2pmha`;
     * doc.languageId; // 'python'
     * match({ notebookType: 'jupyter-notebook' }, doc) // 10
     * match({ notebookType: 'fooNotebook', language: 'python' }, doc) // 0
     * match({ language: 'python' }, doc) // 10
     * match({ notebookType: '*' }, doc) // 5
     * ```
     *
     * @param selector A document selector.
     * @param document A text document.
     * @returns A number `>0` when the selector matches and `0` when the selector does not match.
     */
    fun match(
        selector: DocumentSelector,
        document: TextDocument,
    ): Int

    /**
     * An {@link Event} which fires when the global set of diagnostics changes. This is
     * newly added and removed diagnostics.
     */
    val onDidChangeDiagnostics: Event<DiagnosticChangeEvent>

    /**
     * Get all diagnostics for a given resource.
     *
     * @param resource A resource
     * @returns An array of {@link Diagnostic diagnostics} objects or an empty array.
     */
    fun getDiagnostics(resource: Uri): ReadonlyArray<Diagnostic>

    /**
     * Get all diagnostics.
     *
     * @returns An array of uri-diagnostics tuples or an empty array.
     */
    fun getDiagnostics(): ReadonlyArray<Tuple2<Uri, ReadonlyArray<Diagnostic>>>

    /**
     * Create a diagnostics collection.
     *
     * @param name The {@link DiagnosticCollection.name name} of the collection.
     * @returns A new diagnostic collection.
     */
    fun createDiagnosticCollection(name: String = definedExternally): DiagnosticCollection

    /**
     * Creates a new {@link LanguageStatusItem language status item}.
     *
     * @param id The identifier of the item.
     * @param selector The document selector that defines for what editors the item shows.
     * @returns A new language status item.
     */
    fun createLanguageStatusItem(
        id: String,
        selector: DocumentSelector,
    ): LanguageStatusItem

    /**
     * Register a completion provider.
     *
     * Multiple providers can be registered for a language. In that case providers are sorted
     * by their {@link languages.match score} and groups of equal score are sequentially asked for
     * completion items. The process stops when one or many providers of a group return a
     * result. A failing provider (rejected promise or exception) will not fail the whole
     * operation.
     *
     * A completion item provider can be associated with a set of `triggerCharacters`. When trigger
     * characters are being typed, completions are requested but only from providers that registered
     * the typed character. Because of that trigger characters should be different than {@link LanguageConfiguration.wordPattern word characters},
     * a common trigger character is `.` to trigger member completions.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A completion provider.
     * @param triggerCharacters Trigger completion when the user types one of the characters.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerCompletionItemProvider(
        selector: DocumentSelector,
        provider: CompletionItemProvider<*>,
        vararg triggerCharacters: String,
    ): Disposable

    /**
     * Registers an inline completion provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider An inline completion provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerInlineCompletionItemProvider(
        selector: DocumentSelector,
        provider: InlineCompletionItemProvider,
    ): Disposable

    /**
     * Register a code action provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A code action provider.
     * @param metadata Metadata about the kind of code actions the provider provides.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerCodeActionsProvider(
        selector: DocumentSelector,
        provider: CodeActionProvider<*>,
        metadata: CodeActionProviderMetadata = definedExternally,
    ): Disposable

    /**
     * Register a code lens provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A code lens provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerCodeLensProvider(
        selector: DocumentSelector,
        provider: CodeLensProvider<*>,
    ): Disposable

    /**
     * Register a definition provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A definition provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerDefinitionProvider(
        selector: DocumentSelector,
        provider: DefinitionProvider,
    ): Disposable

    /**
     * Register an implementation provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider An implementation provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerImplementationProvider(
        selector: DocumentSelector,
        provider: ImplementationProvider,
    ): Disposable

    /**
     * Register a type definition provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A type definition provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerTypeDefinitionProvider(
        selector: DocumentSelector,
        provider: TypeDefinitionProvider,
    ): Disposable

    /**
     * Register a declaration provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A declaration provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerDeclarationProvider(
        selector: DocumentSelector,
        provider: DeclarationProvider,
    ): Disposable

    /**
     * Register a hover provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A hover provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerHoverProvider(
        selector: DocumentSelector,
        provider: HoverProvider,
    ): Disposable

    /**
     * Register a provider that locates evaluatable expressions in text documents.
     * The editor will evaluate the expression in the active debug session and will show the result in the debug hover.
     *
     * If multiple providers are registered for a language an arbitrary provider will be used.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider An evaluatable expression provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerEvaluatableExpressionProvider(
        selector: DocumentSelector,
        provider: EvaluatableExpressionProvider,
    ): Disposable

    /**
     * Register a provider that returns data for the debugger's 'inline value' feature.
     * Whenever the generic debugger has stopped in a source file, providers registered for the language of the file
     * are called to return textual data that will be shown in the editor at the end of lines.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider An inline values provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerInlineValuesProvider(
        selector: DocumentSelector,
        provider: InlineValuesProvider,
    ): Disposable

    /**
     * Register a document highlight provider.
     *
     * Multiple providers can be registered for a language. In that case providers are sorted
     * by their {@link languages.match score} and groups sequentially asked for document highlights.
     * The process stops when a provider returns a `non-falsy` or `non-failure` result.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A document highlight provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerDocumentHighlightProvider(
        selector: DocumentSelector,
        provider: DocumentHighlightProvider,
    ): Disposable

    /**
     * Register a document symbol provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A document symbol provider.
     * @param metaData metadata about the provider
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerDocumentSymbolProvider(
        selector: DocumentSelector,
        provider: DocumentSymbolProvider,
        metaData: DocumentSymbolProviderMetadata = definedExternally,
    ): Disposable

    /**
     * Register a workspace symbol provider.
     *
     * Multiple providers can be registered. In that case providers are asked in parallel and
     * the results are merged. A failing provider (rejected promise or exception) will not cause
     * a failure of the whole operation.
     *
     * @param provider A workspace symbol provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerWorkspaceSymbolProvider(provider: WorkspaceSymbolProvider<*>): Disposable

    /**
     * Register a reference provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A reference provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerReferenceProvider(
        selector: DocumentSelector,
        provider: ReferenceProvider,
    ): Disposable

    /**
     * Register a rename provider.
     *
     * Multiple providers can be registered for a language. In that case providers are sorted
     * by their {@link languages.match score} and asked in sequence. The first provider producing a result
     * defines the result of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A rename provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerRenameProvider(
        selector: DocumentSelector,
        provider: RenameProvider,
    ): Disposable

    /**
     * Register a semantic tokens provider for a whole document.
     *
     * Multiple providers can be registered for a language. In that case providers are sorted
     * by their {@link languages.match score} and the best-matching provider is used. Failure
     * of the selected provider will cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A document semantic tokens provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerDocumentSemanticTokensProvider(
        selector: DocumentSelector,
        provider: DocumentSemanticTokensProvider,
        legend: SemanticTokensLegend,
    ): Disposable

    /**
     * Register a semantic tokens provider for a document range.
     *
     * *Note:* If a document has both a `DocumentSemanticTokensProvider` and a `DocumentRangeSemanticTokensProvider`,
     * the range provider will be invoked only initially, for the time in which the full document provider takes
     * to resolve the first request. Once the full document provider resolves the first request, the semantic tokens
     * provided via the range provider will be discarded and from that point forward, only the document provider
     * will be used.
     *
     * Multiple providers can be registered for a language. In that case providers are sorted
     * by their {@link languages.match score} and the best-matching provider is used. Failure
     * of the selected provider will cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A document range semantic tokens provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerDocumentRangeSemanticTokensProvider(
        selector: DocumentSelector,
        provider: DocumentRangeSemanticTokensProvider,
        legend: SemanticTokensLegend,
    ): Disposable

    /**
     * Register a formatting provider for a document.
     *
     * Multiple providers can be registered for a language. In that case providers are sorted
     * by their {@link languages.match score} and the best-matching provider is used. Failure
     * of the selected provider will cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A document formatting edit provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerDocumentFormattingEditProvider(
        selector: DocumentSelector,
        provider: DocumentFormattingEditProvider,
    ): Disposable

    /**
     * Register a formatting provider for a document range.
     *
     * *Note:* A document range provider is also a {@link DocumentFormattingEditProvider document formatter}
     * which means there is no need to {@link languages.registerDocumentFormattingEditProvider register} a document
     * formatter when also registering a range provider.
     *
     * Multiple providers can be registered for a language. In that case providers are sorted
     * by their {@link languages.match score} and the best-matching provider is used. Failure
     * of the selected provider will cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A document range formatting edit provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerDocumentRangeFormattingEditProvider(
        selector: DocumentSelector,
        provider: DocumentRangeFormattingEditProvider,
    ): Disposable

    /**
     * Register a formatting provider that works on type. The provider is active when the user enables the setting `editor.formatOnType`.
     *
     * Multiple providers can be registered for a language. In that case providers are sorted
     * by their {@link languages.match score} and the best-matching provider is used. Failure
     * of the selected provider will cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider An on type formatting edit provider.
     * @param firstTriggerCharacter A character on which formatting should be triggered, like `}`.
     * @param moreTriggerCharacter More trigger characters.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerOnTypeFormattingEditProvider(
        selector: DocumentSelector,
        provider: OnTypeFormattingEditProvider,
        firstTriggerCharacter: String,
        vararg moreTriggerCharacter: String,
    ): Disposable

    /**
     * Register a signature help provider.
     *
     * Multiple providers can be registered for a language. In that case providers are sorted
     * by their {@link languages.match score} and called sequentially until a provider returns a
     * valid result.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A signature help provider.
     * @param triggerCharacters Trigger signature help when the user types one of the characters, like `,` or `(`.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerSignatureHelpProvider(
        selector: DocumentSelector,
        provider: SignatureHelpProvider,
        vararg triggerCharacters: String,
    ): Disposable

    /**
     * @see {@link languages.registerSignatureHelpProvider}
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A signature help provider.
     * @param metadata Information about the provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerSignatureHelpProvider(
        selector: DocumentSelector,
        provider: SignatureHelpProvider,
        metadata: SignatureHelpProviderMetadata,
    ): Disposable

    /**
     * Register a document link provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A document link provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerDocumentLinkProvider(
        selector: DocumentSelector,
        provider: DocumentLinkProvider<*>,
    ): Disposable

    /**
     * Register a color provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A color provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerColorProvider(
        selector: DocumentSelector,
        provider: DocumentColorProvider,
    ): Disposable

    /**
     * Register a inlay hints provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider An inlay hints provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerInlayHintsProvider(
        selector: DocumentSelector,
        provider: InlayHintsProvider<*>,
    ): Disposable

    /**
     * Register a folding range provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged.
     * If multiple folding ranges start at the same position, only the range of the first registered provider is used.
     * If a folding range overlaps with an other range that has a smaller position, it is also ignored.
     *
     * A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A folding range provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerFoldingRangeProvider(
        selector: DocumentSelector,
        provider: FoldingRangeProvider,
    ): Disposable

    /**
     * Register a selection range provider.
     *
     * Multiple providers can be registered for a language. In that case providers are asked in
     * parallel and the results are merged. A failing provider (rejected promise or exception) will
     * not cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A selection range provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerSelectionRangeProvider(
        selector: DocumentSelector,
        provider: SelectionRangeProvider,
    ): Disposable

    /**
     * Register a call hierarchy provider.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A call hierarchy provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerCallHierarchyProvider(
        selector: DocumentSelector,
        provider: CallHierarchyProvider,
    ): Disposable

    /**
     * Register a type hierarchy provider.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A type hierarchy provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerTypeHierarchyProvider(
        selector: DocumentSelector,
        provider: TypeHierarchyProvider,
    ): Disposable

    /**
     * Register a linked editing range provider.
     *
     * Multiple providers can be registered for a language. In that case providers are sorted
     * by their {@link languages.match score} and the best-matching provider that has a result is used. Failure
     * of the selected provider will cause a failure of the whole operation.
     *
     * @param selector A selector that defines the documents this provider is applicable to.
     * @param provider A linked editing range provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
     */
    fun registerLinkedEditingRangeProvider(
        selector: DocumentSelector,
        provider: LinkedEditingRangeProvider,
    ): Disposable

    /**
     * Registers a new {@link DocumentDropEditProvider}.
     *
     * Multiple drop providers can be registered for a language. When dropping content into an editor, all
     * registered providers for the editor's language will be invoked based on the mimetypes they handle
     * as specified by their {@linkcode DocumentDropEditProviderMetadata}.
     *
     * Each provider can return one or more {@linkcode DocumentDropEdit DocumentDropEdits}. The edits are sorted
     * using the {@linkcode DocumentDropEdit.yieldTo} property. By default the first edit will be applied. If there
     * are any additional edits, these will be shown to the user as selectable drop options in the drop widget.
     *
     * @param selector A selector that defines the documents this provider applies to.
     * @param provider A drop provider.
     * @param metadata Additional metadata about the provider.
     *
     * @returns A {@linkcode Disposable} that unregisters this provider when disposed of.
     */
    fun registerDocumentDropEditProvider(
        selector: DocumentSelector,
        provider: DocumentDropEditProvider<*>,
        metadata: DocumentDropEditProviderMetadata = definedExternally,
    ): Disposable

    /**
     * Registers a new {@linkcode DocumentPasteEditProvider}.
     *
     * Multiple providers can be registered for a language. All registered providers for a language will be invoked
     * for copy and paste operations based on their handled mimetypes as specified by the {@linkcode DocumentPasteProviderMetadata}.
     *
     * For {@link DocumentPasteEditProvider.prepareDocumentPaste copy operations}, changes to the {@linkcode DataTransfer}
     * made by each provider will be merged into a single {@linkcode DataTransfer} that is used to populate the clipboard.
     *
     * For {@link DocumentPasteEditProvider.providerDocumentPasteEdits paste operations}, each provider will be invoked
     * and can return one or more {@linkcode DocumentPasteEdit DocumentPasteEdits}. The edits are sorted using
     * the {@linkcode DocumentPasteEdit.yieldTo} property. By default the first edit will be applied
     * and the rest of the edits will be shown to the user as selectable paste options in the paste widget.
     *
     * @param selector A selector that defines the documents this provider applies to.
     * @param provider A paste editor provider.
     * @param metadata Additional metadata about the provider.
     *
     * @returns A {@linkcode Disposable} that unregisters this provider when disposed of.
     */
    fun registerDocumentPasteEditProvider(
        selector: DocumentSelector,
        provider: DocumentPasteEditProvider<*>,
        metadata: DocumentPasteProviderMetadata,
    ): Disposable

    /**
     * Set a {@link LanguageConfiguration language configuration} for a language.
     *
     * @param language A language identifier like `typescript`.
     * @param configuration Language configuration.
     * @returns A {@link Disposable} that unsets this configuration.
     */
    fun setLanguageConfiguration(
        language: String,
        configuration: LanguageConfiguration,
    ): Disposable
}
