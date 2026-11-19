package js.reflect

// TODO: remove after KT-8584 fix
inline fun <T : JsAny?> T.upcast(): T =
    this
