// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface LanguageService {
    /** This is used as a part of restarting the language service. */
    fun cleanupSemanticCache()

    /**
     * Gets errors indicating invalid syntax in a file.
     *
     * In English, "this cdeo have, erorrs" is syntactically invalid because it has typos,
     * grammatical errors, and misplaced punctuation. Likewise, examples of syntax
     * errors in TypeScript are missing parentheses in an `if` statement, mismatched
     * curly braces, and using a reserved keyword as a variable name.
     *
     * These diagnostics are inexpensive to compute and don't require knowledge of
     * other files. Note that a non-empty result increases the likelihood of false positives
     * from `getSemanticDiagnostics`.
     *
     * While these represent the majority of syntax-related diagnostics, there are some
     * that require the type system, which will be present in `getSemanticDiagnostics`.
     *
     * @param fileName A path to the file you want syntactic diagnostics for
     */
    fun getSyntacticDiagnostics(fileName: String): ReadonlyArray<DiagnosticWithLocation>

    /**
     * Gets warnings or errors indicating type system issues in a given file.
     * Requesting semantic diagnostics may start up the type system and
     * run deferred work, so the first call may take longer than subsequent calls.
     *
     * Unlike the other get*Diagnostics functions, these diagnostics can potentially not
     * include a reference to a source file. Specifically, the first time this is called,
     * it will return global diagnostics with no associated location.
     *
     * To contrast the differences between semantic and syntactic diagnostics, consider the
     * sentence: "The sun is green." is syntactically correct; those are real English words with
     * correct sentence structure. However, it is semantically invalid, because it is not true.
     *
     * @param fileName A path to the file you want semantic diagnostics for
     */
    fun getSemanticDiagnostics(fileName: String): ReadonlyArray<Diagnostic>

    /**
     * Gets suggestion diagnostics for a specific file. These diagnostics tend to
     * proactively suggest refactors, as opposed to diagnostics that indicate
     * potentially incorrect runtime behavior.
     *
     * @param fileName A path to the file you want semantic diagnostics for
     */
    fun getSuggestionDiagnostics(fileName: String): ReadonlyArray<DiagnosticWithLocation>

    /**
     * Gets global diagnostics related to the program configuration and compiler options.
     */
    fun getCompilerOptionsDiagnostics(): ReadonlyArray<Diagnostic>

    fun getSyntacticClassifications(
        fileName: String,
        span: TextSpan,
        format: SemanticClassificationFormat,
    ): dynamic /* ClassifiedSpan[] | ClassifiedSpan2020[] */

    fun getSemanticClassifications(
        fileName: String,
        span: TextSpan,
        format: SemanticClassificationFormat,
    ): dynamic /* ClassifiedSpan[] | ClassifiedSpan2020[] */

    /** Encoded as triples of [start, length, ClassificationType]. */
    fun getEncodedSyntacticClassifications(
        fileName: String,
        span: TextSpan,
    ): Classifications

    /**
     * Gets semantic highlights information for a particular file. Has two formats, an older
     * version used by VS and a format used by VS Code.
     *
     * @param fileName The path to the file
     * @param position A text span to return results within
     * @param format Which format to use, defaults to "original"
     * @returns a number array encoded as triples of [start, length, ClassificationType, ...].
     */
    fun getEncodedSemanticClassifications(
        fileName: String,
        span: TextSpan,
        format: SemanticClassificationFormat = definedExternally,
    ): Classifications

    /**
     * Gets completion entries at a particular position in a file.
     *
     * @param fileName The path to the file
     * @param position A zero-based index of the character where you want the entries
     * @param options An object describing how the request was triggered and what kinds
     * of code actions can be returned with the completions.
     * @param formattingSettings settings needed for calling formatting functions.
     */
    fun getCompletionsAtPosition(
        fileName: String,
        position: Int,
        options: GetCompletionsAtPositionOptions?,
        formattingSettings: FormatCodeSettings = definedExternally,
    ): WithMetadata<CompletionInfo>?

    /**
     * Gets the extended details for a completion entry retrieved from `getCompletionsAtPosition`.
     *
     * @param fileName The path to the file
     * @param position A zero based index of the character where you want the entries
     * @param entryName The `name` from an existing completion which came from `getCompletionsAtPosition`
     * @param formatOptions How should code samples in the completions be formatted, can be undefined for backwards compatibility
     * @param source `source` property from the completion entry
     * @param preferences User settings, can be undefined for backwards compatibility
     * @param data `data` property from the completion entry
     */
    fun getCompletionEntryDetails(
        fileName: String,
        position: Int,
        entryName: String,
        formatOptions: dynamic, /* FormatCodeOptions | FormatCodeSettings */
        source: String?,
        preferences: UserPreferences?,
        data: CompletionEntryData?,
    ): CompletionEntryDetails?

    fun getCompletionEntrySymbol(
        fileName: String,
        position: Int,
        name: String,
        source: String?,
    ): Symbol?

    /**
     * Gets semantic information about the identifier at a particular position in a
     * file. Quick info is what you typically see when you hover in an editor.
     *
     * @param fileName The path to the file
     * @param position A zero-based index of the character where you want the quick info
     */
    fun getQuickInfoAtPosition(
        fileName: String,
        position: Int,
    ): QuickInfo?

    fun getNameOrDottedNameSpan(
        fileName: String,
        startPos: Int,
        endPos: Int,
    ): TextSpan?

    fun getBreakpointStatementAtPosition(
        fileName: String,
        position: Int,
    ): TextSpan?

    fun getSignatureHelpItems(
        fileName: String,
        position: Int,
        options: SignatureHelpItemsOptions?,
    ): SignatureHelpItems?

    fun getRenameInfo(
        fileName: String,
        position: Int,
        preferences: UserPreferences,
    ): RenameInfo

    fun findRenameLocations(
        fileName: String,
        position: Int,
        findInStrings: Boolean,
        findInComments: Boolean,
        providePrefixAndSuffixTextForRename: Boolean = definedExternally,
    ): ReadonlyArray<RenameLocation>?

    fun getSmartSelectionRange(
        fileName: String,
        position: Int,
    ): SelectionRange

    fun getDefinitionAtPosition(
        fileName: String,
        position: Int,
    ): ReadonlyArray<DefinitionInfo>?

    fun getDefinitionAndBoundSpan(
        fileName: String,
        position: Int,
    ): DefinitionInfoAndBoundSpan?

    fun getTypeDefinitionAtPosition(
        fileName: String,
        position: Int,
    ): ReadonlyArray<DefinitionInfo>?

    fun getImplementationAtPosition(
        fileName: String,
        position: Int,
    ): ReadonlyArray<ImplementationLocation>?

    fun getReferencesAtPosition(
        fileName: String,
        position: Int,
    ): ReadonlyArray<ReferenceEntry>?

    fun findReferences(
        fileName: String,
        position: Int,
    ): ReadonlyArray<ReferencedSymbol>?

    fun getDocumentHighlights(
        fileName: String,
        position: Int,
        filesToSearch: ReadonlyArray<String>,
    ): ReadonlyArray<DocumentHighlights>?

    fun getFileReferences(fileName: String): ReadonlyArray<ReferenceEntry>

    fun getNavigateToItems(
        searchValue: String,
        maxResultCount: Int = definedExternally,
        fileName: String = definedExternally,
        excludeDtsFiles: Boolean = definedExternally,
    ): ReadonlyArray<NavigateToItem>

    fun getNavigationBarItems(fileName: String): ReadonlyArray<NavigationBarItem>
    fun getNavigationTree(fileName: String): NavigationTree
    fun prepareCallHierarchy(
        fileName: String,
        position: Int,
    ): dynamic /* CallHierarchyItem | CallHierarchyItem[] */

    fun provideCallHierarchyIncomingCalls(
        fileName: String,
        position: Int,
    ): ReadonlyArray<CallHierarchyIncomingCall>

    fun provideCallHierarchyOutgoingCalls(
        fileName: String,
        position: Int,
    ): ReadonlyArray<CallHierarchyOutgoingCall>

    fun provideInlayHints(
        fileName: String,
        span: TextSpan,
        preferences: UserPreferences?,
    ): ReadonlyArray<InlayHint>

    fun getOutliningSpans(fileName: String): ReadonlyArray<OutliningSpan>
    fun getTodoComments(
        fileName: String,
        descriptors: ReadonlyArray<TodoCommentDescriptor>,
    ): ReadonlyArray<TodoComment>

    fun getBraceMatchingAtPosition(
        fileName: String,
        position: Int,
    ): ReadonlyArray<TextSpan>

    fun getIndentationAtPosition(
        fileName: String,
        position: Int,
        options: dynamic, /* EditorOptions | EditorSettings */
    ): Int

    fun getFormattingEditsForRange(
        fileName: String,
        start: Int,
        end: Int,
        options: dynamic, /* FormatCodeOptions | FormatCodeSettings */
    ): ReadonlyArray<TextChange>

    fun getFormattingEditsForDocument(
        fileName: String,
        options: dynamic, /* FormatCodeOptions | FormatCodeSettings */
    ): ReadonlyArray<TextChange>

    fun getFormattingEditsAfterKeystroke(
        fileName: String,
        position: Int,
        key: String,
        options: dynamic, /* FormatCodeOptions | FormatCodeSettings */
    ): ReadonlyArray<TextChange>

    fun getDocCommentTemplateAtPosition(
        fileName: String,
        position: Int,
        options: DocCommentTemplateOptions = definedExternally,
    ): TextInsertion?

    fun isValidBraceCompletionAtPosition(
        fileName: String,
        position: Int,
        openingBrace: Int,
    ): Boolean

    /**
     * This will return a defined result if the position is after the `>` of the opening tag, or somewhere in the text, of a JSXElement with no closing tag.
     * Editors should call this after `>` is typed.
     */
    fun getJsxClosingTagAtPosition(
        fileName: String,
        position: Int,
    ): JsxClosingTagInfo?

    fun getSpanOfEnclosingComment(
        fileName: String,
        position: Int,
        onlyMultiLine: Boolean,
    ): TextSpan?

    val toLineColumnOffset: ((
        fileName: String,
        position: Int,
    ) -> LineAndCharacter)?

    fun getCodeFixesAtPosition(
        fileName: String,
        start: Int,
        end: Int,
        errorCodes: ReadonlyArray<Int>,
        formatOptions: FormatCodeSettings,
        preferences: UserPreferences,
    ): ReadonlyArray<CodeFixAction>

    fun getCombinedCodeFix(
        scope: CombinedCodeFixScope,
        fixId: Any,
        formatOptions: FormatCodeSettings,
        preferences: UserPreferences,
    ): CombinedCodeActions

    fun applyCodeActionCommand(
        action: CodeActionCommand,
        formatSettings: FormatCodeSettings = definedExternally,
    ): kotlin.js.Promise<ApplyCodeActionCommandResult>

    fun applyCodeActionCommand(
        action: ReadonlyArray<CodeActionCommand>,
        formatSettings: FormatCodeSettings = definedExternally,
    ): kotlin.js.Promise<ReadonlyArray<ApplyCodeActionCommandResult>>

    fun applyCodeActionCommand(
        action: dynamic, /* CodeActionCommand | CodeActionCommand[] */
        formatSettings: FormatCodeSettings = definedExternally,
    ): dynamic /* Promise<ApplyCodeActionCommandResult | ApplyCodeActionCommandResult[]> */


    fun getApplicableRefactors(
        fileName: String,
        positionOrRange: dynamic, /* number | TextRange */
        preferences: UserPreferences?,
        triggerReason: RefactorTriggerReason = definedExternally,
        kind: String = definedExternally,
    ): ReadonlyArray<ApplicableRefactorInfo>

    fun getEditsForRefactor(
        fileName: String,
        formatOptions: FormatCodeSettings,
        positionOrRange: dynamic, /* number | TextRange */
        refactorName: String,
        actionName: String,
        preferences: UserPreferences?,
    ): RefactorEditInfo?

    fun organizeImports(
        args: OrganizeImportsArgs,
        formatOptions: FormatCodeSettings,
        preferences: UserPreferences?,
    ): ReadonlyArray<FileTextChanges>

    fun getEditsForFileRename(
        oldFilePath: String,
        newFilePath: String,
        formatOptions: FormatCodeSettings,
        preferences: UserPreferences?,
    ): ReadonlyArray<FileTextChanges>

    fun getEmitOutput(
        fileName: String,
        emitOnlyDtsFiles: Boolean = definedExternally,
        forceDtsEmit: Boolean = definedExternally,
    ): EmitOutput

    fun getProgram(): Program?
    fun toggleLineComment(
        fileName: String,
        textRange: TextRange,
    ): ReadonlyArray<TextChange>

    fun toggleMultilineComment(
        fileName: String,
        textRange: TextRange,
    ): ReadonlyArray<TextChange>

    fun commentSelection(
        fileName: String,
        textRange: TextRange,
    ): ReadonlyArray<TextChange>

    fun uncommentSelection(
        fileName: String,
        textRange: TextRange,
    ): ReadonlyArray<TextChange>

    fun dispose()
}
