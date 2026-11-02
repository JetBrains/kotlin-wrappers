package js.reflect

inline fun <T : JsAny?> T.upcast(): T =
    this
