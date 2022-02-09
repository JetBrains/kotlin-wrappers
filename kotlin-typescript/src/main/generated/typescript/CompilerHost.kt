// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface CompilerHost : ModuleResolutionHost {
    fun getSourceFile(
        fileName: String,
        languageVersion: ScriptTarget,
        onError: (message: String) -> Unit = definedExternally,
        shouldCreateNewSourceFile: Boolean = definedExternally,
    ): SourceFile?

    val getSourceFileByPath: ((
        fileName: String,
        path: Path,
        languageVersion: ScriptTarget,
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
        typeReferenceDirectiveNames: ReadonlyArray<String>,
        containingFile: String,
        redirectedReference: ResolvedProjectReference?,
        options: CompilerOptions,
    ) -> ReadonlyArray<ResolvedTypeReferenceDirective?>)?
    val getEnvironmentVariable: ((name: String) -> String?)?
    val createHash: ((data: String) -> String)?
    val getParsedCommandLine: ((fileName: String) -> ParsedCommandLine?)?
}
