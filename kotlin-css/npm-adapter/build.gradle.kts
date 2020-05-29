// TODO: remove after migration on 1.4-M2

import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js")
}

kotlin.sourceSets.main {
    kotlin.srcDir("../src/commonMain/kotlin")
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        outputFile = project.rootProject.buildDir
            .resolve("js/packages/kotlin-css/kotlin/kotlin-css.js")
            .absolutePath
    }
}
