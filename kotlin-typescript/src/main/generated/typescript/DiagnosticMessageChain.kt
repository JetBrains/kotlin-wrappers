// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

/**
 * A linked list of formatted diagnostic messages to be used as part of a multiline message.
 * It is built from the bottom up, leaving the head to be the "main" diagnostic.
 * While it seems that DiagnosticMessageChain is structurally similar to DiagnosticMessage,
 * the difference is that messages are all preformatted in DMC.
 */
sealed external interface DiagnosticMessageChain {
    var messageText: String
    var category: DiagnosticCategory
    var code: Int
    var next: ReadonlyArray<DiagnosticMessageChain>?
}
