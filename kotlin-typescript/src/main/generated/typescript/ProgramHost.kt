// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

sealed external interface ProgramHost<T : BuilderProgram> {
    /**
     * Used to create the program when need for program creation or recreation detected
     */
    var createProgram: CreateProgram<T>
    fun useCaseSensitiveFileNames(): Boolean
    fun getNewLine(): String
    fun getCurrentDirectory(): String
    fun getDefaultLibFileName(options: CompilerOptions): String
    val getDefaultLibLocation: (() -> String)?
    val createHash: ((data: String) -> String)?

    /**
     * Use to check file presence for source files and
     * if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
     */
    fun fileExists(path: String): Boolean

    /**
     * Use to read file text for source files and
     * if resolveModuleNames is not provided (complier is in charge of module resolution) then module files as well
     */
    fun readFile(
        path: String,
        encoding: String = definedExternally,
    ): String?

    /** If provided, used for module resolution as well as to handle directory structure */
    val directoryExists: ((path: String) -> Boolean)?

    /** If provided, used in resolutions as well as handling directory structure */
    val getDirectories: ((path: String) -> ReadonlyArray<String>)?

    /** If provided, used to cache and handle directory structure modifications */
    val readDirectory: ((
        path: String,
        extensions: ReadonlyArray<String>?,
        exclude: ReadonlyArray<String>?,
        include: ReadonlyArray<String>?,
        depth: Int?,
    ) -> ReadonlyArray<String>)?

    /** Symbol links resolution */
    val realpath: ((path: String) -> String)?

    /** If provided would be used to write log about compilation */
    val trace: ((s: String) -> Unit)?

    /** If provided is used to get the environment variable */
    val getEnvironmentVariable: ((name: String) -> String?)?

    /** If provided, used to resolve the module names, otherwise typescript's default module resolution */
    val resolveModuleNames: ((
        moduleNames: ReadonlyArray<String>,
        containingFile: String,
        reusedNames: ReadonlyArray<String>?,
        redirectedReference: ResolvedProjectReference?,
        options: CompilerOptions,
        containingSourceFile: SourceFile?,
    ) -> ReadonlyArray<ResolvedModule?>)?

    /** If provided, used to resolve type reference directives, otherwise typescript's default resolution */
    val resolveTypeReferenceDirectives: ((
        typeReferenceDirectiveNames: ReadonlyArray<String>,
        containingFile: String,
        redirectedReference: ResolvedProjectReference?,
        options: CompilerOptions,
    ) -> ReadonlyArray<ResolvedTypeReferenceDirective?>)?
}
