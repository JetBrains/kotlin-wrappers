import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
}

kotlin.js {
    moduleName = project.name

    browser()
    binaries.executable()
}

tasks.withType<Kotlin2JsCompile>().configureEach {
    compilerOptions {
        target = "es2015"
    }
}
