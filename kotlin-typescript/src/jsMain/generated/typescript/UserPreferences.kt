// Automatically generated - do not modify!

package typescript

sealed external interface UserPreferences {
    val disableSuggestions: Boolean?
    val quotePreference: (UserPreferencesQuotePreference)?
    val includeCompletionsForModuleExports: Boolean?
    val includeCompletionsForImportStatements: Boolean?
    val includeCompletionsWithSnippetText: Boolean?
    val includeAutomaticOptionalChainCompletions: Boolean?
    val includeCompletionsWithInsertText: Boolean?
    val includeCompletionsWithClassMemberSnippets: Boolean?
    val includeCompletionsWithObjectLiteralMethodSnippets: Boolean?
    val useLabelDetailsInCompletionEntries: Boolean?
    val allowIncompleteCompletions: Boolean?
    val importModuleSpecifierPreference: (UserPreferencesImportModuleSpecifierPreference)?

    /** Determines whether we import `foo/index.ts` as "foo", "foo/index", or "foo/index.js" */
    val importModuleSpecifierEnding: (UserPreferencesImportModuleSpecifierEnding)?
    val allowTextChangesInNewFiles: Boolean?
    val providePrefixAndSuffixTextForRename: Boolean?
    val includePackageJsonAutoImports: (UserPreferencesIncludePackageJsonAutoImports)?
    val provideRefactorNotApplicableReason: Boolean?
    val jsxAttributeCompletionStyle: (UserPreferencesJsxAttributeCompletionStyle)?
    val includeInlayParameterNameHints: (UserPreferencesIncludeInlayParameterNameHints)?
    val includeInlayParameterNameHintsWhenArgumentMatchesName: Boolean?
    val includeInlayFunctionParameterTypeHints: Boolean?
    val includeInlayVariableTypeHints: Boolean?
    val includeInlayVariableTypeHintsWhenTypeMatchesName: Boolean?
    val includeInlayPropertyDeclarationTypeHints: Boolean?
    val includeInlayFunctionLikeReturnTypeHints: Boolean?
    val includeInlayEnumMemberValueHints: Boolean?
    val interactiveInlayHints: Boolean?
    val allowRenameOfImportPath: Boolean?
    val autoImportFileExcludePatterns: js.array.ReadonlyArray<String>?
    val preferTypeOnlyAutoImports: Boolean?
    val organizeImportsIgnoreCase: (Any /* "auto" | boolean */)?
    val organizeImportsCollation: (UserPreferencesOrganizeImportsCollation)?
    val organizeImportsLocale: String?
    val organizeImportsNumericCollation: Boolean?
    val organizeImportsAccentCollation: Boolean?
    val organizeImportsCaseFirst: (Any /* "upper" | "lower" | false */)?
    val organizeImportsTypeOrder: (UserPreferencesOrganizeImportsTypeOrder)?
    val excludeLibrarySymbolsInNavTo: Boolean?
}
