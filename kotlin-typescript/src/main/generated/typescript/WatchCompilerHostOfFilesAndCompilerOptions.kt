// Automatically generated - do not modify!

package typescript

/**
 * Host to create watch with root files and options
 */
external interface WatchCompilerHostOfFilesAndCompilerOptions<T : BuilderProgram> : WatchCompilerHost<T> {
    /** root files to use to generate program */
    var rootFiles: ReadonlyArray<String>

    /** Compiler options */
    var options: CompilerOptions
    var watchOptions: WatchOptions?

    /** Project References */
    var projectReferences: ReadonlyArray<ProjectReference>?
}
