// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.iterable.JsIterable
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * A diagnostics collection is a container that manages a set of
 * [diagnostics][Diagnostic]. Diagnostics are always scopes to a
 * diagnostics collection and a resource.
 *
 * To get an instance of a `DiagnosticCollection` use
 * [createDiagnosticCollection][languages.createDiagnosticCollection].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticCollection)
 */
external interface DiagnosticCollection :
    JsIterable<Tuple2</* uri: */ Uri, /* diagnostics: */ ReadonlyArray<Diagnostic>>>,
    DisposableLike {
    /**
     * The name of this diagnostic collection, for instance `typescript`. Every diagnostic
     * from this collection will be associated with this name. Also, the task framework uses this
     * name when defining [problem matchers](https://code.visualstudio.com/docs/editor/tasks#_defining-a-problem-matcher).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticCollection.name)
     */
    val name: String

    /**
     * Assign diagnostics for given resource. Will replace
     * existing diagnostics for that resource.
     *
     * @param uri A resource identifier.
     * @param diagnostics Array of diagnostics or `undefined`
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticCollection.set)
     */
    fun set(
        uri: Uri,
        diagnostics: ReadonlyArray<Diagnostic>?,
    )

    /**
     * Replace diagnostics for multiple resources in this collection.
     *
     *  _Note_ that multiple tuples of the same uri will be merged, e.g
     * `[[file1, [d1]], [file1, [d2]]]` is equivalent to `[[file1, [d1, d2]]]`.
     * If a diagnostics item is `undefined` as in `[file1, undefined]`
     * all previous but not subsequent diagnostics are removed.
     *
     * @param entries An array of tuples, like `[[file1, [d1, d2]], [file2, [d3, d4, d5]]]`, or `undefined`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticCollection.set)
     */
    fun set(entries: ReadonlyArray<Tuple2<Uri, ReadonlyArray<Diagnostic>?>>)

    /**
     * Remove all diagnostics from this collection that belong
     * to the provided `uri`. The same as `#set(uri, undefined)`.
     *
     * @param uri A resource identifier.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticCollection.delete)
     */
    fun delete(uri: Uri)

    /**
     * Remove all diagnostics from this collection. The same
     * as calling `#set(undefined)`;
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticCollection.clear)
     */
    fun clear()

    /**
     * Iterate over each entry in this collection.
     *
     * @param callback Function to execute for each entry.
     * @param thisArg The `this` context used when invoking the handler function.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticCollection.forEach)
     */
    fun forEach(
        callback: (
            uri: Uri,
            diagnostics: ReadonlyArray<Diagnostic>,
            collection: DiagnosticCollection,
        ) -> Unit,
        thisArg: JsAny? = definedExternally,
    )

    /**
     * Get the diagnostics for a given resource. *Note* that you cannot
     * modify the diagnostics-array returned from this call.
     *
     * @param uri A resource identifier.
     * @returns An immutable array of [diagnostics][Diagnostic] or `undefined`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticCollection.get)
     */
    fun get(uri: Uri): ReadonlyArray<Diagnostic>?

    /**
     * Check if this collection contains diagnostics for a
     * given resource.
     *
     * @param uri A resource identifier.
     * @returns `true` if this collection has diagnostic for the given resource.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticCollection.has)
     */
    fun has(uri: Uri): Boolean

    /**
     * Dispose and free associated resources. Calls
     * [clear][DiagnosticCollection.clear].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticCollection.dispose)
     */
    override fun dispose()
}
