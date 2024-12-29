// Automatically generated - do not modify!

package typescript

sealed external interface UserPreferences {
    val disableSuggestions: Boolean?
    val quotePreference: (UserPreferencesQuotePreference)?

    /**
     * If enabled, TypeScript will search through all external modules' exports and add them to the completions list.
     * This affects lone identifier completions but not completions on the right hand side of `obj.`.
     */
    val includeCompletionsForModuleExports: Boolean?

    /**
     * Enables auto-import-style completions on partially-typed import statements. E.g., allows
     * `import write|` to be completed to `import { writeFile } from "fs"`.
     */
    val includeCompletionsForImportStatements: Boolean?

    /**
     * Allows completions to be formatted with snippet text, indicated by `CompletionItem["isSnippet"]`.
     */
    val includeCompletionsWithSnippetText: Boolean?

    /**
     * Unless this option is `false`, or `includeCompletionsWithInsertText` is not enabled,
     * member completion lists triggered with `.` will include entries on potentially-null and potentially-undefined
     * values, with insertion text to replace preceding `.` tokens with `?.`.
     */
    val includeAutomaticOptionalChainCompletions: Boolean?

    /**
     * If enabled, the completion list will include completions with invalid identifier names.
     * For those entries, The `insertText` and `replacementSpan` properties will be set to change from `.x` property access to `["x"]`.
     */
    val includeCompletionsWithInsertText: Boolean?

    /**
     * If enabled, completions for class members (e.g. methods and properties) will include
     * a whole declaration for the member.
     * E.g., `class A { f| }` could be completed to `class A { foo(): number {} }`, instead of
     * `class A { foo }`.
     */
    val includeCompletionsWithClassMemberSnippets: Boolean?

    /**
     * If enabled, object literal methods will have a method declaration completion entry in addition
     * to the regular completion entry containing just the method name.
     * E.g., `const objectLiteral: T = { f| }` could be completed to `const objectLiteral: T = { foo(): void {} }`,
     * in addition to `const objectLiteral: T = { foo }`.
     */
    val includeCompletionsWithObjectLiteralMethodSnippets: Boolean?

    /**
     * Indicates whether {@link CompletionEntry.labelDetails completion entry label details} are supported.
     * If not, contents of `labelDetails` may be included in the {@link CompletionEntry.name} property.
     */
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
    val autoImportSpecifierExcludeRegexes: js.array.ReadonlyArray<String>?
    val preferTypeOnlyAutoImports: Boolean?

    /**
     * Indicates whether imports should be organized in a case-insensitive manner.
     */
    val organizeImportsIgnoreCase: (Any /* "auto" | boolean */)?

    /**
     * Indicates whether imports should be organized via an "ordinal" (binary) comparison using the numeric value
     * of their code points, or via "unicode" collation (via the
     * [Unicode Collation Algorithm](https://unicode.org/reports/tr10/#Scope)) using rules associated with the locale
     * specified in {@link organizeImportsCollationLocale}.
     *
     * Default: `"ordinal"`.
     */
    val organizeImportsCollation: (UserPreferencesOrganizeImportsCollation)?

    /**
     * Indicates the locale to use for "unicode" collation. If not specified, the locale `"en"` is used as an invariant
     * for the sake of consistent sorting. Use `"auto"` to use the detected UI locale.
     *
     * This preference is ignored if {@link organizeImportsCollation} is not `"unicode"`.
     *
     * Default: `"en"`
     */
    val organizeImportsLocale: String?

    /**
     * Indicates whether numeric collation should be used for digit sequences in strings. When `true`, will collate
     * strings such that `a1z < a2z < a100z`. When `false`, will collate strings such that `a1z < a100z < a2z`.
     *
     * This preference is ignored if {@link organizeImportsCollation} is not `"unicode"`.
     *
     * Default: `false`
     */
    val organizeImportsNumericCollation: Boolean?

    /**
     * Indicates whether accents and other diacritic marks are considered unequal for the purpose of collation. When
     * `true`, characters with accents and other diacritics will be collated in the order defined by the locale specified
     * in {@link organizeImportsCollationLocale}.
     *
     * This preference is ignored if {@link organizeImportsCollation} is not `"unicode"`.
     *
     * Default: `true`
     */
    val organizeImportsAccentCollation: Boolean?

    /**
     * Indicates whether upper case or lower case should sort first. When `false`, the default order for the locale
     * specified in {@link organizeImportsCollationLocale} is used.
     *
     * This preference is ignored if {@link organizeImportsCollation} is not `"unicode"`. This preference is also
     * ignored if we are using case-insensitive sorting, which occurs when {@link organizeImportsIgnoreCase} is `true`,
     * or if {@link organizeImportsIgnoreCase} is `"auto"` and the auto-detected case sensitivity is determined to be
     * case-insensitive.
     *
     * Default: `false`
     */
    val organizeImportsCaseFirst: (Any /* "upper" | "lower" | false */)?

    /**
     * Indicates where named type-only imports should sort. "inline" sorts named imports without regard to if the import is
     * type-only.
     *
     * Default: `last`
     */
    val organizeImportsTypeOrder: OrganizeImportsTypeOrder?

    /**
     * Indicates whether to exclude standard library and node_modules file symbols from navTo results.
     */
    val excludeLibrarySymbolsInNavTo: Boolean?
    val lazyConfiguredProjectsFromExternalProject: Boolean?
    val displayPartsForJSDoc: Boolean?
    val generateReturnInDocTemplate: Boolean?
    val disableLineTextInReferences: Boolean?
}
