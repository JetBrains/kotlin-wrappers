plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCsstype)

    jsMainApi(kotlinx.coroutines.core)

    jsTestImplementation(kotlin("test-js"))
    jsTestImplementation(kotlinx.coroutines.test)

    jsMainApi(npmv("react"))
}
