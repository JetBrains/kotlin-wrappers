// Automatically generated - do not modify!

package vscode

/**
 * A document filter denotes a document by different properties like
 * the {@link TextDocument.languageId language}, the {@link Uri.scheme scheme} of
 * its resource, or a glob-pattern that is applied to the {@link TextDocument.fileName path}.
 *
 * @example <caption>A language filter that applies to typescript files on disk</caption>
 * { language: 'typescript', scheme: 'file' }
 *
 * @example <caption>A language filter that applies to all package.json paths</caption>
 * { language: 'json', pattern: '**​/package.json' }
 */
external interface DocumentFilter {
    /**
    // ORIGINAL SOURCE


    /**
     * A language id, like `typescript`.
    */
    readonly language?: string;

    /**
     * The {@link NotebookDocument.notebookType type} of a notebook, like `jupyter-notebook`. This allows
     * to narrow down on the type of a notebook that a {@link NotebookCell.document cell document} belongs to.
     *
     * *Note* that setting the `notebookType`-property changes how `scheme` and `pattern` are interpreted. When set
     * they are evaluated against the {@link NotebookDocument.uri notebook uri}, not the document uri.
     *
     * @example <caption>Match python document inside jupyter notebook that aren't stored yet (`untitled`)</caption>
     * { language: 'python', notebookType: 'jupyter-notebook', scheme: 'untitled' }
    */
    readonly notebookType?: string;

    /**
     * A Uri {@link Uri.scheme scheme}, like `file` or `untitled`.
    */
    readonly scheme?: string;

    /**
     * A {@link GlobPattern glob pattern} that is matched on the absolute path of the document. Use a {@link RelativePattern relative pattern}
     * to filter documents to a {@link WorkspaceFolder workspace folder}.
    */
    readonly pattern?: GlobPattern;

    // ORIGINAL SOURCE
     **/
}
