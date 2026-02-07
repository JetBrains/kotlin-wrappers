// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * A document filter denotes a document by different properties like
 * the [language}, the {@link Uri.scheme scheme][TextDocument.languageId] of
 * its resource, or a glob-pattern that is applied to the [path][TextDocument.fileName].
 *
 * @example <caption>A language filter that applies to typescript files on disk</caption>
 * { language: 'typescript', scheme: 'file' }
 *
 * @example <caption>A language filter that applies to all package.json paths</caption>
 * { language: 'json', pattern: '**​/package.json' }
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentFilter)
 */
@JsPlainObject
external interface DocumentFilter {
    /**
     * A language id, like `typescript`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentFilter.language)
     */
    val language: String?

    /**
     * The [type][NotebookDocument.notebookType] of a notebook, like `jupyter-notebook`. This allows
     * to narrow down on the type of a notebook that a [cell document][NotebookCell.document] belongs to.
     *
     * *Note* that setting the `notebookType`-property changes how `scheme` and `pattern` are interpreted. When set
     * they are evaluated against the [notebook uri][NotebookDocument.uri], not the document uri.
     *
     * @example <caption>Match python document inside jupyter notebook that aren't stored yet (`untitled`)</caption>
     * { language: 'python', notebookType: 'jupyter-notebook', scheme: 'untitled' }
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentFilter.notebookType)
     */
    val notebookType: String?

    /**
     * A Uri [scheme][Uri.scheme], like `file` or `untitled`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentFilter.scheme)
     */
    val scheme: String?

    /**
     * A [glob pattern} that is matched on the absolute path of the document. Use a {@link RelativePattern relative pattern][GlobPattern]
     * to filter documents to a [workspace folder][WorkspaceFolder].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentFilter.pattern)
     */
    val pattern: GlobPattern?
}
