plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    commonMainImplementation(libs.seskar.core)

    jsMainApi(devNpm(libs.npm.csstype))
}
