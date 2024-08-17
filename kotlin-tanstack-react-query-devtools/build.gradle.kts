plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npmv(libs.npm.tanstack.react.query.devtools))
}
