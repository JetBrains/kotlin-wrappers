// Automatically generated - do not modify!

package typescript

sealed external interface CoreTransformationContext {
    val factory: NodeFactory

    /** Gets the compiler options supplied to the transformer. */
    fun getCompilerOptions(): CompilerOptions

    /** Starts a new lexical environment. */
    fun startLexicalEnvironment(): Unit

    /** Suspends the current lexical environment, usually after visiting a parameter list. */
    fun suspendLexicalEnvironment(): Unit

    /** Resumes a suspended lexical environment, usually before visiting a function body. */
    fun resumeLexicalEnvironment(): Unit

    /** Ends a lexical environment, returning any declarations. */
    fun endLexicalEnvironment(): js.array.ReadonlyArray<Statement>?

    /** Hoists a function declaration to the containing scope. */
    fun hoistFunctionDeclaration(node: FunctionDeclaration): Unit

    /** Hoists a variable declaration to the containing scope. */
    fun hoistVariableDeclaration(node: Identifier): Unit
}
