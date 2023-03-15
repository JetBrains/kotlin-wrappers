package csstype

// TODO: remove after fix in emotion
//  https://github.com/emotion-js/emotion/issues/3011
fun AspectRatio(
    value: Double,
): AspectRatio =
    value.toString().unsafeCast<AspectRatio>()
