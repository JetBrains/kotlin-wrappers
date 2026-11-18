package js.reflect

// TODO: remove after KT-91773 fix
inline fun <T : JsAny?> T.upcast(): T =
    this
