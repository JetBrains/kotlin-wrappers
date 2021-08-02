import kotlinx.css.*
import kotlin.random.Random

const val seed = 46271372869541347
val random = Random(seed)

// Functions below are needed for hash to be different even on CSS with the same properties
fun randomAlign(): Align {
    return when (random.nextInt(0, 13)) {
        0 -> Align.flexEnd
        1 -> Align.baseline
        2 -> Align.center
        3 -> Align.auto
        4 -> Align.end
        5 -> Align.flexStart
        6 -> Align.inherit
        7 -> Align.initial
        8 -> Align.selfStart
        9 -> Align.selfEnd
        10 -> Align.start
        11 -> Align.stretch
        else -> Align.unset
    }
}

fun randomColor(): Color {
    return Color("#${random.nextInt(0xffffff).toString(16)}")
}

fun randomLinearDimension(): LinearDimension {
    return random.nextInt(1024).px
}

fun randomBorderStyle(): BorderStyle {
    return when (random.nextInt(0, 7)) {
        0 -> BorderStyle.initial
        1 -> BorderStyle.inherit
        2 -> BorderStyle.unset
        3 -> BorderStyle.none
        4 -> BorderStyle.dotted
        5 -> BorderStyle.dashed
        else -> BorderStyle.solid
    }
}

