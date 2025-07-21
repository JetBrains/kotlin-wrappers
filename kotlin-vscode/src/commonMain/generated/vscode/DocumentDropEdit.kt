// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * An edit operation applied {@link DocumentDropEditProvider on drop}.
*/
export class DocumentDropEdit {
/**
 * Human readable label that describes the edit.
*/
title?: string;

/**
 * {@link DocumentDropOrPasteEditKind Kind} of the edit.
*/
kind?: DocumentDropOrPasteEditKind;

/**
 * Controls the ordering or multiple edits. If this provider yield to edits, it will be shown lower in the list.
*/
yieldTo?: readonly DocumentDropOrPasteEditKind[];

/**
 * The text or snippet to insert at the drop location.
*/
insertText: string | SnippetString;

/**
 * An optional additional edit to apply on drop.
*/
additionalEdit?: WorkspaceEdit;

/**
 * @param insertText The text or snippet to insert at the drop location.
 * @param title Human readable label that describes the edit.
 * @param kind {@link DocumentDropOrPasteEditKind Kind} of the edit.
*/
constructor(insertText: string | SnippetString, title?: string, kind?: DocumentDropOrPasteEditKind);
}

// ORIGINAL SOURCE
 **/
