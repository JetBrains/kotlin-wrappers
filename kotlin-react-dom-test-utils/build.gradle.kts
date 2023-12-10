import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    jsMainImplementation(kotlinxCoroutines("core"))
    jsMainImplementation(kotlinxCoroutines("test"))

    jsMainApi(npmv("react-dom"))
}

tasks.withType<KotlinCompile<*>>().configureEach {
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi"
}
