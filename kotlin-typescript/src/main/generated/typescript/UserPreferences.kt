// Automatically generated - do not modify!

package typescript

sealed external interface UserPreferences {
    val disableSuggestions: Boolean?
    val quotePreference: QuotePreference?
    val includeCompletionsForModuleExports: Boolean?
    val includeCompletionsForImportStatements: Boolean?
    val includeCompletionsWithSnippetText: Boolean?
    val includeAutomaticOptionalChainCompletions: Boolean?
    val includeCompletionsWithInsertText: Boolean?
    val includeCompletionsWithClassMemberSnippets: Boolean?
    val includeCompletionsWithObjectLiteralMethodSnippets: Boolean?
    val useLabelDetailsInCompletionEntries: Boolean?
    val allowIncompleteCompletions: Boolean?
    val importModuleSpecifierPreference: ImportModuleSpecifierPreference?

    /** Determines whether we import `foo/index.ts` as "foo", "foo/index", or "foo/index.js" */
    val importModuleSpecifierEnding: ImportModuleSpecifierEnding?
    val allowTextChangesInNewFiles: Boolean?
    val providePrefixAndSuffixTextForRename: Boolean?
    val includePackageJsonAutoImports: IncludePackageJsonAutoImports?
    val provideRefactorNotApplicableReason: Boolean?
    val jsxAttributeCompletionStyle: JsxAttributeCompletionStyle?
    val includeInlayParameterNameHints: IncludeInlayParameterNameHints?
    val includeInlayParameterNameHintsWhenArgumentMatchesName: Boolean?
    val includeInlayFunctionParameterTypeHints: Boolean?
    val includeInlayVariableTypeHints: Boolean?
    val includeInlayPropertyDeclarationTypeHints: Boolean?
    val includeInlayFunctionLikeReturnTypeHints: Boolean?
    val includeInlayEnumMemberValueHints: Boolean?
}
