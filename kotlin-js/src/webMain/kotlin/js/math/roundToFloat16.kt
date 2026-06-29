package js.math

inline fun Double.roundToFloat16(): Float =
    f16round(this)
