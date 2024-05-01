@file:JsModule("@preact/signals-react")

package preact.signals.react

import react.Cleanup

@JsName("useSignalEffect")
external fun rawUseSignalEffect(
    effect: () -> Cleanup?,
)
