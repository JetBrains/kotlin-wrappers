package web.audio

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam)
 */
@JsPlainObject
external interface AudioParamDescriptor {
    var name: AudioParamName

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/defaultValue)
     */
    var defaultValue: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/minValue)
     */
    var minValue: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/maxValue)
     */
    var maxValue: Float

    var automationRate: AutomationRate?
}
