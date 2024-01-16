// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface JSDocParsingMode {
    companion object {
        /**
         * Always parse JSDoc comments and include them in the AST.
         *
         * This is the default if no mode is provided.
         */
        @JsIntValue(0)
        val ParseAll: JSDocParsingMode

        /**
         * Never parse JSDoc comments, mo matter the file type.
         */
        @JsIntValue(1)
        val ParseNone: JSDocParsingMode

        /**
         * Parse only JSDoc comments which are needed to provide correct type errors.
         *
         * This will always parse JSDoc in non-TS files, but only parse JSDoc comments
         * containing `@see` and `@link` in TS files.
         */
        @JsIntValue(2)
        val ParseForTypeErrors: JSDocParsingMode

        /**
         * Parse only JSDoc comments which are needed to provide correct type info.
         *
         * This will always parse JSDoc in non-TS files, but never in TS files.
         *
         * Note: Do not use this mode if you require accurate type errors; use {@link ParseForTypeErrors} instead.
         */
        @JsIntValue(3)
        val ParseForTypeInfo: JSDocParsingMode
    }
}
