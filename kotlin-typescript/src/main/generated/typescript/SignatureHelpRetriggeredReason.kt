// Automatically generated - do not modify!

package typescript

/**
 * Signals that this signature help request came from typing a character or moving the cursor.
 * This should only occur if a signature help session was already active and the editor needs to see if it should adjust.
 * The language service will unconditionally attempt to provide a result.
 * `triggerCharacter` can be `undefined` for a retrigger caused by a cursor move.
 */
external interface SignatureHelpRetriggeredReason {
    var kind: String /* "retrigger" */

    /**
     * Character that was responsible for triggering signature help.
     */
    var triggerCharacter: SignatureHelpRetriggerCharacter?
}
