// Automatically generated - do not modify!

package web.dom

import web.cssom.LinkStyle

/**
 * The **`ProcessingInstruction`** interface represents a processing instruction — a Node that embeds an instruction targeting a specific application, which can be ignored by any application that doesn't recognize the instruction.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction)
 */
open external class ProcessingInstruction
private constructor() :
    CharacterData,
    LinkStyle {
    /**
     * The read-only **`target`** property of the ProcessingInstruction interface represent the application to which the ProcessingInstruction is targeted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/target)
     */
    open val target: String
}
