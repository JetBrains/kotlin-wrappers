val k2patch by tasks.registering {
    patchFile("gradle.properties") {
        it.replace(
            "kotlin.version=1.9.23",
            "kotlin.version=2.0.0-RC1",
        )
    }

    patchFile("buildSrc/src/main/kotlin/Plugins.kt") {
        it.replace("""id("io.github.sgrishchenko.karakum")""", "")
    }

    // WA for KT-67628
    patchFile("kotlin-js/src/jsMain/kotlin/js/iterable/IteratorYieldResult.kt") {
        it.replace(
            "IteratorResult<TYield, Void>",
            "IteratorResult<TYield, Nothing?>",
        )
    }
}

fun patchFile(
    path: String,
    transform: (String) -> String,
) {
    val file = rootProject.file(path)
    val content = file.readText()
    file.writeText(transform(content))
}
