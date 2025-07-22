// Automatically generated - do not modify!

package vscode

/**
 * A data provider that provides tree data
 */
external interface TreeDataProvider<T> {
    /**
     * An optional event to signal that an element or root has changed.
     * This will trigger the view to update the changed element/root and its children recursively (if shown).
     * To signal that root has changed, do not pass any argument or pass `undefined` or `null`.
     */
//  onDidChangeTreeData?: Event<T | T[] | undefined | null | void>;

    /**
     * Get {@link TreeItem} representation of the `element`
     *
     * @param element The element for which {@link TreeItem} representation is asked for.
     * @returns TreeItem representation of the element.
     */
//  getTreeItem(element: T): TreeItem | Thenable<TreeItem>;

    /**
     * Get the children of `element` or root if no element is passed.
     *
     * @param element The element from which the provider gets children. Can be `undefined`.
     * @returns Children of `element` or root if no element is passed.
     */
//  getChildren(element?: T): ProviderResult<T[]>;

    /**
     * Optional method to return the parent of `element`.
     * Return `null` or `undefined` if `element` is a child of root.
     *
     * **NOTE:** This method should be implemented in order to access {@link TreeView.reveal reveal} API.
     *
     * @param element The element for which the parent has to be returned.
     * @returns Parent of `element`.
     */
//  getParent?(element: T): ProviderResult<T>;

    /**
     * Called on hover to resolve the {@link TreeItem.tooltip TreeItem} property if it is undefined.
     * Called on tree item click/open to resolve the {@link TreeItem.command TreeItem} property if it is undefined.
     * Only properties that were undefined can be resolved in `resolveTreeItem`.
     * Functionality may be expanded later to include being called to resolve other missing
     * properties on selection and/or on open.
     *
     * Will only ever be called once per TreeItem.
     *
     * onDidChangeTreeData should not be triggered from within resolveTreeItem.
     *
     * *Note* that this function is called when tree items are already showing in the UI.
     * Because of that, no property that changes the presentation (label, description, etc.)
     * can be changed.
     *
     * @param item Undefined properties of `item` should be set then `item` should be returned.
     * @param element The object associated with the TreeItem.
     * @param token A cancellation token.
     * @returns The resolved tree item or a thenable that resolves to such. It is OK to return the given
     * `item`. When no result is returned, the given `item` will be used.
     */
//  resolveTreeItem?(item: TreeItem, element: T, token: CancellationToken): ProviderResult<TreeItem>;
}
