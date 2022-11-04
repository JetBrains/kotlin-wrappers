// Automatically generated - do not modify!

package dom.html

import dom.DocumentFragment
import dom.DocumentOrShadowRoot
import dom.Element
import dom.InnerHTML

sealed external class ShadowRoot :
    DocumentFragment,
    DocumentOrShadowRoot,
    InnerHTML {
    val delegatesFocus: Boolean
    val host: Element
    val mode: ShadowRootMode
    val slotAssignment: SlotAssignmentMode
}
