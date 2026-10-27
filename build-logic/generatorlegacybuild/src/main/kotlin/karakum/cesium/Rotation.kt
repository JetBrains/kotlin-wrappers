package karakum.cesium

const val ROTATION: String = "Rotation"

fun applyRotationFixes(code: String): String {
    val (comments, body) = code.split("\nexternal ")
        .also { require(it.size == 2) }

    val newBody = "external object $ROTATION" +
            body.substringAfter("\ncompanion object", "")
                .substringBeforeLast("\n}")
                .replace("<Rotation>", "<JsDouble>")
                .replace(": Rotation", ": JsDouble")

    return comments + "\n" + newBody
}
