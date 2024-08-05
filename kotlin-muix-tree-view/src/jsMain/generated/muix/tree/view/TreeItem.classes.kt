// Automatically generated - do not modify!

@file:JsModule("@mui/x-tree-view/TreeItem")

package muix.tree.view

import web.cssom.ClassName

sealed external interface TreeItemClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the transition component. */
    val groupTransition: ClassName

    /** Styles applied to the content element. */
    val content: ClassName

    /** State class applied to the content element when expanded. */
    val expanded: ClassName

    /** State class applied to the content element when selected. */
    val selected: ClassName

    /** State class applied to the content element when focused. */
    val focused: ClassName

    /** State class applied to the element when disabled. */
    val disabled: ClassName

    /** Styles applied to the tree item icon. */
    val iconContainer: ClassName

    /** Styles applied to the label element. */
    val label: ClassName

    /** Styles applied to the checkbox element. */
    val checkbox: ClassName

    /** Styles applied to the drag and drop overlay. */
    val dragAndDropOverlay: ClassName
}

external val treeItemClasses: TreeItemClasses
