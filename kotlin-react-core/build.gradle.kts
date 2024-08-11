plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCsstype)

    jsMainApi(libs.coroutines.core)

    jsTestImplementation(kotlin("test-js"))
    jsTestImplementation(libs.coroutines.test)

    jsMainApi(npmv("react"))
}
