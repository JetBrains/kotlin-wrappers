// Automatically generated - do not modify!

package web.dom

import web.cssom.LinkStyle

/**
 * A processing instruction embeds application-specific instructions in XML which can be ignored by other applications that don't recognize them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction)
 */
sealed external class ProcessingInstruction :
    CharacterData,
    LinkStyle {
    override val ownerDocument: Document

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/target) */
    val target: String
}
