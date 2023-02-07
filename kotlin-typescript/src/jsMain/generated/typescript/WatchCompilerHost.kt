// Automatically generated - do not modify!

package typescript

sealed external interface WatchCompilerHost<T : BuilderProgram> : ProgramHost<T>, WatchHost {
    /** Instead of using output d.ts file from project reference, use its source file */
    val useSourceOfProjectReferenceRedirect: (() -> Boolean)?

    /** If provided, use this method to get parsed command lines for referenced projects */
    val getParsedCommandLine: ((fileName: String) -> ParsedCommandLine?)?

    /** If provided, callback to invoke after every new program creation */
    val afterProgramCreate: ((program: T) -> Unit)?
}
