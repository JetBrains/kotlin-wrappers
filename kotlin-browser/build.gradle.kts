plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCssomCore)
    jsMainApi(projects.kotlinWeb)

    jsMainImplementation(kotlinx.coroutines.core)

    jsTestImplementation(kotlin("test-js"))
}
