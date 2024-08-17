plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinPopperjsCore)
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npmv(libs.npm.react.popper))
}
