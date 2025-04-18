// Automatically generated - do not modify!

package web.dom

import web.cssom.LinkStyle

/**
 * The **`ProcessingInstruction`** interface represents a processing instruction; that is, a Node which embeds an instruction targeting a specific application but that can be ignored by any other applications which don't recognize the instruction.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction)
 */
external class ProcessingInstruction
private constructor() :
    CharacterData,
    LinkStyle {
    override val ownerDocument: Document

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/target)
     */
    val target: String
}
