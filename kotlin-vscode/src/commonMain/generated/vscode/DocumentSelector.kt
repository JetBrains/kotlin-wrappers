// Automatically generated - do not modify!

package vscode

import js.core.JsAny

/**
 * A language selector is the combination of one or many language identifiers
 * and {@link DocumentFilter language filters}.
 *
 * *Note* that a document selector that is just a language identifier selects *all*
 * documents, even those that are not saved on disk. Only use such selectors when
 * a feature works without further context, e.g. without the need to resolve related
 * 'files'.
 *
 * @example
 * let sel:DocumentSelector = { scheme: 'file', language: 'typescript' };
 */
typealias DocumentSelector = JsAny /* DocumentFilter | string | ReadonlyArray<DocumentFilter | string> */
