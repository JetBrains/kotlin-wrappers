// Automatically generated - do not modify!

package muix.tree.view

import js.reflect.unsafeCast
import react.dom.events.SyntheticEvent

/**
 * The flag MUI reads on the events it hands to the tree item's own handlers (`TreeViewCancellableEvent` in
 * `@mui/x-tree-view/models`). Set [defaultMuiPrevented] from a handler to keep the default Tree View behaviour
 * from running after it. Honoured by `useTreeItem` for the root `onFocus` / `onBlur` / `onKeyDown`, the content
 * `onClick` / `onMouseDown`, the icon container `onClick` and the label `onDoubleClick`; by the selection plugin
 * for the checkbox `onChange`; by the label editing plugin for the label input `onKeyDown` / `onBlur`; and by the
 * focus and keyboard navigation plugins for the Tree View root's `onFocus` / `onBlur` / `onKeyDown`.
 */
private external interface TreeViewCancellableEvent {
    var defaultMuiPrevented: Boolean?
}

/**
 * `defaultMuiPrevented` of an event received by a Tree View handler, see [TreeViewCancellableEvent].
 */
var SyntheticEvent<*, *>.defaultMuiPrevented: Boolean?
    get() = unsafeCast<TreeViewCancellableEvent>(this).defaultMuiPrevented
    set(value) {
        unsafeCast<TreeViewCancellableEvent>(this).defaultMuiPrevented = value
    }
