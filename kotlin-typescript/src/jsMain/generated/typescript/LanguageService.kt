// Automatically generated - do not modify!

package typescript

import js.promise.Promise

sealed external interface LanguageService {
    /** This is used as a part of restarting the language service. */
    fun cleanupSemanticCache(): Unit

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
    fun getSyntacticDiagnostics(fileName: String): js.array.ReadonlyArray<DiagnosticWithLocation>

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
    fun getSemanticDiagnostics(fileName: String): js.array.ReadonlyArray<Diagnostic>

    /**
     * Gets suggestion diagnostics for a specific file. These diagnostics tend to
     * proactively suggest refactors, as opposed to diagnostics that indicate
     * potentially incorrect runtime behavior.
     *
     * @param fileName A path to the file you want semantic diagnostics for
     */
    fun getSuggestionDiagnostics(fileName: String): js.array.ReadonlyArray<DiagnosticWithLocation>

    /**
     * Gets global diagnostics related to the program configuration and compiler options.
     */
    fun getCompilerOptionsDiagnostics(): js.array.ReadonlyArray<Diagnostic>

    /** @deprecated Use getEncodedSyntacticClassifications instead. */
    fun getSyntacticClassifications(fileName: String, span: TextSpan): js.array.ReadonlyArray<ClassifiedSpan>
    fun getSyntacticClassifications(
        fileName: String,
        span: TextSpan,
        format: SemanticClassificationFormat,
    ): Any /* ClassifiedSpan[] | ClassifiedSpan2020[] */

    /** @deprecated Use getEncodedSemanticClassifications instead. */
    fun getSemanticClassifications(fileName: String, span: TextSpan): js.array.ReadonlyArray<ClassifiedSpan>
    fun getSemanticClassifications(
        fileName: String,
        span: TextSpan,
        format: SemanticClassificationFormat,
    ): Any /* ClassifiedSpan[] | ClassifiedSpan2020[] */

    /** Encoded as triples of [start, length, ClassificationType]. */
    fun getEncodedSyntacticClassifications(fileName: String, span: TextSpan): Classifications

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
        position: Double,
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
        position: Double,
        entryName: String,
        formatOptions: FormatCodeOptions?,
        source: String?,
        preferences: UserPreferences?,
        data: CompletionEntryData?,
    ): CompletionEntryDetails?

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
        position: Double,
        entryName: String,
        formatOptions: FormatCodeSettings?,
        source: String?,
        preferences: UserPreferences?,
        data: CompletionEntryData?,
    ): CompletionEntryDetails?

    fun getCompletionEntrySymbol(fileName: String, position: Double, name: String, source: String?): Symbol?

    /**
     * Gets semantic information about the identifier at a particular position in a
     * file. Quick info is what you typically see when you hover in an editor.
     *
     * @param fileName The path to the file
     * @param position A zero-based index of the character where you want the quick info
     */
    fun getQuickInfoAtPosition(fileName: String, position: Double): QuickInfo?
    fun getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): TextSpan?
    fun getBreakpointStatementAtPosition(fileName: String, position: Double): TextSpan?
    fun getSignatureHelpItems(
        fileName: String,
        position: Double,
        options: SignatureHelpItemsOptions?,
    ): SignatureHelpItems?

    fun getRenameInfo(fileName: String, position: Double, preferences: UserPreferences): RenameInfo

    /** @deprecated Use the signature with `UserPreferences` instead. */
    fun getRenameInfo(fileName: String, position: Double, options: RenameInfoOptions = definedExternally): RenameInfo
    fun findRenameLocations(
        fileName: String,
        position: Double,
        findInStrings: Boolean,
        findInComments: Boolean,
        preferences: UserPreferences,
    ): (js.array.ReadonlyArray<RenameLocation>)?

    /** @deprecated Pass `providePrefixAndSuffixTextForRename` as part of a `UserPreferences` parameter. */
    fun findRenameLocations(
        fileName: String,
        position: Double,
        findInStrings: Boolean,
        findInComments: Boolean,
        providePrefixAndSuffixTextForRename: Boolean = definedExternally,
    ): (js.array.ReadonlyArray<RenameLocation>)?

    fun getSmartSelectionRange(fileName: String, position: Double): SelectionRange
    fun getDefinitionAtPosition(fileName: String, position: Double): (js.array.ReadonlyArray<DefinitionInfo>)?
    fun getDefinitionAndBoundSpan(fileName: String, position: Double): DefinitionInfoAndBoundSpan?
    fun getTypeDefinitionAtPosition(fileName: String, position: Double): (js.array.ReadonlyArray<DefinitionInfo>)?
    fun getImplementationAtPosition(
        fileName: String,
        position: Double,
    ): (js.array.ReadonlyArray<ImplementationLocation>)?

    fun getReferencesAtPosition(fileName: String, position: Double): js.array.ReadonlyArray<ReferenceEntry>?
    fun findReferences(fileName: String, position: Double): js.array.ReadonlyArray<ReferencedSymbol>?
    fun getDocumentHighlights(
        fileName: String,
        position: Double,
        filesToSearch: js.array.ReadonlyArray<String>,
    ): js.array.ReadonlyArray<DocumentHighlights>?

    fun getFileReferences(fileName: String): js.array.ReadonlyArray<ReferenceEntry>
    fun getNavigateToItems(
        searchValue: String,
        maxResultCount: Double = definedExternally,
        fileName: String = definedExternally,
        excludeDtsFiles: Boolean = definedExternally,
        excludeLibFiles: Boolean = definedExternally,
    ): js.array.ReadonlyArray<NavigateToItem>

    fun getNavigationBarItems(fileName: String): js.array.ReadonlyArray<NavigationBarItem>
    fun getNavigationTree(fileName: String): NavigationTree
    fun prepareCallHierarchy(
        fileName: String,
        position: Double,
    ): Any? /* CallHierarchyItem | CallHierarchyItem[] | undefined */

    fun provideCallHierarchyIncomingCalls(
        fileName: String,
        position: Double,
    ): js.array.ReadonlyArray<CallHierarchyIncomingCall>

    fun provideCallHierarchyOutgoingCalls(
        fileName: String,
        position: Double,
    ): js.array.ReadonlyArray<CallHierarchyOutgoingCall>

    fun provideInlayHints(
        fileName: String,
        span: TextSpan,
        preferences: UserPreferences?,
    ): js.array.ReadonlyArray<InlayHint>

    fun getOutliningSpans(fileName: String): js.array.ReadonlyArray<OutliningSpan>
    fun getTodoComments(
        fileName: String,
        descriptors: js.array.ReadonlyArray<TodoCommentDescriptor>,
    ): js.array.ReadonlyArray<TodoComment>

    fun getBraceMatchingAtPosition(fileName: String, position: Double): js.array.ReadonlyArray<TextSpan>
    fun getIndentationAtPosition(fileName: String, position: Double, options: EditorOptions): Double

    fun getIndentationAtPosition(fileName: String, position: Double, options: EditorSettings): Double
    fun getFormattingEditsForRange(
        fileName: String,
        start: Double,
        end: Double,
        options: FormatCodeOptions,
    ): js.array.ReadonlyArray<TextChange>

    fun getFormattingEditsForRange(
        fileName: String,
        start: Double,
        end: Double,
        options: FormatCodeSettings,
    ): js.array.ReadonlyArray<TextChange>

    fun getFormattingEditsForDocument(fileName: String, options: FormatCodeOptions): js.array.ReadonlyArray<TextChange>

    fun getFormattingEditsForDocument(fileName: String, options: FormatCodeSettings): js.array.ReadonlyArray<TextChange>
    fun getFormattingEditsAfterKeystroke(
        fileName: String,
        position: Double,
        key: String,
        options: FormatCodeOptions,
    ): js.array.ReadonlyArray<TextChange>

    fun getFormattingEditsAfterKeystroke(
        fileName: String,
        position: Double,
        key: String,
        options: FormatCodeSettings,
    ): js.array.ReadonlyArray<TextChange>

    fun getDocCommentTemplateAtPosition(
        fileName: String,
        position: Double,
        options: DocCommentTemplateOptions = definedExternally,
        formatOptions: FormatCodeSettings = definedExternally,
    ): TextInsertion?

    fun isValidBraceCompletionAtPosition(fileName: String, position: Double, openingBrace: Double): Boolean

    /**
     * This will return a defined result if the position is after the `>` of the opening tag, or somewhere in the text, of a JSXElement with no closing tag.
     * Editors should call this after `>` is typed.
     */
    fun getJsxClosingTagAtPosition(fileName: String, position: Double): JsxClosingTagInfo?
    fun getLinkedEditingRangeAtPosition(fileName: String, position: Double): LinkedEditingInfo?
    fun getSpanOfEnclosingComment(fileName: String, position: Double, onlyMultiLine: Boolean): TextSpan?
    val toLineColumnOffset: ((fileName: String, position: Double) -> LineAndCharacter)?
    fun getCodeFixesAtPosition(
        fileName: String,
        start: Double,
        end: Double,
        errorCodes: js.array.ReadonlyArray<Double>,
        formatOptions: FormatCodeSettings,
        preferences: UserPreferences,
    ): js.array.ReadonlyArray<CodeFixAction>

    fun getCombinedCodeFix(
        scope: CombinedCodeFixScope,
        fixId: Any,
        formatOptions: FormatCodeSettings,
        preferences: UserPreferences,
    ): CombinedCodeActions

    fun applyCodeActionCommand(
        action: CodeActionCommand,
        formatSettings: FormatCodeSettings = definedExternally,
    ): Promise<ApplyCodeActionCommandResult>

    fun applyCodeActionCommand(
        action: js.array.ReadonlyArray<CodeActionCommand>,
        formatSettings: FormatCodeSettings = definedExternally,
    ): Promise<js.array.ReadonlyArray<ApplyCodeActionCommandResult>>

    /** @deprecated `fileName` will be ignored */
    fun applyCodeActionCommand(fileName: String, action: CodeActionCommand): Promise<ApplyCodeActionCommandResult>

    /** @deprecated `fileName` will be ignored */
    fun applyCodeActionCommand(
        fileName: String,
        action: js.array.ReadonlyArray<CodeActionCommand>,
    ): Promise<js.array.ReadonlyArray<ApplyCodeActionCommandResult>>
    /** @deprecated `fileName` will be ignored */

    /**
     * @param includeInteractiveActions Include refactor actions that require additional arguments to be
     * passed when calling `getEditsForRefactor`. When true, clients should inspect the `isInteractive`
     * property of each returned `RefactorActionInfo` and ensure they are able to collect the appropriate
     * arguments for any interactive action before offering it.
     */
    fun getApplicableRefactors(
        fileName: String,
        positionOrRange: Double,
        preferences: UserPreferences?,
        triggerReason: RefactorTriggerReason = definedExternally,
        kind: String = definedExternally,
        includeInteractiveActions: Boolean = definedExternally,
    ): js.array.ReadonlyArray<ApplicableRefactorInfo>

    /**
     * @param includeInteractiveActions Include refactor actions that require additional arguments to be
     * passed when calling `getEditsForRefactor`. When true, clients should inspect the `isInteractive`
     * property of each returned `RefactorActionInfo` and ensure they are able to collect the appropriate
     * arguments for any interactive action before offering it.
     */
    fun getApplicableRefactors(
        fileName: String,
        positionOrRange: TextRange,
        preferences: UserPreferences?,
        triggerReason: RefactorTriggerReason = definedExternally,
        kind: String = definedExternally,
        includeInteractiveActions: Boolean = definedExternally,
    ): js.array.ReadonlyArray<ApplicableRefactorInfo>

    fun getEditsForRefactor(
        fileName: String,
        formatOptions: FormatCodeSettings,
        positionOrRange: Double,
        refactorName: String,
        actionName: String,
        preferences: UserPreferences?,
        interactiveRefactorArguments: InteractiveRefactorArguments = definedExternally,
    ): RefactorEditInfo?

    fun getEditsForRefactor(
        fileName: String,
        formatOptions: FormatCodeSettings,
        positionOrRange: TextRange,
        refactorName: String,
        actionName: String,
        preferences: UserPreferences?,
        interactiveRefactorArguments: InteractiveRefactorArguments = definedExternally,
    ): RefactorEditInfo?

    fun getMoveToRefactoringFileSuggestions(
        fileName: String,
        positionOrRange: Double,
        preferences: UserPreferences?,
        triggerReason: RefactorTriggerReason = definedExternally,
        kind: String = definedExternally,
    ): LanguageServiceGetMoveToRefactoringFileSuggestionsResult

    fun getMoveToRefactoringFileSuggestions(
        fileName: String,
        positionOrRange: TextRange,
        preferences: UserPreferences?,
        triggerReason: RefactorTriggerReason = definedExternally,
        kind: String = definedExternally,
    ): LanguageServiceGetMoveToRefactoringFileSuggestionsResult

    fun organizeImports(
        args: OrganizeImportsArgs,
        formatOptions: FormatCodeSettings,
        preferences: UserPreferences?,
    ): js.array.ReadonlyArray<FileTextChanges>

    fun getEditsForFileRename(
        oldFilePath: String,
        newFilePath: String,
        formatOptions: FormatCodeSettings,
        preferences: UserPreferences?,
    ): js.array.ReadonlyArray<FileTextChanges>

    fun getEmitOutput(
        fileName: String,
        emitOnlyDtsFiles: Boolean = definedExternally,
        forceDtsEmit: Boolean = definedExternally,
    ): EmitOutput

    fun getProgram(): Program?
    fun toggleLineComment(fileName: String, textRange: TextRange): js.array.ReadonlyArray<TextChange>
    fun toggleMultilineComment(fileName: String, textRange: TextRange): js.array.ReadonlyArray<TextChange>
    fun commentSelection(fileName: String, textRange: TextRange): js.array.ReadonlyArray<TextChange>
    fun uncommentSelection(fileName: String, textRange: TextRange): js.array.ReadonlyArray<TextChange>
    fun getSupportedCodeFixes(fileName: String = definedExternally): js.array.ReadonlyArray<String>
    fun dispose(): Unit
}
