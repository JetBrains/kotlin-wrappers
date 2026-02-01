@file:JsModule("@preact/signals-react")

package preact.signals.react.raw

import react.Cleanup

@JsName("useSignalEffect")
external fun useSignalEffectRaw(
    effect: () -> Cleanup?,
)
