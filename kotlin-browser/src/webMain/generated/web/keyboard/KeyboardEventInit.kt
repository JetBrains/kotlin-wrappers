// Automatically generated - do not modify!

package web.keyboard

import kotlinx.js.JsPlainObject
import web.uievents.EventModifierInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/KeyboardEvent#options)
 */
@JsPlainObject
external interface KeyboardEventInit :
    EventModifierInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/KeyboardEvent#code)
     */
    var code: KeyCode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/KeyboardEvent#isComposing)
     */
    var isComposing: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/KeyboardEvent#key)
     */
    var key: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/KeyboardEvent#location)
     */
    var location: KeyLocation?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/KeyboardEvent#repeat)
     */
    var repeat: Boolean?
}
