plugins {
    id("kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)

    commonMainApi(devNpm(libs.npm.csstype))
}
