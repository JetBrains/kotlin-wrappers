plugins {
    id("kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinPopperjsCore)
    jsMainApi(projects.kotlinReactCore)

    commonMainApi(npm(libs.npm.reactPopper))
}
