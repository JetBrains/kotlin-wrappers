// Automatically generated - do not modify!

package typescript

sealed external interface CoreTransformationContext {
    val factory: NodeFactory

    /** Gets the compiler options supplied to the transformer. */
    fun getCompilerOptions(): CompilerOptions

    /** Starts a new lexical environment. */
    fun startLexicalEnvironment()

    /** Suspends the current lexical environment, usually after visiting a parameter list. */
    fun suspendLexicalEnvironment()

    /** Resumes a suspended lexical environment, usually before visiting a function body. */
    fun resumeLexicalEnvironment()

    /** Ends a lexical environment, returning any declarations. */
    fun endLexicalEnvironment(): ReadonlyArray<Statement>?

    /** Hoists a function declaration to the containing scope. */
    fun hoistFunctionDeclaration(node: FunctionDeclaration)

    /** Hoists a variable declaration to the containing scope. */
    fun hoistVariableDeclaration(node: Identifier)
}
