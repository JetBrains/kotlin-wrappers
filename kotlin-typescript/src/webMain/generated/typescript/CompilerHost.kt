// Automatically generated - do not modify!

package typescript

external interface CompilerHost : ModuleResolutionHost {
    fun getSourceFile(
        fileName: String,
        languageVersionOrOptions: ScriptTarget,
        onError: (message: String) -> Unit = definedExternally,
        shouldCreateNewSourceFile: Boolean = definedExternally,
    ): SourceFile?

    fun getSourceFile(
        fileName: String,
        languageVersionOrOptions: CreateSourceFileOptions,
        onError: (message: String) -> Unit = definedExternally,
        shouldCreateNewSourceFile: Boolean = definedExternally,
    ): SourceFile?

    val getSourceFileByPath: (
        (
        fileName: String,
        path: Path,
        languageVersionOrOptions: CompilerHostGetSourceFileByPathLanguageVersionOrOptions,
        onError: ((message: String) -> Unit)?, /* use undefined for default */
        shouldCreateNewSourceFile: Boolean?, /* use undefined for default */
    ) -> SourceFile?
    )?
    val getCancellationToken: (() -> CancellationToken)?

    fun getDefaultLibFileName(options: CompilerOptions): String

    val getDefaultLibLocation: (() -> String)?
    var writeFile: WriteFileCallback

    fun getCurrentDirectory(): String

    fun getCanonicalFileName(fileName: String): String

    fun useCaseSensitiveFileNames(): Boolean

    fun getNewLine(): String

    val readDirectory: (
        (
        rootDir: String,
        extensions: js.array.ReadonlyArray<String>,
        excludes: (js.array.ReadonlyArray<String>)?,
        includes: js.array.ReadonlyArray<String>,
        depth: Int?, /* use undefined for default */
    ) -> js.array.ReadonlyArray<String>
    )?

    /**
     * Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
     */
    val getModuleResolutionCache: (() -> ModuleResolutionCache?)?

    val resolveModuleNameLiterals: (
        (
        moduleLiterals: js.array.ReadonlyArray<StringLiteralLike>,
        containingFile: String,
        redirectedReference: ResolvedProjectReference?,
        options: CompilerOptions,
        containingSourceFile: SourceFile,
        reusedNames: (js.array.ReadonlyArray<StringLiteralLike>)?,
    ) -> js.array.ReadonlyArray<ResolvedModuleWithFailedLookupLocations>
    )?
    val resolveTypeReferenceDirectiveReferences:
            (Function<Any?> /* resolveTypeReferenceDirectiveReferences?<T extends FileReference | string>(typeDirectiveReferences: readonly T[], containingFile: string, redirectedReference: ResolvedProjectReference | undefined, options: CompilerOptions, containingSourceFile: SourceFile | undefined, reusedNames: readonly T[] | undefined): readonly ResolvedTypeReferenceDirectiveWithFailedLookupLocations[]; */)?
    val getEnvironmentVariable: ((name: String) -> String?)?

    /** If provided along with custom resolveModuleNames or resolveTypeReferenceDirectives, used to determine if unchanged file path needs to re-resolve modules/type reference directives */
    val hasInvalidatedResolutions: ((filePath: Path) -> Boolean)?
    val createHash: ((data: String) -> String)?
    val getParsedCommandLine: ((fileName: String) -> ParsedCommandLine?)?
    var jsDocParsingMode: JSDocParsingMode?
}
