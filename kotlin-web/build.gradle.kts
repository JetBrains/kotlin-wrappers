plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)

    jsMainImplementation(kotlinx.coroutines.core)

    jsTestImplementation(kotlinx.coroutines.test)
    jsTestImplementation(kotlin("test-js"))
}
