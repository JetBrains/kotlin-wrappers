package js.primitive

@OptionalExpectation
@Target(AnnotationTarget.CLASS)
internal expect annotation class JsPrimitive(
    val type: String,
)
