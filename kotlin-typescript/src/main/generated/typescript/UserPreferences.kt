// Automatically generated - do not modify!

package typescript

external interface UserPreferences {
    val disableSuggestions: Boolean?
    val quotePreference: dynamic /* "auto" | "double" | "single" */
    val includeCompletionsForModuleExports: Boolean?
    val includeCompletionsForImportStatements: Boolean?
    val includeCompletionsWithSnippetText: Boolean?
    val includeAutomaticOptionalChainCompletions: Boolean?
    val includeCompletionsWithInsertText: Boolean?
    val includeCompletionsWithClassMemberSnippets: Boolean?
    val allowIncompleteCompletions: Boolean?
    val importModuleSpecifierPreference: dynamic /* "shortest" | "project-relative" | "relative" | "non-relative" */

    /** Determines whether we import `foo/index.ts` as "foo", "foo/index", or "foo/index.js" */
    val importModuleSpecifierEnding: dynamic /* "auto" | "minimal" | "index" | "js" */
    val allowTextChangesInNewFiles: Boolean?
    val providePrefixAndSuffixTextForRename: Boolean?
    val includePackageJsonAutoImports: dynamic /* "auto" | "on" | "off" */
    val provideRefactorNotApplicableReason: Boolean?
    val jsxAttributeCompletionStyle: dynamic /* "auto" | "braces" | "none" */
}
