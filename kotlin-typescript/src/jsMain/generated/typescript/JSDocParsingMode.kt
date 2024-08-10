// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

sealed external interface JSDocParsingMode {
    companion object {
        /**
         * Always parse JSDoc comments and include them in the AST.
         *
         * This is the default if no mode is provided.
         */
        val ParseAll: JSDocParsingMode

        /**
         * Never parse JSDoc comments, mo matter the file type.
         */
        val ParseNone: JSDocParsingMode

        /**
         * Parse only JSDoc comments which are needed to provide correct type errors.
         *
         * This will always parse JSDoc in non-TS files, but only parse JSDoc comments
         * containing `@see` and `@link` in TS files.
         */
        val ParseForTypeErrors: JSDocParsingMode

        /**
         * Parse only JSDoc comments which are needed to provide correct type info.
         *
         * This will always parse JSDoc in non-TS files, but never in TS files.
         *
         * Note: Do not use this mode if you require accurate type errors; use {@link ParseForTypeErrors} instead.
         */
        val ParseForTypeInfo: JSDocParsingMode
    }
}
