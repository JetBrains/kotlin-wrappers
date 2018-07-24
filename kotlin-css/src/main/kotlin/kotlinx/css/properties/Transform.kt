package kotlinx.css.properties

import kotlinx.css.*

class Angle(val value: String) {
    override fun toString() = value
}

val Number.deg get() = Angle("${this}deg")
val Number.grad get() = Angle("${this}grad")
val Number.rad get() = Angle("${this}rad")
val Number.turn get() = Angle("${this}turn")


class Transform(val name: String, private val args: Array<out Any>) {
    override fun toString() = "$name(${args.joinToString(", ")})"
}

class Transforms : StyleList<Transform>(" ") {
    companion object {
        val none = Transforms()
    }
}

fun StyledElement.transform(builder: Transforms.() -> Unit) = transform.builder()

fun Transforms.add(name: String, vararg args: Any) {
    this += Transform(name, args)
}

fun Transforms.matrix(
    a: Number, b: Number,
    c: Number, d: Number,

    tx: Number, ty: Number
) = add("matrix", a, b, c, d, tx, ty)

fun Transforms.matrix3d(
    a1: Number, b1: Number, c1: Number, d1: Number,
    a2: Number, b2: Number, c2: Number, d2: Number,
    a3: Number, b3: Number, c3: Number, d3: Number,
    a4: Number, b4: Number, c4: Number, d4: Number

) = add("matrix3d", a1, b1, c1, d1, a2, b2, c2, d2, a3, b3, c3, d3, a4, b4, c4, d4)


fun Transforms.translate(tx: LinearDimension, ty: LinearDimension = 0.px) = add("translate", tx, ty)
fun Transforms.translateX(t: LinearDimension) = add("translateX", t)
fun Transforms.translateY(t: LinearDimension) = add("translateY", t)

fun Transforms.translate3d(tx: LinearDimension, ty: LinearDimension, tz: LinearDimension) = add("translate3d", tx, ty, tz)
fun Transforms.translateZ(t: LinearDimension) = add("translateZ", t)


fun Transforms.scale(sx: Number, sy: Number) = add("scale", sx, sy)
fun Transforms.scale(s: Number) = add("scale", s)
fun Transforms.scaleX(s: Number) = add("scaleX", s)
fun Transforms.scaleY(s: Number) = add("scaleY", s)

fun Transforms.scale3d(sx: Number, sy: Number, sz: Number) = add("scale3d", sx, sy, sz)
fun Transforms.scaleZ(s: Number) = add("scaleZ", s)


fun Transforms.rotate(a: Angle) = add("rotate", a)

fun Transforms.rotate3d(x: Number, y: Number, z: Number, a: Angle) = add("rotate3d", x, y, z, a)
fun Transforms.rotateX(a: Angle) = add("rotateX", a)
fun Transforms.rotateY(a: Angle) = add("rotateY", a)
fun Transforms.rotateZ(a: Angle) = add("rotateZ", a)


fun Transforms.skew(ax: Angle, ay: Angle = 0.deg) = add("skew", ax, ay)
fun Transforms.skewX(a: Angle) = add("skewX", a)
fun Transforms.skewY(a: Angle) = add("skewY", a)


fun Transforms.perspective(l: LinearDimension) = add("perspective", l)

