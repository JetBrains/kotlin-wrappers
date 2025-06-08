package karakum.csstype

internal val LENGTH_UNITS = listOf(
    // Units
    LengthUnits("ch"),
    LengthUnits("em"),
    LengthUnits("ex"),
    LengthUnits("rem"),

    LengthUnits("cqw"),
    LengthUnits("cqh"),
    LengthUnits("cqi"),
    LengthUnits("cqb"),
    LengthUnits("cqmin"),
    LengthUnits("cqmax"),

    LengthUnits("dvw"),
    LengthUnits("dvh"),
    LengthUnits("dvi"),
    LengthUnits("dvb"),
    LengthUnits("dvmin"),
    LengthUnits("dvmax"),

    LengthUnits("lvw"),
    LengthUnits("lvh"),
    LengthUnits("lvi"),
    LengthUnits("lvb"),
    LengthUnits("lvmin"),
    LengthUnits("lvmax"),

    LengthUnits("svw"),
    LengthUnits("svh"),
    LengthUnits("svi"),
    LengthUnits("svb"),
    LengthUnits("svmin"),
    LengthUnits("svmax"),

    // Viewport-percentage lengths
    LengthUnits("vw"),
    LengthUnits("vh"),
    LengthUnits("vmin"),
    LengthUnits("vmax"),

    // Absolute length units
    LengthUnits("px"),
    LengthUnits("cm"),
    LengthUnits("mm"),
    LengthUnits("`in`", "in"),
    LengthUnits("pc"),
    LengthUnits("pt"),
)

internal data class LengthUnits(
    val name: String,
    val suffix: String,
) {
    constructor(name: String) : this(name, name)
}
