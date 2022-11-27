// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface CompilerHost : ModuleResolutionHost {
    fun getSourceFile(
        fileName: String,
        languageVersionOrOptions: dynamic, /* ScriptTarget | CreateSourceFileOptions */
        onError: (message: String) -> Unit = definedExternally,
        shouldCreateNewSourceFile: Boolean = definedExternally,
    ): SourceFile?

    val getSourceFileByPath: ((
        fileName: String,
        path: Path,
        languageVersionOrOptions: dynamic, /* ScriptTarget | CreateSourceFileOptions */
        onError: ((message: String) -> Unit)?,
        shouldCreateNewSourceFile: Boolean?,
    ) -> SourceFile?)?
    val getCancellationToken: (() -> CancellationToken)?
    fun getDefaultLibFileName(options: CompilerOptions): String
    val getDefaultLibLocation: (() -> String)?
    var writeFile: WriteFileCallback
    fun getCurrentDirectory(): String
    fun getCanonicalFileName(fileName: String): String
    fun useCaseSensitiveFileNames(): Boolean
    fun getNewLine(): String
    val readDirectory: ((
        rootDir: String,
        extensions: ReadonlyArray<String>,
        excludes: ReadonlyArray<String>?,
        includes: ReadonlyArray<String>,
        depth: Int?,
    ) -> ReadonlyArray<String>)?
    val resolveModuleNames: ((
        moduleNames: ReadonlyArray<String>,
        containingFile: String,
        reusedNames: ReadonlyArray<String>?,
        redirectedReference: ResolvedProjectReference?,
        options: CompilerOptions,
        containingSourceFile: SourceFile?,
    ) -> ReadonlyArray<ResolvedModule?>)?

    /**
     * Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
     */
    val getModuleResolutionCache: (() -> ModuleResolutionCache?)?

    /**
     * This method is a companion for 'resolveModuleNames' and is used to resolve 'types' references to actual type declaration files
     */
    val resolveTypeReferenceDirectives: ((
        typeReferenceDirectiveNames: dynamic, /* string[] | readonly FileReference[] */
        containingFile: String,
        redirectedReference: ResolvedProjectReference?,
        options: CompilerOptions,
        containingFileMode: NodeFormat?,
    ) -> ReadonlyArray<ResolvedTypeReferenceDirective?>)?
    val getEnvironmentVariable: ((name: String) -> String?)?

    /** If provided along with custom resolveModuleNames or resolveTypeReferenceDirectives, used to determine if unchanged file path needs to re-resolve modules/type reference directives */
    val hasInvalidatedResolutions: ((filePath: Path) -> Boolean)?
    val createHash: ((data: String) -> String)?
    val getParsedCommandLine: ((fileName: String) -> ParsedCommandLine?)?
}
