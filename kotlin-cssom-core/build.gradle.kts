plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)

    jsMainApi(devNpm(libs.npm.csstype))
}
