plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinCsstype)

    jsMainApi(libs.coroutines.core)

    jsTestImplementation(libs.kotlin.test.js)
    jsTestImplementation(libs.coroutines.test)

    jsMainApi(npmv(libs.npm.react))
}
