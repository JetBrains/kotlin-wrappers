// TODO: remove after migration on 1.4-M2

import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js")
}

kotlin.sourceSets.main {
    kotlin.srcDir("../src/commonMain/kotlin")
}
