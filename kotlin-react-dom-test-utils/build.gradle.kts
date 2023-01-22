import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-js"))
    api(project(":kotlin-browser"))
    api(project(":kotlin-react"))
    api(project(":kotlin-react-dom"))

    implementation(kotlinxCoroutines("core"))
    implementation(kotlinxCoroutines("test"))

    api(npmv("react-dom"))
}

tasks.withType<KotlinCompile<*>>().configureEach {
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi"
}
