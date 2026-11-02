// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface LanguageModelPromptOptions {
// Docs: https://electronjs.org/docs/api/structures/language-model-prompt-options
    /**
     * a JSON schema object or a `RegExp` used to constrain the response to match the
     * specified restraints.
     */
    var responseConstraint: (Any /* (ResponseConstraint) | (RegExp) */)?
    var signal: web.abort.AbortSignal
}
