plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinPopperjsCore)
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npm(libs.npm.react.popper))
}
