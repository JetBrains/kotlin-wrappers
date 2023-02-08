import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-js"))
    jsMainApi(project(":kotlin-browser"))
    jsMainApi(project(":kotlin-react"))
    jsMainApi(project(":kotlin-react-dom"))

    jsMainImplementation(kotlinxCoroutines("core"))
    jsMainImplementation(kotlinxCoroutines("test"))

    jsMainApi(npmv("react-dom"))
}

tasks.withType<KotlinCompile<*>>().configureEach {
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi"
}
